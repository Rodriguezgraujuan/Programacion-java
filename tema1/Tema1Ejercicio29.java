import java.util.Random;
import java.util.Scanner;

public class Tema1Ejercicio29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomint = random.nextInt(1000);
        System.out.println(randomint);
        int num = 0;
        while (num != randomint) {
            System.out.println("Introduce un numero:");
            num = in.nextInt();
            if (num > randomint){
                System.out.println("El numero secreto es menor");
            } else if (num < randomint) {
                System.out.println("El numero secreto es mayor");
            } else {
                System.out.println("Lo has acertado.");
            }
        }
    }
}
