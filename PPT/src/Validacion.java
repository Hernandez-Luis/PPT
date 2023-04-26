public class Validacion {
    public int compara(int num){

        int v = (int) (Math.random() * 4);
        
        System.out.println(" vs ");
        if(v==1){
            System.out.println("Piedra\n");
        }else if (v==2){
            System.out.println("Papel\n");
        }else if(v==3){
            System.out.println("Tijera\n");
        }

        if(num==1 && v==3){
            System.out.println("GANA\n");
            return 1;
        }else if (num==3 && v==2){
            System.out.println("GANA\n");
            return 1;
        }else if(num==2 && v==1){
            System.out.println("GANA\n");
            return 1;
        } else if(num==3 && v==1){
            System.out.println("PIERDES\n");
            return 0;
        }else if (num==2 && v==3){
            System.out.println("PIERDES\n");
            return 0;
        }else if(num==1 && v==2){
            System.out.println("PIERDES\n");
            return 0;
        }else if(num==1 && v==1){
            System.out.println("EMPATE\n");
            return 4;
        }else if (num==2 && v==2){
            System.out.println("EMPATE\n");
            return 4;
        }else if(num==3 && v==3){
            System.out.println("EMPATE\n");
            return 4;
        }
        return 0;
    }
}
