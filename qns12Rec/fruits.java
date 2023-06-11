package qns12Rec;

import java.util.Stack;

public class fruits {
    static int position = 3;
    static Stack<String> f = new Stack<>();
    static void removef(){
        if(f.size() == position) {
            f.pop();
            return;
        };
        String fruitPopped = f.pop();
        // System.out.println(f.size()+":"+fruitPopped);
        removef();
        f.push(fruitPopped);
    }
    public static void main(String[] args) {
        f.push("apple");
        f.push("mango");
        f.push("grapes");
        f.push("cherry");
        f.push("berry");   
        removef();
        System.out.println(f);
    }
}
