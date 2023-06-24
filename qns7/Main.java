package qns7;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        PC exec1 = new PC();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try{
                    exec1.produce();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try{
                    exec1.consume();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class PC{
    LinkedList<Integer> list = new LinkedList<>();
    int capcity = 1;
    public void produce() throws InterruptedException{
        int value = 0;
        while(true){
            synchronized(this){
                while (list.size() == capcity)
                    wait();
                System.out.println("producer produced: "+value);
                list.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException{
        while(true){
            synchronized(this){
                while(list.size() == 0)
                    wait();
                int value = list.removeFirst();
                System.out.println("consumer consumed: "+value);
                notify();
                Thread.sleep(1000);
            }
        }
    }

}