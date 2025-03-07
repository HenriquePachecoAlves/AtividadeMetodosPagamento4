
package Application;

import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = generatePixCode();
        System.out.println("Pagamento via PIX no valor de R$" + amount + " processado.");
        System.out.println("Codigo PIX: " + pixCode);
    }

    private String generatePixCode() {
        Random random = new Random();
        return "PIX" + random.nextInt(1000000);
    }
}