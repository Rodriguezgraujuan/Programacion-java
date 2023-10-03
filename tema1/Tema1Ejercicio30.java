import java.util.Scanner;

public class Tema1Ejercicio30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        double num1 = in.nextDouble();
        System.out.println("Que operacion quieres hacer? +, -, *, / o %");
        char op = in.nextLine().charAt(0);
        System.out.println("Introduce el segundo numero:");
        double num2= in.nextDouble();
        char condicion = 'S';
        while (condicion == 'S'){
            switch (op) {
                case '+':
                    double suma = num1 + num2;
                    System.out.println("El resultado es " + suma);
                case '-':
                    double resta = num1 - num2;
                    System.out.println("El resultado es " + resta);
                case '*':
                    double multi = num1 * num2;
                    System.out.println("El resultado es " + multi);
                case '/':
                    double divi = num1 / num2;
                    System.out.println("El resultado es " + divi);
                case '%':
                    double resto = num1 % num2;
                    System.out.println("El resultado es " + resto);
            }
            condicion = in.nextLine().charAt(0);
        }
    }
}
