package p3;

import java.util.Scanner;

class MylogicThread implements Runnable{
	private int lines;
	MylogicThread(int lines){
		this.lines=lines;
	}
	@Override
	public void run() {
		for(int i=0;i<lines;i++) {
			try {
				Thread.sleep(1000);
			System.out.print(Thread.currentThread().getName()+" "+" Started ");
				System.out.print("*"+" ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(Thread.currentThread().getName()+" "+"Finished");
	}
}

public class Q61 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" "+"main Started");
		System.out.println("enter number of lines");
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		MylogicThread mt=new MylogicThread(line);
		Thread t=new Thread(mt,"Child");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        sc.close();
        System.out.println(Thread.currentThread().getName()+" "+"main finished");
	}

}