package Fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tratamientocsv {
    private final static String COMMA_DELIMITER = ",";

    public List<List<String>> leerArchivo() throws IOException {
        List<List<String>> libros = new ArrayList<>();
        Path ruta = Path.of("C:\\Users\\rodri\\Downloads\\artista.csv");
        try (Stream<String> contenidoFichero = Files.lines(ruta)) {
            libros = contenidoFichero
                    .map(l -> Arrays.asList(l.split(COMMA_DELIMITER)))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        System.out.println(libros);
        return libros;
    }
/*
    public List<List<String>> getLibros() {
        return libros;
    }

    public void agregarArtista(){
        List<String> lista = new ArrayList<>();
        lista.add("p");
        lista.add("p");
        lista.add("12");
        libros.add(lista);
        try {
            actualizarArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actualizarArchivo() throws IOException {
        Path ruta = Path.of("C:\\Users\\rodri\\Downloads\\artista.csv");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta.toFile()))) {
            for (List<String> libro : libros) {
                bw.newLine();
                bw.write(String.join(COMMA_DELIMITER, libro));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 */
}
