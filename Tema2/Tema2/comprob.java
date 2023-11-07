package Tema2;

import javax.swing.plaf.PanelUI;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class comprob {

    public static void Asciiart (String personage){
        if (Objects.equals(personage, "BERSERKER")){
            System.out.println("""

                                               ~.                      \s
                                        Ya...___|__..ab.     .   . \s
                                         Y88b  \\88b  \\88b   (     ) \s
                                          Y88b  :88b  :88b   `.oo'  \s
                                          :888  |888  |888  ( (`-'  \s
                                 .---.    d88P  ;88P  ;88P   `.`.   \s
                                / .-._)  d8P-""\"|""\"'-Y8P      `.`. \s
                               ( (`._) .-.  .-. |.-.  .-.  .-.   ) )\s
                                \\ `---( O )( O )( O )( O )( O )-' / \s
                                 `.    `-'  `-'  `-'  `-'  `-'  .'   \s
                                   `---------------------------'\
                            """);

        }  else if (Objects.equals(personage, "CABALLERO")){
            System.out.println("""


                                               _.--.    .--._
                                             ."  ."      ".  ".
                                            ;  ."    /\\    ".  ;
                                            ;  '._,-/  \\-,_.`  ;
                                            \\  ,`  / /\\ \\  `,  /
                                             \\/    \\/  \\/    \\/
                                             ,=_    \\/\\/    _=,
                                             |  "_   \\/   _"  |
                                             |_   '"-..-"'   _|
                                             | "-.        .-" |
                                             |    "\\    /"    |
                                             |      |  |      |
                                     ___     |      |  |      |     ___
                                 _,-",  ",   '_     |  |     _'   ,"  ,"-,_
                               _(  \\  \\   \\"=--"-.  |  |  .-"--="/   /  /  )_
                             ,"  \\  \\  \\   \\      "-'--'-"      /   /  /  /  ".
                            !     \\  \\  \\   \\                  /   /  /  /     !
                            :      \\  \\  \\   \\                /   /  /  /      :""");

        } else {
            System.out.println("""
                            ,_._._._._._._._._|__________________________________________________________,
                            |_|_|_|_|_|_|_|_|_|_________________________________________________________/
                                              !""");
        }
    }
    public static int ataquepers(String personage){
        int ataque = 0;
        if (Objects.equals(personage, "BERSERKER")){
            ataque = 150;
        } else if (Objects.equals(personage, "CABALLERO")){
            ataque= 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            ataque = 70;
        }
        return ataque;
    }
    public static int velocidadpers(String personage){
        int velocidad = 0;
        if (Objects.equals(personage, "BERSERKER")){
            velocidad = 150;
        } else if (Objects.equals(personage, "CABALLERO")){
            velocidad= 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            velocidad = 70;
        }
        return velocidad;
    }
    public static int defensapers(String personage){
        int defensa = 0;
        if (Objects.equals(personage, "BERSERKER")){
            defensa = 150;
        } else if (Objects.equals(personage, "CABALLERO")){
            defensa= 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            defensa = 70;
        }
        return defensa;
    }
    public static int vidapers(String personage){
        int vida = 0;
        if (Objects.equals(personage, "BERSERKER")){
            vida = 150;
        } else if (Objects.equals(personage, "CABALLERO")){
            vida= 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
           vida = 70;
        }
        return vida;
    }
    public static int criticpers(String personage){
        int critic = 0;
        if (Objects.equals(personage, "BERSERKER")){
            critic = 150;
        } else if (Objects.equals(personage, "CABALLERO")){
            critic= 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            critic = 70;
        }
        return critic;
    }

    public static int regenpers(String personage){
        int regen = 0;
        if (Objects.equals(personage, "BERSERKER")){
            regen = 150;
        } else if (Objects.equals(personage, "CABALLERO")){
            regen= 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            regen = 70;
        }
        return regen;
    }

    public static boolean priorityatackplayer(int velocidad1, int velocidad2){
        return velocidad1 > velocidad2;
    }

    public static boolean hpcheck(int vida){
        return vida>0;
    }

    public static int strike(int ataque, int defensa){
        Random random = new Random();
        int hit = random.nextInt(0, ataque / 10);
        hit = hit * 2 - random.nextInt(0, defensa / 10);
        int criticprob = random.nextInt(ataque/10, 20);
        if (criticprob==19) {
            hit *= 3;
        }
            return hit;
    }

    public static int regeneration (int vida1, int vida2, int regen1, int regen2){

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce tu personaje jugador 1: Berserker, Caballero, Samurai");
        String personage = in.nextLine();
        String player1 = personage;
        System.out.println(player1);
        Asciiart(player1);

        System.out.println("Introduce tu personaje jugador 2: Berserker, Caballero, Samurai");
        personage = in.nextLine();
        String player2 = personage;
        Asciiart(player2);


        int ataque1 = ataquepers(personage);
        int velocidad1 = velocidadpers(personage);
        int defensa1 = defensapers(personage);
        int vida1 = vidapers(personage);
        int critico1 = criticpers(personage);
        int regeneracion1 = regenpers(personage);

        int ataque2 = ataquepers(personage);
        int velocidad2 = velocidadpers(personage);
        int defensa2 = defensapers(personage);
        int vida2 = vidapers(personage);
        int critico2 = criticpers(personage);
        int regeneracion2 = regenpers(personage);

        while (vida1 != 0 || vida2!=0){
            if (priorityatackplayer(velocidad1, velocidad2)){
                int hit = strike(ataque1, defensa2);
                vida2 -= hit;
                if (hpcheck(vida2)){
                    break;
                } else {
                    hit = strike(ataque2, defensa1);
                    vida1 -= hit;
                }
            }
        }
    }
}
