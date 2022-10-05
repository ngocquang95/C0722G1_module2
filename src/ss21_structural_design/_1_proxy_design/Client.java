package ss21_structural_design._1_proxy_design;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet = new InternetProxy();

        internet.connectTo("https://james.codegym.vn");;
    }
}
