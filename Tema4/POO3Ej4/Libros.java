package POO3Ej4;

public class Libros extends Ficha{

    private String autor;

    private String editorial;

    public Libros(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor=autor;
        this.editorial=editorial;
    }

    @Override
    public void prestamo() {
        System.out.println("Tiene 20 dias para devolver el libro");
    }
}
