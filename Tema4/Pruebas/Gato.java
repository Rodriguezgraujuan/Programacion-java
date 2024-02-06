package Pruebas;

public class Gato extends AnimalDomestico{
    public Gato(String nombre, String raza, int peso, String color) {
        super(nombre, raza, peso,color);
    }

    public void hacerRuido() {
        int aleatorioRuido= random.nextInt(1,2);
        boolean conditionRuido=super.hacerRuido(aleatorioRuido==1);
        if (conditionRuido){
            System.out.println("Hace caso");
        } else {
            System.out.println("No hace caso");
        }
    }

    @Override
    public void llamar() {
        int aleatorioLlamar= random.nextInt(1,2);
        super.hacerRuido(aleatorioLlamar==1);
    }

    public void toserBolaPelo(){
        System.out.println("ME AHOGOOOOOOOO");
    }
}
