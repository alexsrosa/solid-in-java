package com.br.solid.liskov;

public class ContaDeEstudante implements Conta {

    private int milhas;
    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaDeEstudante(){
        manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public void saca(double valor){
        this.manipuladorDeSaldo.saca(valor);
    }

    @Override
    public void executaRegrasAdicionais() {

    }

    @Override
    public double getSaldo() {
        return this.manipuladorDeSaldo.getSaldo();
    }

    public int getMilhas() {
        return milhas;
    }

}
