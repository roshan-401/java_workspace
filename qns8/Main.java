package qns8;
import java.util.*;

class Main{
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>(); 
        Stack<String> strStack = new Stack<>();
        intStack.add(5);
        intStack.add(6);
        intStack.add(7);
        System.out.println(intStack);

        strStack.add("hello");
        strStack.add("World");
        strStack.add("!");
        System.out.println(strStack);
    }
}