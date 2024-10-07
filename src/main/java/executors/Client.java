package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(5);
//        ExecutorService executors = Executors.newCachedThreadPool();

        for(int i = 1; i <= 100; i++) {

            if(i == 5 || i == 11 || i == 88) {
                System.out.println("DEBUG");
            }
            PrintNumbers pn = new PrintNumbers(i);
            executors.execute(pn);
        }
    }
}
