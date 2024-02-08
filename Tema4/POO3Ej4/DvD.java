package POO3Ej4;

public class DvD extends Ficha {

    private String Director;
    private int anyo;
    private tipo tipoDVD;

    public enum tipo {
        ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION;
    }

    public DvD(int numero, String titulo, String Director, int anyo, tipo tipoDVD) {
        super(numero, titulo);
        this.Director = Director;
        this.anyo = anyo;
        this.tipoDVD = tipoDVD;
    }
    @Override
    public void prestamo() {
        System.out.println("Tiene 20 dias para devolver el DVD");
    }
}
