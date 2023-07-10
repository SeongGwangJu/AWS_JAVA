package ch24_쓰레드;

public class ThreadMain {
    public static void main(String[] args) { //one of a Thread
        Thread thread1 = new Thread(() -> {
            System.out.println("스레드 이름 : " + Thread.currentThread().getName());
            for(int i = 0; i < 50; i++) {
                System.out.print(Thread.currentThread().getName() + " : ");
                System.out.println(i + " " + Thread.currentThread().getName());

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "1번 스레드"); //-> 뒤는 Runnable 객체.

        Thread thread2 = new Thread(() -> {
            System.out.println("스레드 이름 : " + Thread.currentThread().getName());
            for(int i = 0; i < 50; i++) {
                System.out.print(Thread.currentThread().getName() + " : ");
                System.out.println(i + " " + Thread.currentThread().getName());
            } //위 코드를 실행시켜보면, 1번스레드와 2번스레드 그리고 for문 안의 4줄 모두가 제각각 실행되고있다.
        }, "2번 스레드"); //러너블의 기본형태 : 매개변수도, 객체도 없다
        Thread thread3 = new Thread(new ThreadTest(), "3번 스레드"); //Runnable을 imple한 Test클래스의 인스턴스 생성해 Thread 객체 생성자에 전달
        //so thread3는 run()메서드를 실행하는 스레드임.
        Thread thread4 = new Thread(new Runnable() { //익명클래스
            @Override
            public void run() {
                System.out.println("스레드 이름 : " + Thread.currentThread().getName());
                System.out.println("네번째 스레드 실행");
            }
        }, "4번 스레드");


        thread1.start(); // thread 객체 안의 메소드
/*        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        thread2.start();
/*
        thread3.start();
        thread4.start();
*/



    }
}
