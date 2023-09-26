import java.util.Scanner;

public class t1ej6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Introduce el radio del circulo:");
        short R= in.nextShort();
        double A=3.14*R*R;
        System.out.println("El area del circulo es" + A);
    }
}
