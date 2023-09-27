import java.util.Scanner;

public class Tema1Ejercicio14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int personas = in.nextInt();
        int dias = in.nextInt();

        if (personas >= 5 && dias >= 7){
            double precio= 15 * dias * 0.75;
            System.out.println("El precio es " + precio);
        } else {
            int precio = 15 * dias;
            System.out.println("El precio es " + precio);
        }
    }
}
