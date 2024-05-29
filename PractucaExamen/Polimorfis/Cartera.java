package Polimorfis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartera {

    private List<Dinero> dinero=new ArrayList<>();
    private Scanner in = new Scanner(System.in);


    public void agregarDinero(){
        System.out.println("Quieres agregar monedas(1), billetes(2) o tarjetas(3)?");
        int option = in.nextInt();

        switch (option){
            case 1:
                agregarMoneda();
                break;
            case 2:
                agregarBillete();
                break;
            case 3:
                agregarTarjeta();
                break;
            default:
                System.out.println("Valor incorrecto");
        }
    }

    private void agregarMoneda(){
        System.out.println("Introduce la cantidad 0,5, 1 o 2");
        double valor = in.nextDouble();
        if (valor==0.5||valor==1||valor==2){
            dinero.add(new Monedas(valor));
        }else {
            System.out.println("Valor de moneda incorrecto");
        }
    }

    private void agregarBillete(){
        System.out.println("Introduce la cantidad 5, 10 o 20");
        double valor = in.nextDouble();
        if (valor==5||valor==10||valor==20){
            dinero.add(new Billetes(valor));
        }else {
            System.out.println("Valor de Billete incorrecto");
        }
    }

    private void agregarTarjeta(){
        System.out.println("Introduce una cantidad inferior a 300");
        double valor = in.nextDouble();
        if (valor<300){
            dinero.add(new Tarjeta(valor));
        }else {
            System.out.println("Valor de Tarjeta incorrecto");
        }
    }

    public void mostrarCartera() {
        for (Dinero money : dinero){
            if (money instanceof Monedas) {
                System.out.println("Moneda= " + money.getValor());
            } else if (money instanceof Billetes) {
                System.out.println("Billete= " +money.getValor());
            }else {
                System.out.println("Tarjeta= " + money.getValor());
            }
        }
    }

    public void eliminarDinero(){
        System.out.println("Que quieres eliminar moneda(1), billete(2) o tarjeta(3)");
        int option = in.nextInt();

        switch (option){
            case 1:
                eliminarMoneda();
                break;
            case 2:
                eliminarBillete();
                break;
            case 3:
                eliminarTarjeta();
                break;
            default:
                System.out.println("Valor incorrecto");
        }
    }
    private void eliminarMoneda(){
        System.out.println("Cuantas monedas quieres eliminar?");
        int cantidadEliminar = in.nextInt();
        int cantidadTarjetasTotales=0;

        for (Dinero mony : dinero){
            if (mony instanceof Monedas){
                cantidadTarjetasTotales++;
            }
        }

        if (cantidadTarjetasTotales >= cantidadEliminar) {
            for (int i = 0; cantidadEliminar > i; i++) {
                System.out.println("Introduce la cantidad 0,5, 1 o 2");
                double valor = in.nextDouble();
                if (valor == 0.5 || valor == 1 || valor == 2) {
                    for (Dinero money : dinero){
                        if (money instanceof Monedas && money.getValor() == valor){
                            dinero.remove(money);
                            break;
                        }
                    }
                } else {
                    System.out.println("Valor de moneda incorrecto");
                    i -= 1;
                }
            }
        }else {
            System.out.println("No hay monedas suficientes");
        }
    }

    private void eliminarBillete(){
        System.out.println("Cuantos billetes quieres eliminar?");
        int cantidadEliminar = in.nextInt();
        int cantidadTarjetasTotales=0;
        for (Dinero mony : dinero){
            if (mony instanceof Billetes){
                cantidadTarjetasTotales++;
            }
        }
        if (cantidadTarjetasTotales >= cantidadEliminar) {
            for (int i = 0; cantidadEliminar > i; i++) {
                System.out.println("Introduce la cantidad 5, 10 o 20");
                double valor = in.nextDouble();
                if (valor == 5 || valor == 10 || valor == 20) {
                    for (Dinero money : dinero){
                        if (money instanceof Billetes && money.getValor() == valor){
                            dinero.remove(money);
                            break;
                        }
                    }
                } else {
                    System.out.println("Valor de moneda incorrecto");
                    i -= 1;
                }
            }
        }else {
            System.out.println("No hay billetes suficientes");
        }
    }

    private void eliminarTarjeta(){
        System.out.println("Cuantas Tarjetas quieres eliminar?");
        int cantidadEliminar = in.nextInt();
        int cantidadTarjetasTotales=0;
        for (Dinero mony : dinero){
            if (mony instanceof Tarjeta){
                cantidadTarjetasTotales++;
            }
        }
        if (cantidadTarjetasTotales >= cantidadEliminar) {
            for (int i = 0; cantidadEliminar > i; i++) {
                System.out.println("Introduce una cantidad inferior de 300");
                double valor = in.nextDouble();
                if (valor < 300) {
                    for (Dinero money : dinero){
                        if (money instanceof Tarjeta && money.getValor() == valor){
                            dinero.remove(money);
                            break;
                        }
                    }
                } else {
                    System.out.println("Valor de moneda incorrecto");
                    i -= 1;
                }
            }
        }else {
            System.out.println("No hay tantas tarjetas");
        }
    }


    public void pago(double dineroPagar){
        boolean primeraEntrada = true;
        if (calcularTotal()>=dineroPagar){

            while (dineroPagar >= 0.5 || primeraEntrada) {
                primeraEntrada=false;

                for (Dinero money : dinero) {
                    if (dineroPagar > 0) {

                            if (!(money instanceof Tarjeta)) {
                                dineroPagar -= money.getValor();
                                dinero.remove(money);
                                while (dineroPagar < 0) {
                                    dineroPagar = realizarCambio(dineroPagar);
                                }
                            } else {
                                if (dineroPagar>=money.getValor()){
                                    dineroPagar-=money.getValor();
                                    dinero.remove(money);
                                }else {
                                    money.setValor(money.getValor() - dineroPagar);
                                    dineroPagar=0;
                                }
                            }


                    } else {
                        System.out.println("Pagado");
                        break;
                    }
                    if (dineroPagar==0){
                        break;
                    }
                }
            }

        }else {
            System.out.println("No money");
        }
    }

    private double realizarCambio(double restante){
        if (restante<=-20){
            dinero.add(new Billetes(20));
            restante+=20;
        } else if (restante<=-10) {
            dinero.add(new Billetes(10));
            restante+=10;
        }else if (restante<=-5) {
            dinero.add(new Billetes(5));
            restante+=5;
        }else if (restante<=-2) {
            dinero.add(new Monedas(2));
            restante+=2;
        }else if (restante<=-1) {
            dinero.add(new Monedas(1));
            restante+=1;
        }else if (restante<=-0.5) {
            dinero.add(new Monedas(0.5));
            restante+=0.5;
        }else{
            restante=0;
            System.out.println("menor de 0.5");
        }
        return restante;
    }

    private double calcularTotal(){
        double total=0;

        for (Dinero money : dinero){
            total+=money.getValor();
        }
        return total;
    }

}
