import java.util.Scanner;

public class Tema1Ejercicio1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado");
        int lado = in.nextInt();
        int area=lado*lado;
        int perimetro=4*lado;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);

    }
}
