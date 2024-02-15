package POO4.EJ3;

import POO3EJ2.*;

import java.lang.reflect.Array;
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
            int randomNum= random.nextInt(0,4);
            Animal animal = randomAnimal(randomNum);
            System.out.println(animal);

            if (random.nextInt(1,100)>95){

            }else {
                System.out.println("El animal ataca, hay que huir");
                condition=false;
            }
        }
    }
}
