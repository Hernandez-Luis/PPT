import java.util.Scanner;

public class Deposita implements Retorna{
    public float depositaQuien(float quien,float cuanto){
        return quien + cuanto;
    }
    @Override
    public float dinero(float s, Scanner scanner) {
        float agrega=0;
        System.out.println("Ingresa la cantidad que quieres depositar: ");
        agrega = Float.parseFloat(scanner.next());

        return s + agrega;
    }
}




/*
    public float dinero(float s, Scanner scanner){
        float agrega=0;
        System.out.println("Ingresa la cantidad que quieres depositar: ");
        agrega = Float.parseFloat(scanner.next());

        return s + agrega;
    }*/