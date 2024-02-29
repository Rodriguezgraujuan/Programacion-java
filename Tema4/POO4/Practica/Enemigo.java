package POO4.Practica;

import POO4.Ej5.Ataque;

import java.util.Random;

public class Enemigo implements IPersonaje {

    private final int VIDA_DEFAULT=80;
    private int vida=VIDA_DEFAULT;
    
    private final Random random=new Random();

    private Ataque atacarHeroe() {
        Random random=new Random();
        Ataque ataque = new Ataque(Ataque.tipoAtaque.Cuerpo);
        ataque.setDanyoFisico(random.nextInt(0,20));
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void recibirDanyo(Ataque ataque){
        int danyoAtaque=ataque.getDanyoFisico()+ataque.getDanyoMagico();
        setVida(getVida()-danyoAtaque);
    }


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
    @Override
    public Recompensa darObjeto(){
        Recompensa botin=new Recompensa();
        seleccionObjeto(botin);
        botin.setNivelRecompensa(random.nextInt(1,3));
        return botin;
    }

    @Override
    public void hablar() {
        System.out.println("Voy a hacerme un trono con tus huesos");
    }
    @Override
    public void hacerAlgoHeroe(Heroe heroe) {
        System.out.println("Enemigo pega al heroe");
        heroe.recibirDanyo(atacarHeroe());
    }
}
