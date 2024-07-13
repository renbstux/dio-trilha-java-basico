import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws InputMismatchException {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome Completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.print("Qual a sua conta de usuario: ");
        int numero = scanner.nextInt();

        System.out.print("Qual o seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo U$" + saldo + " já está disponível para saque!");
        scanner.close();

    }
}
