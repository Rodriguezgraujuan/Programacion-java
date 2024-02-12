package POO3EJ5;

import POO3EJ6.IPublicacionconreaccion;

public class PublicacionFoto implements IPublicacion, IAbrirPublicacion, IPublicacionconreaccion {
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
    public void comentar() {
        System.out.println("Comentando foto"+getlink());
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo foto"+getlink());
    }
}
