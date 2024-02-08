package POO3Ej4;

public class Revistas extends Ficha {

    private final int numeroPublicacion;
    private final int anyopublicado;

    public Revistas(int numero, String titulo, int numeroPublicacion, int anyopublicado) {
        super(numero, titulo);
        this.anyopublicado = anyopublicado;
        this.numeroPublicacion = numeroPublicacion;
    }
}
