public class Vetor {
    public static void main(String[] args) {
        
        //assimilar o array mes com os dias
        //mes
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dec"};
        
        //dias
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < mes.length; i++) {            
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias ao todo.");
            //repare que enquanto localiza o [i] no mes, também localiza o [i] no dia. 
        }
    }
}
