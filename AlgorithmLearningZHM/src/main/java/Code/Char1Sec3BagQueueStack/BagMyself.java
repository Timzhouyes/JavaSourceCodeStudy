package Code.Char1Sec3BagQueueStack;

import edu.princeton.cs.algs4.Stack;

public class BagMyself {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(13); //自动装箱
        int a = stack.pop(); //自动拆箱
        System.out.println(a);
    }

}
