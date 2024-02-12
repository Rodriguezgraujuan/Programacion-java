package POO3EJ5;

public interface IAbrirPublicacion {
    public static void main(String[] args) {
        PublicacionTexto texto = new PublicacionTexto("¡Hola mundo!");
        texto.publicar();
        texto.compartir();

        PublicacionFoto foto = new PublicacionFoto("https://ejemplo.com/foto.jpg");
        foto.publicar();
        foto.compartir();

        PublicacionVideo video = new PublicacionVideo("https://ejemplo.com/video.mp4");
        video.publicar();
        video.compartir();
    }
}
