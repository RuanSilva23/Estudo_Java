package DesafioNaAlura;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Angela", 51);
        Pessoa pessoa2 = new Pessoa("Ruan", 22);
        Pessoa pessoa3 = new Pessoa("Maria Luisa", 16);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho da lista: " + listaDePessoas.size());
        System.out.println("A primeira pessoa: " + listaDePessoas.getFirst().getNome());
        System.out.println();
        System.out.println("As pessoas da lista: " + listaDePessoas);
    }
}
