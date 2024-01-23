package POO1;

import java.util.Scanner;

public class Hero1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition=false;
        String nombre1 = null;
        int vida1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        while (!condition) {
            System.out.println("Introduce los valores del Heroe1 y que no pasen de 50");
            System.out.println("Nombre");
            nombre1 = in.nextLine();
            System.out.println("Heath");
            vida1 = in.nextInt();
            System.out.println("Ataque");
            ataque1 = in.nextInt();
            System.out.println("Defensa");
            defensa1 = in.nextInt();
            if (vida1+ataque1+defensa1<=50){
                condition=true;
            }
        }
        in.nextLine();
        Hero hero1= new Hero(nombre1,vida1,ataque1,defensa1);

        condition=false;
        String nombre2 = null;
        int vida2 = 0;
        int ataque2 = 0;
        int defensa2 = 0;
        while (!condition) {
            System.out.println("Introduce los valores del Heroe2 y que no pasen de 50");
            System.out.println("Nombre");
             nombre2 = in.nextLine();
            System.out.println("Heath");
             vida2 = in.nextInt();
            System.out.println("Ataque");
             ataque2 = in.nextInt();
            System.out.println("Defensa");
             defensa2 = in.nextInt();
            if (vida2+ataque2+defensa2<=50){
                condition=true;
            }
        }
        Hero hero2= new Hero(nombre2,vida2,ataque2,defensa2);

        System.out.println("Heroe 1 ataca al Heroe 2");
        hero1.attack(hero2);
        System.out.println("Heroe 2 se regenera con 2 pociones");
        for (int i=0;i<2;i++){
            hero2.drinkPotion();
        }
        System.out.println(hero1);
        System.out.println(hero2);

        System.out.println("El heroe 2 ataca al 1 continuamente");
        for (int j=0; j<5;j++){
            hero2.attack(hero1);
            System.out.println(hero1.getHealth());
        }

        System.out.println("El heroe 1 restaura 50 puntos de salud");
        hero1.rest();

        System.out.println("El heroe 2 sube de nivel y gana al heroe 1");
        hero2.levelUp();
        for (int k=0;k<5;k++){
            hero2.attack(hero1);
        }
        System.out.println(hero2);
        System.out.println("El heroe dos gana");

    }
}
