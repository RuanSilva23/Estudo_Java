package AulaNaAlura.Desafio.Compras.Lista;

public class Compras implements Comparable<Compras>{
    private String nomes;
    private double valor;

    public Compras(String nome, double valor) {
        this.nomes = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nomes;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "Descrição: " + nomes +
                "Valor: " + valor;
    }

    @Override
    public int compareTo(Compras valor2) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(valor2.valor));
    }
}
