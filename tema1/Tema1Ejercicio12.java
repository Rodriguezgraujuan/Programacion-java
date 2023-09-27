import java.util.Scanner;

public class Tema1Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 numeros:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 > num2 && num1 > num3){
                if (num2 > num3){
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(num3);
                } else {
                    System.out.println(num1);
                    System.out.println(num3);
                    System.out.println(num2);
                }
        } else if (num2 > num1 && num2>num3) {
                if (num1 > num3){
                    System.out.println(num2);
                    System.out.println(num1);
                    System.out.println(num3);
                } else {
                    System.out.println(num2);
                    System.out.println(num3);
                    System.out.println(num1);
                }
        } else {
                if (num1 > num2){
                    System.out.println(num3);
                    System.out.println(num1);
                    System.out.println(num2);

                }else {
                    System.out.println(num3);
                    System.out.println(num2);
                    System.out.println(num1);

                }
        }
    }
}
