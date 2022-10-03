package ss11_stack_queue;

import java.util.ArrayList;

public class GenericStudy {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();

        int x = 10;
        Integer x2 = x; // autoboxing
        int x3 = x2; //unboxing
        char c = 'A';
        arrayList.add(1); // autoboxing
        arrayList.add(2);
        arrayList.add("hello");
        arrayList.add(3.5);

        int total = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Integer) {
                total += (Integer) arrayList.get(i);
            }
        }

        System.out.println("Tổng: " + total);
    }
}
