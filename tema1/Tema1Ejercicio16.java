import java.util.Scanner;

public class Tema1Ejercicio16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce D si quieres convertir de euros a dolares, de lo contrario pon E");
        char letra = in.next().charAt(0);
        if (letra == 'D'){
            System.out.println("Me has dado d");
            System.out.println("Introduce los euros que quieres convertir:");
            int mon= in.nextInt();
            double op = mon * 1.06;
            System.out.println(mon + "€ es igual a " + op + "$");
        } else if (letra == 'E') {
            System.out.println("Me has dado E");
            System.out.println("Introduce los euros que quieres convertir:");
            int mon= in.nextInt();
            double op = mon * 0.95;
            System.out.println(mon + "$ es igual a " + op + "€");
        } else {
            System.out.println("Letra incorrecta");
        }
    }
}
