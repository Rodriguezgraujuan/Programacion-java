package Tema2;

public class Ejercicio6 {
    public static void tabla(int num){
        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }

    public static void main(String[] args) {
        for (int num =1;num<=10;num++){
            tabla(num);
        }
    }
}
