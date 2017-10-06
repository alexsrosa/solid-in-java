package com.br.solid.cdianddip;

public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeEntrega entrega;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {

        this.tabela = tabela;
        this.entrega = entrega;
    }

    public double calcula(Compra produto) {
        tabela = new TabelaDePrecoPadrao();
        entrega = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
