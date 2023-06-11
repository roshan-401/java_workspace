import graphics.*;
public class Main {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        double rectArea = r1.area(8, 5.4);
        double rectPeri = r1.perimeter(8, 5.4);
        System.out.println("Rectagle\narea: "+rectArea+"\nperimeter: "+rectPeri);
        Triangle t1 = new Triangle();
        double triArea = t1.area(4, 4.6);
        double triPeri = t1.perimeter(4, 4.6);
        System.out.println("\nTriangle\narea: "+triArea+"\nperimeter: "+triPeri);


    }
}
