package Tema2;

public class comprob {

    public static void main(String[] args) {
        int monedas = 0;
        double euro =  2.01;
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
            System.out.println(euro);
        }
        System.out.println(monedas);
    }
}
