import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Retirar implements Retorna{

    public float retiraQuien(float quien,float cuanto){
        if(cuanto>quien){
            System.out.println("No tienes suficiente dinero para poder transferir");
        }else {
            return quien - cuanto;
        }
        return quien;
    }

    @Override
    public float dinero(float s, Scanner scanner) {
        float resta=0;

        System.out.println("Ingresa la cantidad que deseas retirar: ");
        resta = Float.parseFloat(scanner.next());

        if(resta>s){
            System.out.println("No tienes suficiente dinero para retirar");
        }else {
            return s - resta;
        }
        return s;
    }
}




/*
    public float dinero(float s, Scanner scanner){
        float resta=0;

        System.out.println("Ingresa la cantidad que deseas retirar: ");
        resta = Float.parseFloat(scanner.next());

        if(resta>s){
            System.out.println("No tienes suficiente dinero para retirar");
        }else {
            return s - resta;
        }
        return s;
    }*/
