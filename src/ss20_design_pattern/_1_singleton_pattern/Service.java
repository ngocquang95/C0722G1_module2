package ss20_design_pattern._1_singleton_pattern;

public class Service {
    public Service() {
        System.out.println("Constructor được gọi");
    }

//    private static Service service = new Service();
//
//    public static Service getInstance() {
//        return service;
//    }

    private static Service service;

    public static synchronized Service getInstance() {
        if (service == null) {
            service = new Service();
        }
        return service;
    }

    public void add() {

    }

    public void edit() {

    }
}
