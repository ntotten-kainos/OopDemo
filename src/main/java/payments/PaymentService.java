package main.java.payments;

import main.java.interfaces.IPay;

public class PaymentService {
    public void pay(IPay iPay) {
        iPay.setPaid(true);
    }
}
