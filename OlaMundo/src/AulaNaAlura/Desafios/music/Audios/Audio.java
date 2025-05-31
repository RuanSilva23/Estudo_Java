package AulaNaAlura.Desafios.music.Audios;

public class Audio {
    private String nome;
    private String genero;
    private int duracao;
    private int curtida;
    private int classification;
    private int totalDeReproducao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassification() {
        return classification;
    }


    public int getCurtida() {
        return curtida;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void curtir(){
        this.curtida++;
    }

    public void reproduzir(){
        this.totalDeReproducao++;
    }


}
