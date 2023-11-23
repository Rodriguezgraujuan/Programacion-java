package Package3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscarparejas {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static String[] aletparejas(String[] parejas, String[] animales) {
        int[] posiciones = new int[]{20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20};

        for (int i = 0; i < parejas.length; i++) {
            int num = 0;
            boolean condition = false;
            while (!condition) {
                condition = true;
                num = random.nextInt(0, 20);
                for (int j = 0; j < 20; j++) {
                    if (num == posiciones[j]) {
                        condition = false;
                        break;
                    }
                }
            }
            if (condition){
                parejas[i] = animales[num];
                posiciones[i]=num;
            }
        }
        return parejas;
    }

    public static void juego(String[] parejas, String[] visible){
        boolean fin = true;
        int totalparejasresueltas=0;
        while (fin){
            boolean check=true;
            System.out.println(Arrays.toString(visible));
            System.out.println("Introduce 2 numeros del 1-20");
            int num1= in.nextInt()-1;
            int num2= in.nextInt()-1;
            if (num1==num2){
                check=false;
            }
            String word1 = parejas[num1];
            String word2 = parejas[num2];
            if (word2.equals(word1)&& check){
                visible[num1]=parejas[num1];
                visible[num2]=parejas[num2];
                totalparejasresueltas++;
            }
            if (totalparejasresueltas==10){
                fin=false;
            }
        }
    }

    public static void main(String[] args) {
        String[] animales = new String[]{"nutria", "nutria", "marmota", "marmota", "leon", "leon", "halcon", "halcon", "mono", "mono",
                "panda", "panda", "oso", "oso", "perro", "perro", "gato", "gato", "ballena", "ballena"};

        String[] parejas = new String[20];

        aletparejas(parejas, animales);
        String[] visible= new String[]{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"};
        juego(parejas, visible);
        System.out.println("Lo has conseguido");
    }
}
