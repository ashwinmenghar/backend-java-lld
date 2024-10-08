package generics.tripleExample;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triplet<String> idNameEmail = new Triplet<>("1", "Ashwin", "ashwin@gmail.com");
        Triplet<Integer> idAgeRollNo = new Triplet<>(1, 26, 21);
        Triplet<Long> idAgeRollNoLong = new Triplet<>(1L, 26L, 21L);
        Triplet<Integer> numbers = new Triplet<>(11, 2, 3);


        List<Triplet<String>> triplets = List.of(idNameEmail, idNameEmail);
        List<Triplet<Integer>> triplets1 = List.of(idAgeRollNo, idAgeRollNo);

//        print(triplets);
//        print(triplets1);

        System.out.println(AVG(numbers));
        System.out.println(AVG(idAgeRollNoLong));
    }
    public static <TYPE> void print(List<Triplet<TYPE>> triplets) {
        for(Triplet<TYPE> triplet : triplets) {
            System.out.println(triplet.getLeft() + "-----" + triplet.getMiddle() + "-----" + triplet.getRight());
        }
    }

//    Write another method to find the average and return
    public static Double AVG(Triplet<? extends Number> triplets) {
        return (triplets.getLeft().doubleValue() + triplets.getMiddle().doubleValue() +
                    triplets.getRight().doubleValue()) / 3;
    }
}
