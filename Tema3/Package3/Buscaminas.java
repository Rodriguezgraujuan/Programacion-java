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
        System.out.println(Arrays.toString(minas));
        return minas;
    }

    public static String[] cercamina(String[] minas){
        boolean condition = true;
         int contador = 0;
        while (condition){
            System.out.println("Indica un numero del 1-20");
            int num = in.nextInt()-1;
            System.out.println(Arrays.toString(minas));
            if (minas[num].equals("1")||minas[num].equals("2")){
                System.out.println("Numero ya elegido");
            }else {
                contador++;
                if (minas[num].equals("*")) {
                    System.out.println("Has perdido");
                    condition = false;
                } else if (num>0 && num<19 && minas[num + 1].equals("*") && minas[num - 1].equals("*")) {
                    minas[num] = "2";
                } else if (num!=19&&minas[num + 1].equals("*")) {
                    minas[num] = "1";
                } else if (num!=0&&minas[num - 1].equals("*")) {
                    minas[num] = "1";
                }
            }
            if (contador==14){
                condition=false;
            }
        }
        return minas;
    }

    public static void main(String[] args) {
        String[] minas = new String[20];
        aletminas(minas);
        System.out.println(Arrays.toString(cercamina(minas)));
    }
}
