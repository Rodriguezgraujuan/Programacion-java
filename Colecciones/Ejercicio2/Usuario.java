package Ejercicio2;

public class Usuario {
    private String name;
    private int edad;

    public Usuario(String name, int edad){
        this.name=name;
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getName() {
        return name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}
