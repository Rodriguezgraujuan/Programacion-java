package Fichero;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Tratamientocsv csv= new Tratamientocsv();
        csv.leerArchivo();
        System.out.println(csv.getLibros());
        System.out.println("Agregamos uno nuevo");
        csv.agregarArtista();
        System.out.println("Actualizar el archivo");
        csv.actualizarArchivo();
    }
}
