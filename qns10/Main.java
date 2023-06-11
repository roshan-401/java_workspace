package qns10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        System.out.println("press return to exit");
        Scanner input = new Scanner(System.in);
        while (true) {
            String str = input.nextLine();
            if(str.equals("")) break;
            strList.add(str);
        }
        for (String str : strList)
            System.out.println(str);
    }
}
