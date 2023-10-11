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

        List<String> lista1 = new Stack<>();
        List<String> lista2 = new Stack<>();
        boolean persok = false;
        String personaje1 = null;
        int vida_ber = 150;
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
                    regeneracion1 = 10;
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
                    regeneracion1 = 10;
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
                    defensa2 = 50;
                    vida2 = 150;
                    critico2 = 60;
                    regeneracion2 = 70;
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
                    ataque2 = 100;
                    velocidad2 = 130;
                    defensa2 = 30;
                    vida2 = 70;
                    critico2 = 80;
                    regeneracion2 = 90;
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

        //EMPIEZA LA PARTIDA
        while (vida1 > 0 && vida2 > 0) {
            in.next();
            System.out.println("Ronda " + turno);

            if (prioridad == 1) {
                System.out.println("Jugador 1: ¿Quieres atacar-A o regenerarte-R?");
                char decision1 = in.next().charAt(0);

                if (decision1 == 'A') {
                    int hit = random.nextInt(0, ataque1 / 10);
                    hit = hit * 2 - random.nextInt(0, defensa2 / 10);

                    if (hit > 0) {
                        if (vida2 - hit < 0) {
                            break;
                        } else if (personaje1.equals("Berserker") && vida1 < 150 / 4 && hit == 9) {
                            System.out.println("Jugador 1 ha activado furia, daño x3 ");
                            hit = hit * 3;

                        } else {
                            if (hit > 1) {
                                int prob1 = random.nextInt(critico1 / 10, 10);
                                int prob2 = random.nextInt(critico1 / 10, 10);
                                if (prob1 == prob2) {
                                    hit = hit * 2;
                                }
                            }

                        }
                        int esquivar = random.nextInt(velocidad2/10, 20);
                        if (esquivar>16){
                            hit = 0;
                        }
                        vida2 = vida2 - hit;
                    }
                } else if (decision1 == 'R') {
                    int regen = random.nextInt(1, regeneracion1 / 2);
                    if (regen > 0) {
                        if (personaje1.equals("Berserker")) {
                            if (vida1 == vida_ber){
                            } else {
                                vida1 = vida1 + regen;
                                if (vida1 > vida_ber){
                                    vida1=vida_ber;
                                }
                            }
                        } else if (personaje1.equals("Caballero")){
                        } else {

                        }
                    }

                }

                System.out.println("Jugador 2: ¿Quieres atacar-A o regenerarte-R?");
                char decision2 = in.next().charAt(0);
                if (decision2 == 'A') {
                    int hit = random.nextInt(0, ataque2 / 10);
                    hit = hit * 2 - random.nextInt(0, defensa1 / 10);
                    if (hit > 0) {
                        if (vida1 - hit < 0) {
                            break;
                        } else if (personaje2.equals("Berserker") && vida1 < 150 / 4 && hit == 9) {
                            System.out.println("Jugador 2 ha activado furia, daño x3 ");
                            hit = hit * 3;

                        } else {
                            int prob1 = random.nextInt(critico2 / 10, 10);
                            int prob2 = random.nextInt(critico2 / 10, 10);
                            if (prob1 == prob2) {
                                hit = hit * 2;
                            }
                        }
                        int esquivar = random.nextInt(velocidad1/10, 20);
                        if (esquivar>16){
                            hit = 0;
                        }
                        vida1 = vida1 - hit;
                    }
                } else if (decision2 == 'R') {
                    int regen = random.nextInt(1, regeneracion2 / 10);
                    if (regen > 0) {
                        if (vida2 + regen > vida2) {
                            int diferencia = vida2 + regen - vida2;
                            vida2 = vida2 + diferencia;
                        } else {
                            vida2 = vida2 + regen;
                        }
                    }
                }

            } else if (prioridad == 2) {
                System.out.println("Jugador 2: ¿Quieres atacar-A o regenerarte-R?");
                char decision2 = in.next().charAt(0);

                if (decision2 == 'A') {
                    int hit = random.nextInt(0, ataque2 / 10);
                    hit = hit * 2 - random.nextInt(0, defensa1 / 10);
                    if (hit > 0) {
                        if (vida1 - hit < 0) {
                            break;
                        } else if (personaje2.equals("Berserker") && vida1 < 150 / 4 && hit == 9) {
                            System.out.println("Jugador 2 ha activado furia, daño x3 ");
                            hit = hit * 3;

                        } else {
                            int prob1 = random.nextInt(critico2 / 10, 10);
                            int prob2 = random.nextInt(critico2 / 10, 10);
                            if (prob1 == prob2) {
                                hit = hit * 2;
                            }
                        }
                        int esquivar = random.nextInt(velocidad1/10, 20);
                        if (esquivar>16){
                            hit = 0;
                        }
                        vida1 = vida1 - hit;
                    }

                } else if (decision2 == 'R') {
                    int regen = random.nextInt(1, regeneracion2 / 10);
                    if (regen > 0) {
                        if (vida2 + regen > vida2) {
                            int diferencia = vida2 + regen - vida2;
                            vida2 = vida2 + diferencia;
                        } else {
                            vida2 = vida2 + regen;
                        }
                    }
                }

                System.out.println("Jugador 1: ¿Quieres atacar-A o regenerarte-R?");
                char decision1 = in.next().charAt(0);

                if (decision1 == 'A') {
                    int hit = random.nextInt(0, ataque1 / 10);
                    hit = hit * 2 - random.nextInt(0, defensa2 / 10);
                    if (hit > 0) {
                        if (vida2 - hit < 0) {
                            break;
                        } else if (personaje1.equals("Berserker") && vida1 < 150 / 4 && hit == 9) {
                            System.out.println("Jugador 1 ha activado furia, daño x3 ");
                            hit = hit * 3;

                        } else {
                            if (hit > 1) {
                                int prob1 = random.nextInt(critico1 / 10, 10);
                                int prob2 = random.nextInt(critico1 / 10, 10);
                                if (prob1 == prob2) {
                                    hit = hit * 2;
                                }
                            }
                        }
                        int esquivar = random.nextInt(velocidad2/10, 20);
                        if (esquivar>16){
                            hit = 0;
                        }
                        vida2 = vida2 - hit;
                    }
                } else if (decision1 == 'R') {
                    int regen = random.nextInt(1, regeneracion1 / 10);
                    if (regen > 0) {
                        if (vida1 + regen > vida1) {
                            int diferencia = vida1 + regen - vida1;
                            vida1 = vida1 + diferencia;
                        } else {
                            vida1 = vida1 + regen;
                        }
                    }
                }
            }
            int aleat_ber = random.nextInt(1,30);
            if (personaje1.equals("Berserker") && vida1<150/5 && aleat_ber==2){
                System.out.println("Jugador 1 activa 'llamada de odin'");
                vida1 = vida1 + 50;
            }

            for (int i = 0; i < vida1 / 10; i++) {
                lista1.add("-");
            }
            for (int i = 0; i < vida2 / 10; i++) {
                lista2.add("-");
            }
            System.out.println("Vida del jugador 1: " + vida1 + lista1);

            System.out.println("Vida del jugador 2: " + vida2 + lista2);
            turno++;
            lista1.clear();
            lista2.clear();
        }

        System.out.println("Introduce cualquier caracter");
        if (vida1 > 0) {
            System.out.println("Jugador 1 gana:" + vida1 + lista1);
        } else {
            System.out.println("Jugador 2 gana:" + vida2 + lista2);
        }
    }
}