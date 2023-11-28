package Package3;

import java.util.Random;
import java.util.Scanner;

public class Atrapalamosca {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static boolean Comprobarnum(int buscar) {
        return buscar <= 15 && buscar >= 1;
    }

    public static int[] moscavuela(int[] mosca, int buscar, int aletatoriomosca) {
        if (mosca[buscar] == 0 && buscar != 14 && mosca[buscar + 1] == 1 || mosca[buscar - 1] == 1) {
            mosca[aletatoriomosca] = 0;
            aletatoriomosca = random.nextInt(0, 14);
            mosca[aletatoriomosca] = 1;
        } else if (mosca[buscar] == 0 && mosca[buscar - 1] == 1) {
            mosca[aletatoriomosca] = 0;
            aletatoriomosca = random.nextInt(0, 14);
            mosca[aletatoriomosca] = 1;
        }
        return mosca;
    }

        public static boolean jugada ( int[] mosca, int aletatoriomosca){
            boolean condition = false;
            while (!condition) {
                System.out.println("Indica un numero entre 1-15 para buscar");
                int buscar = in.nextInt();
                buscar -= 1;
                if (Comprobarnum(buscar)) {
                    moscavuela(mosca, buscar, aletatoriomosca);
                    if (mosca[buscar] == 1) {
                        condition = true;
                    }
                } else {
                    System.out.println("Numero incorrecto");
                }
            }
            return condition;
        }

        public static void main (String[]args){
            int[] mosca = new int[15];
            int aletatoriomosca = random.nextInt(0, 14);
            mosca[aletatoriomosca] = 1;
            if (jugada(mosca, aletatoriomosca)) {
                System.out.println("La has encontrado");
            }
        }
    }
