package POO3EJ8;

public class Dmg {
    private int dmgFisico;
    private int dmgMagico;

    public Dmg (int dmgFisico, int dmgMagico){
        this.dmgFisico=dmgFisico;
        this.dmgMagico=dmgMagico;
    }

    public int getDmgFisico() {
        return dmgFisico;
    }

    public int getDmgMagico() {
        return dmgMagico;
    }

    public void setDmgFisico(int dmgFisico) {
        this.dmgFisico = dmgFisico;
    }

    public void setDmgMagico(int dmgMagico) {
        this.dmgMagico = dmgMagico;
    }
}
