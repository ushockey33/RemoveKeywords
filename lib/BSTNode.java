/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dubielsw
 */
public class BSTNode<E> {
    private E element;
    private BSTNode<E> left;
    private BSTNode<E> right;
    
    //Constructors
    public BSTNode(E it, BSTNode l, BSTNode<E> r){
        element = it;
        left = l;
        right = r;    
    }
    
    public BSTNode(E it){
        element = it;
        left = null;
        right = null;
    }
    
    public BSTNode<E> getLeft(){
        return left;
    }
    
    public void setLeft(BSTNode<E> l){
        left = l;
    }
    public E getElement(){
        return element;
    }
    public BSTNode<E> getRight(){
        return right;
    }
    
    public void setRight(BSTNode<E> l){
        right = l;
    }
    
    public boolean isLeaf(){
        if(right == null && left == null){
            return true;
        }
        return false;
    }
    
}
