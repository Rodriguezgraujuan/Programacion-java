import java.util.Scanner;

public class Team1Ejercicio23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int suma= 0;
        int cantidad= 0;
            for (int i=1;i>=0;i++){
            System.out.print("Introduce un numero");
            int num = in.nextInt();

                if (num>=0){
                    suma = suma + num;
                    cantidad = cantidad + 1;
                } else {
                    break;
                }
        }
        float media = suma/cantidad;
        System.out.print(media);
    }
}
