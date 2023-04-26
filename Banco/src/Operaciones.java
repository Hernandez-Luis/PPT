import java.util.Scanner;

public class Operaciones {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Menus menus = new Menus();
        Consulta consulta = new Consulta();
        Deposita deposita = new Deposita();
        Retirar retirar = new Retirar();
        Mensajes mensajes = new Mensajes();

        float s = 0;
        float sLuis = 0;
        float sAlberto = 0;
        float cuanto = 0;
        int quien = 0;

        int x=0;

        while (x!=6){
            x = menus.menu(scanner);
            switch (x){
                case 1:
                    consulta.saldoMio(s);
                    break;
                case 2:
                    s = deposita.dinero(s,scanner);
                    break;
                case 3:
                    s = retirar.dinero(s,scanner);
                    break;
                case 4:
                    consulta.personas(sLuis,sAlberto);
                    quien = mensajes.quien(scanner);
                    cuanto = mensajes.pregunta(scanner);

                    if(quien == 1) {
                        if(cuanto<=s) sLuis = deposita.depositaQuien(sLuis,cuanto);
                        s = retirar.retiraQuien(s,cuanto);
                    }
                    else {
                        if(cuanto<=s) sAlberto = deposita.depositaQuien(sAlberto,cuanto);
                        s = retirar.retiraQuien(s,cuanto);
                    }
                    break;
                case 5:
                    consulta.saldoTodos(s,sLuis,sAlberto);
                    break;
                case 6:
                    System.out.println("- - Saliste del programa - -");
                    break;
            }
        }
    }
}
