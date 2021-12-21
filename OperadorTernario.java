public class OperadorTernario {
    public static void main(String[] args) {
        
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2) ? 0:1; //igual ao JS ou o JS é igual ao Java
        System.out.println(r);

        //comparando strings
        String nome1 = "Alisson";
        String nome2 = "Alisson";
        String nome3 = new String("Alisson"); //objeto

        String res;
        String ras;
        res = (nome1==nome2) ? "igual" : "diferente";
        System.out.println(res);

        ras = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(ras);
    }
}
