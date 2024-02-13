package POO3Ej4;

public abstract class Ficha {


     private final int numero;
     private final String titulo;
     public Ficha(int numero, String titulo){
          this.numero=numero;
          this.titulo=titulo;
     }

     public int getNumero() {
          return numero;
     }

     public String getTitulo() {
          return titulo;
     }

     public void prestamo(){
          System.out.println("Tienes 20 dias para devolverlo");
     }
}
