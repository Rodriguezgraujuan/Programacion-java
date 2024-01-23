package POO1;

import java.util.Random;
import java.util.Scanner;

public class HordasVsHero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean condition = true;
        String nombre = "";
        int vida = 0;
        int ataque = 0;
        int defensa = 0;
        while (condition) {
            System.out.println("Crea tu heroe: Tienes 200 puntos a repartir");
            System.out.println("Introduce tu nombre: ");
            nombre = in.nextLine();
            System.out.println("Vida: ");
            vida = in.nextInt();
            System.out.println("Ataque: ");
            ataque = in.nextInt();
            System.out.println("Defensa: ");
            defensa = in.nextInt();
            if (vida + ataque + defensa <= 200) {
                condition = false;
            }
        }

        Hero personaje = new Hero(nombre, vida, ataque, defensa);

        int partidafin = 0;
        while (partidafin < 3) {
            int enemigoAlea = random.nextInt(1, 3);
            Hero arrayEnomigos[] = new Hero[enemigoAlea];
            for (int i = 0; i < enemigoAlea; i++) {
                arrayEnomigos[i] = new Hero("Enemigo " + i, personaje.getRandomHp(personaje.health / 3), personaje.getRandomAttack(personaje.attack + 30), personaje.getRandomDefense(personaje.health / 2));
            }
            boolean enemigosMuertos = false;
            System.out.println("Empieza la Ronda " + partidafin);
            in.next();
            while (!enemigosMuertos) {
                personaje.levelUp();
                personaje.printStats();
                for (int k = 0; k < arrayEnomigos.length; k++) {
                    arrayEnomigos[k].printHp(k);
                }
                if (personaje.health <= 0) {
                    System.out.println("Has sobrevivido " + partidafin + " Rondas");
                    partidafin = 3;
                    enemigosMuertos = true;
                } else {
                    if (arrayEnomigos[0].health > 0) {
                        if (!arrayEnomigos[0].probHuir()) {
                            arrayEnomigos[0].health = personaje.attack(arrayEnomigos[0].health, arrayEnomigos[0].defense);
                        }
                        if (arrayEnomigos[0].health > 0) {
                            for (int i = 0; i < arrayEnomigos.length; i++) {
                                personaje.health = arrayEnomigos[i].attack(personaje.health, personaje.defense);
                            }
                        }
                    } else if (enemigoAlea > 1 && arrayEnomigos[1].health > 0) {
                        if (!arrayEnomigos[1].probHuir()) {
                            arrayEnomigos[1].health = personaje.attack(arrayEnomigos[1].health, arrayEnomigos[1].defense);
                        }
                        if (arrayEnomigos[1].health > 0) {
                            for (int i = 1; i < arrayEnomigos.length; i++) {
                                personaje.health = arrayEnomigos[i].attack(personaje.health, personaje.defense);
                            }
                        }
                    } else if (enemigoAlea > 2 && arrayEnomigos[2].health > 0) {
                        if (!arrayEnomigos[2].probHuir()) {
                            arrayEnomigos[2].health = personaje.attack(arrayEnomigos[2].health, arrayEnomigos[2].defense);
                        }
                        if (arrayEnomigos[2].health > 0) {
                            personaje.health = arrayEnomigos[2].attack(personaje.health, personaje.defense);
                        }
                    } else {
                        enemigosMuertos = true;
                    }
                }
            }
            if (enemigosMuertos) {
                partidafin++;
                if (personaje.health>=0&&partidafin==3){
                    System.out.println("Has ganado");
                }
            }

            /*
            Aqui tenemos las probabilidades de recuperar vida.
             */
            personaje.health = personaje.probBuscarPocion();
            personaje.health = personaje.probDescansar();
        }

    }
}
