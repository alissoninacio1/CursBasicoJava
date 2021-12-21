//como quiero trabajar con Arrays, tengo que importar cosas
import java.util.Arrays;

public class FloatVetor {
    public static void main(String[] args) {
        
        double[] vetor = {9.24, 3.25, 1.67, 5.56};
        //usando foreach (o tipo de variabe deve concordar com o tipo de vetor)
        for (double decimais : vetor) {
            //para um novo vetor chamado decimais, pegar cada elemento de 'vetor' e redesigná-lo
            System.out.print(decimais + " ");
            // deixei o print em vez de println, para não haver line breaks 
        }


        /*outro exemplo*/
        System.out.println("\n "); //solo para dejar un espacio
        
        Arrays.sort(vetor); //sort hace que tus vetores sean organizados
        for (double decimais : vetor) {
            System.out.print(decimais + " ");
        }


        /*outro exemplo*/
        System.out.println("\n"); //solo para dejar un espacio
        
        //int[] vet or int vet[]
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int numeros : vet) {
            System.out.print(numeros + " ");
        }
        System.out.println("");//white line

        int p = Arrays.binarySearch(vet, 1); 
        //binary search
        System.out.println("I found the value in the position " + p);


        
        /*outro exemplo*/
        //crio um arra com 20 elementos e os preencho com o valor 20
        System.out.println(""); //solo para dejar un espacio
        int[] v = new int[10];
        Arrays.fill(v, 10); //in built func
        for(int valor: v) {
            System.out.print(valor + " ");
        }

    }
}
