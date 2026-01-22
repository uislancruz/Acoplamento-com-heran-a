package alga.bank;

import javabank.Conta;
import javabank.ContaCorrente;

public class Principal {

    static void main(String[] args) {
        PontuacaoDecorator pontuacao = new PontuacaoDecorator(new ContaCorrente());
        Conta conta1 = new TributacaoDecorator(pontuacao);
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.transferir(100, conta2);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
        System.out.println("Pontos da conta 1: " + pontuacao.getPontos());
    }


}
