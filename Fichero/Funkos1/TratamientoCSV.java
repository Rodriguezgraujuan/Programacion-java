package Funkos1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class TratamientoCSV {
    private final static String COMMA_DELIMITER = ",";
    private Encabezado encabezado;
    private List<Funko> funkos = new ArrayList<>();
    private List<String> modelos = new ArrayList<>();

    public void contenidoDelFichero() {
        try (Stream<String> contenidoFichero = Files.lines(Path.of("/home/juarodgra2/IdeaProjects/Programacion-java/Fichero/Funkos1/funkos.csv"))) {
            contenidoFichero.forEach(linea -> {
                String[] lineaSeparada = linea.split(",");
                if (!(lineaSeparada[0].equals("COD")) || !(lineaSeparada[1].equals("NOMBRE")) || !(lineaSeparada[2].equals("MODELO")) || !(lineaSeparada[3].equals("PRECIO")) || !(lineaSeparada[4].equals("FECHA_LANZAMIENTO"))) {
                    Date fechaDate = null;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        fechaDate = sdf.parse(lineaSeparada[4]);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    funkos.add(new Funko(lineaSeparada[0], lineaSeparada[1], lineaSeparada[2], Double.parseDouble(lineaSeparada[3]), fechaDate));
                } else {
                    this.encabezado = new Encabezado(lineaSeparada[0], lineaSeparada[1], lineaSeparada[2], lineaSeparada[3], lineaSeparada[4]);
                }
            });
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }


    public List<Funko> getFunkos() {
        return funkos;
    }

    public void mostrar() {
        System.out.println(encabezado);
        funkos.forEach(System.out::println);
    }

    public void setFunkos(Funko funkos) {
        this.funkos.add(funkos);
    }

    public void eliminarFunko(String cod) {
        this.funkos.removeIf(p -> p.getCod().equals(cod));
    }

    public void mostrarMasCaro() {
        String cod;
        double precio = 0;
        for (Funko funko : funkos) {
            if (funko.getPrecio() > precio) {
                precio = funko.getPrecio();
            }
        }
        final double precioFinal = precio;
        funkos.stream().filter(p -> p.getPrecio() == precioFinal).forEach(System.out::println);
    }

    public void mostrarMedia() {
        System.out.println(calcularMedia());
    }

    private double calcularMedia() {
        double totalPrecio = 0;
        for (Funko funko : funkos) {
            totalPrecio += funko.getPrecio();
        }
        return totalPrecio / funkos.size();
    }

    private void actualizarModelos() {
        for (Funko funko : funkos) {
            if (!(modelos.contains(funko.getModelo()))) {
                modelos.add(funko.getModelo());
            }
        }
    }

    public void mostrarModelos() {
        actualizarModelos();
        for (int i = 0; i < modelos.size(); i++) {
            int finalI = i;
            System.out.println(modelos.get(i));
            funkos.stream().filter(p -> p.getModelo().equals(modelos.get(finalI))).forEach(System.out::println);
        }
    }

    public void mostrar2023() {
        for (Funko funko : funkos) {
            if (funko.getFecha().toString().contains("2023")) {
                System.out.println(funko);
            }
        }
    }

    public void upload() throws IOException {
        Path origen = Path.of("/home/juarodgra2/IdeaProjects/Programacion-java/Fichero/Funkos1/funkos.csv");
        Path destino = Path.of("/home/juarodgra2/IdeaProjects/Programacion-java/Fichero/Funkos1/funkosCopy.csv");
        Files.createFile(destino);
        try (BufferedWriter bw = Files.newBufferedWriter(destino)) {
            bw.write(encabezado.getCod() + "," + encabezado.getNombre() + "," + encabezado.getModelo() + "," + encabezado.getPrecio() + "," + encabezado.getFecha());
            bw.newLine();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            for (Funko funko : funkos) {
                formato.applyPattern("yyyy-MM-dd");
                String fechaTraducida = formato.format(funko.getFecha());
                bw.write(funko.getCod() + ", " + funko.getNombre() + ", " + funko.getModelo() + ", " + funko.getPrecio() + ", " + fechaTraducida);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        Files.deleteIfExists(origen);
        Files.move(destino, origen, StandardCopyOption.REPLACE_EXISTING);
    }
}