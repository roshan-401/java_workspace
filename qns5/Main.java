package qns5;
// class PrimeNumbers implements Runnable{
    //     private int n;
    //     public PrimeNumbers(int n){
        //         this.n = n;
        //     }
        //     @Override
        //     public void run(){
//         boolean flag = true;
//         for(int i=2;i<n;i++){
//             flag = true;
//             for(int j=2;j<i/2;j++){
//                 if(i%j == 0){
//                     flag = false;
//                     continue;
//                 }
//             }
//             if(flag) System.out.println(i);
//         }
//     }
// }
// class MultiplicationTable implements Runnable{
    //     private int n;
    //     public MultiplicationTable(int n){
        //         this.n = n;
        //     }
        //     @Override
        //     public void run(){
            //         try{
                //             Thread.sleep(10);
                //             for(int i=1;i<n;i++){
//             System.out.println(i+":"+i*5);
//             }
//         }catch(Exception e){
    //             System.out.println(e);
    //         }
    
    //     }
    // }
    class PrimeNumbers extends Thread{
        public void run(){
            try{
                boolean flag = true;
                for(int i=2;i<101;i++){
                    Thread.sleep(11);
                    flag = true;
                    for(int j=2;j<i/2;j++){
                        if(i%j == 0){
                            flag = false;
                            continue;
                        }
                    }
                    if(flag) System.out.println(i);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    class MultiplicationTable extends Thread{
        public void run(){
            try{
                for(int i=1;i<101;i++){
                    Thread.sleep(10);
                    System.out.println(i+":"+i*5);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
public class Main {
    public static void main(String[] args) {
        PrimeNumbers p1 = new PrimeNumbers();
        MultiplicationTable m1 = new MultiplicationTable();
        p1.start();
        m1.start();
        // Thread t1 = new Thread(new PrimeNumbers(101));
        // Thread t2 = new Thread(new MultiplicationTable(101));
        // t1.start();
        // t2.start();
    }
}
