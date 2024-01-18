package POO1;

import java.util.Scanner;

public class Persona1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Introduce el DNI, nombre, apellidos y edad de la persona1");
        String Dni1= in.nextLine();
        String nombre1= in.nextLine();
        String apellidos1= in.nextLine();
        int edad1= in.nextInt();
        in.nextLine();

        System.out.println("Introduce el DNI, nombre, apellidos y edad de la persona2");
        String Dni2= in.nextLine();
        String nombre2= in.nextLine();
        String apellidos2= in.nextLine();
        int edad2= in.nextInt();

        Persona persona1=new Persona(Dni1, nombre1, apellidos1, edad1);
        Persona persona2=new Persona(Dni2, nombre2, apellidos2, edad2);
        persona1.setPersona("Alfredo ", "Flores Bombo", 19);
        System.out.println(persona1.getDni()+" "+persona1.getNombre()+persona1.getApellidos()+persona1.edad);

        System.out.println("¿La persona 1 es adulta?" + persona1.isAdult());
        System.out.println("¿La persona 2 esta jubilado?" + persona1.isRetired());

        System.out.println("La diferencia de las edades entre " + persona1.nombre + " y "+ persona2.nombre + " es de " + persona1.ageDifference(persona2.edad));


        System.out.println("¿De que persona quieres comprobar el DNI? 1 o 2");
        int opcion= in.nextInt();
        if (opcion==1){
            if(Persona.checkDNI(persona1.Dni)){
                System.out.println("El Dni de la persona 1 es correcto.");
            }else {
                System.out.println("El Dni de la persona 1 es incorrecto");
            }
        } else if (opcion==2) {
            System.out.println(persona2.getDni());
            if(Persona.checkDNI(persona2.Dni)){
                System.out.println("El Dni de la persona 2 es correcto.");
            }else {
                System.out.println("El Dni de la persona 2 es incorrecto");
            }
        }

        System.out.println("De quien quieres printear los datos? 1 o 2");
        int opcionPrint= in.nextInt();
        if (opcionPrint==1){
            persona1.print();
        }else {
            persona2.print();
        }
    }
}
