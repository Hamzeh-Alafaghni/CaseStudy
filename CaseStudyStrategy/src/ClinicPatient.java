class ClinicPatient {
    private PaymentStrategy paymentStrategy;

    public ClinicPatient(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payBill(int amount) {
        paymentStrategy.pay(amount);
    }
}