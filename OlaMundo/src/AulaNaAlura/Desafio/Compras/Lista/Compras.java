package AulaNaAlura.Desafio.Compras.Lista;

public class Compras implements Comparable<Compras> {
    private String nome;
    private double valor;
    private int dividiu;

    public Compras(String nome, double valor, int vezes) {
        this.nome = nome;
        this.valor = valor;
        this.dividiu = vezes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getDividiu() {
        return dividiu;
    }

    @Override
    public String toString() {
        return "Compras:" +
                "Descrição: " + nome +
                "Valor: " + valor +
                "Dividido em: " + dividiu
                ;
    }

    public int compareTo(Compras valor2){
        return Double.valueOf(this.valor).compareTo(Double.valueOf(valor2.valor));
    }
}
