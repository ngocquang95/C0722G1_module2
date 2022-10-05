package ss21_structural_design._1_proxy_design;

public class InternetReal implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Chào mừng bạn đến với: " + serverHost);
        System.out.println("Kết thúc không lỗi lầm");
    }
}
