package POO3Ej3;

public class Cuadrado extends Rectangulo{
    private final int lado;
    public Cuadrado(int lado){
        super(lado,lado);
        this.lado=lado;
    }

    @Override
    public int area() {
        return lado*lado;
    }

    @Override
    public int perimetro() {
        return lado*4;
    }

    @Override
    public String toString() {
        return "El area es: "+area() +"\n El perimetro es: " + perimetro();
    }
}
