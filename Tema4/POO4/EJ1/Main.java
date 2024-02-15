package POO4.EJ1;

import POO3.Camiones;
import POO3.Ciclomotores;
import POO3.Turismo;
import POO3.Vehiculo;

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

    public static void añadirArrayList(int hora, String matricula, ArrayList<Vehiculo> vehiculos){
        for (int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println();
            }
            int num = random.nextInt(0,4);
            Vehiculo nuevo;
            if (num==1||num==2) {
                System.out.println("Camion dentro");
                nuevo = new Camiones("A","A", 8, 3500, Camiones.PeligrosoNo.SI);
            } else if (num==3) {
                System.out.println("Ciclomotor dentro");
                nuevo = new Ciclomotores("A","A",8,8);
            }else {
                System.out.println("Turismo dentro");
                nuevo = new Turismo("A","",8,8, POO3.Turismo.tipoCoche.PROFESIONAL);

            }
            nuevo.setHora(randomHora());
            nuevo.setMatricula(randomMatricula());
            vehiculos.add(nuevo);
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos=new ArrayList<>();

        System.out.println("Introcuce la hora de entrada");
        int hora= in.nextInt();
        System.out.println("Introcuce la matricula");
        in.nextLine();
        String matricula= in.nextLine();

        añadirArrayList(hora, matricula, vehiculos);

    }
}
