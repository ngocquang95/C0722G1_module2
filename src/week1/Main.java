package week1;

public class Main {
    public static void main(String[] args) {
        // name: biến đối tượng
        // "Ngọc QUang": đối tượng
//        int x = 2;
//
//        String name = "Ngọc QUang";
//
//        String name2 = new String("Ngọc QUnag");

        //str1 có miền giá trị là "Nguyễn Ngọc Quang"
        String str1 = "Nguyễn Ngọc Quang";
        String str2 = "Nguyễn Ngọc Quang";
        String str3 = new String("Nguyễn Ngọc Quang");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true

        System.out.println(1 + "" == "1");
        System.out.println(1 == Integer.parseInt("1"));
    }
}
