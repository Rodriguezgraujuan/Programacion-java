package Funkos1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TratamientoCSV {
    private final static String COMMA_DELIMITER = ",";
    private List<List<String>> funkos;

    public void contenidoDelFichero() {
        try (Stream<String> contenidoFichero = Files.lines(Path.of("/home/juarodgra2/IdeaProjects/Programacion-java/Fichero/Funkos1/funkos.csv"))) {

            funkos = contenidoFichero.map(l -> Arrays.asList(l.split(COMMA_DELIMITER))).toList();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public List<List<String>> getFunkos() {
        return funkos;
    }

    public void mostrar(){
        funkos.forEach(System.out::println);
    }

    public void setFunkos(List<String> funkos) {
        this.funkos.add(funkos);
    }

    public void anadirFunko(Funko funko){
        List<String> funkoAdd = new ArrayList<>();
        funkoAdd.add(funko.getCod()+", "+funko.getNombre()+", "+funko.getModelo()+", "+funko.getPrecio()+", "+funko.getFecha());
        setFunkos(funkoAdd);
    }


}
