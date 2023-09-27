import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num= in.nextInt();
        if (num==0) {
            System.out.println(num + " es zero.");
        } else if (num>0) {
            System.out.println(num + " es positivo:");
        }else {
            System.out.println(num + " es negativo:");
        }

    }

}
