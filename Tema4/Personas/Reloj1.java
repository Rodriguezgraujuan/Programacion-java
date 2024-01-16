package Personas;

import java.util.Scanner;

public class Reloj1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Reloj reloj=new Reloj();
        System.out.println("12 o 24");
        int modo= in.nextInt();
        System.out.println("Hora, minutos y segundos");
        int hora= in.nextInt();
        int min= in.nextInt();
        int sec= in.nextInt();
        reloj.setHoraMinuteSecond(hora,min,sec,modo);
        System.out.println(reloj);
    }

    /*
    Si no pones el toString pondra cosas raras, pero si pones el toString, escribira
    lo que tu le indiques.
     */

}
