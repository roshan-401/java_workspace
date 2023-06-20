package qns6;
class EvenNumber implements Runnable{
    int n;
    EvenNumber(int n){
        this.n = n;
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<n;i=i+2){
                Thread.sleep(10);
                System.out.println("Even"+ i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
class Fibonacci implements Runnable{
    int n;
    Fibonacci(int n){
        this.n = n;
    }
    @Override
    public void run(){
        int a = 0;
        int b = 1;
        int c = 1;
        try{
            while(c<=n){
                Thread.sleep(10);
                System.out.println("Fibonacci"+a);
                c = a+b;
                a = b;
                b = c;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t1 =  new Thread( new Fibonacci(40));
        Thread t2 = new Thread(new EvenNumber(40));
        t1.start();
        t2.start();
    }
}
