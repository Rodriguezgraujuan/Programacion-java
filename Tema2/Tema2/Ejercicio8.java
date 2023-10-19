package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public static int verificacion_numeros(int dia, int mes) {
        int condicion = 0;
        if (dia >= 1 && dia <= 31 && mes>=1 && mes<=12 ) {
            condicion = 1;
        }
        return condicion;
    }

    public static int bisiesto(int year) {
        int bisiesto = 1;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 1) {
                    bisiesto = 0;
                }
            }
        } else {
            bisiesto = 0;
        }
        return bisiesto;
    }

    public static void fecha(int dia, int mes, int bisiesto) {
        if (mes == 1 || mes > 2 && verificacion_numeros(dia, mes)==1) {
            System.out.println("Fecha correcta");
        } else if (bisiesto==1 && mes==2 && dia>=1 && dia<=29) {
            System.out.println("Fecha correcta");
        } else if (mes == 2 && dia>=1 && dia <=28) {
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dia, mes, año");
        int dia = in.nextInt();
        int mes = in.nextInt();
        int year = in.nextInt();

        if (verificacion_numeros(dia, mes) == 0) {
            System.out.println("Fecha incorrecta");
        } else {
            fecha(dia, mes, bisiesto(year));
        }
    }
}
