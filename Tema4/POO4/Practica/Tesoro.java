package POO4.Practica;

import java.util.Random;

public class Tesoro extends Recompensa{

    private final Random random=new Random();

    private void seleccionObjeto(Recompensa botin){
        int randomNum= random.nextInt(1,7);
        switch (randomNum){
            case 1-> botin.setTipoRecompensa(TipoRecompensa.ARMADURA);
            case 2-> botin.setTipoRecompensa(TipoRecompensa.ARCO);
            case 3-> botin.setTipoRecompensa(TipoRecompensa.BASTONMAGO);
            case 4-> botin.setTipoRecompensa(TipoRecompensa.BOTAS);
            case 5->botin.setTipoRecompensa(TipoRecompensa.CAPA);
            case 6->botin.setTipoRecompensa(TipoRecompensa.CASCO);
            case 7->botin.setTipoRecompensa(TipoRecompensa.ESPADA);
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
