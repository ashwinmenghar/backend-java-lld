package synchronization.AdderSubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
//        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count);
        Subtractor sub = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both the threads have completed " +
                "count: " + count.value);
    }
}
