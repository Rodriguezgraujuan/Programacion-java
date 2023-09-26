import java.util.Scanner;

public class t1ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numd = in.nextInt();

        if ((numd >= 1) && (numd <= 6)) {
            int lado = (7 - numd);
            System.out.println("El lado opuesto es" + lado);
        } else {
            System.out.println("El numero añadido es incorrecto");
        }
    }
}
