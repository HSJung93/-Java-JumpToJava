package thread;

import java.util.ArrayList;

// Thread를 extends 하던 것에서 Runnable을 implements 하도록 변경되었다.
public class RunnableTest implements Runnable {
    int seq;
    public RunnableTest(int seq) {
        this.seq = seq;
    }
    // Runnable 인터페이스는 run 메소드를 구현하도록 강제한다.
    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {
        }
        System.out.println(this.seq+" thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0; i<10; i++) {
            Thread t = new Thread(new RunnableTest(i));
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }
}
