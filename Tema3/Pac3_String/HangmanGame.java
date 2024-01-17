package Pac3_String;

import java.util.Scanner;

public class HangmanGame {
    static String palabraoculta;

    public static void palabraocutaguiones(String palabra){
        String guion="_";
        palabraoculta=guion.repeat(palabra.length());
    }

    public static int jugada(String palabra, String letrabuscar, int intentos){
        boolean cambiono=false;
        letrabuscar=letrabuscar.toLowerCase();
        for (int i=0; i<palabra.length();i++){
            String letrapalabra = String.valueOf(palabra.charAt(i));
            if (letrapalabra.equals(letrabuscar)){
                palabraoculta=palabraoculta.substring(0, i) + letrabuscar + palabraoculta.substring(i + 1);
                cambiono=true;
            }
        }
        if (!cambiono){
            intentos++;
        }
        return intentos;
    }

    public static boolean completaono(){
        boolean hayguion=true;
        for (int i =0;i<palabraoculta.length();i++){
            String letra= String.valueOf(palabraoculta.charAt(i));
            if (letra.equals("_")) {
                hayguion = false;
                break;
            }
        }
        return hayguion;
    }

    public static void handman(int intentos){
        switch (intentos){
            case 1-> System.out.println(" o ");
            case 2-> System.out.println(" o "+"\n"+ " | ");
            case 3-> System.out.println(" o "+"\n"+ "/| ");
            case 4-> System.out.println(" o "+"\n"+ "/|\\");
            case 5-> System.out.println(" o "+"\n"+ "/|\\"+"\n"+"/");
            case 6-> System.out.println(" o "+"\n"+ "/|\\"+"\n"+"/a \\");
        }
    }

    public static boolean sololetras(String palabra){
        return palabra.matches("[a-z]");
    }

    public static void borrarconsola(){
        for (int i = 0;i<30;i++){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la palabra:");
        String palabra=in.nextLine();
        borrarconsola();
        palabra=palabra.toLowerCase();
        boolean condition= true;
        int intentos = 0;
        palabraocutaguiones(palabra);
        while (condition) {
            System.out.println("Introduce una letra");
            char letra = in.next().charAt(0);
            if (sololetras(String.valueOf(letra))) {
                intentos = jugada(palabra, String.valueOf(letra), intentos);
                System.out.println(palabraoculta);
                handman(intentos);
                if (intentos > 5 || completaono()) {
                    condition = false;
                    System.out.println("Has ganado");
                }
            }else{
                System.out.println("Introduce solo letras");
            }
        }
    }
}
