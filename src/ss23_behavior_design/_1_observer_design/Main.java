package ss23_behavior_design._1_observer_design;

public class Main {
    public static void main(String[] args) {
        Girl ngocTrinh = new Girl();
        ngocTrinh.add(new Boy("Bảo"));
        ngocTrinh.add(new Boy("Đăng Công"));
        ngocTrinh.add(new Boy("Sang"));
        ngocTrinh.add(new Boy("Phương"));
        ngocTrinh.add(new Boy("Đạt"));

        ngocTrinh.postImageToFaceBook();
    }
}
