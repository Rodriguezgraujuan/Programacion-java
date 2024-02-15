package POO4.EJ1;

import POO3.Camiones;
import POO3.Ciclomotores;
import POO3.Turismo;
import POO3.Vehiculo;
import POO4.EJ2.Avion;
import POO4.EJ2.Barco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random=new Random();

    public static int randomHora(){
        return random.nextInt(1,24);
    }

    public static String randomMatricula(){
        String[] arrayMatriculas=new String[]{"AB","EB","GC", "VH", "MA", "PE"};
        return arrayMatriculas[random.nextInt(0,arrayMatriculas.length)];
    }

    public static String randomPistaAterrizaje(){
        String[] arrayMatriculas=new String[]{"A1","A2","A3", "A4", "A5", "A6"};
        return arrayMatriculas[random.nextInt(0,arrayMatriculas.length)];
    }

    public static String randomCanal(){
        String[] arrayMatriculas=new String[]{"C1","C2","C3", "C4", "C5", "C6"};
        return arrayMatriculas[random.nextInt(0,arrayMatriculas.length)];
    }

    public static void añadirArrayList(ArrayList<Vehiculo> vehiculos){
        for (int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println();
            }
            int num = random.nextInt(0,8);
            Vehiculo nuevo;
            if (num==1||num==2) {
                nuevo = new Camiones("A","A", 8, 3500, Camiones.PeligrosoNo.SI);
            } else if (num==3) {
                nuevo = new Ciclomotores("A","A",8,8);
            }else if (num==4){
                nuevo = new Turismo("A","",8,8, Turismo.tipoCoche.PROFESIONAL);
            } else if (num==5) {
                nuevo = new Avion(randomHora(), randomMatricula(),randomPistaAterrizaje());
            } else {
                nuevo = new Barco(randomHora(), randomMatricula(), randomCanal());
            }
            nuevo.setHora(randomHora());
            nuevo.setMatricula(randomMatricula());
            vehiculos.add(nuevo);
            System.out.println(nuevo);
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos=new ArrayList<>();

        añadirArrayList(vehiculos);

    }
}
