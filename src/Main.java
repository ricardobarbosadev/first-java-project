import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Locale localPortugal = new Locale("pt", "PT");
        Locale localBrasil = new Locale("pt", "BR");

        String name = "Ricardo Barbosa";
        String accountType = "Corrente";
        double balance = 2500.00;


        int optionChoosen = 0;
        while (optionChoosen != 4) {
            System.out.println("Selecione a opção pretendida: " +
                    " 1 - Consultar informação." +
                    " 2 - Receber valor." +
                    " 3 - Transferir valor." +
                    " 4 - Sair.");


            optionChoosen = scanner.nextInt();


            switch (optionChoosen) {
                case 1:
                    System.out.println("*********************");
                    System.out.println("Nome de cliente: " + name);
                    System.out.println("Tipo de conta: " + accountType);
                    System.out.println("Saldo Disponível: " + NumberFormat.getCurrencyInstance(localPortugal).format(balance));
                    System.out.println("*********************");
                    break;
                case 2:
                    System.out.println("Indique o valor a receber");
                    double inputValue = scanner.nextDouble();
                    balance += inputValue;
                    System.out.println("Valor recebido: " + NumberFormat.getCurrencyInstance(localPortugal).format(inputValue) + " Saldo atual: " + NumberFormat.getCurrencyInstance(localPortugal).format(balance));
                    break;
                case 3:
                    System.out.println("Indique o valor a transferir");
                    double outputValue = scanner.nextDouble();
                    balance -= outputValue;
                    System.out.println("Valor transferido: " + NumberFormat.getCurrencyInstance(localPortugal).format(outputValue) + " Saldo atual: " + NumberFormat.getCurrencyInstance(localPortugal).format(balance));
                    break;
                case 4:
                    System.out.println("A sair...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        }

        scanner.close();
    }
}






