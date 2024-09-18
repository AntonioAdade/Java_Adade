public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual canal? " + smartTv.canal);
        System.out.println("Qual volume? " + smartTv.volume);

        
        smartTv.ligar ();
        System.out.println("Novo status: Tv ligada? " + smartTv.ligada);
        
        smartTv.desligar ();
        System.out.println("Novo status: Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual " + smartTv.volume);

        System.out.println("Qual canal? " + smartTv.canal);
        smartTv.definirCanal(25);
        System.out.println("Novo canal? " + smartTv.canal);




    }
}
