package qns14;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Pickout the option:\n"+
            "1:Add element\t"+
            "2:Delete element\n"+
            "3:First element\t"+
            "4:Print queue\n"+
            "0:Exit!");
            switch (input.nextInt()) {
                case 1: {
                    System.out.print("Enter the element to insert: ");
                    numbers.add(input.nextInt());
                }
                break;
                case 2: {
                    System.out.println("element " +numbers.remove()+" removed");
                }
                break;
                case 3: {
                    System.out.println("The first element is  "+numbers.peek());
                }
                break;
                case 4: {
                    System.out.println(numbers);
                }
                break;
                case 0: {
                    return;
                }
                default:{
                    System.out.println("INVALID INPUT try again");
                }
                break;
            }
        }
    }
}