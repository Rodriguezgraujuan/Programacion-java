import java.util.*;

public class Practica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int velocidad1 = 1;
        int ataque1 = 1;
        int defensa1 = 1;
        int vida1 = 1;
        int critico1 = 1;
        int regeneracion1 = 1;

        int velocidad2 = 1;
        int ataque2 = 1;
        int defensa2 = 1;
        int vida2 = 1;
        int critico2 = 1;
        int regeneracion2 = 1;

        int hit1 = 0;
        int hit2 = 0;
        int jug1_esqui = 0;
        int jug2_esqui = 0;
        int sangrado = 0;

        List<String> vidajug1 = new Stack<>();
        List<String> vidajug2 = new Stack<>();

        boolean persok = false;
        String personaje1 = null;
        int vida_ber = 135;
        int vida_cab = 100;
        int vida_sam = 85;

        while (!persok) {
            System.out.println("Jugador 1 escoge personaje: Berserker, Caballero, Samurai");
            personaje1 = in.nextLine();
            switch (personaje1) {
                case "Berserker":
                    ataque1 = 150;
                    velocidad1 = 20;
                    defensa1 = 65;
                    vida1 = 135;
                    critico1 = 30;
                    regeneracion1 = 40;
                    persok = true;
                    break;
                case "Caballero":
                    ataque1 = 100;
                    velocidad1 = 40;
                    defensa1 = 200;
                    vida1 = 100;
                    critico1 = 20;
                    regeneracion1 = 30;
                    persok = true;
                    break;
                case "Samurai":
                    ataque1 = 120;
                    velocidad1 = 150;
                    defensa1 = 30;
                    vida1 = 85;
                    critico1 = 70;
                    regeneracion1 = 50;
                    persok = true;
                    break;
                default:
                    System.out.println("Personaje incorrecto");
            }
        }

        persok = false;
        String personaje2 = null;
        while (!persok) {
            System.out.println("Jugador 2 escoge personaje: Berserker, Caballero, Samurai");
            personaje2 = in.nextLine();
            switch (personaje2) {
                case "Berserker":
                    ataque2 = 150;
                    velocidad2 = 20;
                    defensa2 = 65;
                    vida2 = 135;
                    critico2 = 30;
                    regeneracion2 = 40;
                    persok = true;
                    break;
                case "Caballero":
                    ataque2 = 100;
                    velocidad2 = 40;
                    defensa2 = 200;
                    vida2 = 100;
                    critico2 = 20;
                    regeneracion2 = 30;
                    persok = true;
                    break;
                case "Samurai":
                    ataque2 = 120;
                    velocidad2 = 150;
                    defensa2 = 30;
                    vida2 = 85;
                    critico2 = 70;
                    regeneracion2 = 50;
                    persok = true;
                    break;
                default:
                    System.out.println("Personaje incorrecto");
            }
        }

        int prioridad;
        if (velocidad1 > velocidad2) {
            prioridad = 1;
        } else if (velocidad2 > velocidad1) {
            prioridad = 2;
        } else {
            prioridad = random.nextInt(1, 2);
        }
        System.out.println(prioridad);
        int turno = 1;

        System.out.println("INTRODUCE CUALQUIER CARACTER PARA EMPEZAR:");
        while (vida1 > 0 && vida2 > 0) {
            in.next();
            System.out.println("Ronda " + turno);

            if (prioridad == 1) {
                System.out.println("Jugador 1: ¿Quieres atacar-A o regenerarte-R?");
                char decision1 = in.next().charAt(0);

                if (decision1 == 'A') {
                    hit1 = random.nextInt(0, ataque1 / 10);
                    System.out.println(hit1);
                    hit1 = hit1 * 2 - random.nextInt(0, defensa2 / 10);

                    if (hit1 > 0) {
                        if (vida2 - hit1 < 0) {
                            break;
                        } else if (personaje1.equals("Berserker") && vida1 < 150 / 4 && hit1 == 9) {
                            System.out.println("Jugador 1 ha activado furia, daño x3 ");
                            hit1 = hit1 * 3;

                        } else if (personaje1.equals("Caballero") && hit1 <=8 && hit1 >=5) {
                            System.out.println("Jugador 1 hace ataque de escudo");
                            hit1 = random.nextInt(10,12);

                        } else if (personaje1.equals("Caballero") && hit1==20 && vida1<50) {
                            System.out.println("Jugador 1 hace punta de espada, realizara 1 ataque con posibilidad de sangrado");
                            hit1 = random.nextInt(random.nextInt(10,30));
                            sangrado = 5;
                        } else if (personaje1.equals("Samurai") && hit1 >=3 && hit1 <9) {
                            System.out.println("Jugador 1 realiza un ataque frontal");
                            hit1 = random.nextInt(15,22);

                        } else if (personaje1.equals("Samurai") && vida1<25) {
                            System.out.println("Jugador 1 activa fortaleza hachiman");
                            hit1 = random.nextInt(15, 20);
                            defensa1 = 80;

                        } else {
                            if (hit1 > 1) {
                                int prob1 = random.nextInt(critico1 / 10, 10);
                                int prob2 = random.nextInt(critico1 / 10, 10);
                                if (prob1 == prob2) {
                                    hit1 = hit1 * 2;
                                }
                            }

                        }
                        int esquivar = random.nextInt(velocidad2/10, 20);
                        if (esquivar>16){
                            hit1 = 0;
                            jug1_esqui = 1;
                        }
                        if (sangrado>0){
                            vida2 = vida2 - hit1 - 2;
                            sangrado--;
                        } else {
                            vida2 = vida2 - hit1;
                        }
                    }
                } else if (decision1 == 'R') {
                    int regen = random.nextInt(1, regeneracion1 / 2);
                    if (regen > 0) {
                        if (personaje1.equals("Berserker")) {
                            if (vida1 != vida_ber){
                                vida1 = vida1 + regen;
                                if (vida1 > vida_ber){
                                    vida1=vida_ber;
                                }
                            }
                        } else if (personaje1.equals("Caballero")){
                            if (vida1 != vida_cab){
                                vida1 = vida1 + regen;
                                if (vida1>vida_cab){
                                    vida1 = vida_cab;
                                }
                            }
                        } else {
                            if (vida1 != vida_sam){
                                vida1 = vida1 + regen;
                                if (vida1>vida_sam){
                                    vida1 = vida_sam;
                                }
                            }
                        }
                    }

                }
                if (vida2<0){
                    vida2=0;
                    break;
                }
                System.out.println("Jugador 2: ¿Quieres atacar-A o regenerarte-R?");
                char decision2 = in.next().charAt(0);
                if (decision2 == 'A') {
                    hit2 = random.nextInt(0, ataque2 / 10);
                    System.out.println(hit2);
                    hit2 = hit2 * 2 - random.nextInt(0, defensa1 / 10);
                    if (hit2 > 0) {
                        if (vida1 - hit2 < 0) {
                            break;
                        } else if (personaje2.equals("Berserker") && vida2 < 150 / 4 && hit2 == 9) {
                            System.out.println("Jugador 2 ha activado furia, daño x3 ");
                            hit2 = hit2 * 3;

                        } else if (personaje2.equals("Caballero") && hit2 <=8 && hit2 >=5) {
                            System.out.println("Jugador 2 hace ataque de escudo");
                            hit2 = random.nextInt(10,12);

                        } else if (personaje2.equals("Caballero") && hit2==20 && vida2<50) {
                            System.out.println("Jugador 2 hace punta de espada, realizara 1 ataque con posibilidad de sangrado");
                            hit2 = random.nextInt(random.nextInt(10,30));
                            sangrado = 5;
                        } else if (personaje2.equals("Samurai") && hit2 >=3 && hit2 <9) {
                            System.out.println("Jugador 2 realiza un ataque frontal");
                            hit2 = random.nextInt(15,22);

                        } else if (personaje2.equals("Samurai") && vida2<25) {
                            System.out.println("Jugador 2 activa fortaleza hachiman");
                            hit2 = random.nextInt(15, 20);
                            defensa2 = 80;

                        } else {
                            int prob1 = random.nextInt(critico2 / 10, 10);
                            int prob2 = random.nextInt(critico2 / 10, 10);
                            if (prob1 == prob2) {
                                hit2 = hit2 * 2;
                            }
                        }
                        int esquivar = random.nextInt(velocidad1/10, 20);
                        if (esquivar>16){
                            hit2 = 0;
                            jug2_esqui = 1;
                        }
                        vida1 = vida1 - hit2;
                    }
                } else if (decision2 == 'R') {
                    int regen = random.nextInt(1, regeneracion2 / 10);
                    if (regen > 0) {
                        if (personaje2.equals("Berserker")) {
                            if (vida2 != vida_ber){
                                vida2 = vida2 + regen;
                                if (vida2 > vida_ber){
                                    vida2=vida_ber;
                                }
                            }
                        } else if (personaje2.equals("Caballero")){
                            if (vida2 != vida_cab){
                                vida2 = vida2 + regen;
                                if (vida2>vida_cab){
                                    vida2 = vida_cab;
                                }
                            }
                        } else {
                            if (vida2 != vida_sam){
                                vida2 = vida2 + regen;
                                if (vida2>vida_sam){
                                    vida2 = vida_sam;
                                }
                            }
                        }
                    }
                }
                if (vida1<0){
                    vida1=0;
                    break;
                }
            } else if (prioridad == 2) {
                System.out.println("Jugador 2: ¿Quieres atacar-A o regenerarte-R?");
                char decision2 = in.next().charAt(0);

                if (decision2 == 'A') {
                    hit2 = random.nextInt(0, ataque2 / 10);
                    hit2 = hit2 * 2 - random.nextInt(0, defensa1 / 10);
                    if (hit2 > 0) {
                        if (vida1 - hit2 < 0) {
                            break;
                        } else if (personaje2.equals("Berserker") && vida2 < 150 / 4 && hit2 == 9) {
                            System.out.println("Jugador 2 ha activado furia, daño x3 ");
                            hit2 = hit2 * 3;

                        } else if (personaje2.equals("Caballero") && hit2 <=8 && hit2 >=5) {
                            System.out.println("Jugador 2 hace ataque de escudo");
                            hit2 = random.nextInt(10,12);

                        } else if (personaje2.equals("Caballero") && hit2==20 && vida2<50) {
                            System.out.println("Jugador 2 hace punta de espada, realizara 1 ataque con posibilidad de sangrado");
                            hit2 = random.nextInt(random.nextInt(10,30));
                            sangrado = 5;
                        } else if (personaje2.equals("Samurai") && hit2 >=3 && hit2 <9) {
                            System.out.println("Jugador 2 realiza un ataque frontal");
                            hit2 = random.nextInt(15,22);

                        } else if (personaje2.equals("Samurai") && vida2<25) {
                            System.out.println("Jugador 2 activa fortaleza hachiman");
                            hit2 = random.nextInt(15, 20);
                            defensa2 = 80;

                        } else {
                            int prob1 = random.nextInt(critico2 / 10, 10);
                            int prob2 = random.nextInt(critico2 / 10, 10);
                            if (prob1 == prob2) {
                                System.out.println("Jugador 2 da golpe critico");
                                hit2 = hit2 * 2;
                            }
                        }
                        int esquivar = random.nextInt(velocidad1/10, 20);
                        if (esquivar>16){
                            hit2 = 0;
                            jug1_esqui = 1;
                        }
                        vida1 = vida1 - hit2;
                    }
                    System.out.println(hit2);
                } else if (decision2 == 'R') {
                    int regen = random.nextInt(1, regeneracion2 / 10);
                    if (regen > 0) {
                        if (personaje2.equals("Berserker")) {
                            if (vida2 != vida_ber){
                                vida2 = vida2 + regen;
                                if (vida2 > vida_ber){
                                    vida2=vida_ber;
                                }
                            }
                        } else if (personaje2.equals("Caballero")){
                            if (vida2 != vida_cab){
                                vida2 = vida2 + regen;
                                if (vida2>vida_cab){
                                    vida2 = vida_cab;
                                }
                            }
                        } else {
                            if (vida2 != vida_sam){
                                vida2 = vida2 + regen;
                                if (vida2>vida_sam){
                                    vida2 = vida_sam;
                                }
                            }
                        }
                    }
                }
                if (vida1<0){
                    vida1=0;
                    break;
                }
                System.out.println("Jugador 1: ¿Quieres atacar-A o regenerarte-R?");
                char decision1 = in.next().charAt(0);

                if (decision1 == 'A') {
                    hit1 = random.nextInt(0, ataque1 / 10);
                    hit1 = hit1 * 2 - random.nextInt(0, defensa2 / 10);
                    if (hit1 > 0) {
                        if (vida2 - hit1 < 0) {
                            break;
                        } else if (personaje1.equals("Berserker") && vida1 < 150 / 4 && hit1 == 9) {
                            System.out.println("Jugador 1 ha activado furia, daño x3 ");
                            hit1 = hit1 * 3;

                        } else if (personaje1.equals("Caballero") && hit1 <=8 && hit1 >=5) {
                            System.out.println("Jugador 1 hace ataque de escudo");
                            hit1 = random.nextInt(10,12);

                        } else if (personaje1.equals("Caballero") && hit1==20 && vida1<50) {
                            System.out.println("Jugador 1 hace punta de espada, realizara 1 ataque con posibilidad de sangrado");
                            hit1 = random.nextInt(random.nextInt(10,30));
                            sangrado = 5;
                        } else if (personaje1.equals("Samurai") && hit1 >=3 && hit1 <9) {
                            System.out.println("Jugador 1 realiza un ataque frontal");
                            hit1 = random.nextInt(15,22);

                        } else if (personaje1.equals("Samurai") && vida1<25) {
                            System.out.println("Jugador 1 activa fortaleza hachiman");
                            hit1 = random.nextInt(15, 20);
                            defensa1 = 80;

                        } else {
                            if (hit1 > 1) {
                                int prob1 = random.nextInt(critico1 / 10, 10);
                                int prob2 = random.nextInt(critico1 / 10, 10);
                                if (prob1 == prob2) {
                                    hit1 = hit1 * 2;
                                }
                            }
                        }
                        int esquivar = random.nextInt(velocidad2/10, 20);
                        if (esquivar>16){
                            hit1 = 0;
                        }
                        vida2 = vida2 - hit1;
                    }
                } else if (decision1 == 'R') {
                    int regen = random.nextInt(1, regeneracion1 / 10);
                    if (regen > 0) {
                        if (personaje1.equals("Berserker")) {
                            if (vida1 != vida_ber){
                                vida1 = vida1 + regen;
                                if (vida1 > vida_ber){
                                    vida1=vida_ber;
                                }
                            }
                        } else if (personaje1.equals("Caballero")){
                            if (vida1 != vida_cab){
                                vida1 = vida1 + regen;
                                if (vida1>vida_cab){
                                    vida1 = vida_cab;
                                }
                            }
                        } else {
                            if (vida1 != vida_sam){
                                vida1 = vida1 + regen;
                                if (vida1>vida_sam){
                                    vida1 = vida_sam;
                                }
                            }
                        }
                    }
                }
            }
            if (vida2<0){
                vida2=0;
                break;
            }
            int aleat_ber = random.nextInt(1,10);
            if (personaje1.equals("Berserker") && vida1<150/5 && aleat_ber==2){
                System.out.println("Jugador 1 activa 'llamada de odin'");
                vida1 = vida1 + 50;
            } else if (personaje2.equals("Berserker") && vida2<150/5 && aleat_ber==2) {
                System.out.println("Jugador 2 activa 'llamada de odin'");
                vida2 = vida2 + 50;
            }
            vidajug1.clear();
            vidajug2.clear();
            for (int i = 0; i < vida1 / 10; i++) {
                vidajug1.add("-");
            }
            for (int i = 0; i < vida2 / 10; i++) {
                vidajug2.add("-");
            }
            if (hit1<0){
                hit1=0;
            }
            if (hit2<0){
                hit2=0;
            }

            if (jug1_esqui == 1){
                System.out.println("Jugador 1 ha esquivado el ataque");
                jug1_esqui = 0;
            }
            System.out.println("El jugador 1 causo " + hit1 + " puntos de daño.");
            if (jug2_esqui == 1) {
                System.out.println("Jugador 2 ha esquivado el ataque");
                jug2_esqui = 0;
            }
            System.out.println("El jugador 2 causo " + hit2 + " puntos de daño.");

            System.out.println("Vida del jugador 1: " + vida1 + vidajug1);
            System.out.println("Vida del jugador 2: " + vida2 + vidajug2);
            turno++;

            hit1=0;
            hit2=0;
            System.out.println("Introduce cualquier caracter");
        }
        System.out.println(vida1);
        if (vida1 > 0) {
            System.out.println("Jugador 1 causo " + hit1 + " puntos de daño");
            System.out.println("Jugador 1 gana:" + vida1 + vidajug1);
        } else {
            System.out.println("Jugador 2 causo " + hit2 + " puntos de daño");
            System.out.println("Jugador 2 gana:" + vida2 + vidajug2);
        }
    }
}