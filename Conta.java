public class Conta {
    static int myMethod(int x, int y) {
      return x + y;
    }
  
    public static void main(String[] args) {
      System.out.println(myMethod(5, 3));
    }
  }
  

  //The void keyword, used in the examples above, indicates that the method should not return a value.
  //If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, 
  //and use the return keyword inside the method