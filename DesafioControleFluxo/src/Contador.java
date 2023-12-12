import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        // Digitação dos numeros via terminal 
	Scanner scanner = new Scanner (System.in);
    int paramentroUm = scanner.nextInt();
    int paramentroDois = scanner.nextInt();
		
	try {
        contar(paramentroUm, paramentroDois);
    } catch (ParametrosInvalidosException error) {
        System.err.println("Error: " + error.getMessage());
        }
    }

    
static void contar (int paramentroUm, int paramentroDois) throws ParametrosInvalidosException {

    if (paramentroDois<paramentroUm) {
        throw new ParametrosInvalidosException("O segundo paramentro deve ser maior que o primeiro");
    }

    int contagem = paramentroDois - paramentroUm; 

    for (int i = contagem; i<=paramentroDois; i++) {
        
        System.out.println("Imprimindo o número " + i);
        
    }
    
}
    
}


