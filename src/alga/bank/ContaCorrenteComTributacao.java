package alga.bank;

import javabank.Conta;
import javabank.ContaCorrente;

public class ContaCorrenteComTributacao extends ContaCorrente {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, Conta conta) {
        super.transferir(valor, conta);
    }
}
