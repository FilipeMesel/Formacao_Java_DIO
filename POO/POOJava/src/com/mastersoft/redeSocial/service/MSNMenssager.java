package com.mastersoft.redeSocial.service;

public class MSNMenssager extends ServicoMenssagemInstantanea {

    @Override
    public void enviarMenssagem()
        {
            validarConectadoInternet();
            System.out.println("ENVIAR MSGS VIA MSN");
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
