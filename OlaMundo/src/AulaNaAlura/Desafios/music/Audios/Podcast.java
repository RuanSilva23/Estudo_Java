package AulaNaAlura.Desafios.music.Audios;

public class Podcast extends Audio{
    private String autor;
    private String tipoGenero;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public void exibirInformacoesPodcast(){
        System.out.println("Nome: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Duração: " + getDuracao() + " minutos.");
        System.out.println("Gênero: " + getTipoGenero());
        System.out.println("Curtidas: " + getCurtida());
        System.out.println("Reproduções: " + getTotalDeReproducao() );
    }

    @Override
    public int getClassification() {
        if (this.getCurtida()>800){
            return 10;
        }else {
            return 4;
        }
    }
}
