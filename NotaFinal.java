
import java.util.Scanner;
import java.util.Locale;//para usar o ponto decimal no terminal porque o meu latptop está em pt-br
public class NotaFinal {
    public static void main(String[] args) {

        //calling input imports
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        /*defining variables*/

        //name
        System.out.println("\nWrite the student name: ");
        String name = scan.nextLine();

        //notes
        System.out.println("\nWrite the first score: ");
        float firstNote = scan.nextFloat();

        System.out.println("\nWrite the second score: ");
        float secondNote = scan.nextFloat();

        //get the average
        float average = (firstNote + secondNote) / 2;

        //printing on screen a well formatted string 
        System.out.printf("\n Name: %s\n Score 1: %.2f\n Score 2: %.2f\n Average: %.2f\n", name, firstNote, secondNote, average);

        //a code that I noticed that isn't necessary in NetBeans, but here is. 
        scan.close();
    }
}
