

public class Tema1Ejercicio27 {
    public static void main(String[] args) {
        int n = 1;
        int primos = 0;
        while (primos < 20) {
            int bucle =0;
            for (int i = 1; i<=n ; i++){
                if (n%i==0) {
                    bucle++;

                }
            }
            if (bucle<=2) {
                System.out.println(n);
                primos++;
            }
            n++;
        }




    }
}
