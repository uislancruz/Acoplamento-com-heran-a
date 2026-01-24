package alga.bank;

import javabank.Conta;

import java.util.Objects;

public abstract class ContaBaseDecorator implements Conta{

    private Conta contaOriginal;

    public ContaBaseDecorator(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    public void aplicarInvestimento(double valor) {
        contaOriginal.aplicarInvestimento(valor);
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    public void transferir(double valor, Conta conta) {
        contaOriginal.transferir(valor, conta);
    }

    @Override
    public void imprimirSaldo() {
        contaOriginal.imprimirSaldo();
    }
}
