import java.util.Scanner;

public class Menus {
    public int menu(Scanner scanner){
        System.out.println("- - M E N U - -");
        System.out.println("1.- Consultar mi saldo");
        System.out.println("2.- Depositar dinero");
        System.out.println("3.- Retirar dinero");
        System.out.println("4.- Transferir dinero");
        System.out.println("5.- Consultar saldo de todos");
        System.out.println("6.- Salir");
        return scanner.nextInt();
    }
}
