package POO1;

import java.util.Random;
import java.util.Scanner;

public class HordasVsHero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random=new Random();
        boolean condition=true;
        String nombre="";
        int vida=0;
        int ataque=0;
        int defensa=0;
        while (condition) {
            System.out.println("Crea tu heroe: Tienes 200 puntos a repartir");
            System.out.println("Introduce tu nombre: ");
            nombre= in.nextLine();
            System.out.println("Vida: ");
            vida= in.nextInt();
            System.out.println("Ataque: ");
            ataque= in.nextInt();
            System.out.println("Defensa: ");
            defensa= in.nextInt();
            if (vida+ataque+defensa<=200){
                condition=false;
            }
        }

        Hero personaje=new Hero(nombre, vida, ataque, defensa);

        int partidafin=0;
        while (partidafin<3){
            int enemigoAlea= random.nextInt(1,3);
            Hero arrayEnimigos[]=new Hero[enemigoAlea];
            for (int i=0; i<enemigoAlea;i++){
                arrayEnimigos[i]=new Hero("Enemigo "+i, personaje.getRandomHp(), personaje.getRandomAttack(), personaje.getRandomDefense());
            }
            boolean enemigosMuertos=false;
            while (!enemigosMuertos){
                if (arrayEnimigos[0].health>0){
                    personaje.attack(arrayEnimigos[0].health, arrayEnimigos[0].defense);
                    if (arrayEnimigos[0].health>0){
                        arrayEnimigos[0].attack(personaje.health,personaje.defense);
                    }
                }
            }
            if (enemigosMuertos){
                partidafin++;
            }

        }

    }
}
