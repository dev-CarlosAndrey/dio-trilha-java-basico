import java.util.Scanner;
import java.util.Locale; 
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.println("Contando numero:" + i);
    }
    System.out.println("Contador funcionando");
    }
}
