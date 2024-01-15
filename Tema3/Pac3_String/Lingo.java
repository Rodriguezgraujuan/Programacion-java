package Pac3_String;

import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabraOculta = null;
        String palabra = null;
        boolean conditionpalabra=true;
        while (conditionpalabra) {
            System.out.println("Introduce la palabra");
            palabra = in.nextLine();
            if (palabra.length()==5){
                conditionpalabra=false;
            }else{
                System.out.println("Debe ser una palabra de 5 letras");
            }
        }
        boolean condition=true;
        boolean conditionpalabrabuscar=false;
        while (condition) {
            System.out.println("Intento:");
            String palabraBuscar = in.nextLine();
            if (palabraBuscar.length()==5){
                conditionpalabrabuscar=true;
            }
            if (conditionpalabrabuscar) {
                palabraOculta = construirPalabraOculta(palabra, palabraBuscar);
                System.out.println("Pista: " + palabraOculta);
                if (!aciertono(palabraOculta)) {
                    condition = false;
                }
            }else {
                System.out.println("Debe ser de 5 letras");
            }
        }
    }
    
    public static boolean aciertono(String palabra){
        boolean condition=false;
        for (int i=0;i<palabra.length();i++){
            String letra= String.valueOf(palabra.charAt(i));
            if (letra.equals("-")||letra.equals("*")) {
                condition = true;
                break;
            }
        }
        return condition;
    }
    public static String construirPalabraOculta(String palabra, String palabraBuscar) {
        StringBuilder palabraOculta = new StringBuilder();
        int longitud = Math.max(palabra.length(), palabraBuscar.length());

        for (int i = 0; i < longitud; i++) {
            char letraPalabra;
            char letraBuscar;
            if (i < palabra.length()) {
                letraPalabra = palabra.charAt(i);
            } else {
                letraPalabra = '-';
            }
            if (i < palabraBuscar.length()) {
                letraBuscar = palabraBuscar.charAt(i);
            } else {
                letraBuscar = '-';
            }

            if (letraPalabra == letraBuscar) {
                palabraOculta.append(letraPalabra);
            } else {
                boolean estaenotraposicion=false;
                for (int j=0;j<palabra.length();j++){
                    if (letraBuscar==palabra.charAt(j)){
                        palabraOculta.append('*');
                        estaenotraposicion=true;
                        break;
                    }
                }
                if (!estaenotraposicion){
                    palabraOculta.append('-');
                }
            }
        }
        return palabraOculta.toString();
    }
}
