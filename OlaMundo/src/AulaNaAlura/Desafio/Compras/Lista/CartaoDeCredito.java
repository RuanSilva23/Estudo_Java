package AulaNaAlura.Desafio.Compras.Lista;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
<<<<<<< HEAD
    private double limiteDoCartao;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldo = limiteDoCartao;
=======
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
        this.compras = new ArrayList<>();
    }

    public boolean lancamento(Compras compras){
        if (this.saldo >= compras.getValor()){
<<<<<<< HEAD
            this.saldo-=compras.getValor();
=======
            this.saldo -= compras.getValor();
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
            this.compras.add(compras);
            return true;
        }else {
            return false;
        }
<<<<<<< HEAD

    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
=======
    }

    public double getLimite() {
        return limite;
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
    }

    public double getSaldo() {
        return saldo;
    }

<<<<<<< HEAD
=======

>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
    public List<Compras> getCompras() {
        return compras;
    }

    public void setCompras(List<Compras> compras) {
        this.compras = compras;
    }


}
