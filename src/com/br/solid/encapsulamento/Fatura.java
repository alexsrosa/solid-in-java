package com.br.solid.encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.setPago();
    }

    private void setPago() {
        if (this.valorTotalDosPagamento() >= this.getValor()){
            this.pago = true;
        }
    }

    private double valorTotalDosPagamento() {
        double valor = 0;

        for (Pagamento pagamento : this.getPagamentos()) {
            valor += pagamento.getValor();

        }
        return valor;
    }
}
