public class Main {
    static void main(String[] args) {

        ClinicPatient patient = new ClinicPatient(new CashPayment());
        patient.payBill(50);

        System.out.println("Patient switched payment method...");
        patient.setPaymentStrategy(new CardPayment());
        patient.payBill(50);
    }
}