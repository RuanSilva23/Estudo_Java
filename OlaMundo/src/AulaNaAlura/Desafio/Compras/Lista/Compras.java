package AulaNaAlura.Desafio.Compras.Lista;

<<<<<<< HEAD
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
=======
public class Compras implements Comparable<Compras>{
    private String nomes;
    private double valor;

    public Compras(String nome, double valor) {
        this.nomes = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nomes;
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
    }

    public double getValor() {
        return valor;
    }

<<<<<<< HEAD
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
=======
    @Override
    public String toString() {
        return "Compra: " +
                "Descrição: " + nomes +
                "Valor: " + valor;
    }

    @Override
    public int compareTo(Compras valor2) {
>>>>>>> ce8c5de2ab440f918d7dc8107618b1a8efa7cad8
        return Double.valueOf(this.valor).compareTo(Double.valueOf(valor2.valor));
    }
}
