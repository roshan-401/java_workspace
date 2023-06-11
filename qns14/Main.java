package qns14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Pickout the option:\n"+
            "1:Add element at first\t"+
            "2:Add element at last\n"+
            "3:Delete element at first\t"+
            "4:Delete element at last\n"+
            "5:First element\t"+
            "6:Last element\n"+
            "7:Print queue\t"+
            "0:Exit!");
            switch (input.nextInt()) {
                case 1: {
                    System.out.print("Enter the element to insert: ");
                    numbers.addFirst(input.nextInt());
                }
                break;
                case 2: {
                    System.out.print("Enter the element to insert: ");
                    numbers.addLast(input.nextInt());
                }
                break;
                case 3: {
                    System.out.println("first element " +numbers.removeFirst()+" removed");
                }
                break;
                case 4: {
                    System.out.println("last element is  "+numbers.removeLast()+" removed");
                }
                break;
                case 5:{
                    System.out.println("the first element is "+numbers.getFirst());
                }
                break;
                case 6:{
                    System.out.println("the last element is "+numbers.getLast());
                }
                case 7: {
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