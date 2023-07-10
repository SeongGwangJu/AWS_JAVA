package ch24_쓰레드;

public class 분신_만들기 {
	public static void main(String[] args) {
		
		분신 분신1 = new 분신();
		분신 분신2 = new 분신();
		분신 분신3 = new 분신();
		분신 분신4 = new 분신();
		분신 분신5 = new 분신();
		분신 분신6 = new 분신();
		Thread thread1 = new Thread();
		Thread thread2 = new Thread();
		
		분신1.start(); //분신 클래스의 run메소드 실행.
		분신2.start();
		thread1.start();
		thread2.start();
		
		분신4.start();
		
	}
}
