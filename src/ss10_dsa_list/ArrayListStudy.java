package ss10_dsa_list;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //CRUD
        //C => add
        // R => get
        // U => set
        // D => remove
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList);
        arrayList.set(1, 1000);
        System.out.println(arrayList.get(2));
    }
}
