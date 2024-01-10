package Personas;

import java.util.Scanner;

public class Persona1 {

    public static void main(String[] args) {
    Personas personas= new Personas();
        Scanner in = new Scanner(System.in);
    personas.name= "Juan";
    personas.lastname= "Rodriguez";
    personas.age= 18;

        System.out.println("Introduce la otra persona");
        String otrapersona= in.nextLine();

        System.out.println(personas.saludar());
        System.out.println(personas.presentacion());
        System.out.println(personas.saludarotrapersona(otrapersona));
    }
}
