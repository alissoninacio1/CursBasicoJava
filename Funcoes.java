public class Funcoes {
    
    //fazendo duas funções/métodos
    //como estou usando o void = que quer dizer que não retorna nada
    //não preciso usar o return = retorna algo
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        soma(5, 2);
    }
}
