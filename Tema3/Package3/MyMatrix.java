package Package3;

import java.util.Scanner;

public class MyMatrix {
    static Scanner in = new Scanner(System.in);


    public static int[][] matrizcrear(int columnas, int filas){
       int[][] matrizcreada = new int[filas][columnas];
       for (int i = 0; i<matrizcreada.length;i++){
           for (int j = 0; j<matrizcreada[i].length; j++){
               System.out.println("Introduce el dato de la fila: " + (i+1)+ " columna: " +(j +1));
               int num = in.nextInt();
               matrizcreada[i][j]=num;
           }
       }

        return matrizcreada;
    }

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

    public static int columnaspedir(){
        System.out.println("Introduce las columnas");
        return in.nextInt();
    }

    public static int filaspedir(){
        System.out.println("Introduce las filas");
        return in.nextInt();
    }

    public static boolean filascolumnascheck(int columnas,int filas){
        boolean condition=true;
        if (columnas == 0 || filas == 0) {
            System.out.println("No pueden haber matriz vacias");
        } else {
            condition=false;
        }
        return condition;
    }

    public static boolean matrizunidadono(int[][] matriz){
        boolean matrizunidad=false;
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz.length;j++){
                if (matriz[i][i]==1&&j==i){
                    matrizunidad=true;
                }else if (matriz[i][j]==0&&j!=i){
                    matrizunidad=true;
                } else {
                    matrizunidad=false;
                    break;
                }
            }
        }
        return  matrizunidad;
    }

    public static void main(String[] args) {

        boolean condition = true;
        int columnas = 0;
        int filas = 0;
        /*
        while (condition) {
            filas = filaspedir();
            columnas = columnaspedir();
            condition = filascolumnascheck(columnas, filas);
        }
        int[][] matriz = matrizcrear(columnas, filas);

        matrizPrint(matriz);
        System.out.println(matrizMaximo(matriz));
        System.out.println(matrizMinimo(matriz));
        System.out.println(matrizMedia(matriz));
        if (matrizexistenum(matriz)) {
            System.out.println("Si existe");
        } else {
            System.out.println("No existe");
        }
        System.out.println("El numero se repite " + repitenum(matriz) + " veces");

        condition = true;
        while (condition) {
            System.out.println("Introduce filas primera matriz");
            filas = filaspedir();
            System.out.println("Introduce columnas primera matriz");
            columnas = columnaspedir();
            condition = filascolumnascheck(columnas, filas);
        }
        int[][] matrizop1 = matrizcrear(columnas, filas);
        int filasop1 = filas;
        int columnasop1 = columnas;


        condition = true;
        while (condition) {
            System.out.println("Introduce filas segunda matriz");
            filas = filaspedir();
            System.out.println("Introduce columnas segunda matriz");
            columnas = columnaspedir();
            condition = filascolumnascheck(columnas, filas);
        }
        int[][] matrizop2 = matrizcrear(columnas, filas);
        int filasop2 = filas;
        int columnasop2 = columnas;


        if (filasop1 == filasop2 && columnasop1 == columnasop2) {
            System.out.println(Arrays.deepToString(matrizSuma(matrizop1, matrizop2)));
            System.out.println(Arrays.deepToString(matrizResta(matrizop1, matrizop2)));
        }else {
            System.out.println("Matrices no tienen los mismos tamaños");
        }

        System.out.println("Matriz unidad");
        condition=true;
        */
        while (condition) {
            filas = filaspedir();
            columnas = columnaspedir();
            condition = filascolumnascheck(columnas, filas);
        }
        int[][]matrizparaunidad=matrizcrear(columnas,filas);
        if (filas==columnas){
            if (matrizunidadono(matrizparaunidad)){
                System.out.println("Si es una matriz unidad");
            } else {
                System.out.println("No es una matriz unidad");
            }
        }
    }
}
