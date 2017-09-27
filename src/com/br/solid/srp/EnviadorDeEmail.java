package com.br.solid.srp;

public class EnviadorDeEmail {

    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
