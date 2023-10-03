import java.util.Scanner;

public class Tema1Ejercicio22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int cifra = 0;
        double num = in.nextInt();
        while (num>=1){
             num = num/10;
             cifra = cifra + 1;
        }
    System.out.println(cifra);
    }
}
