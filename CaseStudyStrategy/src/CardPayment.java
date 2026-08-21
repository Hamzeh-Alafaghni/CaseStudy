class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing credit card payment of " + amount + " JOD. (Includes bank fees)");
    }
}