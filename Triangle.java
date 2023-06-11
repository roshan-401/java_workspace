package graphics;
public class Triangle implements Graphics{
    public double  area(double  l, double  b) {
        return l*b*0.5;
    }
    public double  perimeter(double  l, double  b) {
        return l+b + Math.sqrt((l*l)+(b*b));
    }
}