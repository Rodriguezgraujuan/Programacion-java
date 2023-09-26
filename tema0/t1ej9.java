import java.util.Scanner;

public class t1ej9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int num1= in.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2= in.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int division = num1/num2;
        int producto = num1*num2;
        int resto = num1%num2;

        System.out.println("La suma de " + num1 + " y " + num2 +" es igual a " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 +" es igual a " + resta);
        System.out.println("La division de " + num1 + " y " + num2 +" es igual a " + division);
        System.out.println("El producto de " + num1 + " y " + num2 +" es igual a   " + producto);
        System.out.println("Es resto de " + num1 + " y " + num2 +" es igual a " + resto);

    }

}
