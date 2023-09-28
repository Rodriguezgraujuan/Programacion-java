import java.util.Scanner;

public class Tema1Ejercicio18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num= in.nextInt();
        if (num<0){
            System.out.println("Numero erroneo");
        } else {
            double raiz = Math.sqrt(num);
            System.out.println(raiz);
        }
    }
}
