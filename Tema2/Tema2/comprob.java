package Tema2;

import java.util.Arrays;

public class comprob {


   public static void main(String[] args) {
       int[][] matrizOriginal = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
       };

       int[][] matrizNueva = new int[4][4];

       for (int i = 0; i < matrizOriginal.length; i++) {
           for (int j = 0; j < matrizOriginal[i].length; j++) {
               matrizNueva[i][j] = matrizOriginal[i][j];
           }
       }
       int[][] matriz2 = new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,10}};
       System.out.println(Arrays.deepToString(matrizOriginal));
       System.out.println(Arrays.deepToString(matrizNueva));
   }
}
