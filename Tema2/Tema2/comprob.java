package Tema2;

import java.util.Arrays;
import java.util.Scanner;

public class comprob {


    public static void main(String[] args) {
        System.out.printf("(+%s) - %d - %s", "34", 123, "456789");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String[] pepearray= a.split(" ");
        System.out.println(Arrays.toString(pepearray));
    }

}