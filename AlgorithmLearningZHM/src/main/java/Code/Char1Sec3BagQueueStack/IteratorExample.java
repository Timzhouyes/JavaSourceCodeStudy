package Code.Char1Sec3BagQueueStack;

import java.util.Iterator;
import java.util.Stack;

public class IteratorExample {
    public static void main(String[] args) {
        Stack<String> collection = new Stack<>();
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

    }
}
