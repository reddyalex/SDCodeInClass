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
public class BinaryNode<T extends Comparable<T>> {
    
    public T value;
    public BinaryNode<T> left;
    public BinaryNode<T> right;

    public BinaryNode(T value, BinaryNode<T> left, BinaryNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
     public BinaryNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    
}
