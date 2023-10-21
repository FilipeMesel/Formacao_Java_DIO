package com.mastersoft.redeSocial.service;

public abstract class ServicoMenssagemInstantanea {

    public abstract void enviarMenssagem();

    public abstract void receberMenssagem();

    //Somente os filhos e classes do mesmo pacote conhecem esse método
    protected void validarConectadoInternet()
    {
        System.out.println("INTERNET OK");
    }
    
}
