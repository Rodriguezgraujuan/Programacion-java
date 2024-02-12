package POO3EJ5;

import POO3EJ6.IPublicacionconreaccion;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion, IPublicacionconreaccion {
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
    public void comentar() {
        System.out.println("Comentando video"+getVideo());
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo video"+getVideo());
    }
}
