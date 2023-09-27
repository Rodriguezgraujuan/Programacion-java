import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 2 numeros:");
        int num1= in.nextInt();
        int num2= in.nextInt();
        if (num1 > num2) {
            int op = num1-num2 ;
            System.out.println(op);
        } else {
            int op1 = num2-num1 ;
            System.out.println(op1);
        }
    }
}
