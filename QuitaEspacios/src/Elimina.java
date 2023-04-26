import java.util.Scanner;

public class Elimina {
    public String quitar(Scanner scanner) {
        System.out.print("Ingresa un mensaje: ");
        String mensaje = scanner.nextLine();

        String nuevoMensaje = "";

        for (int i = 0; i < mensaje.length(); i++) {
            if(mensaje.charAt(i) != ' '){
                nuevoMensaje += mensaje.charAt(i);
            }
        }
        return nuevoMensaje;
    }

