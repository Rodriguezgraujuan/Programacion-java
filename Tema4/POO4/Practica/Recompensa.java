package POO4.Practica;

public class Recompensa {
    private int nivelRecompensa;
    private TipoRecompensa tipoRecompensa;

    private String nombreRecompensa;

    public enum TipoRecompensa {
        ESPADA, ARMADURA, CASCO, BOTAS, CAPA, ARCO, BASTONMAGO
    }

    public Recompensa() {
    }

    public void setNivelRecompensa(int nivelRecompensa) {
        this.nivelRecompensa = nivelRecompensa;
    }

    public void setTipoRecompensa(TipoRecompensa tipoRecompensa) {
        this.tipoRecompensa = tipoRecompensa;
    }

    public int getNivelRecompensa() {
        return nivelRecompensa;
    }

    public TipoRecompensa getTipoRecompensa() {
        return tipoRecompensa;
    }

    public String toString() {
        return "Tipo: " + getTipoRecompensa() + "  Nivel: " + getNivelRecompensa();
    }

}
