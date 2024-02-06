package Pruebas;


import java.util.Random;

public abstract class AnimalDomestico {

    protected final Random random=new Random();
    protected String nombre;
    protected String raza;
    protected int peso;
    protected String color;

    protected AnimalDomestico(String nombre, String raza, int peso, String color) {
        this.nombre=nombre;
        this.raza=raza;
        this.peso=peso;
        this.color=color;
    }

    public boolean hacerRuido(boolean condition){
        return condition;
    }
    public boolean llamar(boolean condition){
        return condition;
    }

    public void dormir(){
        
    }


    public abstract void hacerRuido();

    public abstract void llamar();
}
