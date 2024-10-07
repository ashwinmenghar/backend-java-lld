package threads.helloworldprinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world, This is printer by " + Thread.currentThread().getName() +" thread");

        HelloWorldPrinter hwt = new HelloWorldPrinter();
        Thread thread = new Thread(hwt);

        thread.start();

        System.out.println("This is written at end " + Thread.currentThread().getName() +" thread");

    }
}

