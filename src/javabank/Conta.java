package javabank;

public interface Conta {

    double getSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta conta);

    void aplicarInvestimento(double valor);

    default void imprimirSaldo(){
        System.out.printf("Seu saldo é de R$%.2f%n", this.getSaldo());
    }
}
