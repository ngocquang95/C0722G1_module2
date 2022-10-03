package ss10_dsa_list;

import java.util.LinkedList;

public class LinkedListStudy {
    public static void main(String[] args) {
        //generic
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println(linkedList.get(2));
    }
}
