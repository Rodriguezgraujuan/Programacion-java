package Package3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Atrapalamosca {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static boolean busqueda(int[] mosca, int aletatoriomosca){
        boolean condition = false;
        while (!condition){
            System.out.println(Arrays.toString(mosca));
            System.out.println("Indica un numero entre 1-15 para buscar");
            int buscar = in.nextInt();
            buscar -=1;
            if (mosca[buscar]==0&& mosca[buscar+1]==1||mosca[buscar-1]==1){
                mosca[aletatoriomosca]=0;
                aletatoriomosca = random.nextInt(0,14);
                mosca[aletatoriomosca]=1;
            } else if (mosca[buscar]==1) {
                condition = true;
            }
        }
        return condition;
    }
    public static void main(String[] args) {
        int [] mosca = new int[15];
        int aletatoriomosca = random.nextInt(0,14);
        mosca[aletatoriomosca]=1;
        System.out.println(Arrays.toString(mosca));
        if (busqueda(mosca, aletatoriomosca)){
            System.out.println("La has encontrado");
        }
    }
}
