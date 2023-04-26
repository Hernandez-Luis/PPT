import java.util.Scanner;

public class Operaciones {
    Scanner scanner = new Scanner(System.in);
    public void op(){

        Accion accion = new Accion();
        Desicion desicion = new Desicion();
        Validacion validacion = new Validacion();

        int ganadas=0,pierde=0,empate=0;

        int x=0;
        while (x!=2){
            x=validacion.compara(desicion.escoge(accion.pregunta(scanner)));
            if(x==1) ganadas = ganadas + 1;
            else if (x==0) pierde = pierde + 1;
            else empate = empate + 1;
            System.out.println("Continuar (1) o Salir (2):");
            x = scanner.nextInt();
        }
        System.out.println("Ganaste " + ganadas + " veces, perdiste " + pierde + " y empataste " + empate + " veces");
    }
}
