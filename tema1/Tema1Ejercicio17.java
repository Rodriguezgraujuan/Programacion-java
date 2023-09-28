import java.util.Scanner;

public class Tema1Ejercicio17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero del 0 y el 2");
        int num = in.nextInt();

        if (num == 0){
            //cuadrado
            System.out.println("Introduce el lado del cuadrado");
            int lado = in.nextInt();
            int area=lado*lado;
            int perimetro=4*lado;
            System.out.println("El area es " + area);
            System.out.println("El perimetro es " + perimetro);
        } else if (num == 1) {
            //Rectangulo
            System.out.println("Introduce la base");
            int base = in.nextInt();
            System.out.println("Introduce la altura");
            int altura = in.nextInt();
            int area = base * altura;
            int perimetro = base * 2 + altura * 2;
            System.out.println("El area es " + area);
            System.out.println("El perimetro es " + perimetro);
        } else if (num == 2) {
            //triangulo
            System.out.println("Introduce la base");
            int base = in.nextInt();
            System.out.println("Introduce la altura");
            int altura = in.nextInt();
            int area = base*altura/2;
            System.out.println("El area es " + area);
        }else {
            System.out.println("Numero introducido incorrecto");
        }
    }
}
