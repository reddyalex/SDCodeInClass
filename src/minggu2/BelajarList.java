/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Reddy
 */
public class BelajarList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> arrInteger = new ArrayList<>(); // tanpa constructor kapasitas awal adalah 10
        
        arrInteger = new ArrayList<>(99); // dengan kapasitas awal adalah 99
        
        arrInteger.add(90);
        arrInteger.add(12);
        arrInteger.add(0, 75);
        
        for (int i = 0; i < arrInteger.size(); i++) {
            System.out.print(arrInteger.get(i) + ", ");
        }
        System.out.println("");
        
        ArrayList<Integer> arrLain = new ArrayList<>();
        
        arrLain.add(10);
        arrLain.add(20);
        arrLain.add(5);
        
        for (int i = 0; i < arrLain.size(); i++) {
            System.out.print(arrLain.get(i) + ", ");
        }
        System.out.println("");
        
        arrInteger.addAll(1, arrLain);
        
        for (int i = 0; i < arrInteger.size(); i++) {
            System.out.print(arrInteger.get(i) + ", ");
        }
        System.out.println("");
        
        int[] arrPrim = {7,6,4};
        
        
        ArrayList<Integer> convert = new ArrayList<>();
        for (int i = 0; i < arrPrim.length ; i++) {
            convert.add(arrPrim[i]);
        }
        arrInteger.addAll(convert);
        for (int i = 0; i < arrInteger.size(); i++) {
            System.out.print(arrInteger.get(i) + ", ");
        }
        System.out.println("");
        Integer[] arrDariArrList = new Integer[arrInteger.size()];
        
        arrInteger.toArray(arrDariArrList);
        
        if (arrInteger.contains(5)){
            System.out.println("Ya angka 5 ada di dalam ArrayList");
        }
        else{
            System.out.println("Tidak ada angka 5 ada di dalam ArrayList");
        }        
        if (arrInteger.contains(50)){
            System.out.println("Ya angka 50 ada di dalam ArrayList");
        }
        else{
            System.out.println("Tidak ada angka 50 ada di dalam ArrayList");
        }
        
        arrInteger.remove(5);
        for (int i = 0; i < arrInteger.size(); i++) {
            System.out.print(arrInteger.get(i) + ", ");
        }
        System.out.println("");
        
        arrInteger.remove(new Integer(5));
        for (int i = 0; i < arrInteger.size(); i++) {
            System.out.print(arrInteger.get(i) + ", ");
        }
        System.out.println("");
                
        System.out.println("Posisi Angka 6 ada di index = " + arrInteger.indexOf(60));
        
        
        
        
        
        
        
        
    }
    
}
