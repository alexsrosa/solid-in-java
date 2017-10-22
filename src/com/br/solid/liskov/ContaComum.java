package com.br.solid.liskov;

public class ContaComum implements Conta{

    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaComum() {
        manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor){
        this.manipuladorDeSaldo.deposita(valor);
    }

    public void saca(double valor){
        this.manipuladorDeSaldo.saca(valor);
    }

    @Override
    public void executaRegrasAdicionais() {
        this.rende();
    }

    public void rende() {
        this.manipuladorDeSaldo.rende(0.01);
    }

    public double getSaldo() {
        return this.manipuladorDeSaldo.getSaldo();
    }
}
