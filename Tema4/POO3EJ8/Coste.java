package POO3EJ8;

public class Coste {
    private int costeFisico;
    private int costeMana;

    public Coste(int costeFisico, int costeMana){
        this.costeFisico=costeFisico;
        this.costeMana=costeMana;
    }
    public int getCosteFisico() {
        return costeFisico;
    }

    public int getCosteMana() {
        return costeMana;
    }

    public void setCosteFisico(int costeFisico) {
        this.costeFisico = costeFisico;
    }

    public void setCosteMana(int costeMana) {
        this.costeMana = costeMana;
    }
}
