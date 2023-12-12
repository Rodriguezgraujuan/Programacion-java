import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        char[][] tablero = new char[1][1];
        char[][] tablerovisible = new char[10][10];
        int seleccion = menuModoJuego();
        if (seleccion > 0 && seleccion < 4) {
            tablero = crearTablero(11, 11);
            tablerovisible = crearTablero(11, 11);
        } else if (seleccion==4){
            System.out.println("Introduce las filas y las columnas del tablero");
            int filas = in.nextInt();
            int columnas = in.nextInt();
            tablero = crearTablero(filas, columnas);
            tablerovisible = crearTablero(filas, columnas);
        }
        int[] cantidadBarcosTotales = cantidadBarcos(seleccion);
        insertarBarcos(tablero, tablero.length, tablero[1].length, cantidadBarcosTotales[0], cantidadBarcosTotales[1], cantidadBarcosTotales[2], cantidadBarcosTotales[3]);
        int disparo = 0;
        boolean haybarcos = true;
        while (cantidadBarcosTotales[4] > disparo && haybarcos) {
            mostrarTableroCompleto(tablero);
            System.out.println("AA");
            mostrarTableroVisible(tablerovisible);
            int[] vectordisparo = pideCoordenadasDisparo(tablero);
            realizaDisparo(tablero, tablerovisible, vectordisparo);
            disparo++;
            if (!quedanBarcos(tablero, tablerovisible)) {
                haybarcos = false;
            }
        }
        mostrarTableroCompleto(tablero);
        if (quedanBarcos(tablero, tablerovisible)) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Haws ganado");
        }


    }

    public static int[] cantidadBarcos(int seleccion) {
        int[] cantidadbarcos = new int[5];
        if (seleccion == 1) {
            cantidadbarcos = new int[]{5, 3, 1, 1, 50};
        } else if (seleccion == 2) {
            cantidadbarcos = new int[]{2, 1, 1, 1, 30};
        } else if (seleccion == 3) {
            cantidadbarcos = new int[]{1, 1, 0, 0, 10};
        } else {
            System.out.println("Introduce los barcos que quieres");
            int lanchas = in.nextInt();
            int buque = in.nextInt();
            int acorazados= in.nextInt();
            int portaviones= in.nextInt();
            System.out.println("Introduce la cantidad de tiros");
            int cantidadtiros= in.nextInt();
            cantidadbarcos = new int[]{lanchas, buque, acorazados, portaviones, cantidadtiros};
        }
        return cantidadbarcos;
    }

    public static int menuModoJuego() {
        boolean condition = false;
        int selecion = 0;
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

    public static char[][] crearTablero(int filas, int columnas) {
        char[][] tablero = new char[filas][columnas];
        int valorletra=65;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i>0&&j==0){
                    char num_letra= (char) valorletra;
                    tablero[i][j]=num_letra;
                    valorletra++;
                } else if(i==0&&j>0){
                    char num=(char) (j-1+'0');
                    tablero[i][j]=num;
                } else{
                    tablero[i][j] = '-';
                }
            }
        }
        tablero[0][0]=' ';
        return tablero;
    }

    public static void mostrarTableroCompleto(char[][] tablero) {
        for (char[] ints : tablero) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void mostrarTableroVisible(char[][] tablero) {
        for (char[] ints : tablero) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static boolean quedanBarcos(char[][] tablero, char[][] tablerovisible) {
        boolean condition = true;
        int contador = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == 'B' && tablerovisible[i][j] == '-' || tablero[i][j] == 'L' && tablerovisible[i][j] == '-' || tablero[i][j] == 'Z' && tablerovisible[i][j] == '-' || tablero[i][j] == 'P' && tablerovisible[i][j] == '-') {
                    contador++;
                }
            }
        }
        if (contador == 0) {
            condition = false;
        }
        return condition;
    }

    public static char[][] insertarBarcos(char[][] tablero, int filas, int columnas, int lanchas, int buques, int acorazados, int portaaviones) {
        int totalbarcos = lanchas + buques + portaaviones + acorazados;
        int num = 0;
        while (num != totalbarcos) {
            boolean condition = false;
            int fila = random.nextInt(1, filas - 1);
            int columna = random.nextInt(1, columnas - 1);
            if (lanchas > 0) {
                insertarLancha(tablero, fila, columna);
                if (tablero[fila][columna] == 'L') {
                    lanchas--;
                    condition = true;
                }
            } else if (buques > 0) {
                insertarBuque(tablero, fila, columna);
                if (tablero[fila][columna] == 'B') {
                    buques--;
                    condition = true;
                }
            } else if (acorazados > 0) {
                insertarAcorazado(tablero, fila, columna);
                if (tablero[fila][columna] == 'Z') {
                    acorazados--;
                    condition = true;
                }
            } else if (portaaviones > 0) {
                insertarPortaaviones(tablero, fila, columna);
                if (tablero[fila][columna] == 'P') {
                    portaaviones--;
                    condition = true;
                }
            }
            if (condition) {
                num++;
            }
        }
        return tablero;
    }

    public static void insertarLancha(char[][] tablero, int fila, int columna) {
        if (tablero[fila][columna] == '-') {
            tablero[fila][columna] = 'L';
        }
    }

    public static void insertarBuque(char[][] tablero, int fila, int columna) {
        int condicion1=columna-1;
        int condicion3=columna-2;
        if (columna > 0 && columna < condicion1 && tablero[fila][columna] == '-' && tablero[fila][columna + 1] == '-' && tablero[fila][columna - 1] == '-') {
            tablero[fila][columna + 1] = 'B';
            tablero[fila][columna] = 'B';
            tablero[fila][columna - 1] = 'B';
        } else if (columna > 1 && tablero[fila][columna] == '-' && tablero[fila][columna - 1] == '-' && tablero[fila][columna - 2] == '-') {
            tablero[fila][columna] = 'B';
            tablero[fila][columna - 1] = 'B';
            tablero[fila][columna - 2] = 'B';
        } else if (columna < condicion3 && tablero[fila][columna] == '-' && tablero[fila][columna + 1] == '-' && tablero[fila][columna + 2] == '-') {
            tablero[fila][columna] = 'B';
            tablero[fila][columna + 1] = 'B';
            tablero[fila][columna + 2] = 'B';
        }
    }

    public static void insertarAcorazado(char[][] tablero, int fila, int columna) {
        int condicion3= columna-2;
        int condicion4= columna-1;
        if (columna < 7 && tablero[fila][columna] == '-' && tablero[fila][columna + 1] == '-' && tablero[fila][columna + 2] == '-' && tablero[fila][columna + 3] == '-') {
            tablero[fila][columna] = 'Z';
            tablero[fila][columna + 1] = 'Z';
            tablero[fila][columna + 2] = 'Z';
            tablero[fila][columna + 3] = 'Z';
        } else if (columna > 2 && tablero[fila][columna] == '-' && tablero[fila][columna - 1] == '-' && tablero[fila][columna - 2] == '-' && tablero[fila][columna - 3] == '-') {
            tablero[fila][columna] = 'Z';
            tablero[fila][columna - 1] = 'Z';
            tablero[fila][columna - 2] = 'Z';
            tablero[fila][columna - 3] = 'Z';
        } else if (columna > 0 && columna < condicion3 && tablero[fila][columna] == '-' && tablero[fila][columna + 1] == '-' && tablero[fila][columna + 2] == '-' && tablero[fila][columna - 1] == '-') {
            tablero[fila][columna] = 'Z';
            tablero[fila][columna + 1] = 'Z';
            tablero[fila][columna + 2] = 'Z';
            tablero[fila][columna - 1] = 'Z';
        } else if (columna > 1 && columna < condicion4 && tablero[fila][columna] == '-' && tablero[fila][columna - 1] == '-' && tablero[fila][columna - 2] == '-' && tablero[fila][columna + 1] == '-') {
            tablero[fila][columna] = 'Z';
            tablero[fila][columna - 1] = 'Z';
            tablero[fila][columna - 2] = 'Z';
            tablero[fila][columna + 1] = 'Z';
        }
    }

    public static void insertarPortaaviones(char[][] tablero, int fila, int columna) {
        int condicion3=fila-2;
        int condicion4=fila-3;
        int condicion5=fila-1;
        if (fila < 4 && tablero[fila][columna] == '-' && tablero[fila + 1][columna] == '-' && tablero[fila + 2][columna] == '-' && tablero[fila + 3][columna] == '-' && tablero[fila + 4][columna] == '-') {
            tablero[fila][columna] = 'P';
            tablero[fila + 1][columna] = 'P';
            tablero[fila + 2][columna] = 'P';
            tablero[fila + 3][columna] = 'P';
            tablero[fila + 4][columna] = 'P';
        } else if (fila > 5 && tablero[fila][columna] == '-' && tablero[fila - 1][columna] == '-' && tablero[fila - 2][columna] == '-' && tablero[fila - 3][columna] == '-' && tablero[fila - 4][columna] == '-') {
            tablero[fila][columna] = 'P';
            tablero[fila - 1][columna] = 'P';
            tablero[fila - 2][columna] = 'P';
            tablero[fila - 3][columna] = 'P';
            tablero[fila - 4][columna] = 'P';
        } else if (fila > 2 && fila < condicion3 && tablero[fila][columna] == '-' && tablero[fila - 1][columna] == '-' && tablero[fila - 2][columna] == '-' && tablero[fila + 1][columna] == '-' && tablero[fila + 2][columna] == '-') {
            tablero[fila][columna] = 'P';
            tablero[fila - 1][columna] = 'P';
            tablero[fila - 2][columna] = 'P';
            tablero[fila + 1][columna] = 'P';
            tablero[fila + 2][columna] = 'P';
        } else if (fila > 0 && fila < condicion4 && tablero[fila][columna] == '-' && tablero[fila + 1][columna] == '-' && tablero[fila + 2][columna] == '-' && tablero[fila + 3][columna] == '-' && tablero[fila - 1][columna] == '-') {
            tablero[fila][columna] = 'P';
            tablero[fila + 1][columna] = 'P';
            tablero[fila + 2][columna] = 'P';
            tablero[fila + 3][columna] = 'P';
            tablero[fila - 1][columna] = 'P';
        } else if (fila > 2 && fila < condicion5 && tablero[fila][columna] == '-' && tablero[fila - 1][columna] == '-' && tablero[fila - 2][columna] == '-' && tablero[fila - 3][columna] == '-' && tablero[fila + 1][columna] == '-') {
            tablero[fila][columna] = 'P';
            tablero[fila - 1][columna] = 'P';
            tablero[fila - 2][columna] = 'P';
            tablero[fila - 3][columna] = 'P';
            tablero[fila + 1][columna] = 'P';
        }
    }

    public static int[] pideCoordenadasDisparo(char[][] tablero) {
        int[] vectorDisparo = new int[2];
        boolean condition=true;
        while (condition) {
            System.out.println("Introduce las coordenadas (columna: 0-9, fila: A-J)");
            vectorDisparo[0] = in.nextInt()+1;
            in.nextLine();
            String letra = in.nextLine();
            int columna = filaStringToInt(letra);
            vectorDisparo[1] = columna;
            if (vectorDisparo[0]>0&&vectorDisparo[0]<10&&vectorDisparo[1]>0&&vectorDisparo[1]<10){
                condition=false;
            } else {
                System.out.println("Numero incorrecto");
            }
        }
        return vectorDisparo;
    }

    public static void realizaDisparo(char[][] tablero, char[][] tablerovisible, int[] posicionesDisparo) {
        int fila = posicionesDisparo[1];
        int columna = posicionesDisparo[0];
        if (tablero[fila][columna] == 'L' || tablero[fila][columna] == 'B' || tablero[fila][columna] == 'Z' || tablero[fila][columna] == 'P') {
            tablerovisible[fila][columna] = 'X';
        } else {
            tablerovisible[fila][columna] = 'A';
        }
    }

    public static int filaStringToInt(String s) {
        s = s.toUpperCase();
        return switch (s) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D" -> 4;
            case "E" -> 5;
            case "F" -> 6;
            case "G" -> 7;
            case "H" -> 8;
            case "I" -> 9;
            case "J" -> 10;
            default -> -1;
        };
    }
}
