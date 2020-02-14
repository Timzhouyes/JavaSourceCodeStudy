package Code.Char1Sec3BagQueueStack;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * This class is exercise of "Stack" class.
 */
public class StackExercise<T> implements Iterable<T> {
    private Node first;
    private int N;

    private class Node {
        T t;
        Node next;
    }

    public boolean isEmpty() {
        return (N == 0);
    }

    public int size() {
        return N;
    }

    public void push(T t) {
        Node oldfirst = first;
        first = new Node();
        first.t = t;
        first.next = oldfirst;
        N++;
    }

    public T pop() {
        T oldt = first.t;
        first = first.next;
        N--;
        return oldt;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = first;

        public boolean hasNext() {
            return (current.next != null);
        }

        public T next() {
            T t = current.t; //Here returning value is the value "now". Not next.
            current = current.next;
            return t;
        }
    }
}
