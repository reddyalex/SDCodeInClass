/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu912;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Reddy
 */
public class BelajarHashSet {
    public static void main(String[] args) {
        
        HashSet<String> data = new HashSet<>();
        HashSet<String> ans = new HashSet<>();
//        TreeSet<String> data = new TreeSet<>();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda= ");
        String nama = sc.nextLine();
        
        for (int i = 0; i < nama.length()-9; i++) {
            String cari = nama.substring(i,i+10);
//            System.out.println(cari);
            if (!data.contains(cari)){
                data.add(cari);
            }
            else{
                ans.add(cari);
                //System.out.println("Karakter yang kembar = " + cari);
//                break;
            }
        }
        
//        Iterator<String> it = data.iterator(); 
//  
//        System.out.println( 
//            "Iterate HashSet using iterator : "); 
//  
//        // Iterate HashSet with the help of hasNext() and 
//        // next() method 
//        while (it.hasNext()) { 
//  
//            // Print HashSet values 
//            System.out.print(it.next() + " "); 
//        } 
        
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println(data.)
//        }
        ArrayList<String> returnans = new ArrayList<>(ans);

        for (String string : returnans) {
            System.out.println(string);
        }
        
//The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
//
//For example, "ACGAATTCCG" is a DNA sequence.
//When studying DNA, it is useful to identify repeated sequences within the DNA.
//
//Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.
//Example 1:
//Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//Output: ["AAAAACCCCC","CCCCCAAAAA"]
//Example 2:
//Input: s = "AAAAAAAAAAAAA"
//Output: ["AAAAAAAAAA"]        
        
        
        
    }
}
