package com.mastersoft.redeSocial;

import com.mastersoft.redeSocial.service.FaceboockMenssager;
import com.mastersoft.redeSocial.service.InstagramMenssager;
import com.mastersoft.redeSocial.service.MSNMenssager;
import com.mastersoft.redeSocial.service.ServicoMenssagemInstantanea;

public class ComputadorPedrinho {
    /**
     * @param args
     */
    public static void main(String [] args)
    {
        ServicoMenssagemInstantanea service = null;

        String smi = "fcb";
        if(smi.equals("msn"))
        {
            service = new MSNMenssager();
        }else if(smi.equals("instagram"))
        {
            service = new InstagramMenssager();
        }else if(smi.equals("fcb"))
        {
            service = new FaceboockMenssager();
        }
        service.enviarMenssagem();
        service.receberMenssagem();
    }
}
