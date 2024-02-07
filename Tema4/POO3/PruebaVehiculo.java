package POO3;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Turismo t = new Turismo("","",8,4,Turismo.tipoCoche.PROFESIONAL);
        Camiones C= new Camiones("","",8,1500, Camiones.PeligrosoNo.SI);
        Ciclomotores M=new Ciclomotores("","",2,1000);
        System.out.println(M.necesitaCarnet());
    }
}
