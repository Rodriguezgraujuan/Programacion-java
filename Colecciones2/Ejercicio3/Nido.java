package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nido {

    static Random random=new Random();

    public static Serpiente crearSerpiente(){
        Serpiente serpiente=new Serpiente();
        serpiente.coloresNacimiento();
        return serpiente;
    }

    public static void addSerpientesNido(List<Serpiente> nest){
        Serpiente serpiente=new Serpiente();
        switch (random.nextInt(1,4)){
            case 2:
                if (nest.size()<20){
                    serpiente.coloresNacimiento();
                    nest.add(serpiente);
                }
            case 3:
                if (nest.size()<19){
                    serpiente.coloresNacimiento();
                    nest.add(serpiente);
                    serpiente.coloresNacimiento();
                    nest.add(serpiente);
                }
            default:
                if (nest.size()<18){
                    serpiente.coloresNacimiento();
                    nest.add(serpiente);
                    serpiente.coloresNacimiento();
                    nest.add(serpiente);
                    serpiente.coloresNacimiento();
                    nest.add(serpiente);
                }
        }
    }

    public static void serpienteAciones(Serpiente serpiente){
        serpiente.setEstadoSerpiente();
        serpiente.vidaSerpiente();
        System.out.println(serpiente);
    }

    public static List<Serpiente> comprobarSerpienesMuertas(List<Serpiente> nest){
        List<Serpiente> serpientesMuertas = nest.stream().filter(p-> p.getColor().isEmpty()).toList();
        List<Serpiente> serpientesDiferencias= new ArrayList<>(nest);
        serpientesDiferencias.removeAll(serpientesMuertas);
        return nest=serpientesDiferencias;
    }

    public static List<Serpiente> mangostaNido(List<Serpiente> nest, int tiempo){
        int randomNum= random.nextInt(1,10);
        if (tiempo % 10 == 0){
            if (randomNum<3&&nest.size()>1){
                System.out.println("La mangosta paso por el nido y mato a 1");
                nest.remove(nest.size()-1);
            } else if (randomNum==3||randomNum==4) {
                System.out.println("La mangosta paso por el nido y mato a 2");
                nest.remove(nest.size()-1);
                nest.remove(nest.size()-1);
            }else if (randomNum==5||randomNum==6) {
                System.out.println("La mangosta paso por el nido y mato a 3");
                nest.remove(nest.size()-1);
                nest.remove(nest.size()-1);
                nest.remove(nest.size()-1);
            }else if (randomNum==7||randomNum==8) {
                System.out.println("La mangosta paso por el nido y mato a 4");
                nest.remove(nest.size()-1);
                nest.remove(nest.size()-1);
                nest.remove(nest.size()-1);
                nest.remove(nest.size()-1);
            }else {
                System.out.println("La mangosta paso sin matar a nadie");
            }
        }
        nest=comprobarSerpienesMuertas(nest);
        return nest;
    }
    public static void main(String[] args) {
        List<Serpiente> nest = new ArrayList<>();
        nest.add(crearSerpiente());

        for (int i = 1; i <= 300; i++) {
            addSerpientesNido(nest);
            System.out.println("Segundos restantes: " + (300 - i + 1));
            nest.forEach(Nido::serpienteAciones);
            nest=comprobarSerpienesMuertas(nest);
            mangostaNido(nest, i);
            try {
                Thread.sleep(1000); // Esperar 1 segundo
            } catch (InterruptedException e) {
                System.err.println("Error: Interrupción durante la espera.");            }
        }

    }
}
