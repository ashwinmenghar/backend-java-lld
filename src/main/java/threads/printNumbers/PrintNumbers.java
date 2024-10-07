package threads.printNumbers;

public class PrintNumbers implements Runnable{
    int printNumber;

    public PrintNumbers(int printNumber) {
        this.printNumber = printNumber;
    }
    @Override
    public void run() {
        System.out.println("Printed by thread: " + Thread.currentThread().getName()
                + " => " + printNumber);
    }
}
