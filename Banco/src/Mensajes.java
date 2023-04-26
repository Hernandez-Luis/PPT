import java.util.Scanner;

public class Mensajes {
    public float pregunta(Scanner scanner){
        System.out.println("Ingresa la cantidad que quieres transferir: ");
        return Float.parseFloat(scanner.next());
    }
    public int quien(Scanner scanner){
        System.out.println("Ingresa el numero de cuenta a quien le quieres transferir: ");
        return scanner.nextInt();
    }
}
