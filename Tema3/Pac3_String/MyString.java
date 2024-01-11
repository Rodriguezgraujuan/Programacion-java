package Pac3_String;

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
        System.out.println(funcioninvertidamayus("Alberto"));
        System.out.println("Tiene " + numerovocales("Alberto") + " vocales");
        System.out.println(palabramayorlongitud("Alberto Pepe Amapolavoladora"));
        System.out.println(cadenarepetida("AB", "Abraunacabadepinos"));
        System.out.println(numerotelefono("34622264846"));
        histograma("Me comi una salchipapa");
    }
}
