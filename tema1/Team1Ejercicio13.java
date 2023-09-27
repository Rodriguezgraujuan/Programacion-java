import java.util.Scanner;

public class Team1Ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce los segundos");
        int segundos = in.nextInt() + 1;
        System.out.println("Introduce los minutos");
        int minutos = in.nextInt();
        System.out.println("Introduce los horas");
        int horas = in.nextInt();

        if (segundos <= 60 && minutos <= 60 && horas <= 23) {
            if (segundos >= 60) {
                minutos = minutos + 1;
                segundos = segundos - 60;
                if (minutos >= 60) {
                    minutos = minutos - 60;
                    horas = horas + 1;
                    if (horas > 23) {
                        horas = horas - 24;
                    }
                }
            } else {
                System.out.println("Hora incorrecta.");
            }
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
    }
}