package ss20_design_pattern._2_factory_method_pattern;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        bank.getBankName();
    }
}
