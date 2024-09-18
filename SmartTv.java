public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo o volume para " + volume);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("diminuindo canal para " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("diminuindo canal para " + canal);
    }

    public void definirCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Selecionando canal " + canal);
    }






}