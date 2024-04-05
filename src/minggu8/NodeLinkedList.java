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
public class NodeLinkedList {
    public String value;
    public NodeLinkedList next;

    public NodeLinkedList() {
        this.value = "";
        this.next = null;
    }
    public NodeLinkedList(String value) {
        this.value = value;
        this.next = null;
    }
    public NodeLinkedList(String value, NodeLinkedList next) {
        this.value = value;
        this.next = next;
    }
    
}
