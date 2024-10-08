package generics.tripleExample;

public class Triplet<Type> {
    private Type left;
    private Type right;
    private Type middle;

    public Triplet(Type left, Type middle, Type right) {
        this.left = left;
        this.right = right;
        this.middle = middle;
    }

    public Type getMiddle() {
        return middle;
    }

    public Type getRight() {
        return right;
    }

    public Type getLeft() {
        return left;
    }
}
