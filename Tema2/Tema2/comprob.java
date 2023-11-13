package Tema2;

import java.util.*;

public class comprob {
    static Random random = new Random();
    static List<String> vidajug = new Stack<>();
    static int countersamuraifort = 0;

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
            ataque = 120;
        }
        return ataque;
    }

    public static int velocidadpers(String personage) {
        int velocidad = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            velocidad = 20;
        } else if (Objects.equals(personage, "CABALLERO")) {
            velocidad = 40;
        } else if (Objects.equals(personage, "SAMURAI")) {
            velocidad = 150;
        }
        return velocidad;
    }

    public static int defensapers(String personage) {
        int defensa = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            defensa = 65;
        } else if (Objects.equals(personage, "CABALLERO")) {
            defensa = 200;
        } else if (Objects.equals(personage, "SAMURAI")) {
            defensa = 30;
        }
        return defensa;
    }

    public static int vidapers(String personage) {
        int vida = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            vida = 135;
        } else if (Objects.equals(personage, "CABALLERO")) {
            vida = 100;
        } else if (Objects.equals(personage, "SAMURAI")) {
            vida = 85;
        }
        return vida;
    }

    public static int criticpers(String personage) {
        int critic = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            critic = 30;
        } else if (Objects.equals(personage, "CABALLERO")) {
            critic = 20;
        } else if (Objects.equals(personage, "SAMURAI")) {
            critic = 70;
        }
        return critic;
    }

    public static int regenpers(String personage) {
        int regen = 0;
        if (Objects.equals(personage, "BERSERKER")) {
            regen = 40;
        } else if (Objects.equals(personage, "CABALLERO")) {
            regen = 30;
        } else if (Objects.equals(personage, "SAMURAI")) {
            regen = 50;
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

    public static int strike(int ataque, int defensa, int critico, int velocidad) {
        int hit = random.nextInt(0, ataque / 10);
        hit = hit * 2 - random.nextInt(0, defensa / 10);
        int criticprob = random.nextInt(critico / 10, 20);
        if (hit<0){
            hit=0;
        } else{
            int esquivar = random.nextInt(velocidad/10, 20);
            if (esquivar>18){
                hit = 0;
            }
        }
        if (criticprob == 14) {
            hit *= 3;
        }
        return hit;
    }

    public static void Roundcounter(int number){
        System.out.println("Ronda: " + number);
    }

    public static int skillhp(int vida, int hit, String player){
        if (player.equals("BERSERKER") && vida<150/5 && hit>13){
            System.out.println("BERSERKER entra en furia");
            vida+=30;
        } if (player.equals("SAMURAI") && vida<25 && countersamuraifort==1) {
            System.out.println("Jugador 1 activa fortaleza hachiman");
            vida += 30;
            countersamuraifort++;
        }
        return vida;
    }

    public static void Mostrardmg(int hit){
        System.out.println("Ha hecho " + hit + " puntos de daño");
    }

    public static void Mostrarregen(int regen){
        System.out.println("Se ha curado " + regen + " puntos de vida");
    }
    public static int skilldmg(int vida, int hit, String player) {
        if (player.equals("BERSERKER") && vida < 150 / 4 && hit == 9) {
            System.out.println("Jugador 1 ha activado furia, daño x3 ");
            hit = hit * 3;
        } else if (player.equals("CABALLERO") && hit <= 8 && hit >= 5) {
            System.out.println("Jugador 1 hace ataque de escudo");
            hit = random.nextInt(10, 12);
        } else if (player.equals("CABALLERO") && hit == 20 && vida < 50) {
            System.out.println("Jugador 1 hace punta de espada");
            hit = random.nextInt(random.nextInt(10, 30));
        } else if (player.equals("SAMURAI") && hit >= 3 && hit < 9) {
            System.out.println("Jugador 1 realiza un ataque frontal");
            hit = random.nextInt(15, 22);
        }
        return hit;
    }

    public static void displayhp(int vida){
        vidajug.clear();
        for (int i = 0; i < vida / 10; i++) {
            vidajug.add("-");
        }
        System.out.println(vidajug);
    }

    public static int dodge(int velocidad, int hit){
        int esquivar = random.nextInt(velocidad/10, 20);
        if (esquivar>16){
            hit = 0;
        }
        return hit;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        String player1 = null;
        String player2 = null;
        System.out.println("Introduce tu personaje jugador 1: BERSERKER, CABALLERO, SAMURAI");
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


        System.out.println("Introduce tu personaje jugador 2: BERSERKER, CABALLERO, SAMURAI");
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

        int numerorondas=1;

        while (vida1 > 0 || vida2 > 0) {
            Roundcounter(numerorondas);
            numerorondas++;
            System.out.println("Pulsa cualquier tecla para continuar");
            in.next();
            if (priorityatackplayer(velocidad1, velocidad2)) {
                System.out.println("Player 1: Atacar-A o Regenerarte-R");
                char atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    int hit = strike(ataque1, defensa2, critico1, velocidad2);
                    hit = skilldmg(vida1,hit,player1);
                    hit = dodge(velocidad2, hit);
                    vida1 = skillhp(vida1, hit, player1);
                    vida2 -= hit;
                    if (Islive(vida2)) {
                        break;
                    }
                    Mostrardmg(hit);
                } else if (atacarregen == 'R') {
                   int regen = random.nextInt(1, regeneracion1/10);
                    vida1+= regen;
                    Mostrarregen(regen);
                }
                System.out.println("Player 2: Atacar-A o Regenerarte-R");
                atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    int hit = strike(ataque2,defensa1,critico2, velocidad1);
                    hit = skilldmg(vida2,hit,player2);
                    hit = dodge(velocidad1, hit);
                    vida2 = skillhp(vida2, hit, player2);
                    vida1 -= hit;
                    Mostrardmg(hit);
                } else if (atacarregen == 'R') {
                    int regen = random.nextInt(1, regeneracion2/10);
                    vida2+= regen;
                    Mostrarregen(regen);
                }
            } else {
                System.out.println("Player 2: Atacar-A o Regenerarte-R");
                char atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    int hit = strike(ataque2,defensa1,critico2, velocidad1);
                    hit = skilldmg(vida2,hit,player2);
                    hit = dodge(velocidad1, hit);
                    vida2 = skillhp(vida2, hit, player2);
                    vida1 -= hit;
                    if (Islive(vida1)) {
                        break;
                    }
                    Mostrardmg(hit);
                } else if (atacarregen == 'R') {
                    int regen = random.nextInt(1, regeneracion2/10);
                    vida2+= regen;
                    Mostrarregen(regen);
                }
                System.out.println("Player 1: Atacar-A o Regenerarte-R");
                atacarregen = in.next().charAt(0);
                if (atacarregen == 'A') {
                    int hit = strike(ataque1, defensa2, critico1, velocidad2);
                    hit = skilldmg(vida1,hit,player1);
                    hit = dodge(velocidad2, hit);
                    vida1 = skillhp(vida1, hit, player1);
                    vida2 -= hit;
                    if (Islive(vida2)) {
                        break;
                    }
                    Mostrardmg(hit);
                } else if (atacarregen == 'R') {
                    int regen = random.nextInt(1, regeneracion1/10);
                    vida1+= regen;
                    Mostrarregen(regen);
                }
            }
            if (!Islive(vida1)||!Islive(vida2)) {
                System.out.println("Vida jugador 1: " + vida1);
                displayhp(vida1);
                System.out.println("Vida jugador 2: " + vida2);
                displayhp(vida2);
            }

        }
        if (vida1 <= 0) {
            System.out.println("Jugador 2 gana:" + vida2);
            displayhp(vida2);
        } else {
            System.out.println("Jugador 1 gana:" + vida1);
            displayhp(vida1);
        }
        Asciiart("Trophie");

    }
}