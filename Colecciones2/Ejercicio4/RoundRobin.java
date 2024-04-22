package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoundRobin {

    static Random random=new Random();

    public static Proceso generarProcesoAleatorio(List<Proceso> listasProcesos){
        Proceso proceso = new Proceso("", random.nextInt(1,4));
        return proceso;
    }

    public static void main(String[] args) {
        List<Proceso> listasProcesos = new ArrayList<>();
        listasProcesos.add(new Proceso("p1", 2));
        listasProcesos.add(new Proceso("p2", 1));
        generarProcesoAleatorio(listasProcesos);
        while (!(listasProcesos.isEmpty())){
            listasProcesos.forEach(proceso->proceso.setSegundo(proceso.getSegundo()-0.2));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            listasProcesos.forEach(System.out::println);
        }
    }
}
