package com.mastersoft.fabricaEquipamentos.estabelecimento;

import com.mastersoft.fabricaEquipamentos.equipamentos.copiadora.Copiadora;
import com.mastersoft.fabricaEquipamentos.equipamentos.copiadora.Xerox;
import com.mastersoft.fabricaEquipamentos.equipamentos.digitalizadora.Digitalizadora;
import com.mastersoft.fabricaEquipamentos.equipamentos.digitalizadora.Scanner;
import com.mastersoft.fabricaEquipamentos.equipamentos.equipamentoMultifuncional.EquipamentoMultifuncional;
import com.mastersoft.fabricaEquipamentos.equipamentos.impressora.Deskjet;
import com.mastersoft.fabricaEquipamentos.equipamentos.impressora.Impressora;

public class Fabrica {

    public static void main(String [] args)
    {
        Impressora i = new Deskjet();
        i.imprimir();

        Copiadora c = new Xerox();
        c.copiar();

        Digitalizadora d = new Scanner();
        d.digitalizar();

        EquipamentoMultifuncional eq = new EquipamentoMultifuncional();
        eq.copiar();
        eq.digitalizar();
        eq.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora i2 = em;
        Copiadora c2 = em;
        Digitalizadora d2 = em;
        i2.imprimir();
        c2.copiar();
        d2.digitalizar();
    }
    
}
