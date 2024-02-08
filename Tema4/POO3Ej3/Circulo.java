package POO3Ej3;

public class Circulo extends Figura2D{

    private int radio;

    public Circulo(int radio){
        this.radio=radio;
    }
    @Override
    public int area() {
        return (int) (Math.PI*(Math.pow(radio,2)));
    }

    @Override
    public int perimetro() {
        return (int) (2*Math.PI*radio);
    }

    @Override
    public String toString() {
        return "El area es: "+area() +"\n El perimetro es: " + perimetro();
    }
}
