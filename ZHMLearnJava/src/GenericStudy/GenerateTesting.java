package GenericStudy;

import java.util.ArrayList;
import java.util.List;

public class GenerateTesting {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("abcd");
        arrayList.add(1234);

        for (int i = 0; i < arrayList.size(); i++) {
            Object item = arrayList.get(i);
            System.out.println("Testing generic: " + item);
        }

    }
}
