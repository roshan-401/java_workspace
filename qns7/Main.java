package qns7;
class Message{
    private String content;
    private boolean empty = true;

    public synchronized String read(){
        while(empty){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        empty = true;
        notifyAll();
        return  content;
    }
}
public class Main {
    
}
