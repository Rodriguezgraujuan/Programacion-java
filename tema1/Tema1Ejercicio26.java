import java.util.Scanner;

public class Tema1Ejercicio26 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = in.nextInt();
        int bucle =0;
        for (int i = 1; i<=num ; i++){
            if (num%i==0) {
                bucle++;

            }
        }
        if (bucle>2){
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }
    }
}
