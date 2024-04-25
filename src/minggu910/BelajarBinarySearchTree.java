/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu910;

/**
 *
 * @author Reddy
 */
public class BelajarBinarySearchTree {
    public static void main(String[] args) {
        
        MyBinarySearchTree<Integer> mbst = new MyBinarySearchTree<>();
        
        
        mbst.insertIterative(10);
        mbst.insertIterative(6);
        mbst.insertIterative(19);
        mbst.insertIterative(5);
        mbst.insertIterative(15);
        mbst.insertIterative(21);
        mbst.insertIterative(17);
        System.out.println("===Traversal In order====");
        mbst.printInorder(); 
        System.out.println("===Traversal Pre order====");
        mbst.printPreOrder();
        System.out.println("===Traversal Post order====");
        mbst.printPostOrder();
        
        mbst.delete(10);
        System.out.println("===Traversal In order====");
        mbst.printInorder();
        
        int a =10;
//        System.out.println("Halo");
        
        MyBinarySearchTree<Integer> mbstRecursive = new MyBinarySearchTree<>();
        mbstRecursive.insertRecursive(10);
        mbstRecursive.insertRecursive(6);
        mbstRecursive.insertRecursive(19);
        mbstRecursive.insertRecursive(5);
        mbstRecursive.insertRecursive(15);
        mbstRecursive.insertRecursive(21);
        mbstRecursive.insertRecursive(17);
        System.out.println("");
        System.out.println("===Traversal In order====");
        mbstRecursive.printInorder();   
    }
}
