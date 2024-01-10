package Personas;

public class Personas {
    public String name;
    public String lastname;
    public int age;

    public String saludar(){
        return "Hola mundo";
    }

    public String presentacion(){
        return "Me llamo " + name + lastname;
    }

    public String saludarotrapersona(String persona){
        return "Un placer, " + persona;
    }
}
