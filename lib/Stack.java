/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dubielsw
 */
public class Stack<E> {
    private Node<E> top; //top of stack
    private int size = 0; //size of stack
 /**Constructors **/   
    public Stack(E it){
        top = new Node<E>(it);
        size++;
    }
    public Stack(){
        top = new Node<E>();
        size = 0;
    }
/**	Returns true if the stack is empty; otherwise false

@return true is stack is empty otherwise false

*/
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
/** Returns the object at the top of the stack without removing it

@return the object at the top of the stack

@throws EmptyStackException

*/
    public E peek(){
        Node<E> curr = top;
        return (E)curr.getData();
        
    }
/** Returns the object at the top of the stack and removes it

so stack is one smaller

@return the object at the top of the stack

@throws EmptyStackException

*/
    public E pop(){
        Node<E> curr = top;
        top = top.getNext();
        size--;
        return (E)curr.getData();
        
    }
/** Pushes an item onto the top of the stack

@param it The object to be inserted at the top

*/
    public void push(E it){
        Node<E> curr = new Node<E>(it);
        curr.setNext(top);
        top = curr;
        size++;
    }
/** Dumps the stack - clears it of its contents

*/
    public void puke(){
        top = null;
        size = 0;
        
    }
/** Returns the number of elements on the stack

@return size - the number of elements on the stack

*/
    public int size(){
        return size;
        
    }
    
}
