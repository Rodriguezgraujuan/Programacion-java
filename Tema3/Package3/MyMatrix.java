package Package3;

import java.util.Scanner;

public class MyMatrix {
    static Scanner in = new Scanner(System.in);

    public static void matrizPrint(int[][] matriz){
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }

    public static int matrizMaximo(int[][] matriz){
        int max = -1;
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                if (matriz[i][j]>max){
                    max=matriz[i][j];
                }
            }
        }
        return max;
    }

    public static int matrizMinimo(int[][] matriz){
        int min = matrizMaximo(matriz);
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                if (matriz[i][j]<min){
                    min=matriz[i][j];
                }
            }
        }
        return min;
    }

    public static int matrizMedia(int[][] matriz){
        int media = 0;
        int cantidadnum = 0;
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                media+=matriz[i][j];
                cantidadnum++;
            }
        }
        return media/cantidadnum;
    }

    public static boolean matrizexistenum(int[][] matriz, int num){
        boolean numexiste=false;
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                if (matriz[i][j]==num){
                    numexiste=true;
                }
            }
        }
        return numexiste;
    }
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       matrizPrint(matriz);
        System.out.println(matrizMaximo(matriz));
        System.out.println(matrizMinimo(matriz));
        System.out.println(matrizMedia(matriz));
        System.out.println("Introduce un numero");
        int num=in.nextInt();
        if(matrizexistenum(matriz,num)){
            System.out.println("Si existe");
        }else{
            System.out.println("No existe");
        }
    }
}
