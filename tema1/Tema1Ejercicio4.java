import java.util.Scanner;

public class Tema1Ejercicio4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tres numeros:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if ( num1 > num2 && num1 > num3) {
            System.out.println(num1 + " Es mayor que " + num2 + " y " + num3);
        } else if (num1 < num2 && num2 > num3) {
            System.out.println(num2 + " Es mayor que " + num1 + " y " + num3);
        } else {
            System.out.println(num3 + " Es mayor que " + num1 + " y " + num2);
        }
    }
}
