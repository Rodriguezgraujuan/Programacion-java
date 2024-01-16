package Personas;

import java.util.Scanner;

public class Persona1 {

    public static void main(String[] args) {
    Personas personas= new Personas("Alfred",9);

        Scanner in = new Scanner(System.in);
        personas.name= "Juan";
        personas.lastname= "Rodriguez";

        System.out.println("Introduce la otra persona");
        String otrapersona= in.nextLine();

        System.out.println(personas.saludar());
        System.out.println(personas.presentacion());
        System.out.println(personas.saludarotrapersona(otrapersona));
        personas.setAge(18);
        System.out.println(personas.getAge()+"La edad");
        personas.showInfo();
    }
}
