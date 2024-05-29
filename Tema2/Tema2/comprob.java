package Tema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class comprob {

    static List<String> patata = new ArrayList<>();
    public static void main(String[] args) {
        List<String> pepe = new ArrayList<>();

        patata.add("1");
        pepe.add("3");

        agregar2(pepe);
        System.out.println(patata);
        System.out.println(pepe);
    }

    public static void agregar2(List<String> pepe){
        pepe.add("1");
    }
}