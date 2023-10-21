import iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone dozeProMax = new Iphone();

        System.out.println("Telefone...");
        dozeProMax.ligar();
        dozeProMax.atender();
        dozeProMax.iniciarCorreioDeVoz();

        System.out.println("Navegador...");
        dozeProMax.exibirPagina();
        dozeProMax.atualizarPagina();
        dozeProMax.dicionarNovaAba();

        System.out.println("Tocador musical...");
        dozeProMax.selecionarMusica();
        dozeProMax.tocar();
        dozeProMax.pausar();
    }
}
