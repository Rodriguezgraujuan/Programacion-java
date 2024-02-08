package POO3Ej4;

public class Revistas extends Ficha {

    private int numeroPublicacion;
    private int anyopublicado;

    public Revistas(int numero, String titulo, int numeroPublicacion, int anyopublicado) {
        super(numero, titulo);
        this.anyopublicado = anyopublicado;
        this.numeroPublicacion = numeroPublicacion;
    }

    @Override
    public void prestamo() {
        System.out.println("Tiene 20 dias para devolver la revista");
    }
}
