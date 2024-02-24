package POO4.Practica;

import POO1.Hero;

import java.util.Arrays;
import java.util.Random;

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
            }
        }
    }

    public static void printMundo(Casilla[][] mundo){
        for (int i = 0; i<10; i++){
            System.out.println(Arrays.deepToString(mundo[i]));
        }
    }

    public static void moverPersonaje(Heroe heroe, Casilla[][] mundo){
    }

    public static void main(String[] args) {
        Casilla[][] mundo=new Casilla[10][10];
        crearMundo(mundo);
        printMundo(mundo);
    }
}
