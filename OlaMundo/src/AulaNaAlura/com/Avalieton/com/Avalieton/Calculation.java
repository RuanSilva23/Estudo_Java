package AulaNaAlura.com.Avalieton.com.Avalieton;

import AulaNaAlura.com.Avalieton.Modelos.Filme;

public class Calculation {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
}
