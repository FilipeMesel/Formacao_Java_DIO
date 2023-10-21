package com.mastersoft.redeSocial.service;

public class FaceboockMenssager extends ServicoMenssagemInstantanea{

    @Override
    public void enviarMenssagem()
        {
            validarConectadoInternet();
            System.out.println("ENVIAR MSGS VIA FACEBOOK");
            salvarHistoricoMenssagem();
        }

    @Override
    public void receberMenssagem()
    {
        validarConectadoInternet();
        System.out.println("MSGS RECEBIDA");
        salvarHistoricoMenssagem();
    }

    private void salvarHistoricoMenssagem()
    {
        System.out.println("SALVANDO O HISTÓRICO DE MENSSAGEM");
    }
    
}
