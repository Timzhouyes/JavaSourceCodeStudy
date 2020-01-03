package GenericStudy;

import java.util.ArrayList;

public class CheckArrayListType {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("abcde");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(12345);
        ArrayList<Object> arrayList3 = new ArrayList<>();
        arrayList3.add(123433);
        arrayList3.add("hahahaha");
        System.out.println(arrayList3);
        /*
        Here will show that below is always true
         */
        System.out.println(arrayList1.getClass() == arrayList2.getClass());
    }
}
