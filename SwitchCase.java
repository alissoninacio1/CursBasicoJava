
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEscreva o numero de pernas: ");
        int pernas = scan.nextInt();
        
        System.out.println("Isso é um(a): ");

        String tipo;

        switch (pernas) {
            case 1:
                tipo = "perneta ou saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }

        System.out.print(tipo);
        scan.close();
    }
}
