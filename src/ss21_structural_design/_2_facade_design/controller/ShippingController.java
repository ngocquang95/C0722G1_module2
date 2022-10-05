package ss21_structural_design._2_facade_design.controller;

import ss21_structural_design._2_facade_design.facade.Facade;

public class ShippingController {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.payment("quang.nguyen");
    }
}
