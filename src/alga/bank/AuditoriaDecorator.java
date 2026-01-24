package alga.bank;

import javabank.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator {

    private int quantidadeOperacao;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeOperacao() {
        return quantidadeOperacao;
    }

    @Override
    public void sacar(double valor) {
        quantidadeOperacao++;
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantidadeOperacao++;
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, Conta conta) {
        quantidadeOperacao++;
        super.transferir(valor, conta);
    }

    @Override
    public void aplicarInvestimento(double valor) {
        quantidadeOperacao++;
        getContaOriginal().aplicarInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {
        quantidadeOperacao++;
        getContaOriginal().imprimirSaldo();
    }
}
