public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    /**Função para mudar de canal
     * 
     */
    public void mudarCanal(int novoCanal)
    {
        canal = novoCanal;
    }

    /**Função para aumentar canal
     * 
     */
    public void aumentarCanal()
    {
        canal++;
    }

    /**Função para diminuir canal
     * 
     */
    public void diminuirCanal()
    {
        canal--;
    }

    /**
     * Função que aumenta o volume da tv
     */
    public void aumentarVolume()
    {
        volume++;
    }

    /**
     * Função para diminuir o volume
     */
    public void diminuirVolume()
    {
        volume--;
    }

    /**
     * Método para ligar a tv
     */
    public void ligar()
    {
        ligada = true;
    }

    /**
     * Desligar a tv
     */
    public void desligar()
    {
        ligada = false;
    }

}
