package ch24_쓰레드;

public class 분신 extends Thread {
	private static int number;
	private int num;
	
	public 분신() {
		number += 1;
		num = number;
	}
	@Override //쓰레드라는 익명클래스 재정의
	public void run() {
		System.out.println(num + "개 분신 실행");
		while(true) {
			System.out.println(num + "분신 반복");
			
			try {
				Thread.sleep(3000); //반복하다가 3초동안 잠
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
