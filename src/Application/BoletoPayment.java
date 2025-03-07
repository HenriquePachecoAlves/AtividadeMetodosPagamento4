
package Application;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = generateBoletoCode();
        System.out.println("Pagamento via Boleto no valor de R$" + amount + " processado.");
        System.out.println("Código do Boleto: " + boletoCode);
    }

    private String generateBoletoCode() {
        Random random = new Random();
        return "BOLETO" + random.nextInt(1000000);
    }
}