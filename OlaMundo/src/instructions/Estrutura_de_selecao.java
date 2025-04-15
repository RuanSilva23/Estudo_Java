package instructions;

import java.lang.classfile.instruction.SwitchCase;

public class Estrutura_de_selecao {
    public static void main(String [] args){
        int semana = 7;

        System.out.println("Qual dia é da semana: ");

        switch (semana) {
            case 1: {
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda-feira");
                break;
            }
            case 3: {
                System.out.println("Terça-feira");
                break;
            }
            case 4: {
                System.out.println("Quarta-feira");
                break;
            }
            case 5: {
                System.out.println("Quita-feira");
                break;
            }
            case 6: {
                System.out.println("Sexta-feira");
                break;
            }
            case 7: {
                System.out.println("Sabado");
                break;
            }
        }
    }
}
