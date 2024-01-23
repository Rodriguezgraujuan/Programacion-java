package POO1;

import java.util.Random;

public class Hero {

    public Random random = new Random();
    public String name;
    public int level = 0;
    public int health;
    private final int hpUpdate = 5;
    private final int recoverPotionHp = 10;
    private final int restauraHp = 50;
    private final int maxHealth = 150;
    public int experience;
    private final int addExp = 10;
    private final int resetExp = 50;
    public int attack;
    public int defense;
    public int descanso = 100;

    public Hero(String nombre, int vida, int ataque, int defensa) {
        name = nombre;
        health = vida;
        attack = ataque;
        defense = defensa;

    }

    public void drinkPotion() {
        health += recoverPotionHp;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public void rest() {
        health += restauraHp;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public String toString() {
        return "El personaje " + name + " Vida: " + health + " Nivel: " + level + " Ataque: " + attack + " Defensa: " + defense;
    }

    public int attack(int vidaHeroeEnemigo, int defensaEnemigo) {
        Random random = new Random();
        int golpe = random.nextInt(1, attack);
        if (golpe - defensaEnemigo < 0) {
            golpe = defensaEnemigo;
        }
        vidaHeroeEnemigo -= golpe - defensaEnemigo;
        experience += addExp;
        if (vidaHeroeEnemigo < 0) {
            vidaHeroeEnemigo = 0;
        }
        return vidaHeroeEnemigo;
    }

    public void levelUp() {
        if (experience >= resetExp) {
            attack++;
            defense++;
            health += hpUpdate;
            level++;
            experience -= resetExp;
        }
    }

    public int getRandomHp(int max) {
        return random.nextInt(1, max);
    }

    public int getRandomAttack(int max) {
        return random.nextInt(1, max);
    }

    public int getRandomDefense(int max) {
        return random.nextInt(1, max);
    }

    public boolean probHuir() {
        return random.nextInt(0, 10) == 1;
    }

    public int probDescansar() {
        boolean descansarono =  random.nextInt(0, 1000) == 1;
        if (descansarono) {
            System.out.println("Has descansado, te curas 100 de vida");
            health += descanso;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        return health;
    }

    public int probBuscarPocion() {
        boolean encontradono = random.nextInt(0, 10) == 1;
        if (encontradono) {
            System.out.println("Has encontrado una poción, te curas 10 de vida");
            health += recoverPotionHp;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        return health;
    }

    public void printStats() {
        System.out.println(" ⚔\uFE0F La vida del heroe " + name + " es " + health + " ⚔\uFE0F");
        System.out.println("El ataque es " + attack);
        System.out.println("La defensa es " + defense);
        System.out.println("El nivel es " + level);
    }

    public void printHp(int num) {
        System.out.println("La vida del Enemigo " + num + " es " + health);
    }

}
