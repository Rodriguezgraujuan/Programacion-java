package POO3EJ5;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion{
    private final String Video;

    public PublicacionVideo(String video){
        this.Video=video;
    }

    public String getVideo() {
        return Video;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando video"+getVideo());
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo video"+getVideo());
    }
}
