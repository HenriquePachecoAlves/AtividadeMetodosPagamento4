
package Application;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do cartao de credito: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento no valor de R$" + amount + " processado com o cartao " + cardNumber);
    }
}