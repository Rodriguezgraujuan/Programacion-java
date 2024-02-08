package POO3Ej3;

public class Triangulo extends Figura2D{
    private final int base;
    private final int altura;
    private final int lado;

    public Triangulo(int base, int altura, int lado){
        this.base=base;
        this.altura=altura;
        this.lado=lado;
    }
    @Override
    public int area() {
        return (base*altura)/2;
    }

    @Override
    public int perimetro() {
        return (lado*2)+base;
    }

    @Override
    public String toString() {
        return "El area es: "+area() +"\n El perimetro es: " + perimetro();
    }
}
