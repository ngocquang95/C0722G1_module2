package ss18_string_regex;

public class RegexStudy {
    public static void main(String[] args) {
        String regex = "abc";
        String name = "abc";
        System.out.println(name.matches(regex));
        System.out.println("abc".matches("abc"));

//        Dấu ngoặc vuông [...] => Đại diện cho 1 ký tự trong 1 tập ký tự
        System.out.println("b".matches("[abc]"));


        // Dấu gạch ngang (-) => biểu thức biểu diễn tập hợp các ký tự liên tục
        System.out.println("5".matches("^[a-z0-9A-Z]$"));

        // Dấu mũ (^) => Ngoại trừ tập hợp ký tự mẫu khi nằm trong []
        System.out.println("a".matches("[^a-z]"));

        // Sử dụng ký tự *  => 0 hoặc nhiều lần lặp lại
        System.out.println("SV001".matches("SV[0-9]*"));

        // Sử dụng ký tự + => 1 hoặc nhiều lần

        // Sử dụng ký tự ? => 0 hoặc 1 lần

        //Sử dụng ký tự ngoặc ngọn {}
        // {n}: Lặp n lần
        // {n,m}: Có n đến m ký tự
        // {n,}: Có n ký tự trở lên
        System.out.println("A001".matches("[A-Z][0-9]{3}"));

        System.out.println("graay".matches("gr(aa|ee)y"));
        System.out.println("graey".matches("gr[ae]y"));

        System.out.println("_".matches("\\w"));

        //(+84)
        System.out.println("(".matches("[(]"));
        System.out.println("(".matches("[(][+]"));
        System.out.println("%".matches("[.]"));

        String name2 = "Nguyen Ngoc Quang";
        if (name2.split(" ").length >= 2 && name2.split(" ").length <= 6) {
            System.out.println("Co 6 tu");
        }

        System.out.println(name2.matches("[a-zA-Z ]+"));

    }
}
