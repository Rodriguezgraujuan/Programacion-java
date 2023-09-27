import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 numeros:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 < num2 && num2<num3){
            System.out.println("Estan ordenados de menor a mayor");
        } else {
            System.out.println("No estan ordenados");
        }
    }
}
