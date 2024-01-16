package Personas;

public class Reloj {

    public int horas;
    public int minutos;
    public int segundos;

    public int modo;

    public Reloj() {
    }
    public Reloj(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public void setHoraMinuteSecond(int horas, int minutos, int segundos, int modo){
        if (modo==24) {
            if (horas >= 0 && horas <= 23) {
                this.horas = horas;
            }
        } else if (modo==12) {
            if (horas>=1&&horas<=12){
                this.horas = horas;
            }
        }
        if (minutos>=0&&minutos<60){
            this.minutos=minutos;
        }
        if (segundos>=0&&segundos<60){
            this.segundos=segundos;
        }
    }

    public void gethora(){
        System.out.println(toString());
    }

    public String toString(){
        return horas+":"+minutos+":"+segundos;
    }


}
