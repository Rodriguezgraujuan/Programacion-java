package POO4.Practica;

import POO4.Ej5.Ataque;

import java.util.Random;

public class Aliado implements IPersonaje {

    private final int VIDA_DEFAULT=100;
    private int vida=VIDA_DEFAULT;

    private final Random random=new Random();

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

    @Override
    public void hablar() {
        System.out.println("Bebe esta pocion y sanaras:");
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

    public Recompensa darObjeto(){
        Random random=new Random();
        Recompensa botin=new Recompensa();
        seleccionObjeto(botin);
        botin.setNivelRecompensa(random.nextInt(1,3));
        return botin;
    }

    public String hacerAlgoHeroe(Heroe heroe) {
        hablar();
        heroe.setVida(heroe.getVida()+heroe.getCarisma()+10);
        return "Aliado";
    }
}
