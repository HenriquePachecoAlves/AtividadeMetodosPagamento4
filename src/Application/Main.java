
package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();


        System.out.println("Escolha o metodo de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartao de Credito");
        System.out.println("3: Boleto");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                paymentProcessor.setPaymentStrategy(new PixPayment());
                break;
            case 2:
                paymentProcessor.setPaymentStrategy(new CreditCardPayment());
                break;
            case 3:
                paymentProcessor.setPaymentStrategy(new BoletoPayment());
                break;
            default:
                System.out.println("Opcao invalida.");
                return;
        }


        System.out.print("Digite o valor da transaçao: ");
        double amount = scanner.nextDouble();

        paymentProcessor.processPayment(amount);
    }
}