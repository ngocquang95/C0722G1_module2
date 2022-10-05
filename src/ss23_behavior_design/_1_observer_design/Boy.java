package ss23_behavior_design._1_observer_design;

public class Boy implements Observer {
    private String name;

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " Đã hiểu và đã cập nhật lại trạng thái");
    }
}
