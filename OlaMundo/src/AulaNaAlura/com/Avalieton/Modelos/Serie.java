package AulaNaAlura.com.Avalieton.Modelos;

import AulaNaAlura.com.Avalieton.com.calculo.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int duracaoPorEpisodio;
    private int episodiosPorTemporada;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }

    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * duracaoPorEpisodio;
    }

    public int getClassificacao(){
        return 0;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
