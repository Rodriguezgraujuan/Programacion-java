package POO4.EJ3;

import POO3EJ2.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static Animal randomAnimal(int num){
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(new Pinguino());
        listaAnimales.add(new Mono());
        listaAnimales.add(new Perro());
        listaAnimales.add(new Gato());
        listaAnimales.add(new Oso());
        return listaAnimales.get(num);
    }
    public static void main(String[] args) {
        boolean condition=true;
        Random random = new Random();
        while (condition){
            int randomNum= random.nextInt(0,5);
            Animal animal = randomAnimal(randomNum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println();
            }
            if (random.nextInt(1,100)<95){
                switch (randomNum){
                    case 0->((Pinguino) animal).hacerRuido();
                    case 1->((Mono) animal).hacerRuido();
                    case 2->((Perro) animal).hacerRuido();
                    case 3->((Gato)animal).hacerRuido();
                    case 4->((Oso) animal).hacerRuido();
                }
                System.out.println("Se va a descansar");
            }else {
                System.out.println("El animal ataca, hay que huir");
                condition=false;
            }
        }
    }
}
