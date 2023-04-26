public class Consulta {
    public void saldoMio(float s){
        System.out.println("Tu saldo actual es de $" + s + " mexicanos");
    }

    public void personas(float sLuis,float sAlberto){
        System.out.println("Num. cuenta: 1 Nombre: Luis Hernandez Saldo actual: $" + sLuis);
        System.out.println("Num. cuenta: 2 Nombre: Alberto Ramirez Saldo actual: $" + sAlberto);
    }

    public void saldoTodos(float s,float sLuis,float sAlberto){
        System.out.println("Tu saldo actual es de $" + s + " mexicanos");
        System.out.println("El saldo de Luis Hernandez es de $" + sLuis);
        System.out.println("El saldo de Alberto ramirez es de $" + sAlberto);
    }
}
