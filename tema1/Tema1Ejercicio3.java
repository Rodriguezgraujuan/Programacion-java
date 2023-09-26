import java.util.Scanner;

public class Tema1Ejercicio3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = in.nextInt();
        System.out.println("Introduce la altura");
        int altura = in.nextInt();
        int area = base*altura/2;
        System.out.println("El area es " + area);
    }
}
