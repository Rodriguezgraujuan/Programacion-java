package Package3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscarparejas {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static String[] aletparejas(String[] parejas, String[] animales, int[] numeros){
        for (int i = 0; i<parejas.length;i++){
            int num = random.nextInt(0, animales.length);
            boolean condition=false;
            for (int j = 0; j<numeros.length-1; j++){
                if (num == numeros[j]) {
                    condition = true;
                }
            }
            if (!condition) {
                parejas[i] = animales[num];
                animales[num]="1";
            }
            numeros[i]=num;
        }
        System.out.println(Arrays.toString(parejas));
        return parejas;
    }
    public static void main(String[] args) {
        String[] animales = new String[]{"nutria", "nutria", "marmota", "marmota", "leon", "leon", "halcon", "halcon", "mono", "mono",
                "panda", "panda", "oso", "oso", "perro", "perro", "gato", "gato", "ballena", "ballena"};
        String[] parejas = new String[20];

        int[] numeros = new int[20];

        aletparejas(parejas, animales, numeros);

    }
}
