public class Bridge {
    public static void main(String[] args) {
        PaymentProcess visaPaymentProcessor = new VisaPaymentProcess("1234.3456.xxx", "12/25", "123");
        MemberRegistration membership = new MemberRegistration(visaPaymentProcessor);
        membership.register();

        PaymentProcess momoPaymentProcessor = new MomoPaymentProcess("09090909090");
        MemberRegistration membershipMomo = new MemberRegistration(momoPaymentProcessor);
        membershipMomo.register();
    }
}

abstract class PaymentProcess {
    public abstract void pay(double amount);
}

class VisaPaymentProcess extends PaymentProcess {
    private final String cardNumber;
    private final String expiryDate;
    private final String cvv;

    public VisaPaymentProcess(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " USD with visa card " + cardNumber + "...");
        // TODO: Implement logic...
    }
}

class MomoPaymentProcess extends PaymentProcess {
    private final String phoneNumber;

    public MomoPaymentProcess(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " VND with momo card " + phoneNumber + "...");
        // TODO: Implement logic...
    }
}

class MemberRegistration {
    private final PaymentProcess paymentProcessor;

    public MemberRegistration(PaymentProcess paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void register() {
        double amount = 100; // the registration fee
        paymentProcessor.pay(amount);
        System.out.println("Registered for Youtube membership!");
    }
}


