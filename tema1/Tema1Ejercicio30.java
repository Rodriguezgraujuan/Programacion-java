import java.util.Scanner;

public class Tema1Ejercicio30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        double num1 = in.nextDouble();
        System.out.println("Que operacion quieres hacer? +, -, *, / o %");
        String op = in.next();
        System.out.println("Introduce el segundo numero:");
        double num2= in.nextDouble();
        String condicion = "S";
        while (condicion == "S"){
            switch (op) {
                case "+":
                    double suma = num1 + num2;
                    System.out.println("El resultado es " + suma);
                    break;
                case "-":
                    double resta = num1 - num2;
                    System.out.println("El resultado es " + resta);
                    break;
                case "*":
                    double multi = num1 * num2;
                    System.out.println("El resultado es " + multi);
                    break;
                case "/":
                    double divi = num1 / num2;
                    System.out.println("El resultado es " + divi);
                    break;
                case "%":
                    double resto = num1 % num2;
                    System.out.println("El resultado es " + resto);
                    break;
            }
            condicion = in.next();
            System.out.println(condicion);
        }
    }
}
