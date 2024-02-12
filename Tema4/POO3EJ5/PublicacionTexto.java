package POO3EJ5;

public class PublicacionTexto implements IPublicacion{
    private final String texto;

    public PublicacionTexto(String texto){
        this.texto=texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando comentario"+getTexto());
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo comentario"+getTexto());
    }
}
