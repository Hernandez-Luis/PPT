import java.util.Scanner;

public class Accion {
    public String pregunta(Scanner scanner){
        System.out.println("Piedra,Papel o Tijera?: ");
        return scanner.next();
    }
}
