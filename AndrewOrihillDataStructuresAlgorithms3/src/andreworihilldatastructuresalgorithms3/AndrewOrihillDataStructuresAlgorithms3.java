package andreworihilldatastructuresalgorithms3;
import java.util.*;
public class AndrewOrihillDataStructuresAlgorithms3 {
    public static void main(String[] args) {
    //  This is a stack
        Stack<String> stack = new Stack<String>();
        stack.push("Moe");
        printStack(stack);
        stack.push("Larry");
        printStack(stack);
        stack.push("Curly");
        printStack(stack);
        //**************
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        System.out.println("-------------------");
    // This is a queue
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("Leader");
        q.offer("Middleman");
        q.offer("Stooge");
        System.out.printf("%s " , q);
        System.out.println();
        //**************
        q.poll();
        System.out.printf("%s\n" , q);
        q.poll();
        System.out.printf("%s\n " , q);
        q.poll();
        System.out.printf("%s\n" , q);
    // end of queue
    }
    private static void printStack(Stack<String> s) {
        if(s.isEmpty())
            System.out.println("Empty!");
        else
            System.out.printf("%s TOP\n", s);
    }
}