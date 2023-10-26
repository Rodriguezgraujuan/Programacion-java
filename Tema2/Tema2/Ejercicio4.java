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
        String decision = in.nextLine();

        if (showMenu(decision).equals("Euros")){
            System.out.println("Introduce la cantidad de Euros: ");
            double Euro = in.nextDouble();
            double dolares = euro2dolar(Euro);
            System.out.println(Euro + "€ son " + dolares + "$");
        } else {
            System.out.println("Introduce la cantidad de dolares: ");
            double dolar = in.nextDouble();
            double euros = dolar2euro(dolar);
            System.out.println(dolar + "$ son " + euros + "€");
        }
    }
}
