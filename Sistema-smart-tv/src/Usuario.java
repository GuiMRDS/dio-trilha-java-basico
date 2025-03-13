public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminirVolume();
        smartTv.diminirVolume();
        smartTv.diminirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        

        smartTv.ligar ();
        System.out.println("Novo sStatus Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo sStatus Tv ligada ? " + smartTv.ligada);
    }
}
