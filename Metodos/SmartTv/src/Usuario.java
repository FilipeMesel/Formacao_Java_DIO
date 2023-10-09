public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Ligada ? " + smartTv.ligada);
        System.out.println("Novo Status -> Volume " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal " + smartTv.canal);
        smartTv.mudarCanal(27);
        System.out.println("Novo Status -> Canal " + smartTv.canal);
    }
}
