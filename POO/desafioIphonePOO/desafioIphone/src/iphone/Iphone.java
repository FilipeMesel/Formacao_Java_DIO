package iphone;

import navegadorInternet.INavegadorInternet;
import telefone.ITelefone;
import tocadorMusical.ITocadorMusical;

public class Iphone implements INavegadorInternet, ITelefone, ITocadorMusical {

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("TOCANDO MUSICA PELO IPHONE");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("PAUSANDO A MUSICA PELO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("SELECIONANDO UMA MUSICA");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("TELEFONANDO PARA ALGUEM...");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("ATENDENDO O TELEFONEMA");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        // TODO Auto-generated method stub
        System.out.println("INICIANDO O CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("EXIBINDO UMA PÁGINA NO SAFARI");
    }

    @Override
    public void dicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("ADD NOVA ABA NO SAFARI");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("ATUALIZANDO A PÁGINA WEB PELO SAFARI");
    }
    
}
