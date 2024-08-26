// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

class StackOverflowException extends Exception{
    public StackOverflowException(String message){
        super(message);
    }
}

class StackUnderflowException extends Exception{
    public StackUnderflowException(String message){
        super(message);
    }
}

class STACK{
    private int maxSize;
    private int top;
    private int[] stackArray;

    public STACK(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) throws StackOverflowException{
        if(isFull()){
            throw new StackOverflowException("Stack is Full. Cannot push new item.");
        }

        stackArray[++top] = value;
    }

    public int pop() throws StackUnderflowException{
        if(isEmpty()){
            throw new StackUnderflowException("Stack is Empty . Cannot pop item");
        }

        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

}


public class Main {
    public static void main(String[] args) {
        STACK stack = new STACK(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60); // This will throw StackOverflowException
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop()); // This will throw StackUnderflowException
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }

    }
}
