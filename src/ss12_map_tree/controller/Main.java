package ss12_map_tree.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Vịnh");
        stringMap.put(2, "Công");
        stringMap.put(3, "Sang");
        stringMap.put(4, "Thành");
        stringMap.put(5, "Bảo");
        // Cách 1
        //Lấy tất cả các key của map
        Set<Integer> integerSet = stringMap.keySet(); // 1 2 3 4 5
        System.out.println(integerSet);

        stringMap.put(6, "Linh");

        System.out.println(integerSet); // 1 2 3 4 5 6

//        for (Integer key : integerSet) {
//            System.out.printf("%d - %s\n", key, stringMap.get(key));
//        }
//
//        // Cách 2
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
        }
    }
}
