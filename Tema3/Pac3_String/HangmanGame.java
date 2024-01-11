package Pac3_String;

import java.util.Scanner;

public class HangmanGame {

    public static boolean estaono(String palabra,char letrabuscar){
        boolean condition = false;
        for (int i = 0; i<palabra.length();i++){
            if (palabra.charAt(i)==letrabuscar){
                condition=true;
                i=200;
            }
        }
        return condition;
    }

    public static String colocarletra(String palabra,char letrabuscar, String palabraoculta){
        String posiciones = null;
        for (int i = 0; i<palabra.length();i++){
            if (palabra.charAt(i)==letrabuscar){
                posiciones+=i;
            }
        }
        for (int j = 0; j<posiciones.length();j++){
            palabraoculta.charAt(0)=letrabuscar;
        }
        return palabraoculta;
    }

    public static int jugada(String palabra,char letrabuscar, int intentos){
        String guion="-";
        String palabraoculta=guion.repeat(palabra.length());
        if (estaono(palabra,letrabuscar)){

        }
        return intentos;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la palabra a esconder");
        String palabra= in.nextLine();
        int intentos=0;
        while (intentos<6){
            System.out.println("Introduce una letra");
            char letrabuscar=in.next().charAt(0);
            jugada(palabra, letrabuscar, intentos);
        }
    }
}
