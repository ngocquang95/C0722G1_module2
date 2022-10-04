package ss20_design_pattern._2_factory_method_pattern;

public class BankFactory {
    /*
    type = 1 => TPBank
    type = 2 => VietcomBank
    null
     */
    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                return null;
        }
    }
}
