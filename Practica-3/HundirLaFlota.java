import java.util.Scanner;

public class HundirLaFlota {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int seleccion = menuModoJuego();
    }

    public static int menuModoJuego(){
        boolean condition=false;
        int selecion=0;
        while (!condition) {
            System.out.println("Elije modo de juego " + "\n" +
                    "(facil, medio, dificil, personalizado)");
            selecion = in.nextInt();
            if (selecion > 0 && selecion < 5) {
                condition = true;
            }
        }
        return selecion;
    }
}
