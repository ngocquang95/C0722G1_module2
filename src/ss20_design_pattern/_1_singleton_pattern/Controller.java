package ss20_design_pattern._1_singleton_pattern;

public class Controller {
    void test() {
        Service service = Service.getInstance();
        Service service2 = Service.getInstance();
        Service service3 = Service.getInstance();
        Service service4 = Service.getInstance();
        Service service5 = Service.getInstance();

        service.add();
        service2.edit();
    }
}
