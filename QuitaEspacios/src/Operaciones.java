import java.util.Scanner;

public class Operaciones {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Elimina elimina = new Elimina();
        Mostrar mostrar = new Mostrar();

        mostrar.muestra(elimina.quitar(scanner));

    }
}