package com.br.solid.baixoacoplamento;

import com.br.solid.baixoacoplamento.domain.NotaFiscal;

public interface AcaoAposGerarNota {

    public void executa(NotaFiscal notaFiscal);
}
