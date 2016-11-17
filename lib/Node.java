/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dubielsw
 */
public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> prev;
    
    public Node(E dataItem){
        data = dataItem;
        next = null;
    }
    public Node(){
        data = null;
        next = null;
    }
    public Node (E dataItem, Node<E> nodeRef){
        data = dataItem;
        next = nodeRef;
    }
    public void setNext(Node<E> nodeRef){
        next = nodeRef;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setData(E dataItem){
        data = dataItem;
    }
    public E getData(){
        return data;
    }
    public Node<E> getPrev(){
        return prev;
    }
    public void setPrev(Node<E> prev){
        this.prev = prev;
        
    }
    
    
}
