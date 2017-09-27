package com.br.solid.baixoacoplamento;

import com.br.solid.baixoacoplamento.domain.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
