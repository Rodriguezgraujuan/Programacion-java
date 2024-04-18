package Ejercicio3;

import java.util.Random;
public class Serpiente {

    private String color="";

    private int edad=0;

    private franjaEdad estadoSerpiente;

    private enum franjaEdad{
        joven, mayor
    }

    public enum coloresPosibles{
        r,v,a
    }

    public void coloresNacimiento() {
        resetColor();
        while (getColor().length() < 5) {
            setColor(randomColor());
        }
    }

    private String randomColor(){
        Random random = new Random();
        return switch (random.nextInt(1, 4)) {
            case 2 -> String.valueOf(coloresPosibles.r);
            case 3 -> String.valueOf(coloresPosibles.v);
            default -> String.valueOf(coloresPosibles.a);
        };
    }

    public void vidaSerpiente(){
        if (getEstadoSerpiente().equals(franjaEdad.joven)){
            vidaSerpienteJoven();
        }else {
            vidaSerpienteMayor();
        }
    }

    public void vidaSerpienteJoven(){
        Random random=new Random();

        addEdad();
        if (random.nextInt(1,10)<=8){
            System.out.println("Añadimos anilla");
            setColor(randomColor());
        }
        if (random.nextInt(1,10)>=8){
            System.out.println("Muda piel");
            mudarpiel();
        }
    }

    private void mudarpiel(){
        int anillasSerpiente=color.length();
        resetColor();
        for (int i = 0; i<anillasSerpiente;i++){
            setColor(randomColor());
        }
    }

    private void vidaSerpienteMayor(){
        Random random=new Random();
        addEdad();
        int randomNum=random.nextInt(1,10);
        if (randomNum!=7){
            System.out.println("Quitamos anilla");
            quitarAnilla();
        }
        if (randomNum==2){
            System.out.println("Muda piel");
            mudarpiel();
        }
        if (randomNum==8){
            System.out.println("Fuck, una fucking mangosta");
            resetColor();
        }
    }

    public void setEstadoSerpiente() {
        if (getEdad()<10) {
            this.estadoSerpiente = franjaEdad.joven;
        }else {
            this.estadoSerpiente = franjaEdad.mayor;
        }
    }

    public void resetColor(){
        this.color="";
    }

    public int getEdad() {
        return edad;
    }

    private franjaEdad getEstadoSerpiente() {
        return estadoSerpiente;
    }

    public void setColor(String color) {
        this.color += color;
    }

    public void quitarAnilla(){
        if (!(getColor().isEmpty())) {
            this.color = getColor().substring(0, getColor().length() - 1);
        }
    }

    public void addEdad() {
        this.edad = this.edad+1;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Serpiente{" +
                "color='" + color + '\'' +
                ", edad=" + edad +
                ", estadoSerpiente=" + estadoSerpiente +
                '}';
    }
}
