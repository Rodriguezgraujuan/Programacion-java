package Package3;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    static Scanner in = new Scanner(System.in);
    public static int pedirnum(){
        System.out.println("Introduce un numero");
        return in.nextInt();
    }

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
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                media += anInt;
                cantidadnum++;
            }
        }
        return media/cantidadnum;
    }

    public static boolean matrizexistenum(int[][] matriz){
        int num = pedirnum();
        boolean numexiste=false;
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                if (anInt == num) {
                    numexiste = true;
                    break;
                }
            }
        }
        return numexiste;
    }

    public static int repitenum(int[][] matriz){
        int num = pedirnum();
        int contador =0;
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                if (num==matriz[i][j]){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int[][] matrizSuma(int[][] matrizop1,int[][] matrizop2 ){
        int[][] matrizResultado= new int[3][3];
        for (int i =0; i<matrizop1.length; i++){
            for (int j = 0; j<matrizop1.length; j++){
                matrizResultado[i][j]=matrizop1[i][j]+matrizop2[i][j];
            }
        }
        return matrizResultado;
    }

    public static int[][] matrizResta(int[][] matrizop1,int[][] matrizop2 ){
        int[][] matrizResultado= new int[3][3];
        for (int i =0; i<matrizop1.length; i++){
            for (int j = 0; j<matrizop1.length; j++){
                matrizResultado[i][j]=matrizop1[i][j]-matrizop2[i][j];
            }
        }
        return matrizResultado;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizop1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizop2 = new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        matrizPrint(matriz);
        System.out.println(matrizMaximo(matriz));
        System.out.println(matrizMinimo(matriz));
        System.out.println(matrizMedia(matriz));
        if(matrizexistenum(matriz)){
            System.out.println("Si existe");
        }else{
            System.out.println("No existe");
        }
        System.out.println("El numero se repite " + repitenum(matriz) + " veces");
        System.out.println(Arrays.deepToString(matrizSuma(matrizop1, matrizop2)));
        System.out.println(Arrays.deepToString(matrizResta(matrizop1, matrizop2)));
    }
}
