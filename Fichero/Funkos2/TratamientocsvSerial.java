package Funkos2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TratamientocsvSerial {

    public void loadCSV(){
        try {
            List<String> csvStrings = Files.readAllLines(Path.of("/home/juarodgra2/IdeaProjects/Programacion-java/Fichero/Funkos1/funkos.csv"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
