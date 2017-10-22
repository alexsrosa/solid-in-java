package com.br.solid.liskov;

public interface Conta {

    void deposita(double valor);
    void saca(double valor);
    void executaRegrasAdicionais();
    double getSaldo();
}
