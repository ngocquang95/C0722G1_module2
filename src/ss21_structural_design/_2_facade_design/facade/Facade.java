package ss21_structural_design._2_facade_design.facade;

import ss21_structural_design._2_facade_design.service.EmailService;
import ss21_structural_design._2_facade_design.service.PaymentService;
import ss21_structural_design._2_facade_design.service.ShippingService;

public class Facade {
    private EmailService emailService = new EmailService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void payment(String email) {
        emailService.confirmEmail(email);
        paymentService.payment();
        shippingService.shipping();
    }
}
