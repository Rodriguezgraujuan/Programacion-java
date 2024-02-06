package Pruebas;

public class Perro extends AnimalDomestico{
    private boolean esPeligroso;

    public Perro(String nombre, String raza, int peso, String color, boolean agresivo) {
        super(nombre, raza, peso, color);
        this.esPeligroso=agresivo;
    }

    @Override
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

    public void pasear(){
        System.out.println("Vamooooooooooos, que lento erees");
    }
}
