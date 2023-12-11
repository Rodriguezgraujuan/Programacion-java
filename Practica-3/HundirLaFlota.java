import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        char[][] tablero= new char[1][1];
        char[][] tablerovisible= new char[10][10];
        int seleccion = menuModoJuego();
        if (seleccion>0&&seleccion<4){
            tablero=crearTablero(10,10);
            tablerovisible=crearTablero(10,10);
        } else {
            System.out.println("Introduce las filas y las columnas del tablero");
            int filas = in.nextInt();
            int columnas=in.nextInt();
            tablero=crearTablero(filas,columnas);
        }
        int[] cantidadBarcosTotales=cantidadBarcos(seleccion);
        insertarBarcos(tablero, tablero.length, tablero[1].length, cantidadBarcosTotales[0], cantidadBarcosTotales[1], cantidadBarcosTotales[2], cantidadBarcosTotales[3]);
        int disparo=0;
        boolean haybarcos = true;
        while (cantidadBarcosTotales[4]>disparo||haybarcos){
            mostrarTableroVisible(tablerovisible);
            int[] vectordisparo=pideCoordenadasDisparo(tablero);
            realizaDisparo(tablero, tablerovisible,vectordisparo);
            disparo++;
            if (!quedanBarcos(tablero)){
                haybarcos=false;
            }
        }
        mostrarTableroCompleto(tablero);
        if (quedanBarcos(tablero)){
            System.out.println("Has perdido");
        } else {
            System.out.println("Haws ganado");
        }


    }

    public static int[] cantidadBarcos(int seleccion){
        int[] cantidadbarcos = new int[5];
        if (seleccion==1){
            cantidadbarcos= new int[]{5, 3, 1, 1, 50};
        } else if (seleccion==2) {
            cantidadbarcos= new int[]{2, 1, 1, 1, 30};
        } else if (seleccion==3) {
            cantidadbarcos= new int[]{1, 1, 0, 0, 10};
        } else {

        }
        return cantidadbarcos;
    }

    public static int menuModoJuego(){
        boolean condition=false;
        int selecion=0;
        while (!condition) {
            System.out.println("Elije modo de juego " + "\n" +
                    "(facil-1, medio-2, dificil-3, personalizado-4)");
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

    public static void mostrarTableroCompleto(char[][] tablero) {
        for (char[] ints : tablero) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void mostrarTableroVisible(char[][] tablero){
        for (char[] ints : tablero) {
            System.out.println(Arrays.toString(ints));
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
            boolean condition=false;
            int fila = random.nextInt(0, filas-1);
            int columna= random.nextInt(0,columnas-1);
            if (lanchas>0){
                insertarLancha(tablero,fila,columna);
                if (tablero[fila][columna]=='L'){
                    lanchas--;
                    condition= true;
                }
            } else if (buques>0){
                insertarBuque(tablero,fila,columna);
                if (tablero[fila][columna]=='B'){
                    buques--;
                    condition=true;
                }
            } else if (acorazados>0) {
                insertarAcorazado(tablero,fila,columna);
                if (tablero[fila][columna]=='Z'){
                    acorazados--;
                    condition=true;
                }
            } else if (portaaviones>0) {
                insertarPortaaviones(tablero, fila, columna);
                if (tablero[fila][columna]=='P'){
                    portaaviones--;
                    condition=true;
                }
            }
            if (condition) {
                num++;
            }
        }
        return tablero;
    }

    public static void insertarLancha(char[][] tablero, int fila, int columna){
        if (tablero[fila][columna]=='-'){
            tablero[fila][columna]='L';
        }
    }

    public static void insertarBuque(char[][] tablero, int fila, int columna){
        if (columna>0&&columna<9&&tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna-1]=='-'){
            tablero[fila][columna+1]='B';
            tablero[fila][columna]='B';
            tablero[fila][columna-1]='B';
        } else if (columna>1&&tablero[fila][columna]=='-'&&tablero[fila][columna-1]=='-'&&tablero[fila][columna-2]=='-') {
            tablero[fila][columna]='B';
            tablero[fila][columna-1]='B';
            tablero[fila][columna-2]='B';
        } else if (columna<8&&tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna+2]=='-') {
            tablero[fila][columna]='B';
            tablero[fila][columna+1]='B';
            tablero[fila][columna+2]='B';
        }
    }

    public static void insertarAcorazado(char[][] tablero, int fila, int columna){
        if (columna<7&&tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna+2]=='-'&&tablero[fila][columna+3]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna+1]='Z';
            tablero[fila][columna+2]='Z';
            tablero[fila][columna+3]='Z';
        } else if (columna>2&&tablero[fila][columna]=='-'&&tablero[fila][columna-1]=='-'&&tablero[fila][columna-2]=='-'&&tablero[fila][columna-3]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna-1]='Z';
            tablero[fila][columna-2]='Z';
            tablero[fila][columna-3]='Z';
        }else if (columna>0&&columna<8&&tablero[fila][columna]=='-'&&tablero[fila][columna+1]=='-'&&tablero[fila][columna+2]=='-'&&tablero[fila][columna-1]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna+1]='Z';
            tablero[fila][columna+2]='Z';
            tablero[fila][columna-1]='Z';
        }else if (columna>1&&columna<9&&tablero[fila][columna]=='-'&&tablero[fila][columna-1]=='-'&&tablero[fila][columna-2]=='-'&&tablero[fila][columna+1]=='-'){
            tablero[fila][columna]='Z';
            tablero[fila][columna-1]='Z';
            tablero[fila][columna-2]='Z';
            tablero[fila][columna+1]='Z';
        }
    }

    public static void insertarPortaaviones(char[][] tablero, int fila, int columna){
        if (fila<4&&tablero[fila][columna]=='-'&&tablero[fila+1][columna]=='-'&&tablero[fila+2][columna]=='-'&&tablero[fila+3][columna]=='-'&&tablero[fila+4][columna]=='-'){
            tablero[fila][columna]='P';
            tablero[fila+1][columna]='P';
            tablero[fila+2][columna]='P';
            tablero[fila+3][columna]='P';
            tablero[fila+4][columna]='P';
        } else if (fila>5&&tablero[fila][columna]=='-'&&tablero[fila-1][columna]=='-'&&tablero[fila-2][columna]=='-'&&tablero[fila-3][columna]=='-'&&tablero[fila-4][columna]=='-') {
            tablero[fila][columna]='P';
            tablero[fila-1][columna]='P';
            tablero[fila-2][columna]='P';
            tablero[fila-3][columna]='P';
            tablero[fila-4][columna]='P';
        } else if (fila>2&&fila<8&&tablero[fila][columna]=='-'&&tablero[fila-1][columna]=='-'&&tablero[fila-2][columna]=='-'&&tablero[fila+1][columna]=='-'&&tablero[fila+2][columna]=='-') {
            tablero[fila][columna]='P';
            tablero[fila-1][columna]='P';
            tablero[fila-2][columna]='P';
            tablero[fila+1][columna]='P';
            tablero[fila+2][columna]='P';
        } else if (fila>0&&fila<7&&tablero[fila][columna]=='-'&&tablero[fila+1][columna]=='-'&&tablero[fila+2][columna]=='-'&&tablero[fila+3][columna]=='-'&&tablero[fila-1][columna]=='-') {
            tablero[fila][columna]='P';
            tablero[fila+1][columna]='P';
            tablero[fila+2][columna]='P';
            tablero[fila+3][columna]='P';
            tablero[fila-1][columna]='P';
        } else if (fila>2&&fila<9&&tablero[fila][columna]=='-'&&tablero[fila-1][columna]=='-'&&tablero[fila-2][columna]=='-'&&tablero[fila-3][columna]=='-'&&tablero[fila+1][columna]=='-') {
            tablero[fila][columna]='P';
            tablero[fila-1][columna]='P';
            tablero[fila-2][columna]='P';
            tablero[fila-3][columna]='P';
            tablero[fila+1][columna]='P';
        }
    }

    public static int[] pideCoordenadasDisparo(char[][] tablero){
        int[] vectorDisparo = new int[2];
        System.out.println("Introduce las coordenadas (columna: 0-9, fila: A-J)");
        vectorDisparo[0]= in.nextInt();
        in.nextLine();
        String letra= in.nextLine();
        int columna=filaStringToInt(letra);
        vectorDisparo[1]= columna;
        return vectorDisparo;
    }

    public static void realizaDisparo(char[][] tablero, char[][] tablerovisible,int[] posicionesDisparo){
        int fila = posicionesDisparo[1];
        int columna = posicionesDisparo[0];
        if (tablero[fila][columna]=='L'||tablero[fila][columna]=='B'||tablero[fila][columna]=='Z'||tablero[fila][columna]=='P'){
            tablerovisible[fila][columna]='X';
        } else {
            tablerovisible[fila][columna]='A';
        }
    }

    public static int filaStringToInt(String s){
        s=s.toUpperCase();
        return switch (s) {
            case "A" -> 0;
            case "B" -> 1;
            case "C" -> 2;
            case "D" -> 3;
            case "E" -> 4;
            case "F" -> 5;
            case "G" -> 6;
            case "H" -> 7;
            case "I" -> 8;
            case "J" -> 9;
            default -> -1;
        };
    }
}
