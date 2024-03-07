/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Reddy
 */
public class BelajarPrirotyQueue {
    
    static class compareTire implements Comparator<Tire>{

        @Override
        public int compare(Tire o1, Tire o2) {
            double keyO1 = o1.price / o1.warranty;
            double keyO2 = o2.price / o2.warranty;
            if (keyO1 < keyO2){
                return -1;
            }
            else{
                return 1;
            }                
        }
        
        
    }
    
    public static int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());        
        for (int stone : stones) {
            pq.add(stone);
        }     
        while(pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();          
            if( y-x>0){
                pq.add(y-x);
            }            
        }
        if(pq.size()==0) return 0;
        return pq.remove();
    }
    
    public static int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(1l);        
        for (int i=0;i<n-1;i++){
            Long value = pq.remove();
            
            while(pq.size()>0 && pq.peek()==value){
                pq.remove();
            }
            pq.add(value*2);
            pq.add(value*3);
            pq.add(value*5);
                    
        }
        return pq.remove().intValue();
        
        //[1, 2, 3, 4, 5, 6, 8, 9, 10, 12]
        // 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16,
    }
    
    
    public static void main(String[] args) {
        
//        
//        PriorityQueue<Integer> pqinteger = new PriorityQueue( new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 < o2) return 1;
//                else{
//                    return -1;
//                }
//            }
//        });
        
        PriorityQueue<Integer> pqinteger = new PriorityQueue(Collections.reverseOrder());
        
        
        
        pqinteger.add(20);
        pqinteger.add(10);
        pqinteger.add(15);
        pqinteger.add(2);
        pqinteger.add(39);
        pqinteger.add(30);
        
        System.out.println(pqinteger.remove());
        
        
        
//        PriorityQueue<Tire> pqT = new PriorityQueue<>(new Comparator<Tire>(){
//            @Override
//            public int compare(Tire o1, Tire o2) {
//                double keyO1 = o1.price / o1.warranty;
//                double keyO2 = o2.price / o2.warranty;
//                if (keyO1 < keyO2){
//                    return -1;
//                }
//                else{
//                    return 1;
//                }                
//            }
//        });

        PriorityQueue<Tire> pqT = new PriorityQueue<>(new CompareTireFileBeda());
        Tire temp = new Tire("MotorMaster",61.49, 110000); 
        // System.out.println(temp);
        pqT.add(temp);
        pqT.add(new Tire("Goodyear",98.99, 220000));
        pqT.add(new Tire("Michelin",101.99, 150000));
        System.out.println(pqT.remove());
        System.out.println("");
        System.out.println("===============Jeda pakai tree with comprable========");
        
        PriorityQueue<TireWithComparable> pqTwithComparable = new PriorityQueue<>();
        
        pqTwithComparable.add(new TireWithComparable("MotorMaster",61.49, 110000));
        pqTwithComparable.add(new TireWithComparable("Goodyear",98.99, 220000));
        pqTwithComparable.add(new TireWithComparable("Michelin",101.99, 150000));
        
        System.out.println(pqTwithComparable.remove());
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(nthUglyNumber(i) + ", ");
        }

         
         
    }
}
