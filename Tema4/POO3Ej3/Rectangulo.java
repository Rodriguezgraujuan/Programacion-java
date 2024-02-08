package POO3Ej3;

public class Rectangulo extends Figura2D{

    private final int base;
    private final int altura;
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public int area() {
        return base*altura;
    }

    @Override
    public int perimetro() {
        return base*2+altura*2;
    }

    @Override
    public String toString() {
        return "El area es: "+area() +"\n El perimetro es: " + perimetro();
    }
}
