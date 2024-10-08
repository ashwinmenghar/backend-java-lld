package generics;

public class PairGenericType<T, U> {
    private  T first;
    private  U second;

    public PairGenericType(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }


}
