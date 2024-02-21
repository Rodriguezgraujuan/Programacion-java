package POO4.Practica;

import POO4.Ej5.Ataque;

import java.util.ArrayList;

public class Heroe {


    private final int VIDA_DEFAULT=100;
    private final int DEFENSA_DEFAULT=5;
    private final int AGILIDAD_DEFAULT=10;

    private int vida = VIDA_DEFAULT;
    private int defensa=DEFENSA_DEFAULT;
    private int carisma;
    private int agilidad=AGILIDAD_DEFAULT;
    private String posicion;

    private ArrayList<String> inventario;


    public int getAgilidad() {
        return agilidad;
    }

    public int getVida() {
        return vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getCarisma() {
        return carisma;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void recibirDanyo(Ataque ataque){
        int danyoAtaque=ataque.getDanyoFisico()+ ataque.getDanyoMagico();
        if (ataque.getTipo().equals(Ataque.tipoAtaque.Distancia)){
            danyoAtaque*=2;
        }
        setVida(getVida()-danyoAtaque);
    }

    public void anyadirObjetoInventario(String objeto){
        inventario.add(objeto);
    }

    private ArrayList<String> getInventario() {
        return inventario;
    }

    public void mostrarInventario(){
        for (int i=0;i<getInventario().size();i++){
            System.out.println(i+". "+inventario.get(i));
        }
    }

}
