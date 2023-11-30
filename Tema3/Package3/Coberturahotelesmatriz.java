package Package3;

import java.util.Arrays;
import java.util.Scanner;

public class Coberturahotelesmatriz {
    static int[][] hotel = new int[12][5];
    static Scanner in = new Scanner(System.in);

    public static void printcuadradomatriz() {
        for (int[] ints : hotel) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] coberturahabitacion(int piso, int habitacion, int potencia) {
        hotel[piso][habitacion] = potencia;
        int piso1 = piso;
        int piso2 = piso;
        int habitacion1 = habitacion;
        int habitacion2 = habitacion;


        int potencia1 = potencia - 1;
        int potencia2 = potencia - 1;
        int potencia3 = potencia - 1;
        int potencia4 = potencia - 1;


        for (int i = 0; i < potencia1; potencia1--) {
            piso1--;
            if (piso1 >= 0) {
                hotel[piso1][habitacion] = potencia1;
            }
        }
        for (int i = 0; i < potencia2; potencia2--) {
            piso2++;
            if (piso2 <= 11) {
                hotel[piso2][habitacion] = potencia2;
            }
        }

        for (int i = 0; i < potencia3; potencia3--) {
            habitacion1--;
            if (habitacion1 >= 0) {
                hotel[piso][habitacion1] = potencia3;
            }
        }
        for (int i = 0; i < potencia4; potencia4--) {
            habitacion2++;
            if (habitacion2 < 5) {
                hotel[piso][habitacion2] = potencia4;
            }
        }
        int piso3=piso;
        int potencia5=potencia;
        int habitacion3=habitacion;
        boolean condition=true;
        while (condition){
            if (habitacion3==4) {
                condition=false;
            } else if (piso==0&&habitacion==0) {
                if (potencia-2>0) {
                    hotel[piso + 1][habitacion + 1] = potencia - 2;
                    if (potencia-4>0) {
                        hotel[piso + 2][habitacion + 1] = potencia - 4;
                        hotel[piso + 1][habitacion + 2] = potencia - 4;
                    }
                }
                condition=false;
            } else {
                if (potencia5 - 2<0) {
                    potencia5 =0;
                } else {
                    potencia5 -= 2;

                    hotel[piso3 + 1][habitacion3 + 1] = potencia5;
                    if (hotel[piso3 + 1][habitacion3] == 1 || hotel[piso3 + 1][habitacion3] == 0 || potencia5 == 0) {
                        hotel[piso3 + 1][habitacion3 + 1] = 0;

                        piso3 = piso - 1;
                        habitacion3++;
                        potencia5 = hotel[piso + 1][habitacion + 1];
                    }
                }
                piso3++;
            }
        }

        potencia5=potencia;
         piso3=piso;
         habitacion3=habitacion;
         condition=true;
        while (condition){
            if (habitacion3==0) {
                condition=false;
            } else {
                if (potencia5 - 2<0) {
                    potencia5 =0;
                } else {
                    potencia5-=2;
                }
                if (piso3<11&&piso>0) {
                    hotel[piso3 + 1][habitacion3 - 1] = potencia5;
                    if (hotel[piso3 + 1][habitacion3] == 1 || hotel[piso3 + 1][habitacion3] == 0 || potencia5 == 0) {
                        hotel[piso3 + 1][habitacion3 - 1] = 0;
                            piso3 = piso + 1;
                            habitacion3--;
                            potencia5 = hotel[piso + 1][habitacion - 1];

                    }
                }
                piso3++;
            }
        }

        potencia5=potencia;
        piso3=piso;
        habitacion3=habitacion;
        condition=true;
        while (condition){
            if (habitacion3==0) {
                condition=false;
            } else {
                if (potencia5 - 2<0) {
                    potencia5 =0;
                } else {
                    potencia5-=2;
                }
                if (piso3>0) {
                    hotel[piso3 - 1][habitacion3 - 1] = potencia5;

                if (hotel[piso3 - 1][habitacion3] == 1 || hotel[piso3 + 1][habitacion3] == 0 || potencia5 == 0) {
                    hotel[piso3 - 1][habitacion3 - 1] = 0;
                }
                    piso3 =piso+1;
                    habitacion3--;
                    potencia5 = hotel[piso-1][habitacion-1];
                }
                piso3--;
            }
        }

        potencia5=potencia;
        piso3=piso;
        habitacion3=habitacion;
        condition=true;
        while (condition){
            if (habitacion3==4||piso==0) {
                condition=false;
            } else {
                if (potencia5 - 2 < 0) {
                    potencia5 = 0;
                } else {
                    potencia5 -= 2;
                }
                if (piso3>0&&piso3<11) {
                hotel[piso3 - 1][habitacion3 + 1] = potencia5;
                    if (hotel[piso3 - 1][habitacion3] == 1 || hotel[piso3 + 1][habitacion3] == 0 || potencia5 == 0) {
                        hotel[piso3 - 1][habitacion3 + 1] = 0;

                        piso3 = piso + 1;
                        habitacion3++;
                        potencia5 = hotel[piso - 1][habitacion + 1];
                    }
                }
                piso3--;
            }
        }


        return hotel;
    }

    public static void main(String[] args) {
        System.out.println("Introduce el piso");
        int piso = in.nextInt();
        System.out.println("Introduce la habitación");
        int habitacion = in.nextInt();
        System.out.println("Introduce la potencia");
        int potencia = in.nextInt();
        coberturahabitacion(piso, habitacion, potencia);
        printcuadradomatriz();
    }
}
