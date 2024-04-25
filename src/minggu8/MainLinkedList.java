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

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//https://leetcode.com/problems/add-two-numbers
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans = new ListNode();
//        ListNode cur1 = l1;
//        ListNode cur2 = l2;
//        ListNode curans = ans;
//        int carry = 0;
//        while (cur1 != null && cur2 !=null){
//            
//            int temptotal = cur1.val + cur2.val + carry;
//            carry = temptotal / 10;
//            curans.val = temptotal % 10;
//            cur1 = cur1.next;
//            cur2 = cur2.next;
//            if (cur1 != null || cur2 !=null || carry == 1){
//                curans.next = new ListNode();
//                curans = curans.next;
//            }
//        }
//
//        while (cur1 != null){
//            int temptotal = cur1.val + carry;
//            carry = temptotal / 10;
//            curans.val = temptotal % 10;
//            cur1 = cur1.next;
//            if (cur1 != null || carry == 1){
//                curans.next = new ListNode();
//                curans = curans.next;
//            }
//        }
//        
//        while (cur2 != null){
//            int temptotal = cur2.val + carry;
//            carry = temptotal / 10;
//            curans.val = temptotal % 10;
//            cur2 = cur2.next;
//            if (cur2 != null || carry == 1){
//                curans.next = new ListNode();
//                curans = curans.next;
//            }
//        }
//
//        if (carry == 1){
//            curans.val = carry;
//        }
//        return ans;
//    }
//}
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode curr = head;
//        int counter=1;
//        while (curr !=null){
//            curr = curr.next;
//            counter++;
//        }
//
//        curr = head;
//        int c2 = 1;
//        while(c2 < counter - n -1){
//            c2++;
//            curr = curr.next;
//        }
//        
//        if(counter - n == 1 ){
//            head = head.next;
//        }
//        else{
//            curr.next = curr.next.next;
//        }
//        return head;
//    }
//}