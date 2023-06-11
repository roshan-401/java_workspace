package qns13;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Queue: "+numbers);
        System.out.println("Peek element: "+numbers.peek());
        System.out.println("dequeuing element: "+numbers.remove());
        System.out.println("dequeuing element: "+numbers.remove());
        System.out.println("Queue atlast: "+numbers);

    }
}