package qns12;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    static class Delivery{
            String product;
            int no_of_boxes;
            Delivery(String product,int no_of_boxes){
                this.product = product;
                this.no_of_boxes = no_of_boxes;
            }
            public String toString(){
                return this.product;
            }
        }
    public static void remove_at_pos(Stack<Delivery> orders,int position){
        Stack<Delivery> temp = new Stack<>();
        for(int i=1; i < position;i++){
            temp.push(orders.pop());
        }
        orders.pop();
        while(!temp.isEmpty())
            orders.push(temp.pop());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Delivery> orders = new Stack<Delivery>();
        orders.push(new Delivery("sunlight", 10));
        orders.push(new Delivery("ujala", 60));
        orders.push(new Delivery("Dove", 15));
        orders.push(new Delivery("Chandrika", 20));
        System.out.println("Before: "+orders);
        remove_at_pos(orders,2);
        System.out.println("After: "+orders);
    }
}
