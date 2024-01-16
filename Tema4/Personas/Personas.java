package Personas;

public class Personas {
    public String name;
    public String lastname;
    private int age;

    private final static int defaultage=0;


    public Personas(String name,int age) {
        this.name=name;
        this.age = age;
    }

    public Personas(String nombre){
        name=nombre;
        this.age=defaultage;
    }

    public Personas(){
        this.age=defaultage;
    }

    public String saludar(){
        return "Hola mundo";
    }

    public String presentacion(){
        return "Me llamo " + name + lastname;
    }

    public String saludarotrapersona(String persona){
        return "Un placer, " + persona;
    }

    public int getAge(){return age;}


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public static void showInfo(){
        System.out.println( "La clase persona tiene nombre y edad");
    }


}
