/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

/**
 *
 * @author Reddy
 */
public class MainLinkedList {
    public static void main(String[] args) {
        
        
        MyLinkedList ll = new MyLinkedList();
        
        ll.insertFirst("5");
        ll.printSequence();
        ll.insertFirst("4");
        ll.printSequence();        
        ll.insertFirst("3");
        ll.printSequence();
        ll.insertFirst("2");
        ll.insertLast("6");        
        ll.printSequence();

//        ll.insertLast("6");        
//        ll.printSequence();
//        ll.insertFirst("1");        
//        ll.printSequence();
        System.out.println(ll.indexOf("6"));
        
    }
}
