package AulaNaAlura.com.Avalieton.Modelos;

import AulaNaAlura.com.Avalieton.com.calculo.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizcoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeVisualizcoes() {
        return totalDeVisualizcoes;
    }

    public void setTotalDeVisualizcoes(int totalDeVisualizcoes) {
        this.totalDeVisualizcoes = totalDeVisualizcoes;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualizcoes>100){
            return 4;
        }else {
            return 2;
        }
    }
}
