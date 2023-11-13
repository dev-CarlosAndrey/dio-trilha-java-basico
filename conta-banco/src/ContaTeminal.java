import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) {

        // criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu número: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite agora sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor agora digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // imprindo os dados digitados pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + " e já está disponível para saque.");

    }
    
}
