package Tema2;

import static java.lang.Character.toChars;
import static java.lang.Character.toUpperCase;

public class Utils {

    public static double miles2kilometers(double miles) {
        return miles * 1.60934;
    }

    public static double getTaxes(double euro, double percentage) {

        return Math.round(euro * percentage) / 100.0;
    }

    public static double getNetPrice(double euro, double percentage){
        return (double) Math.round(euro * 100) /100 + getTaxes(euro, percentage);
    }

    public static int getCoins(double euro){
        int monedas = 0;

        while (euro>0){
            if (euro>=2){
                euro-=2;
                monedas+=10000000;
            } else if (euro>=1) {
                euro-=1;
                monedas+=1000000;
            } else if (euro>=0.5) {
                euro-=0.5;
                monedas+=100000;
            } else if (euro>=0.2) {
                euro-=0.2;
                monedas+=10000;
            } else if (euro>=0.1) {
                euro-=0.1;
                monedas+=1000;
            } else if (euro>=0.05) {
                euro-=0.05;
                monedas+=100;
            }else if (euro>=0.02) {
                euro-=0.02;
                monedas+=10;
            } else {
                if (euro>=0.009) {
                    euro -= 0.01;
                    monedas += 1;
                } else {
                    break;
                }
            }

        }
        return monedas;
    }

    public static char getNIF(int NIF){
        int num_letra = NIF%23;
        return switch (num_letra) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> '1';
        };
    }

    public static boolean isValidNIF(int numero, char letra){
        boolean goodnumber= false;
        char letramayus= character.toUpperCase;
        if (getNIF(numero)=letrastring){
            goodnumber= true;
        }
        return goodnumber;
    }
}
