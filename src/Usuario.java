public class Usuario {
    public static void main(String[]args)throws Exception{

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;
        System.out.println("Volume Atual :" +smartTv.volume);

        System.out.println("A TV Ligada?" + smartTv.ligada);
        System.out.println("Volume Atual?" + smartTv.volume);
        System.out.println("Assistindo o Canal?" + smartTv.canal);

        smartTv.ligarTv();
        System.out.println("Novo Status -> TV Ligada?" + smartTv.ligada);

    }
}
