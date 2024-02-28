package POO4.Practica;

import POO1.Hero;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MundoAbierto {

    public static Random random=new Random();

    public static Paisaje paisajeRandom(){
        Paisaje paisaje;
        int randomNum=random.nextInt(0,14);
        switch (randomNum){
            case 1->paisaje=new Paisaje(Paisaje.tipoPaisaje.Montanya);
            case 2->paisaje=new Paisaje(Paisaje.tipoPaisaje.MontanyaNevada);
            case 3->paisaje=new Paisaje(Paisaje.tipoPaisaje.Rio);
            case 4->paisaje=new Paisaje(Paisaje.tipoPaisaje.Pradera);
            case 5->paisaje=new Paisaje(Paisaje.tipoPaisaje.Pueblo);
            case 6->paisaje=new Paisaje(Paisaje.tipoPaisaje.Ciudad);
            case 7->paisaje=new Paisaje(Paisaje.tipoPaisaje.Bosque);
            case 8->paisaje=new Paisaje(Paisaje.tipoPaisaje.Pantano);
            case 9->paisaje=new Paisaje(Paisaje.tipoPaisaje.Desierto);
            case 10->paisaje=new Paisaje(Paisaje.tipoPaisaje.Glaciar);
            case 11->paisaje=new Paisaje(Paisaje.tipoPaisaje.Acantilado);
            case 12->paisaje=new Paisaje(Paisaje.tipoPaisaje.Savana);
            default->paisaje=new Paisaje(Paisaje.tipoPaisaje.Jungla);
        }
        return paisaje;
    }
    public static void crearMundo(Casilla[][] mundo){
        for (int i=0;i<10;i++){
            for (int k=0;k<10;k++){
                Paisaje paisaje=paisajeRandom();
                mundo[i][k]=new Casilla(paisaje,i,k);
                seleccionAliadoEnemigo(mundo,i,k);
            }
        }
    }
    public static void seleccionAliadoEnemigo(Casilla[][] mundo, int i, int k){
        Random random=new Random();
        int numRandom=random.nextInt(1,10);
        if (numRandom<4){
            mundo[i][k].setPersonaje(new Enemigo());
        } else if (numRandom>=7){
            mundo[i][k].setPersonaje(new Aliado());
        }
    }


    public static void printMundo(Casilla[][] mundo){
        for (int i = 0; i<10; i++){
            System.out.println(Arrays.deepToString(mundo[i]));
        }
    }

    public static void printCasilla(Casilla[][] mundo, Heroe heroe){
        System.out.println(mundo[heroe.getPosicion_y()][heroe.getPosicion_x()]);
    }

    public static void main(String[] args) {
        Casilla[][] mundo=new Casilla[10][10];
        crearMundo(mundo);
        printMundo(mundo);
        Heroe heroe=new Heroe();
        Scanner in = new Scanner(System.in);
        while (heroe.getVida()>0){
            System.out.println("Donde quieres moverte? N, O, S, E");
            String direccion= in.nextLine();
            heroe.moverPersonaje(direccion);
            printCasilla(mundo, heroe);
            if (mundo[heroe.getPosicion_y()][heroe.getPosicion_x()].getPersonaje().equals(new Enemigo())){
                System.out.println("Enemigo");
                mundo[heroe.getPosicion_y()][heroe.getPosicion_x()].getPersonaje().atacarHeroe();
            } else if (mundo[heroe.getPosicion_y()][heroe.getPosicion_x()].getPersonaje().equals(new Aliado())) {
                System.out.println("Aliado");
                mundo[heroe.getPosicion_y()][heroe.getPosicion_x()].getPersonaje().curar(heroe);
            }
        }
    }
}
