package POO3Ej4;

public class Libros extends Ficha{

    private final String autor;

    private final String editorial;

    public Libros(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor=autor;
        this.editorial=editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro " + "Autor: "+getAutor()+ " Editorial: " +getEditorial() + " Titulo: "+getTitulo()+ " Numero: "+getNumero();
    }
}
