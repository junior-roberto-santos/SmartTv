public class SmartTv {
    boolean ligada= false;
    int canal= 1;
    int volume= 25;

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void ligarTv(){
        ligada= true;

    }
    public void desligarTv(){
        ligada= false;

    }

}