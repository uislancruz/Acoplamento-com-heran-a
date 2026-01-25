package alga;

import alga.com.loja.CartaoCredito;
import alga.com.loja.MetodoPagamento;

public class PrincipalLoja {
    static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new CartaoCredito("123123123");

        carrinho.finalizar(metodoPagamento);
    }
}
