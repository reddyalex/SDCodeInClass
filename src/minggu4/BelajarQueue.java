/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Reddy
 */
public class BelajarQueue {
    
    public static void main(String[] args) {
        
        
//        Queue<Integer> antri = new LinkedList<>();
//        
//        
//        int jumlah = 1372;
//        int pass = 37;
//        
//        for(int i =0; i< jumlah;i++){
//            antri.add(i);
//        }
//        
//        int counter=0;
//        while( antri.size() >1){    
//            if( counter==pass ){               
//                //System.out.println(antri.remove());
//                antri.remove();
//                counter=0;                
//            }
//            else{
//                antri.add(antri.remove());
//                counter++;
//            } 
//        }
//        System.out.println(antri.remove());

        RecentCounter recentCounter = new RecentCounter();
        // requests = [1], range is [-2999,1], return 1
        System.out.println(recentCounter.ping(1));     
        // requests = [1, 100], range is [-2900,100], return 2
        System.out.println(recentCounter.ping(100));   
        // requests = [1, 100, 3001], range is [1,3001], return 3
        System.out.println(recentCounter.ping(3001));  
        // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
        System.out.println(recentCounter.ping(3002));  
        
//       
//        Queue<Integer> q = new LinkedList<>();
//        
//        //q.add(10);
//        System.out.println(q.peek());
//        try {
//            System.out.println(q.element());
//        } catch (Exception e) {
//            System.out.println("Element tidak ada");
//        }
//        if (q.size()>0){
//            System.out.println(q.element());
//        }
//        else{
//            System.out.println("Element tidak ada");
//        }
//        


    }
}
