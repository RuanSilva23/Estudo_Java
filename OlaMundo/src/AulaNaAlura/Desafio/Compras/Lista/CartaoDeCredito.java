package AulaNaAlura.Desafio.Compras.Lista;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldo = limiteDoCartao;
        this.compras = new ArrayList<>();
    }

    public boolean lancamento(Compras compras){
        if (this.saldo >= compras.getValor()){
            this.saldo-=compras.getValor();
            this.compras.add(compras);
            return true;
        }else {
            return false;
        }

    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void setCompras(List<Compras> compras) {
        this.compras = compras;
    }


}
