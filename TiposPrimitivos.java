import java.util.Scanner; //quando o import não funciona no vs code, é só apertar Shift + Alt + o
import java.util.Locale;  // to use .useLocale(Locale.US);

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Scanner teclado = new Scanner(System.in); este código só vai ler em português por causa do idioma do computador
        //usar este
        Scanner scan = new Scanner(System.in).useLocale(Locale.US); //use import java.util.Locale

        System.out.print("\nWrite your name: ");
        String nome = scan.nextLine();

        System.out.print("\nWrite your grade: ");
        float nota = scan.nextFloat();
        

        //System.out.println("\n A nota é " + nota);
        //System.out.print("\n A nota é " + nota);

        //System.out.printf("\n A nota de %s é %.2f", nome, nota);
        System.out.format("\nThe student %s got a grade of: %.2f.\n", nome, nota);

        
        //como está dando um erro porque 'teclado' não fecha, coloquei este código.
        scan.close();
    }
}
