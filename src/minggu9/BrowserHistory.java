/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9;

/**
 *
 * @author Reddy
 */
class Node{
    String val;
    Node next,prev;
    public Node(String val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class BrowserHistory {

    Node home;
    Node curr;

    public BrowserHistory(String homepage) {
        home = new Node(homepage); 
        curr = home;
    }
    
    public void visit(String url) {
        curr.next = null;
        Node t = new Node(url);
        curr.next = t;
        t.prev = curr;
        curr = t;
    }
    
    public String back(int steps) {
        while(curr.prev != null && steps-- > 0){
            curr = curr.prev; 
        }
        return curr.val;
    }
    
    public String forward(int steps) {
        while(curr.next != null && steps-- > 0){
            curr = curr.next; 
        }
        return curr.val;
    }
}