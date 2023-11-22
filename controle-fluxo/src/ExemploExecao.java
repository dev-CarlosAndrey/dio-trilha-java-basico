import java.text.NumberFormat;

public class ExemploExecao {
    public static void main(String[] args) {
        Number valor = NumberFormat.getInstance().parse("a1.75"); 
        System.out.println(valor);
    }
}
