/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu913;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import minggu912.Student;
/**
 *
 * @author Reddy
 */
public class BelajarMAP {
    
    public static void main(String[] args) {
        
        HashMap<String, Student> allStudents = filldata();
        
        
        String kalimat = "Retains only the elements in this set that are contained in the specified collection (optional operation). In other words, removes from this set all of its elements that are not contained in the specified collection. If the specified collection is also a set, this operation effectively modifies this set so that its value is the intersection of the two sets.";
        
        
        TreeMap<String, Integer> occurance = new TreeMap<>();
        
        for (String string : kalimat.split(" ")) {
//            if (occurance.containsKey(string)){
//                occurance.put(string,occurance.get(string)+1);                
//            }
//            else{
//                occurance.put(string,1);
//            }
            occurance.put(string, occurance.getOrDefault(string, 0) + 1);
        }
        
        for (String key : occurance.keySet()) {
            System.out.println(key +":" + occurance.get(key));
        }
        
        System.out.println("");
        System.out.println("=================Cetak setelah sort pakai LIST=============");
        List<Map.Entry<String, Integer>> listKata = new ArrayList<>(occurance.entrySet());
        
        Collections.sort(listKata, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o2.getValue().compareTo(o1.getValue());
            }
        
        });
        
        for (Map.Entry<String, Integer> entry : listKata) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        
    }
    
    public static HashMap<String,Student> filldata(){
        HashMap<String, Student> temp = new HashMap<>();
        
        
        
        temp.put("1", new Student("1",172,true, true, false));
        temp.put("2", new Student("2",165,true, false, true));
        temp.put("3", new Student("3",154,false, false, false));
        temp.put("4", new Student("4",165,false, true, false));
        temp.put("5", new Student("5",166,true, true, false));
        temp.put("6", new Student("6",165,false, true, false));
        temp.put("7", new Student("7",171,true, false, true));
        temp.put("8", new Student("8",168,true, false, false));
        temp.put("9", new Student("9",159,false, false, true));
        temp.put("10", new Student("10",161,false, true, true));
        temp.put("11", new Student("11",172,false, true, true));
        temp.put("12", new Student("12",169,false, true, false));
        temp.put("13", new Student("13",171,false, true, false));
        temp.put("14", new Student("14",164,true, true, true));
        
        
        return temp;
    }
    
}
