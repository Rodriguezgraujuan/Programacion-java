import java.util.Scanner;

public class Tema1Ejercicio20 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 2 numeros");
        int A = in.nextInt();
        int B = in.nextInt();
        if (B>A){
            for (A=A;A<=B;A++){
                if (A%2==1){
                    System.out.println(A);
                }
            }
        } else {
            System.out.println("A es mayor que B");
        }
    }
}
