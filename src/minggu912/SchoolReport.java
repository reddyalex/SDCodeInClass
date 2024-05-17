/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu912;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Reddy
 */
public class SchoolReport {
    public static void main(String[] args) {
        
        TreeSet<Student> students = filldata();
        TreeSet<Student> basketFans = new TreeSet<>();
        TreeSet<Student> footballFans = new TreeSet<>();
        TreeSet<Student> badmintonFans = new TreeSet<>();
        
        
        
        for( Student stu : students){
//            System.out.println(stu.nama +"," + stu.tinggi);
            if(stu.sukabadminton){
                badmintonFans.add(stu);
            }
            if(stu.sukabasket){
                basketFans.add(stu);
            }
            if(stu.sukasepakbola){
                footballFans.add(stu);
            }            
        }
        System.out.println("basket size=" + basketFans.size());
        System.out.println("sepakbola size=" + footballFans.size());        
        System.out.println("badminton size=" + badmintonFans.size());
//        Report: Basketball and Football fan.
        TreeSet<Student> report1 = new TreeSet<>(basketFans);
        report1.retainAll(footballFans);
        System.out.println("Student yang suka basket dan sepakbola = ");
        for( Student stu : report1){
            System.out.println(stu);
        }
        
        System.out.println("=================");
        
        // Basketball, Football and Badminton fan
        TreeSet<Student> report2 = new TreeSet<>(basketFans);
        report2.retainAll(footballFans);
        report2.retainAll(badmintonFans);
        
        System.out.println("Student yang suka basket,sepakbola dan badminton= ");
        for( Student stu : report2){
            System.out.println(stu);
        }
        
        
        // Report Basketball or Badminton fans
        TreeSet<Student> report3 = new TreeSet<>(basketFans);
        report3.addAll(badmintonFans);
        System.out.println("Student yang suka Basketball or Badminton fans= ");
        for( Student stu : report3){
            System.out.println(stu);
        }
        
        // Report Basketball or Badminton fans
        TreeSet<Student> report4 = new TreeSet<>(footballFans);
        report4.removeAll(basketFans);
        report4.removeAll(badmintonFans);
        System.out.println("Student yang suka Sepakbola saja= ");
        for( Student stu : report4){
            System.out.println(stu);
        }
        
        // Report dislike all
        TreeSet<Student> report5 = new TreeSet<>(students);
        report5.removeAll(basketFans);
        report5.removeAll(badmintonFans);
        report5.removeAll(footballFans);
        System.out.println("Student yang tidak suka semua exkur= ");
        for( Student stu : report5){
            System.out.println(stu);
        }
        
    }
    
    public static TreeSet<Student> filldata(){
        TreeSet<Student> temp = new TreeSet<>();
        
        temp.add(new Student("1",172,true, true, false));
        temp.add(new Student("2",165,true, false, true));
        temp.add(new Student("3",154,false, false, false));
        temp.add(new Student("4",165,false, true, false));
        temp.add(new Student("5",166,true, true, false));
        temp.add(new Student("6",165,false, true, false));
        temp.add(new Student("7",171,true, false, true));
        temp.add(new Student("8",168,true, false, false));
        temp.add(new Student("9",159,false, false, true));
        temp.add(new Student("10",161,false, true, true));
        temp.add(new Student("11",172,false, true, true));
        temp.add(new Student("12",169,false, true, false));
        temp.add(new Student("13",171,false, true, false));
        temp.add(new Student("14",164,true, true, true));
        
        
        return temp;
    }
    
}
