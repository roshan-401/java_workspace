package CO5;
class Multiplication extends Thread {
	public Multiplication() {
		for(int i=1;i<11;i++) {
			System.out.println(i*5);
		}
	}
}
class PrimeNumbers extends Thread{
	 PrimeNumbers(int n) {
		 boolean flag;
		for(int i=2;i<=n;i++) {
			flag = true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) System.out.println(i);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		
		PrimeNumbers p1 = new PrimeNumbers(20);
		Multiplication m1 = new Multiplication();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(m1);
		t1.run();
		t2.run();
	}
}