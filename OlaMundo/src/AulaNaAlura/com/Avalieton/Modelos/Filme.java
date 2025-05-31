package AulaNaAlura.com.Avalieton.Modelos;

import AulaNaAlura.com.Avalieton.com.Avalieton.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)mediaAvalia()/2;
    }
}
