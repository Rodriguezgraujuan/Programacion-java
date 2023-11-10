package Tema2;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class comprob {
    static Random random = new Random();


    public static void Asciiart(String personage) {
        switch (personage) {
            case "BERSERKER" -> System.out.println("""

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
            case "CABALLERO" -> System.out.println("""


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
            case "SAMURAI" -> System.out.println("""
                    ,_._._._._._._._._|__________________________________________________________,
                    |_|_|_|_|_|_|_|_|_|_________________________________________________________/
                                      !""");
            case "Trophie" -> System.out.println("""
                      ___________
                                '._==_==_=_.'
                                .-\\:      /-.
                               | (|:.     |) |
                                '-|:.     |-'
                                  \\::.    /
                                   '::. .'
                                     ) (\s
                                   _.' '._
                                  `""\"""\""`\
                    """);
        }
    }

    public static int ataquepers(String personage) {
        int ataque = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            ataque = 150;
        } else if (Objects.equals(personage, "CABALLERO")) {
            ataque = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            ataque = 70;
        }
        return ataque;
    }

    public static int velocidadpers(String personage) {
        int velocidad = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            velocidad = 150;
        } else if (Objects.equals(personage, "CABALLERO")) {
            velocidad = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            velocidad = 70;
        }
        return velocidad;
    }

    public static int defensapers(String personage) {
        int defensa = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            defensa = 150;
        } else if (Objects.equals(personage, "CABALLERO")) {
            defensa = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            defensa = 70;
        }
        return defensa;
    }

    public static int vidapers(String personage) {
        int vida = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            vida = 150;
        } else if (Objects.equals(personage, "CABALLERO")) {
            vida = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            vida = 70;
        }
        return vida;
    }

    public static int criticpers(String personage) {
        int critic = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            critic = 150;
        } else if (Objects.equals(personage, "CABALLERO")) {
            critic = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            critic = 70;
        }
        return critic;
    }

    public static int regenpers(String personage) {
        int regen = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            regen = 150;
        } else if (Objects.equals(personage, "CABALLERO")) {
            regen = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            regen = 70;
        }
        return regen;
    }

    public static boolean playerOk(String player) {
        return !player.equals("BERSERKER") && !player.equals("CABALLERO") && !player.equals("SAMURAI");
    }

    public static boolean priorityatackplayer(int velocidad1, int velocidad2) {
        return velocidad1 > velocidad2;
    }

    public static boolean Islive(int vida) {
        return vida <= 0;
    }

    public static int strike(int ataque, int defensa, int critico) {
        int hit = random.nextInt(0, ataque / 10);
        hit = hit * 2 - random.nextInt(0, defensa / 10);
        int criticprob = random.nextInt(critico / 10, 20);
        if (criticprob == 14) {
            hit *= 3;
        }
        return hit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        String player1 = null;
        String player2 = null;
        System.out.println("Introduce tu personaje jugador 1: (B) Berserker, (C) Caballero, (S) Samurai");
        while (condition) {
            player1 = in.nextLine();
            System.out.println(player1);
            Asciiart(player1);
            condition = playerOk(player1);
            if (condition) {
                System.out.println("Nombre erroneo");
            }
        }
        int ataque1 = ataquepers(player1);
        int velocidad1 = velocidadpers(player1);
        int defensa1 = defensapers(player1);
        int vida1 = vidapers(player1);
        int critico1 = criticpers(player1);
        int regeneracion1 = regenpers(player1);


        System.out.println("Introduce tu personaje jugador 2: (B) Berserker, (C) Caballero, (S) Samurai");
        condition = true;
        while (condition) {
            player2 = in.nextLine();
            Asciiart(player2);
            condition = playerOk(player2);
            if (condition) {
                System.out.println("Nombre erroneo");
            }
        }

        int ataque2 = ataquepers(player2);
        int velocidad2 = velocidadpers(player2);
        int defensa2 = defensapers(player2);
        int vida2 = vidapers(player2);
        int critico2 = criticpers(player2);
        int regeneracion2 = regenpers(player2);

        while (vida1 > 0 || vida2 > 0) {
            System.out.println("Pulsa cualquier tecla para continuar");
            in.next();
            if (priorityatackplayer(velocidad1, velocidad2)) {
                System.out.println("Player 1: Atacar-A o Regenerarte-R");
                char atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    vida2 -= strike(ataque1, defensa2, critico1);
                    if (Islive(vida2)) {
                        break;
                    }
                } else if (atacarregen == 'R') {
                    vida1+= random.nextInt(1, regeneracion1/10);
                }
                System.out.println("Player 2: Atacar-A o Regenerarte-R");
                atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    vida1 -= strike(ataque2, defensa1, critico2);
                } else if (atacarregen == 'R') {
                    vida2+= random.nextInt(1, regeneracion2/10);
                }
                System.out.println("Vida1: " + vida1);
                System.out.println("Vida2: " + vida2);
            } else {
                System.out.println("Player 2: Atacar-A o Regenerarte-R");
                char atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    vida1 -= strike(ataque2, defensa1, critico2);
                    if (Islive(vida1)) {
                        break;
                    }
                } else if (atacarregen == 'R') {
                    vida2 +=random.nextInt(1, regeneracion2/10);
                }
                System.out.println("Player 1: Atacar-A o Regenerarte-R");
                atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    vida2 -= strike(ataque1, defensa2, critico1);
                    if (Islive(vida2)) {
                        break;
                    }
                } else if (atacarregen == 'R') {
                    vida1+= random.nextInt(1, regeneracion1/10);
                }
            }
            System.out.println();
            System.out.println("hola");

        }
        if (vida1 <= 0) {
            System.out.println("Jugador 2 gana:" + vida2);
        } else {
            System.out.println("Jugador 1 gana:" + vida1);
        }
        Asciiart("Trophie");

    }
}
