package Pac3_String;

import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String mensaje){
        StringBuilder mensajencryptado= new StringBuilder();
        for (int i = 0;i<mensaje.length();i++){
            int letranum=mensaje.charAt(i);
            if (letranum<=90&&letranum>=65||letranum>=97&&letranum<=122||letranum>=48&&letranum<=57) {
                if (letranum == 90) {
                    letranum = 65;
                } else if (letranum == 122) {
                    letranum = 97;
                } else if (letranum == 57) {
                    letranum = 48;
                } else {
                    letranum++;
                }
            }
            char letra=(char)letranum;
            mensajencryptado.append(letra);
        }
        return mensajencryptado.toString();
    }

    public static String decrypt(String mensajencryptado){
        StringBuilder mensajedesencryptado= new StringBuilder();
        for (int i = 0;i<mensajencryptado.length();i++){
            int letranum=mensajencryptado.charAt(i);
            if (letranum<=90&&letranum>=65||letranum>=97&&letranum<=122||letranum>=48&&letranum<=57) {
                if (letranum==65){
                    letranum=90;
                } else if (letranum==97) {
                    letranum=122;
                } else if (letranum==48) {
                    letranum=57;
                } else {
                    letranum--;
                }
            }
            char letra=(char)letranum;
            mensajedesencryptado.append(letra);
        }
        return mensajedesencryptado.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el mensaje");
        String mensaje = in.nextLine();
        String encriptado=encrypt(mensaje);
        String desencriptado=decrypt(encriptado);
        System.out.println(encriptado);
        System.out.println(desencriptado);
    }
}
