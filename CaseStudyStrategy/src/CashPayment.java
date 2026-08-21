class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing cash payment of " + amount + " JOD.");
    }
}
