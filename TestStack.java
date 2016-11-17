
import java.util.*;

public class TestStack{
	public static void main (String[] args){
		playWithStack();
	}
	public static void playWithStack(){
		Stack<Integer> intStack = new Stack<Integer>();
		System.out.println("The stack is empty: " + intStack.isEmpty());
		intStack.push(0);
		System.out.println("The stack is empty: " + intStack.isEmpty());
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		System.out.println("The top: " + intStack.peek());
		System.out.println("Size now is: " + intStack.size());
		while(!intStack.isEmpty()){
			System.out.println("Removing the top: " + intStack.pop());
			System.out.println("Size now is: " + intStack.size());
		}
		System.out.println("The stack is empty: " + intStack.isEmpty());
		intStack.push(0);
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		intStack.puke();
		while(!intStack.isEmpty()){
			System.out.println("Removing the top: " + intStack.pop());
			System.out.println("Size now is: " + intStack.size());
		}
		System.out.println("The stack is empty: " + intStack.isEmpty());
	}
}
