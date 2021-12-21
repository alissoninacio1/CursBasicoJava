import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, s=0; 
        String response;

        do {
            System.out.println("\nDigite um número: ");
            n = scan.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N] ");
            response = scan.next();
        } while (response.equals("S"));

            System.out.println("\nA Soma de todos os valores é " + s);

        scan.close();
    }
}
