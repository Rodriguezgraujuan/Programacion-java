import java.util.Scanner;

public class Tema1Ejercicio28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int lot = (int) (Math.random() * (99999 + 1));
        System.out.println(lot);

        for (int i=1; i<=5; i++){
            System.out.println("Introduce el numero " + i);
            int num = in.nextInt();

            if (num == lot){
                System.out.println("Has hacertado");
                break;
            } else if (i != 5){
                System.out.println("Vuelve a intentarlo");
            }
        }
    }
}
