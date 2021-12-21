import java.util.Scanner;

public class FatorialNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWrite a number: ");
        int num = scan.nextInt();

        int f = 1;
        int c = num;
        System.out.print(num + "! = ");//todos os prints simples que eu dou, vão parar na mesma linha usando print e não println

        while (c > 0) {

            if(c == 1) {
                System.out.print("1 = " + f);
                break;
            }

            System.out.printf("%d X ",c);
            f *= c;
            c--;
        }
        
        scan.close();
    }
}
