import java.util.Scanner;

public class Tema1Ejercicio24 {
    public static void main(String[] args){
        System.out.print("¿Cuantos alumnos tienes?");
        Scanner in = new Scanner(System.in);
        int alumnos = in.nextInt();
        int aprobados = 0;
        int suspendidos = 0;
        for (int i=1; i<=alumnos;i++){
            System.out.print( " Introduce la nota del alumno " + i + "=");
            int nota = in.nextInt();
                if (nota>=5 && nota<=10){
                    System.out.print("Esta aprobado ");
                    aprobados++;
                } else if (nota<5 && nota>0) {
                    System.out.print("Esta suspendido ");
                    suspendidos++;
                } else {
                    System.out.println("Nota incorrecta");
                }
        }
        System.out.println(aprobados + " aprobados y " + suspendidos + " suspendidos");

    }
}
