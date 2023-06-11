package qns11;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    LinkedList<String> trees = new LinkedList<String>();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter return to exit");
    while(true){
      String tree = input.nextLine();
      if(tree.equals("")) break;
      trees.add(tree);
    }
    // for(String tree : trees){
    //   System.out.println(tree);
    // }
    System.out.println("Before clearing: "+trees);
    trees.clear();
    System.out.println("After clearing: "+trees);
  }
}