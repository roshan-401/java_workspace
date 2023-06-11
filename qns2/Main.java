package qns2;

import qns2.arithmetic.*;

public class Main {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println("Addition: "+a1.operate(5, 9));
        Multiplication m1 = new Multiplication();
        System.out.println("Mulitplication: "+m1.operate(2, 9));
    }
}
