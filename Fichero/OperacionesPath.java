import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class OperacionesPath {

    static Scanner in = new Scanner(System.in);

    public static void menu(){
        System.out.println("""
                1. Seleccionar archivo para mover a ruta niats.
                2. Mostrar directorio niats.
                3. Salir.
                  """);
    }

    public static void mostrarDirectorio() throws IOException {
        Files.list(Path.of("/tmp/niats")).forEach(System.out::println);
    }

    public static void aplanarDirectorio(Path directorio) throws IOException {
        if (Files.exists(directorio)&&Files.isDirectory(directorio)){
            try (DirectoryStream<Path> directorioTree = Files.newDirectoryStream(directorio)) {
                Path directorioBase= directorio;
                for (Path file : directorioTree) {
                    if (Files.exists(file.toAbsolutePath().normalize())&&Files.isDirectory(file.toAbsolutePath().normalize())){
                        if (Files.list(file.toAbsolutePath().normalize()).findAny().isEmpty()) {
                            Files.delete(file.toAbsolutePath().normalize());
                        }else {
                            aplanarDirectorio(file.toAbsolutePath().normalize());
                        }
                    } else if (Files.exists(file.toAbsolutePath().normalize())&&Files.isRegularFile(file.toAbsolutePath().normalize())){
                        System.out.println(file.getFileName());
                        System.out.println(directorio.getFileName());
                        Path dest = Path.of(directorio.toAbsolutePath().normalize().toString() + file.getFileName());
                        Files.move(file.toAbsolutePath().normalize(), dest.toAbsolutePath().normalize(), StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Ruta incorrecta");
        }
    }

    public static void main(String[] args) throws IOException {
        boolean condition=true;
        while (condition) {
            menu();
            int option= in.nextInt();
            switch (option){
                case 1:
                    in.nextLine();
                    String directorio= in.nextLine();
                    aplanarDirectorio(Path.of(directorio));
                    break;
                case 2:
                    mostrarDirectorio();
                    break;
                case 3:
                    condition=false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
