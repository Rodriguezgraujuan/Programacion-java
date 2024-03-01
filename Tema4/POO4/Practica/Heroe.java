package POO4.Practica;

import POO4.Ej5.Ataque;

import java.util.ArrayList;
import java.util.Random;

public class Heroe {

    private final Random random = new Random();


    private final int VIDA_DEFAULT=100;
    private final int DEFENSA_DEFAULT=5;
    private final int AGILIDAD_DEFAULT=10;

    private int MAX_VIDA=100;

    private int vida = VIDA_DEFAULT;
    private int defensa=DEFENSA_DEFAULT;
    private int carisma;
    private int agilidad=AGILIDAD_DEFAULT;
    private int posicion_x=0;
    private int posicion_y=0;

    private int cascoLvl;
    private int armaduraLvl;
    private int botasLvl;
    private int capaLvl;
    private int espadaLvl;
    private int arcoLvl;
    private int bastonLvl;


    private int enemigosDerrotados;


    private final ArrayList<Recompensa> inventario=new ArrayList<>();


    public int getAgilidad() {
        return agilidad;
    }

    public int getVida() {
        return vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getPosicion_x() {
        return posicion_x;
    }
    public int getPosicion_y() {
        return posicion_y;
    }

    public int getMAX_VIDA() {
        return MAX_VIDA;
    }

    public int getEnemigosDerrotados() {
        return enemigosDerrotados;
    }

    public void setEnemigosDerrotados(int enemigosDerrotados) {
        this.enemigosDerrotados = enemigosDerrotados;
    }

    public void setMAX_VIDA(int MAX_VIDA) {
        this.MAX_VIDA = MAX_VIDA;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setVida(int vida) {
        if (vida>getMAX_VIDA()) {
            this.vida = vida;
        }
    }

    public void setPosicion_x(int posicion) {
        this.posicion_x = posicion;
    }
    public void setPosicion_y(int posicion) {
        this.posicion_y = posicion;
    }

    public int getArmaduraLvl() {
        return armaduraLvl;
    }

    public int getBotasLvl() {
        return botasLvl;
    }

    public int getCapaLvl() {
        return capaLvl;
    }

    public int getCascoLvl() {
        return cascoLvl;
    }

    public int getVIDA_DEFAULT() {
        return VIDA_DEFAULT;
    }

    public int getArcoLvl() {
        return arcoLvl;
    }

    public int getEspadaLvl() {
        return espadaLvl;
    }

    public int getBastonLvl() {
        return bastonLvl;
    }

    public void printInventario(){
        if (!getInventario().isEmpty()) {
            for (int i = 0; i < getInventario().size(); i++) {
                System.out.print(i + 1 + ". ");
                System.out.println(getInventario().get(i));
            }
        }else {
            System.out.println("Inventario vacio");
        }
    }

    public Ataque atacarEnemigoCuerpo(char arma){
        Random random=new Random();
        Ataque ataque=new Ataque(Ataque.tipoAtaque.Cuerpo);
        if (arma=='E') {
            ataque.setDanyoFisico(random.nextInt(70,110));
        }else {
            ataque.setDanyoFisico(random.nextInt(50, 100));
        }
        return ataque;
    }

    public Ataque atacarEnemigoDistancia(char arma){
        Random random=new Random();
        Ataque ataque=new Ataque(Ataque.tipoAtaque.Distancia);
        if (arma=='A') {
            ataque.setDanyoFisico(random.nextInt(60, 100));
        }else {
            ataque.setDanyoFisico(random.nextInt(1,15));
            ataque.setDanyoMagico(random.nextInt(80, 90));
        }
        return ataque;
    }

    public void recibirDanyo(Ataque ataque){
        if (random.nextInt(0,100)>getAgilidad()) {
            int danyoAtaque = ataque.getDanyoFisico() + ataque.getDanyoMagico();
            danyoAtaque -= getDefensa();
            if (ataque.getTipo().equals(Ataque.tipoAtaque.Distancia)) {
                danyoAtaque *= 2;
            }
            setVida(getVida() - danyoAtaque);
        }
    }

    public void anyadirObjetoInventario(Recompensa item){
        inventario.add(item);
    }

    private ArrayList<Recompensa> getInventario() {
        return inventario;
    }

    public void moverPersonaje(String rumbo){
        if (rumbo.equals("N")&&getPosicion_y()==0||rumbo.equals("E")&&getPosicion_x()==0||rumbo.equals("S")&&getPosicion_y()==9||rumbo.equals("O")&&getPosicion_x()==9){
            System.out.println("Fuera del mapa");
        }else {
            switch (rumbo){
                case "N"->setPosicion_y(getPosicion_y()-1);
                case "E"->setPosicion_x(getPosicion_x()-1);
                case "S"->this.setPosicion_y(getPosicion_y()+1);
                case "O"->this.setPosicion_x(getPosicion_x()+1);
            }
        }
    }

    public void equiparEquipamiento(){
        this.cascoLvl=equiparMejorCasco();
        this.armaduraLvl=equiparMejorArmadura();
        this.botasLvl=equiparMejorBotas();
        this.capaLvl=equiparMejorCapa();
        this.espadaLvl=equiparMejorEspada();
        this.arcoLvl=equiparMejorArco();
        this.bastonLvl=equiparMejorBaston();
        setVida(getVIDA_DEFAULT()+(getCascoLvl()*10)+(getArmaduraLvl()*10)+(getBotasLvl()*10));
        setDefensa(getDefensa()+(getCascoLvl()*3)+(getArmaduraLvl()*3)+(getBotasLvl()*3));
        setMAX_VIDA(getVIDA_DEFAULT()+(getCascoLvl()*10)+(getArmaduraLvl()*10)+(getBotasLvl()*10));
        setAgilidad(getAgilidad()+(getCapaLvl()*10));
    }

    private int equiparMejorCasco(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.CASCO){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;
    }

    private int equiparMejorArmadura(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.ARMADURA){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;

    }
    private int equiparMejorBotas(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.BOTAS){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;

    }
    private int equiparMejorCapa(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.CAPA){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;

    }
    private int equiparMejorEspada(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.ESPADA){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;

    }

    private int equiparMejorArco(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.ARCO){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;

    }

    private int equiparMejorBaston(){
        int nivelActualMejor=0;
        for (int i=0; i<getInventario().size();i++){
            if (getInventario().get(i).getTipoRecompensa()==Recompensa.TipoRecompensa.BASTONMAGO){
                if (getInventario().get(i).getNivelRecompensa()>nivelActualMejor){
                    nivelActualMejor=getInventario().get(i).getNivelRecompensa();
                }
            }
        }
        return nivelActualMejor;

    }

    @Override
    public String toString() {
        return "Vida: " + getVida()+ "\nDefensa: " + getDefensa()+ "\nCarisma: " + getCarisma()+ "\nAgilidad: " + getAgilidad();
    }
}
