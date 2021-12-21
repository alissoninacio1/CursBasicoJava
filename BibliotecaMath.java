public class BibliotecaMath {
    public static void main(String[] args) {
        
        float v = 8.9f; //quando o valor nao vem de um input, eu uso o 'f'
       
        //arredondar para baixo
        int ar = (int) Math.floor(v); 
        //sem o int do typecast, dá um erro de conversao,
        //por isso voce tem que forçá-lo usando o typecast

        System.out.println(ar);

        //arredondar para cima
        float num = 8.1f;
        int cima =(int) Math.ceil(num);
        System.out.println(cima);

        //arredondamento aritimético
        float num2 = 8.5f;
        int arit = (int) Math.round(num2);
        System.out.println(arit);



        // random numbers
        double ale = Math.random();
        System.out.println(ale);

        /*
        Uma forma mais simples, objetiva e "elegante" de gerar números 
        aleatórios é importar a biblioteca Random (import java.util.
        Random) e criar um referência à Random, (exemplo, Random r = new Random(); )
        e para pegar o número basta um r.nextInt(numero_limite); */
    }
}
