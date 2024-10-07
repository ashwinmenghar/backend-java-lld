package threads.printNumbers;

public class Client {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            PrintNumbers pn = new PrintNumbers(i);
            Thread th = new Thread(pn);

            th.start();
        }
    }
}
