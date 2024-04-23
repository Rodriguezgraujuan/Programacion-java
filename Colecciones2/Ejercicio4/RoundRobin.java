package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoundRobin {

    static Random random=new Random();
    public static Proceso generarProcesoAleatorio(List<Integer> numeros) {
        String name = "p"+numeros.size();
        numeros.add(numeros.size());
        return new Proceso(name, random.nextInt(1, 4));
    }

    public static void moverProceso(List<Proceso> listaProcesos){
        Proceso primerProceso = listaProcesos.get(0);
        listaProcesos.remove(0);
        listaProcesos.add(primerProceso);
        System.out.println("Se ha movido el proceso: " + listaProcesos.get(0).getName() + " al final. ");
    }

    public static void main(String[] args) {
        List<Proceso> listasProcesos = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);

        int vecesPasadas=0;
        listasProcesos.add(new Proceso("p0", random.nextInt(3,4)));
        while (!(listasProcesos.isEmpty())){
            listasProcesos.get(0).setSegundo(listasProcesos.get(0).getSegundo()-0.2);
            moverProceso(listasProcesos);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vecesPasadas++;
            if (vecesPasadas==10){
                vecesPasadas=0;
                listasProcesos.add(generarProcesoAleatorio(numeros));
            }
            listasProcesos.removeIf(proceso -> proceso.getSegundo() < 0.2);
            if (!(listasProcesos.isEmpty())) {
                System.out.println(listasProcesos.get(0));
            }
        }
    }
}
