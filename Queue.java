/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dubielsw
 */
public class Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;
 /** Constructors **/   
    public Queue(E it){
        front = rear =new Node<E>(it);
        size++;
        
    }
    
    public Queue(){
        front = rear = new Node<E>(); // Create top that stores it
        size = 0;
    }
/**	Returns true if the queue is empty; otherwise false

@return true is queue is empty otherwise false

*/   
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
        
    }
/** Returns the object at the front of the queue without removing it

@return the object at the front of the stack

@throws NoSuchElementException

*/
    public E front(){
        Node<E> curr = front;
        return (E)curr.getData();
        
    }
/** Returns the object at the front of the queue and removes it

so queue is one smaller

@return the object at the front of the queue

@throws NoSuchElementException

*/
    public E dequeue(){
        Node<E> curr = front;
        front = curr.getNext();
        size--;
        return (E)curr.getData();
        
    }
    
/** Inserts an item onto the rear of the queue

@param it the object to be inserted at the rear

*/    
    public void enqueue(E it){
        Node<E> curr = rear;
        rear = new Node<E>(it);
        
        rear.setPrev(curr);
        curr.setNext(rear);
        if(size ==0){front = rear;}       
        size++;
    }
/** 
     *Clears the queue - clears it of its contents

*/
    public void clear(){
        front = null;
        rear = null;
        size = 0;   
    }
/** Returns the number of elements in the queue
@return size - the number of elements in the queue
*/
    public int size(){
        return size;
    }
    
    
    
    
    
}
