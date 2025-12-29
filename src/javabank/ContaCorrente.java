package javabank;

public class ContaCorrente implements Conta{
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {this.saldo -= valor;}

    public void depositar(double valor) {this.saldo += valor;}

    public void transferir(double valor, Conta conta) {
        this.saldo -= valor;
        conta.depositar(valor);
    }
}
