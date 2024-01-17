package POO1;

import Tema2.Utils;

public class Persona {
    public final String Dni;
    public String nombre;
    public String apellidos;
    public int edad;
    public static final int adultAge=18;
    public static final int retiredAge=65;

    public Persona(String Dni, String nombre, String apellidos, int edad){
        this.Dni=Dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    private static boolean checkNumerosDni(String Dni){
        boolean condition=false;
        String numeros= Dni.substring(0,8);
        for (int i=0;i<numeros.length();i++){
            if (numeros.charAt(i)<=9){
                condition=true;
            } else {
                condition=false;
                break;
            }
        }
        return condition;
    }

    private static boolean checkLetraDni(String Dni){
        boolean condition= false;
        char[] letrasDni=new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        for (char c : letrasDni) {
            if (Dni.charAt(8) == c) {
                condition = true;
                break;
            }
        }
        return condition;
    }

    public static boolean checkDNI(String Dni){
        boolean condition=false;
        if (checkNumerosDni(Dni)&&checkLetraDni(Dni)) {
            int numeros= Integer.parseInt(Dni.substring(0,7));
            char letra = Utils.getNIF(numeros);
            if (letra==Dni.charAt(8)){
                condition=true;
            }
        }
        return condition;
    }

    public void setPersona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        if (edad>0){
            this.edad=edad;
        }
    }

    public String getDni(){
        return this.Dni;
    }
    public String getNombre(){
        return this.Dni;
    }
    public String getApellidos(){
        return this.Dni;
    }

    private boolean isAdult(){
        return this.edad >= adultAge;
    }

    private boolean isRetired(){
        return this.edad>=retiredAge;
    }

    public int ageDifference(int edadOtraPersona){
        return Math.abs(this.edad-edadOtraPersona);
    }

    public void print(){
        System.out.println(this.nombre + this.apellidos);
        System.out.println("Su Dni es: " + this.Dni);
        System.out.println("Su edad es: " + this.edad);
    }

}
