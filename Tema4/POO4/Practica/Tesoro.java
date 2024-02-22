package POO4.Practica;

import java.util.Random;

public class Tesoro {

    private final Random random=new Random();

    private void seleccionObjeto(Recompensa botin){
        int randomNum= random.nextInt(1,7);
        switch (randomNum){
            case 1-> botin.setTipoRecompensa(Recompensa.TipoRecompensa.ARMADURA);
            case 2-> botin.setTipoRecompensa(Recompensa.TipoRecompensa.ARCO);
            case 3-> botin.setTipoRecompensa(Recompensa.TipoRecompensa.BASTONMAGO);
            case 4-> botin.setTipoRecompensa(Recompensa.TipoRecompensa.BOTAS);
            case 5->botin.setTipoRecompensa(Recompensa.TipoRecompensa.CAPA);
            case 6->botin.setTipoRecompensa(Recompensa.TipoRecompensa.CASCO);
            case 7->botin.setTipoRecompensa(Recompensa.TipoRecompensa.ESPADA);
        }
    }

    public Recompensa darObjeto(){
        Random random=new Random();
        Recompensa botin=new Recompensa();
        seleccionObjeto(botin);
        botin.setNivelRecompensa(random.nextInt(1,3));
        return botin;
    }
}
