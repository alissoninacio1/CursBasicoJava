

/**
 * ProgramaMedia
 */

import java.util.Scanner;
import java.util.Locale;

public class ProgramaMedia {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nWrite the first grade: ");
        float n1 = scan.nextFloat();
        System.out.println("\nWrite the second grade: ");
        float n2 = scan.nextFloat();

        float media = (n1 + n2) / 2;

        if (media > 8 && media < 9.9) {
            System.out.println("\n Congrats! You have a good grade.");
        }

        else if (media >= 7 && media <= 8) {
            System.out.println("\n You passed!");
        }

        else if (media == 10) {
            System.out.println("\n You're a genius when studying!");
        }

        else {
            System.out.println("\n So sorry! You need to study more! \n");
        }



        scan.close();
    }   
}