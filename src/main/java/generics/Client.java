package generics;

public class Client {

    public static void main(String[] args) {

        Pair p1 = new Pair(1.222, "Ashwin");
//        Pair p2 = new Pair(12, "ashwin");

        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        PairGenericType<Double, String> PG1 = new PairGenericType<>(10.44, "Ashu");
//        PairGenericType<Double, String> PG2 = new PairGenericType<>(10.44, "Ashu");
        System.out.println(PG1.getFirst());
        System.out.println(PG1.getSecond());





    }
}
