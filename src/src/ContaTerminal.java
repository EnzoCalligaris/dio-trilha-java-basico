import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int accountNum;
        String agency, clientName;
        double balance;

        System.out.println("--- Cadastro de Nova Conta ---");

        System.out.println("Digite o número da Conta !");
        accountNum = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        sc.nextLine();
        agency = sc.nextLine();

        System.out.println("Por favor, digite seu Nome !");
        clientName = sc.nextLine();

        System.out.println("Por favor, digite o valor que quer Depositar !");
        balance = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", clientName, agency, accountNum, balance);


        sc.close();
    }
}
