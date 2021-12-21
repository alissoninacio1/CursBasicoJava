public class OperadoresUnarios {
    public static void main(String[] args) {

        int numero = 5;
        int valor = 5 + numero++; 
        //pós-inremento - depois que eu fizer esta operação, 
        //o valor de numero será aumentado em 1 na próxima vez que eu usá-lo
        
        //int valor2 = 5 + ++numero; 

        //pré-incremento, que vem antes da variável, faz a alteração
        //da variavel numero antes de terminr a operação, ou seja, ele muda o valor
        // e o usa na operação.
        System.out.println(valor);
    }
}
