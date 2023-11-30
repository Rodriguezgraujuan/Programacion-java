package Package3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Atrapalamoscamatrices {
    static int[][] tablero= new int[4][4];
    static Random random= new Random();
    static Scanner in = new Scanner(System.in);

    static int randomfila=1;
    static int randomcolumna=1;

    static boolean condition=true;

    public static int[][] colocarmosca(){
        tablero[randomfila][randomcolumna]=0;
        randomfila= random.nextInt(0,3);
        randomcolumna= random.nextInt(0,3);
        tablero[randomfila][randomcolumna]=1;
        return tablero;
    }

    public static int numerojugador(){
        int number = -1;
        while (number<0||number>3){
            System.out.println("Introduce un numero del 1-4");
            number= in.nextInt()-1;
            if (number<0||number>3){
                System.out.println("numero incorrecto");
            }
        }
        return number;
    }

    public static void moscavuela(int filajugador, int columnajugador){
        if (columnajugador!=0) {
            if (tablero[filajugador][columnajugador-1] == 1) {
                colocarmosca();
            }
        }
        if (columnajugador!=3) {
            if (tablero[filajugador][columnajugador+1] == 1) {
                colocarmosca();
            }
        }
        if (filajugador!=0) {
            if (tablero[filajugador-1][columnajugador] == 1) {
                colocarmosca();
            }
        }
        if (filajugador!=3) {
            if (tablero[filajugador+1][columnajugador] == 1) {
                colocarmosca();
            }
        }
    }

    public static void jugada(){
        System.out.println(Arrays.deepToString(tablero));
        int filajugador=numerojugador();
        int columnajugador=numerojugador();
        if (tablero[filajugador][columnajugador]==1){
            System.out.println("Has ganado");
            condition=false;
        } else {
            moscavuela(filajugador, columnajugador);
        }
    }
    public static void main(String[] args) {
        colocarmosca();
        while (condition){
            jugada();
        }
    }
}
