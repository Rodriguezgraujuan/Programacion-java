package Funkos2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TratamientocsvSerial {
    private final Path fichero = Path.of("/home/juarodgra2/IdeaProjects/Programacion-java/Fichero/Funkos2/funkos.dat");

    public void crearFichero() throws IOException {
        if (!(Files.exists(fichero))) {
            Files.createFile(fichero);
        }
    }

    public List<FunkosSerial> recargarLista(){
        List<FunkosSerial> funkos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                FunkosSerial funkoFichero = (FunkosSerial) input.readObject();
                funkos.add(funkoFichero);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return funkos;
    }

    public void crearFunko(FunkosSerial funko) {

        List<FunkosSerial> funkos=recargarLista();
        funkos.add(funko);
        try (FileOutputStream fos = new FileOutputStream(fichero.toFile());
             ObjectOutputStream output = new ObjectOutputStream(fos)) {
            for (FunkosSerial funkosSerial : funkos) {
                output.writeObject(funkosSerial);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void borrarFunko(String cod) {
        List<FunkosSerial> funkos=recargarLista();
        funkos.removeIf(funkosSerial -> funkosSerial.getCod().equals(cod));

        try (FileOutputStream fos = new FileOutputStream(fichero.toFile());
             ObjectOutputStream output = new ObjectOutputStream(fos)) {
            for (FunkosSerial funkosSerial : funkos) {
                output.writeObject(funkosSerial);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void leerFunkos() {
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                FunkosSerial funko = (FunkosSerial) input.readObject();
                System.out.println(funko.toString());
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void funkoCaro() {
        FunkosSerial funkoCaro = new FunkosSerial("", "", "", 0, null);
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                FunkosSerial funko = (FunkosSerial) input.readObject();
                if (funko.getPrecio() > funkoCaro.getPrecio()) {
                    funkoCaro = funko;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println(funkoCaro);
    }

    public void mediaFunko() {
        Double precioTotal = 0.0;
        int contador = 0;
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                FunkosSerial funko = (FunkosSerial) input.readObject();
                precioTotal += funko.getPrecio();
                contador++;
            }
            System.out.println(precioTotal / contador);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    public void mostrarModelos(){
        List<String> modelos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                FunkosSerial funko = (FunkosSerial) input.readObject();
                if (!(modelos.contains(funko.getModelo()))){
                    modelos.add(funko.getModelo());
                }
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {
        for (String modelo : modelos){
            System.out.println(modelo);
            mostrarFunkosModelo(modelo);
        }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void mostrarFunkosModelo(String modelo){
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {
        while (fis.available() > 0) {
            FunkosSerial funko = (FunkosSerial) input.readObject();
            if (modelo.equals(funko.getModelo())){
                System.out.println(funko);
            }
        }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void mostrar2023(){
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
             ObjectInputStream input = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                FunkosSerial funko = (FunkosSerial) input.readObject();
                if (funko.getFecha().toString().contains("2023")){
                    System.out.println(funko);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
