package thread;

import java.util.ArrayList;

public class ThreadTest extends Thread {
    int seq;
    public ThreadTest(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {

        }
        System.out.println(this.seq+" thread end.");
    }

    public static void main(String[] args) {

        // 쓰레드가 모두 수행되고 종료되기 전에 main 메소드가 먼저 종료
        // for(int i=0; i<10; i++) {
        //     Thread t = new Test(i);
        //     t.start();
        // }
        // System.out.println("main end.");

        // 모든 쓰레드가 종료된 후에 main 메소드를 종료
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0; i<10; i++) {
            Thread t = new ThreadTest(i);
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                //  join 메소드는 쓰레드가 종료될 때까지 기다리게 하는 메서드
                // 쓰레드 프로그래밍 시 가장 많이 실수하는 부분이 바로 쓰레드가 종료되지 않았는데 쓰레드가 종료된 줄 알고 그 다음 로직을 수행하게 만드는 일이다. 쓰레드가 종료된 후 그 다음 로직을 수행해야 할 때 꼭 필요한 것이 바로 이 join 메소드이다.
                t.join();
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }
}

