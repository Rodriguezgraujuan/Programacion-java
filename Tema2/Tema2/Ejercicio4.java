package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static String showMenu(String desicion){
        String conversor = null;
        if (desicion.equals("Eu2do")){
            conversor = "Euros";
        } else if (desicion.equals("Do2eu")){
            conversor = "Dolares";
        }
        return conversor;
    }
    public static double euro2dolar(double dinero){
        return dinero * 1.05;
    }
    public static double dolar2euro(double dinero){
        return dinero * 0.95;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elije si quieres pasar de Euros a dolares (Eu2do) o Dolares a euros (Do2eu)");
        String desicion = in.nextLine();

        System.out.println("Introduce la cantidad de dinero: ");
        double dinero = in.nextDouble();
        if (showMenu(desicion).equals("Euros")){
            double dolares = euro2dolar(dinero);
            System.out.println(dinero + "€ son " + dolares + "$");
        } else {
            double euros = dolar2euro(dinero);
            System.out.println(dinero + "$ son " + euros + "€");
        }
    }
}
