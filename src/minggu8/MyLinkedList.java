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
public class MyLinkedList {
    public NodeLinkedList header;

    public MyLinkedList() {
        header = null;
    }
    
    public void printSequence(){
        
        NodeLinkedList curr = header;
        while (curr != null){
            if (curr == header){
                System.out.print(curr.value);                
            }
            else{
                System.out.print(", " + curr.value);
            }
            curr = curr.next;
        }
        System.out.println("");
    }
    
    public void insertFirst(String newValue){        
        NodeLinkedList newnode = new NodeLinkedList(newValue);
        newnode.next = header;
        header  = newnode;
    }
    
    public void insertLast(String newValue){
        
        if (header == null){
            insertFirst(newValue);
            return;
        }
        NodeLinkedList curr = header;
        while (curr.next != null){
            curr = curr.next;
        }
        NodeLinkedList newnode = new NodeLinkedList(newValue);
        curr.next = newnode;        
        
    }
    
    public String getFirst(){
        
        return (header!=null ? header.value : "" );
    }
    
    public int indexOf(String value){
        if (header == null){            
            return -1;
        }
        NodeLinkedList curr = header;
        int counter = 0;
        while (curr != null && !curr.value.equals(value)){
            curr = curr.next;
            counter++;
        }
        return counter;
    }
    
}
