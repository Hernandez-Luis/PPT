public class Desicion {
    public int escoge(String dato){
        int num=0;
        if(dato.equals("Piedra")){
            num=1;
        } else if (dato.equals("Papel")) {
            num=2;
        }else num=3;
        return num;
    }
}
