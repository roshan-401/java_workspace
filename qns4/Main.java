package qns4;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0,n,i=0;
        System.out.println("Enter the numbers \nnegative numbers are not allowed!\nzero will end user input");
        while(true){
            n = input.nextInt();
            if(n<0){
                try {
                    throw new NegativeNumberException("negative number not allowed");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(n == 0){
                break;
            }
            else{
                sum += n;
                i++;
            }
        }
        System.out.println("Average:"+sum/i);
    }
 
}
