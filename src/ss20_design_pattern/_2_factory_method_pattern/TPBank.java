package ss20_design_pattern._2_factory_method_pattern;

public class TPBank implements Bank {
    @Override
    public void getBankName() {
        System.out.println("TPBank");
    }
}
