public class Main {
    public static void main(String[] args) {
      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; 	 //1
      for (int i = 0; i < myNumbers.length; ++i) { 		// 2
         for(int j = 0; j < myNumbers[i].length; ++j) { // 3
            System.out.println(myNumbers[i][j]);
         }
      }
    }
 }
 //1 - multidimensional array
 // 2 - normal for loop
 // 3 - for inside another for: j < myNumbers[i].length
         /* j is the elements position and i is the arrays position ( element 			position of the array myNumbers, which represents another array 			   inside myNumbers).
         When i = 0, we have the first array, we get its length and loop through 		its elements while is less than the length of the array[i], which means, the array 0 or 1 or 2 or 3.... inside that array myNumber (wee need to have in mind that we need one array inside another */