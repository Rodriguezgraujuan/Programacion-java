package Pac3_String;

public class MyString {

    public static String funcioninvertidamayus(){
        String cadenaoriginal="Alberto";
        String cadenainvertida = "";
        for (int i = cadenaoriginal.length()-1; i>=0;i--){
            cadenainvertida=cadenainvertida+cadenaoriginal.charAt(i);
        }
        return cadenainvertida.toUpperCase();
    }

    public static int numerovocales(){
        String cadenaoriginal="Alberto";
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

    public static String palabramayorlongitud(){
        String cadenaoriginal="Alberto Pepe Amapolavoladora";
        String[] cadenarray= cadenaoriginal.split(" ");
        int palabralarga=0;
        for (int i =0; i<cadenarray.length;i++){
            if (cadenarray[i].length()>cadenarray[palabralarga].length()){
                palabralarga=i;
            }
        }
        return cadenarray[palabralarga];
    }

    public static int cadenarepetida(){
        String string1="AB";
        String string2="Abraunacabadepinos";
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
                }
            }
            contadorbucle++;

        }
        return vecesrepetidas;
    }

    public static String numerotelefono(){
        String numerotelefono="34622264846";
        String pais= "(+"+numerotelefono.substring(0,2)+")";
        String numerosprimeros= numerotelefono.substring(2,5);
        String numerosfinales= numerotelefono.substring(5,11);
        return pais+"-"+numerosprimeros+"-"+numerosfinales;
    }

    public static void main(String[] args) {
        System.out.println(funcioninvertidamayus());
        System.out.println("Tiene " + numerovocales() + " vocales");
        System.out.println(palabramayorlongitud());
        System.out.println(cadenarepetida());
        System.out.println(numerotelefono());
    }
}
