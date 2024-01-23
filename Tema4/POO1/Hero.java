package POO1;

import java.util.Random;

public class Hero {

    public Random random = new Random();
    private String name;
    private int level = 0;
    private int health;
    private int experience;
    private int attack;
    private int defense;
    private final int hpUpdate = 5;
    private final int recoverPotionHp = 10;
    private final int restauraHp = 50;
    private final int maxHealth = 150;
    private final int addExp = 10;
    private final int resetExp = 50;
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

    public void setHealth(int health) {
        if (health<=0){
            health=0;
        } else if (health>maxHealth){
            health=maxHealth;
        }
        this.health=health;
    }

    public void setAttack(int attack) {
        if (attack<=1){
            attack=30;
        } else if (attack>200){
            attack=30;
        }
        this.attack=attack;
    }

    public void setDefense(int defense) {
        if (defense<=0){
            defense=20;
        } else if (defense>200) {
            defense=20;
        }
        this.defense=defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public String toString() {
        return "El personaje " + name + " Vida: " + health + " Nivel: " + level + " Ataque: " + attack + " Defensa: " + defense;
    }
    public void attack(Hero otroHeroe) {
        Random random = new Random();
        int golpe = random.nextInt(1, attack);
        if (golpe - otroHeroe.getDefense() < 0) {
            golpe = otroHeroe.getDefense();
        }
        otroHeroe.setHealth(otroHeroe.getHealth() - (golpe - otroHeroe.defense));
        experience += addExp;
        if (otroHeroe.getHealth() < 0) {
            otroHeroe.setHealth(0);
        }

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
        boolean descansarono = random.nextInt(0, 1000) == 1;
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
