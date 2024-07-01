public class PaymentService {
    public void pay(IPay iPay) {
        iPay.setPaid(true);
    }
}
