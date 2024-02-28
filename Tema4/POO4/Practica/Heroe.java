package POO4.Practica;

import POO4.Ej5.Ataque;

import java.util.ArrayList;
import java.util.Random;

public class Heroe {


    private final int VIDA_DEFAULT=100;
    private final int DEFENSA_DEFAULT=5;
    private final int AGILIDAD_DEFAULT=10;

    private int vida = VIDA_DEFAULT;
    private int defensa=DEFENSA_DEFAULT;
    private int carisma;
    private int agilidad=AGILIDAD_DEFAULT;
    private int posicion_x=0;
    private int posicion_y=0;


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

    public int getPosicion_x() {
        return posicion_x;
    }
    public int getPosicion_y() {
        return posicion_y;
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

    public void setPosicion_x(int posicion) {
        this.posicion_x = posicion;
    }
    public void setPosicion_y(int posicion) {
        this.posicion_y = posicion;
    }

    public Ataque atacarEnemigo(){
        Random random=new Random();
        Ataque ataque=new Ataque(Ataque.tipoAtaque.Cuerpo);
        ataque.setDanyoFisico(random.nextInt(50,100));
        return ataque;
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

    public void moverPersonaje(String rumbo){
        if (rumbo.equals("N")&&posicion_y==0||rumbo.equals("E")&&posicion_x==0||rumbo.equals("S")&&posicion_y==9||rumbo.equals("O")&&posicion_x==9){
            System.out.println("Fuera del mapa");
        }else {
            switch (rumbo){
                case "N"->this.posicion_y-=1;
                case "E"->this.posicion_x-=1;
                case "S"->this.posicion_y+=1;
                case "O"->this.posicion_x+=1;
            }
        }
    }

}
