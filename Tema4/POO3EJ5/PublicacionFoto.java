package POO3EJ5;

public class PublicacionFoto implements IPublicacion, IAbrirPublicacion{
    private final String link;

    public PublicacionFoto(String link){
        this.link=link;
    }

    public String getlink() {
        return link;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando foto"+getlink());
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo foto"+getlink());
    }
}
