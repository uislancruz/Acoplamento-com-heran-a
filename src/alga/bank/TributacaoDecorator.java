package alga.bank;

import javabank.Conta;


public class TributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    public TributacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void transferir(double valor, Conta conta) {
        getContaOriginal().transferir(valor, conta);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarInvestimento(double valor) {
        getContaOriginal().aplicarInvestimento(valor);
        debitarImpostoMovimentacao(valor);
    }

    private void debitarImpostoMovimentacao(double valorMovimentacao) {
        getContaOriginal().sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}

