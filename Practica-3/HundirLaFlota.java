import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int seleccion = menuModoJuego();
    }

    public static int menuModoJuego(){
        boolean condition=false;
        int selecion=0;
        while (!condition) {
            System.out.println("Elije modo de juego " + "\n" +
                    "(facil, medio, dificil, personalizado)");
            selecion = in.nextInt();
            if (selecion > 0 && selecion < 5) {
                condition = true;
            }
        }
        return selecion;
    }

    public static char[][] crearTablero(int filas, int columnas){
         char[][] tablero = new char[filas][columnas];
         for (int i=0;i<tablero.length;i++) {
             for (int j = 0; j < tablero.length; j++){
                 tablero[i][j]='-';
             }
         }
         return tablero;
    }

    public static void mostrarTableroCompleto(char[][] tablero){
        for (int i=0;i<tablero.length;i++) {
            for (int j = 0; j < tablero.length; j++){
                System.out.println(tablero[i][j]);
            }
        }
    }

    public static void mostrarTableroVisible(char[][] tablero){
        for (int i=0;i<tablero.length;i++) {
            for (int j = 0; j < tablero.length; j++){
                System.out.println(tablero[i][j]);
            }
        }
    }

    public static boolean quedanBarcos(char[][] tablero){
        boolean condition=true;
        for (int i=0;i<tablero.length&&condition;i++) {
            for (int j = 0; j < tablero.length&&condition; j++){
                if (tablero[i][j]=='B'||tablero[i][j]=='L'||tablero[i][j]=='Z'||tablero[i][j]=='P'){
                    condition=false;
                }
            }
        }
        return condition;
    }

    public static char[][] insertarBarcos(char[][] tablero, int filas, int columnas,int lanchas, int buques, int acorazados, int portaaviones){
        int totalbarcos= lanchas+buques+portaaviones+acorazados;
        int num=0;
        while (num!=totalbarcos){
            int fila = random.nextInt(0, filas-1);
            int columna= random.nextInt(0,columnas-1);
            if (lanchas>0){
                insertarLancha(tablero,fila,columna);
            } else if (buques>0){
                insertarBuque(tablero,fila,columna);
            } else if (acorazados>0) {
                insertarAcorazado(tablero,fila,columna);
            } else if (portaaviones>0) {

            }
            num=totalbarcos;
        }
        return tablero;
    }

    public static void insertarLancha(char[][] tablero, int fila, int columna){
        if (tablero[fila][columna]=='-'){
            tablero[fila][columna]='L';
        }
    }

    public static void insertarBuque(char[][] tablero, int fila, int columna){
        if (tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna-1]=='-'){
            tablero[fila][columna+1]='B';
            tablero[fila][columna]='B';
            tablero[fila][columna-1]='B';
        } else if (tablero[fila][columna]=='-'&&tablero[fila][columna-1]=='-'&&tablero[fila][columna-2]=='-') {
            tablero[fila][columna]='B';
            tablero[fila][columna-1]='B';
            tablero[fila][columna-2]='B';
        } else if (tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna+2]=='-') {
            tablero[fila][columna]='B';
            tablero[fila][columna+1]='B';
            tablero[fila][columna+2]='B';
        }
    }

    public static void insertarAcorazado(char[][] tablero, int fila, int columna){
        if (tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna+2]=='-'&&tablero[fila][columna+3]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna+1]='Z';
            tablero[fila][columna+2]='Z';
            tablero[fila][columna+3]='Z';
        } else if (tablero[fila][columna]=='-'&&tablero[fila][columna-1]=='-'&&tablero[fila][columna-2]=='-'&&tablero[fila][columna-3]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna+1]='Z';
            tablero[fila][columna+2]='Z';
            tablero[fila][columna+3]='Z';
        }else if (tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna+2]=='-'&&tablero[fila][columna-1]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna+1]='Z';
            tablero[fila][columna+2]='Z';
            tablero[fila][columna-1]='Z';
        }else if (tablero[fila][columna]=='-'&&tablero[fila][columna-1]=='-'&&tablero[fila][columna-2]=='-'&&tablero[fila][columna+1]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna-1]='Z';
            tablero[fila][columna-2]='Z';
            tablero[fila][columna+1]='Z';
        }
    }

    public static void insertarPortaaviones(char[][] tablero, int fila, int columna){
        if (tablero[fila][columna]=='-'&&tablero[fila+1][columna]=='-'&&tablero[fila+2][columna]=='-'&&tablero[fila+3][columna]=='-'&&tablero[fila+4][columna]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila+1][columna]='Z';
            tablero[fila+2][columna]='Z';
            tablero[fila+3][columna]='Z';
            tablero[fila+4][columna]='Z';
        } else if (tablero[fila][columna]=='-'&&tablero[fila-1][columna]=='-'&&tablero[fila-2][columna]=='-'&&tablero[fila-3][columna]=='-'&&tablero[fila-4][columna]=='-') {
            tablero[fila][columna]='Z';
            tablero[fila-1][columna]='Z';
            tablero[fila-2][columna]='Z';
            tablero[fila-3][columna]='Z';
            tablero[fila-4][columna]='Z';
        } else if (tablero[fila][columna]=='-'&&tablero[fila-1][columna]=='-'&&tablero[fila-2][columna]=='-'&&tablero[fila+1][columna]=='-'&&tablero[fila+2][columna]=='-') {
            tablero[fila][columna]='Z';
            tablero[fila-1][columna]='Z';
            tablero[fila-2][columna]='Z';
            tablero[fila+1][columna]='Z';
            tablero[fila+2][columna]='Z';
        } else if (tablero[fila][columna]=='-'&&tablero[fila+1][columna]=='-'&&tablero[fila+2][columna]=='-'&&tablero[fila+3][columna]=='-'&&tablero[fila-1][columna]=='-') {
            tablero[fila][columna]='Z';
            tablero[fila+1][columna]='Z'tablero[fila+2][columna]='Z';
            tablero[fila+3][columna]='Z';
            tablero[fila-1][columna]='Z';
        } else if (tablero[fila][columna]=='-'&&tablero[fila-1][columna]=='-'&&tablero[fila-2][columna]=='-'&&tablero[fila-3][columna]=='-'&&tablero[fila+1][columna]=='-') {
            tablero[fila][columna]='Z';
            tablero[fila-1][columna]='Z';
            tablero[fila-2][columna]='Z';
            tablero[fila-3][columna]='Z';
            tablero[fila+1][columna]='Z';
        }
    }
}
