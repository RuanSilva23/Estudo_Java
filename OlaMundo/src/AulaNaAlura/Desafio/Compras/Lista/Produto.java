package AulaNaAlura.Desafio.Compras.Lista;

public class Produto {
    private String nome;
    private double valor;
    private double limiteDoCartao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double limiteDoCartao(double valor){
        limiteDoCartao -= valor;

        return valor;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }
}
