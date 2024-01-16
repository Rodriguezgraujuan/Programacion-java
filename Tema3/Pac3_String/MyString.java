package Pac3_String;

import java.util.Scanner;

public class MyString {

    public static String funcioninvertidamayus(String cadenaoriginal){
        String cadenainvertida = "";
        for (int i = cadenaoriginal.length()-1; i>=0;i--){
            cadenainvertida=cadenainvertida+cadenaoriginal.charAt(i);
        }
        return cadenainvertida.toUpperCase();
    }

    public static int numerovocales(String cadenaoriginal){
        cadenaoriginal=cadenaoriginal.toLowerCase();
        int contador = 0;
        for (int i = 0; i<cadenaoriginal.length(); i++){
            if (cadenaoriginal.charAt(i) == 'a'||cadenaoriginal.charAt(i) == 'e'|| cadenaoriginal.charAt(i) == 'i'
                    ||cadenaoriginal.charAt(i) == 'o'|| cadenaoriginal.charAt(i) == 'u'){
                contador ++;
            }
        }
        return contador;
    }

    public static String palabramayorlongitud(String cadenaoriginal){
        String[] cadenarray= cadenaoriginal.split(" ");
        int palabralarga=0;
        for (int i =0; i<cadenarray.length;i++){
            if (cadenarray[i].length()>cadenarray[palabralarga].length()){
                palabralarga=i;
            }
        }
        return cadenarray[palabralarga];
    }

    public static int cadenarepetida(String string1, String string2){
        string2 = string2.toUpperCase();
        int contadorbucle=0;
        int numeroposicionletra=0;
        int vecesrepetidas=0;

        while (contadorbucle<string2.length()-1){
            String letrastring1=String.valueOf(string1.charAt(0));
            String letrastring2= String.valueOf(string2.charAt(contadorbucle));
            if (letrastring1.equals(letrastring2)){
                numeroposicionletra=contadorbucle+2;
                String string2acortado = string2.substring(contadorbucle, numeroposicionletra);
                if (string1.equals(string2acortado)){
                    vecesrepetidas++;
                    contadorbucle+=letrastring1.length()-1;
                }
            }
            contadorbucle++;

        }
        return vecesrepetidas;
    }

    public static int numeropalabras(String cadena){
        String[] cadenaseparada=cadena.split(" ");
        return cadenaseparada.length;
    }

    public static String numerotelefono(String numerotelefono){
        if (numerotelefono.length()==11) {
            numerotelefono=String.format("(+%s)-%s-%s", numerotelefono.substring(0, 2), numerotelefono.substring(2, 5), numerotelefono.substring(5, 11));
        } else {
            System.out.println("numero incorrecto");
        }
        return numerotelefono;
    }

    public static void histograma(String cadena){
        cadena= cadena.toUpperCase();
        int contador_A=0;
        int contador_E=0;
        int contador_I=0;
        int contador_O=0;
        int contador_U=0;

        for (int i = 0; i<cadena.length();i++){
            switch (cadena.charAt(i)) {
                case 'A' -> contador_A++;
                case 'E' -> contador_E++;
                case 'I' -> contador_I++;
                case 'O' -> contador_O++;
                case 'U' -> contador_U++;
            }
        }
        String aste="*";
        System.out.println(String.format("%s %d %s","A",contador_A,aste.repeat(contador_A)));
        System.out.println(String.format("%s %d %s","E",contador_E,aste.repeat(contador_E)));
        System.out.println(String.format("%s %d %s","I",contador_I,aste.repeat(contador_I)));
        System.out.println(String.format("%s %d %s","O",contador_O,aste.repeat(contador_O)));
        System.out.println(String.format("%s %d %s","U",contador_U,aste.repeat(contador_U)));
     }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Seleciona un ejercicio a-1, b-2, c-3, d-4, e-5, f-6, g-7");
        int opcion= in.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce la cadena que quieres invertir");
                String palabraparainvertir=in.nextLine();
                System.out.println(funcioninvertidamayus(palabraparainvertir));
                break;
            case 2:
                System.out.println("Introduce la cadena de las que quieras saber las vocales");
                String palabraparavocales=in.nextLine();
                System.out.println("Tiene " + numerovocales(palabraparavocales) + " vocales");
                break;
            case 3:
                System.out.println("Introduce la cadena para saber la de mayor longitud");
                String cadenamayorlongitud=in.nextLine();
                System.out.println(palabramayorlongitud(cadenamayorlongitud));
                break;
            case 4:
                System.out.println("Introduce la primera cadena");
                String cadena1= in.nextLine();
                System.out.println("Introduce la segunda cadena");
                String cadema2= in.nextLine();
                System.out.println(cadenarepetida(cadena1, cadema2));
                break;
            case 5:
                System.out.println("Introduce una cadena para contar sus palabras");
                String cadena= in.nextLine();
                System.out.println(numeropalabras(cadena));
                break;
            case 6:
                System.out.println("Introduce el numero de telefono con el prefijo de 2 numeros");
                String telefono=in.nextLine();
                System.out.println(numerotelefono(telefono));
                break;
            case 7:
                System.out.println("Introduce una cadena para hacer el histograma");
                String cadenaparahistograma=in.nextLine();
                histograma(cadenaparahistograma);
                break;
        }
    }
}
