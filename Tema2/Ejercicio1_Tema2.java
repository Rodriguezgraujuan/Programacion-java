import java.util.Scanner;

public class Ejercicio1_Tema2 {

    public static int numberSign(int num){
        int estado = 0;
        if (num<0){
            estado = -1;
        } else if (num>0){
            estado = 1;
        }
        return estado;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = in.nextInt();
        int resultado = numberSign(num);
        System.out.println(resultado);
    }
}
