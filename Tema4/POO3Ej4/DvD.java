package POO3Ej4;

public class DvD extends Ficha {

    private final String Director;
    private final int anyo;
    private final tipo tipoDVD;

    public enum tipo {
        ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION;
    }

    public DvD(int numero, String titulo, String Director, int anyo, tipo tipoDVD) {
        super(numero, titulo);
        this.Director = Director;
        this.anyo = anyo;
        this.tipoDVD = tipoDVD;
    }
}
