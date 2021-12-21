public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4; 
        y = 7;
        z = 12;

        boolean r; 

        r = (x<y ^ y!=z) ? true:false; //xor, exclusivamente verdadero.
        System.out.println(r);
    }
}
