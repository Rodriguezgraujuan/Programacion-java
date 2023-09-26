import java.util.Scanner;

public class Tema1Ejercicio2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = in.nextInt();
        System.out.println("Introduce la altura");
        int altura = in.nextInt();
        int area = base * altura;
        int perimetro = base * 2 + altura * 2;
        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);


    }
}
