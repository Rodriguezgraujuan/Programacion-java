package Ejercicio1;

public class Pajaros extends Avistamiento {
    private final int peso;
    private final String especie;

    public Pajaros( String especie,int hora,int peso) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Pajaros{" +
                "peso=" + peso +
                ", especie='" + especie + '\'' +
                ",hora= "+getHora()+'\''+
                '}';
    }
}
