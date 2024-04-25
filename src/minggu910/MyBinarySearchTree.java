/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu910;
import minggu910.BinaryNode;
/**
 *
 * @author Reddy
 */
public class MyBinarySearchTree<T extends Comparable<T>> {
    
    
    public BinaryNode<T> root;

    public MyBinarySearchTree() {
        root = null;
    }
    
    public void insertIterative(T data){
        BinaryNode<T> newNode = new BinaryNode<>(data);
        
        if ( root == null){
            root = newNode;
            return;
        }
        BinaryNode<T> current = root;
        while (current !=null){
            if (newNode.value.compareTo(current.value) <0){
                if (current.left == null){
                    current.left = newNode;
                    return;
                }
                else{
                    current = current.left;
                }
            }
            else{
                if (current.right == null){
                   current.right = newNode;
                   return;
                }
                else{
                    current = current.right;
                }
            }
        }
    }
    
    public void insertRecursive(T data){
        root = insertRecursivePrivate(root, data);
    }
    
    private BinaryNode<T> insertRecursivePrivate(BinaryNode<T> current, T data){
        if (current == null){
            return new BinaryNode<>(data);
        }
        else{
            if (data.compareTo(current.value) <0){
                current.left = insertRecursivePrivate(current.left, data);
            }
            else{
                current.right = insertRecursivePrivate(current.right, data);
            }
        }
        return current;
    }
    
    
    private void inOrderTraversal(BinaryNode<T> current){
        if( current != null){
            inOrderTraversal(current.left);
            System.out.print(current.value + ", ");
            inOrderTraversal(current.right);
            
        }
        
    }
    private void preOrderTraversal(BinaryNode<T> current){
        if( current != null){
            System.out.print(current.value + ", ");
            preOrderTraversal(current.left);            
            preOrderTraversal(current.right);
        }
    }
    public void printPreOrder(){
        preOrderTraversal(root);
        System.out.println("");
    }
    
    private void postOrderTraversal(BinaryNode<T> current){
        if( current != null){
            
            postOrderTraversal(current.left);            
            postOrderTraversal(current.right);
            System.out.print(current.value + ", ");
        }
    }
    public void printPostOrder(){
        postOrderTraversal(root);
        System.out.println("");
    }
    
    public void printInorder(){
        inOrderTraversal(root);
        System.out.println("");
    }
    
    private BinaryNode<T> searchHelper(BinaryNode<T> current, T data){
        if (current == null) return null;
        int hasilCompare = data.compareTo(current.value) ;
        if (hasilCompare== 0){
            return current;
        }
        else if (hasilCompare <0 ){
            return searchHelper(current.left, data);
        }else{
            return searchHelper(current.right, data);
        }
    }
    
    public BinaryNode<T> search(T data){
        return searchHelper(root, data);
    }
    
    private T successorValue(BinaryNode<T> root){
        T minv = root.value;
        while (root.left != null){
            minv = root.left.value;
            root = root.left;
        }
        return minv;
    }
    private T predecessorValue(BinaryNode<T> root){
        T maxv = root.value;
        while (root.right != null){
            maxv = root.right.value;
            root = root.right;
        }
        return maxv;
    }
    
    private BinaryNode<T> deleteRecursive(BinaryNode<T> current, T data){
        if(current == null){return null;}
        int hasilCompare = data.compareTo(current.value) ;
        if (hasilCompare <0 ){
            current.left= deleteRecursive(current.left, data);
        }else if (hasilCompare > 0 ){
            current.right = deleteRecursive(current.right, data);
        }
        else{
            if (current.left == null){
                return current.right;
            }
            else if (current.right == null){
                return current.left;
            }
            // kondisi punya 2 child
            // delete teknik opsi 1
//            current.value = predecessorValue(current.left);
//            current.left = deleteRecursive(current.left, current.value);
            
            // delete teknik opsi 2
            current.value = successorValue(current.right);
            current.right = deleteRecursive(current.right, current.value);
        }
        return current;
    }
    
    public void delete(T data){
        root = deleteRecursive(root, data);
    }
    
}
