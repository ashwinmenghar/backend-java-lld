package threads.helloworldprinter;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Run print by " + Thread.currentThread().getName() +" thread");
    }
}
