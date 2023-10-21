package com.mastersoft.fabricaEquipamentos.equipamentos.equipamentoMultifuncional;

import com.mastersoft.fabricaEquipamentos.equipamentos.copiadora.Copiadora;
import com.mastersoft.fabricaEquipamentos.equipamentos.digitalizadora.Digitalizadora;
import com.mastersoft.fabricaEquipamentos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("EQUIPAMENTO MULTIFUNCIONAL DIGITALIZANDO");
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("EQUIPAMENTO MULTIFUNCIONAL IMPRIMINDO");
    }

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("EQUIPAMENTO MULTIFUNCIONAL COPIANDO");
    }
    
}
