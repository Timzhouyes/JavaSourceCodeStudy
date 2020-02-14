package Code.Char1Sec3BagQueueStack;

public class FixedLengthStack<T> {
    private T[] a;
    private int N;

    public FixedLengthStack(Integer length) {
        a = (T[]) new Object[length];
    }

    public void push(T t) {
        if (a.length == N) throw new IndexOutOfBoundsException("Out of range!");
        a[N++] = t;
    }

    public T pop() {
        if (a.length == 0) throw new NullPointerException("Already no elemet to pop!");
        return a[--N];
    }
}
