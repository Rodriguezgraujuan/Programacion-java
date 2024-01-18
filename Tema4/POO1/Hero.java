package POO1;

import java.util.Random;

public class Hero {
    public String name;
    public int level=0;
    public int health;
    private final int hpUpdate=5;
    private final int recoverPotionHp=10;
    private final int restauraHp=50;
    private final int maxHealth=150;
    public int experience;
    private final int addExp=10;
    private final int resetExp=50;
    public int attack;
    public int defense;

    public Hero(String nombre, int vida, int ataque, int defensa){
        name=nombre;
        health=vida;
        attack=ataque;
        defense=defensa;

    }

    public void drinkPotion(){
        health+=recoverPotionHp;
        if (health>maxHealth){
            health=maxHealth;
        }
    }

    public void rest(){
        health+=restauraHp;
        if (health>maxHealth){
            health=maxHealth;
        }
    }

    public String toString(){
        return "El personaje "+name+" Vida: "+ health + " Nivel: "+ level+" Ataque: "+attack+" Defensa: "+ defense;
    }

    public int attack(int vidaHeroeEnemigo, int defensaEnemigo){
       Random random=new Random();
       int golpe=random.nextInt(1,attack);
       if (golpe-defensaEnemigo<0){
        golpe=defensaEnemigo;
       }
       vidaHeroeEnemigo-=golpe-defensaEnemigo;
       experience+=addExp;
       return vidaHeroeEnemigo;
    }

    public void levelUp(){
        if (experience>=resetExp){
            attack++;
            defense++;
            health+=hpUpdate;
            level++;
            experience-=resetExp;
        }
    }
}
