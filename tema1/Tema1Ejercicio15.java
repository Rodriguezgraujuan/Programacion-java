import java.util.Scanner;

public class Tema1Ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        int bisiesto = 1;

        if (year % 4 == 0) {
            if (year%100==0)  {
                if (year%400==0){
                        bisiesto = 1;
                } else {
                        bisiesto = 0;
                }
            } else {
                bisiesto = 1;
            }
        } else {
            bisiesto = 0;
        }
        if (month == 1){
            System.out.println("31 dias");
        } else if (month == 2) {
            if (bisiesto == 1){
                System.out.println("Tiene 29 dias");
            } else {
                System.out.println("Tiene 28 dias");
            }
        } else if (month == 3) {
            System.out.println("31 dias");
        } else if (month == 4) {
            System.out.println("30 dias");
        } else if (month == 5) {
            System.out.println("31 dias");
        } else if (month == 6) {
            System.out.println("30 dias");
        } else if (month == 7) {
            System.out.println("31 dias");
        } else if (month == 8) {
            System.out.println("30 dias");
        } else if (month == 9) {
            System.out.println("31 dias");
        } else if (month == 10) {
            System.out.println("30 dias");
        } else if (month == 11) {
            System.out.println("31 dias");
        } else if ((month == 12)) {
            System.out.println("30 dias");
        } else {
            System.out.println("numero de mes incorrecto");
        }
    }
}
