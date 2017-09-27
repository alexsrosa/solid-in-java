package com.br.solid.baixoacoplamento.dao;

import com.br.solid.baixoacoplamento.AcaoAposGerarNota;
import com.br.solid.baixoacoplamento.domain.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}