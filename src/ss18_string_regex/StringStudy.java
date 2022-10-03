package ss18_string_regex;

public class StringStudy {
    public static void main(String[] args) {
        String name = "Đức Vịnh"; // String is immutable???

        name = "Đăng Công";
        name = name.concat(" 1");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Đăng Công");

        StringBuilder stringBuilder2 = stringBuilder;

        stringBuilder.append(" 1");

        System.out.println(stringBuilder == stringBuilder2);

        String str = "";
        for(int i = 0; i <= 10; i++) {
            str += "Hello "; // Tuyệt đối cấm
        }



        //Chuyển đổi kiểu dữ liệu
        String s1 = "Sang";
        StringBuilder stringBuilder1 = new StringBuilder(s1);
        stringBuilder1.reverse();// Đảo string

        s1 = stringBuilder1.toString();
        System.out.println(s1);
    }
}
