import java.util.Random;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int velocidad1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int vida1 = 0;

        int velocidad2= 0;
        int ataque2 = 0;
        int defensa2 = 0;
        int vida2 = 0;


        int total1 = 501;
        int total2 = 501;

        while (total1 > 500) {
            System.out.println("Jugador 1, Introduce tus puntos de atributos. (No pases de 500)");
            System.out.println("Velocidad:");
            velocidad1 = in.nextInt();
            System.out.println("Ataque:");
            ataque1 = in.nextInt();
            System.out.println("Defensa:");
            defensa1 = in.nextInt();
            System.out.println("Vida:");
            vida1 = in.nextInt();
            total1 = velocidad1 + ataque1 + defensa1 + vida1;

            if (total1 > 500 && velocidad1 <=200 && velocidad1 >0 && ataque1 <= 200 && ataque1 > 0 && defensa1 <=200 && defensa1>0 && vida1 <= 200 && vida1>0) {
                System.out.println("Atributos incorrectos. Deben ser 500 en total o menos");
            }
        }
            if (ataque1<10){
                ataque1=10;
            } else if (defensa1<10) {
                defensa1=10;
            }
            vida1 = vida1 + 100;

        while (total2 > 500) {
            System.out.println("Jugador 2, Introduce tus puntos de atributos. (No pases de 500)");
            System.out.println("Velocidad:");
            velocidad2 = in.nextInt();
            System.out.println("Ataque:");
            ataque2 = in.nextInt();
            System.out.println("Defensa:");
            defensa2 = in.nextInt();
            System.out.println("Vida:");
            vida2 =  in.nextInt();
            total2 = velocidad2 + ataque2 + defensa2 + vida2;

            if (total2 > 500 && velocidad2 <=200 && velocidad2 >0 && ataque2 <= 200 && ataque2 > 0 && defensa2 <=200 && defensa2>0 && vida2 <= 200 && vida2>0) {
                System.out.println("Atributos incorrectos. Deben ser 500 en total o menos");
            }
        }
            if (ataque2<10){
                ataque2=10;
            } else if (defensa2<10) {
                defensa2=10;
            }
           vida2 = vida2 + 100;

        int prioridad;
        if (velocidad1 > velocidad2){
            prioridad = 1;
        } else if (velocidad2>velocidad1){
            prioridad = 2;
        } else {
            prioridad = random.nextInt(1,2);
        }
        System.out.println(prioridad);
        int turno = 1;
        char condicion = 's';
        while (vida1 > 0 && vida2 > 0 && condicion=='s'){
            System.out.println("Ronda " + turno);
            if (prioridad==1) {
                int hit = random.nextInt(0, ataque1 / 10);

                if (hit>0) {
                    hit = hit - random.nextInt(0, defensa2 / 10);
                    if (vida2 - hit < 0) {
                        break;
                    } else {
                        vida2 = vida2 - hit;
                    }
                }

                hit = random.nextInt(0, ataque2 / 10);
                hit = hit - random.nextInt(0, defensa1 / 10);
                if (hit > 0) {
                    if (vida1 - hit < 0){
                        break;
                    }else {
                        vida1 = vida1 - hit;
                    }
                }
                System.out.println("Vida del jugador 1: " + vida1);
                System.out.println("Vida del jugador 2: " + vida2);
                System.out.println("Quieres continuar? Pon S");
                condicion = in.next().charAt(0);
            } else if (prioridad==2){
                System.out.println("Prioridad2");
                int hit = random.nextInt(0, ataque2 / 10);
                hit = hit - random.nextInt(0, defensa1 / 10);
                if (hit>0){
                    if (vida1-hit<0){
                        break;
                    }else {
                        vida1 = vida1 - hit;
                    }
                }
                hit = random.nextInt(0, ataque1 / 10);
                hit = hit - random.nextInt(0, defensa2 / 10);
                if (hit > 0) {
                    if (vida2-hit<0){
                        break;
                    } else {
                        vida2 = vida2 - hit;
                    }
                }
                System.out.println("Vida del jugador 2: " + vida2);
                System.out.println("Vida del jugador 1: " + vida1);
                System.out.println("Quieres continuar? Pon S");
                condicion = in.next().charAt(0);
            }
            turno++;
        }
        if (vida1 >0){
            System.out.println("Jugador 1 gana");
        } else {
            System.out.println("Jugador 2 gana");
        }
    }
}
