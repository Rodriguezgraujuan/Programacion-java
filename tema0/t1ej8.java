import java.util.Scanner;

public class t1ej8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        if ( num1 == num2 ) {
            System.out.println(num1 + " y " + num2 + " son iguales");
        } else if (num1 > num2) {
            System.out.println(num1 +" es mayor que " + num2);
        }else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
