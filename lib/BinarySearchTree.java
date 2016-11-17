/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dubielsw
 */
public class BinarySearchTree<E extends Comparable <E>> {
    
    private BSTNode<E> root;
    private int size;
    
    public BinarySearchTree(){
        root = null;
        size = 0;
    }
    
    public BinarySearchTree(BSTNode<E> node){
        root = node;
        size = 1;
    }
    
    public BSTNode<E> search(E it){
        BSTNode<E> curr = root;
        while(curr.getElement() != it || curr)

    }
    
    public boolean contains(E it){
        
    }
    
    public void insert(E it){
        BSTNode<E> newNode = new BSTNode<E>(it);
        if(root == null){
            root = newNode; 
            return;
        }
        BSTNode<E> parent = null;
        BSTNode<E> node = root;
        while(node != null){
            parent = node;
            int compareResult = it.compareTo(node.getElement());
            if(compareResult < 0){
                node = node.getLeft();
            }
            else if(compareResult > 0){
                node = node.getRight();
            }
            else{
                return;
            }
            
        }
        
        int res = it.compareTo(parent.getElement());
        if (res < 0){
            parent.setLeft(newNode);
            
        }
        else{
                parent.setRight(newNode);
        }
        size++;
              
    }
    
    public void remove(E it){
        
    }
    
    public int getHeight(){
        Queue<BSTNode> Q = new Queue<BSTNode>();
        if(root == null){return 0;}
        Q.enqueue(root);
        int height = 0;
        while(!Q.isEmpty()){
            int nodeCount = Q.size();
            if(nodeCount == 0){
                return height;
            }
            height++;
            while(nodeCount >0){
                BSTNode<E> node = Q.dequeue();
                
                if(node.getLeft() != null){
                    Q.enqueue(node.getLeft());
                }
                if(node.getRight() != null){
                    Q.enqueue(node.getRight());
                }
                nodeCount--;
            }
        }
        return height;
        
        
        
    }
    
    public void swapElements(BSTNode<E> node1, BSTNode<E> node2){
    
    }
    public void printByLevel(){
        Queue<BSTNode> Q = new Queue<BSTNode>();
        int levelNodes = 0;
        if(root == null){return;}
        
        
        Q.enqueue(root);
        while(!Q.isEmpty()){
            levelNodes = Q.size();
            while(levelNodes>0){
                BSTNode<E> n = Q.dequeue();
                System.out.print(n.getElement()+ " ");
                if(n.getLeft() != null){Q.enqueue(n.getLeft());}
                if(n.getRight() != null){Q.enqueue(n.getRight());}   
                levelNodes--;
            }
                System.out.println();
        }  
    }
    	/**prints the tree in a depth-first fashion
	* use your Stack class
        */
    public void printByDepth(){
        
        Stack<BSTNode> S = new Stack<BSTNode>();
        S.push(root);
        while(!S.isEmpty()){
            BSTNode node = S.pop();
            System.out.println(node.getElement());   
            if(node.getRight() != null){
                S.push(node.getRight());
                
            }
            if(node.getLeft() != null){
                S.push(node.getLeft());
            }
        } 
    }
		
    /**prints the tree in an inorder fashion. 
    * uses a stack to push left children onto the stack
    */
    public void printInOrder(){
        
        
    }
        
        

    
    
    
}
