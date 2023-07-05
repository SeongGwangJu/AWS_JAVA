package ch_24_쓰레드;

public class ThreadTest implements Runnable{

    /**
     *
     */
    @Override
    public void run() {
        System.out.println("세번째 스레드 실행");
    }
}
