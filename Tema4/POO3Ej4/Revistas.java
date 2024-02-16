package POO3Ej4;

public class Revistas extends Ficha {

    private final int numeroPublicacion;
    private final int anyopublicado;

    public Revistas(int numero, String titulo, int numeroPublicacion, int anyopublicado) {
        super(numero, titulo);
        this.anyopublicado = anyopublicado;
        this.numeroPublicacion = numeroPublicacion;
    }

    public int getAnyopublicado() {
        return anyopublicado;
    }

    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    @Override
    public String toString() {
        return "Revista " + "Numero: " + getNumero()+ " Titulo: " + getTitulo()+ " Anyo publicacion: " + getAnyopublicado()+ " Numero publicacion: " + getNumeroPublicacion();
    }
}
