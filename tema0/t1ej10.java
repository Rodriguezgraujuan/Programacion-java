import java.util.Scanner;

public class t1ej10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce primer numero:");
        double num1 = in.nextDouble();
        System.out.println("Introduce segundo numero:");
        double num2 = in.nextDouble();
        double suma= num1 + num2;
        double producto= num1 * num2;
        double resto= num1 % num2;
        double division= num1/num2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de el producto es: " + producto);
        System.out.println("El resultado de el resto es: " + resto);
        System.out.println("El resultado de la division es: " + division);
    }
}
