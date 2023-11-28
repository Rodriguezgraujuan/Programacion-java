package Package3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static String[] aletminas(String[] minas) {
        boolean[] posiciones = new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        for (int j = 0 ; j<20;j++){
            minas[j]="0";
        }
        for (int i = 0; i < 7; i++) {
            int num=0;
            boolean condition = true;
            while (condition) {
                condition = false;
                num = random.nextInt(0, 20);
                if (!posiciones[num]) {
                        condition = true;
                        break;
                }
            }
            if (condition){
                minas[num]="*";
            }
        }
        return minas;
    }

    public static void cercamina(String[] minas){
        String[] minasvisible = new String[20];
        for (int j = 0 ; j<20;j++){
            minasvisible[j]="0";
        }
        boolean condition = true;
         int contador = 0;
        while (condition){
            System.out.println("Indica un numero del 1-20");
            System.out.println(Arrays.toString(minasvisible));
            int num = in.nextInt()-1;
            if (minas[num].equals("1")||minas[num].equals("2")){
                System.out.println("Numero ya elegido");
            }else {
                contador++;
                if (minas[num].equals("*")) {
                    System.out.println("Has perdido");
                    condition = false;
                } else if (num>0 && num<19 && minas[num + 1].equals("*") && minas[num - 1].equals("*")) {
                    minasvisible[num] = "2";
                } else if (num!=19&&minas[num + 1].equals("*")) {
                    minasvisible[num] = "1";
                } else if (num!=0&&minas[num - 1].equals("*")) {
                    minasvisible[num] = "1";
                } else if (minas[num].equals("0")){
                    minasvisible[num]="null";
                }
            }


            if (contador==14){
                condition=false;
                System.out.println("Has ganado");
            }
        }
    }

    public static void main(String[] args) {
        String[] minas = new String[20];
        aletminas(minas);
        cercamina(minas);
    }
}
