import java.util.*;

public class TestQueue{
	public static void main (String[] args){
		playWithQueue();
	}
	public static void playWithQueue(){
		Queue<Integer> intQ = new Queue<Integer>();
		System.out.println("The queue is empty: " + intQ.isEmpty());
		intQ.enqueue(0);
		System.out.println("The queue is empty: " + intQ.isEmpty());
		intQ.enqueue(1);
		intQ.enqueue(2);
		intQ.enqueue(3);
		intQ.enqueue(4);
		System.out.println("The front: " + intQ.front());
		System.out.println("Size now is: " + intQ.size());
		while(!intQ.isEmpty()){
			System.out.println("Removing the front: " + intQ.dequeue());
			System.out.println("Size now is: " + intQ.size());
		}
		System.out.println("The queue is empty: " + intQ.isEmpty());
		intQ.enqueue(0);
		intQ.enqueue(1);
		intQ.enqueue(2);
		intQ.enqueue(3);
		intQ.enqueue(4);
		intQ.clear();
		while(!intQ.isEmpty()){
			System.out.println("Removing the front: " + intQ.dequeue());
			System.out.println("Size now is: " + intQ.size());
		}
		System.out.println("The queue is empty: " + intQ.isEmpty());
	}
}
