package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class writer {
    public static void main(String[] args){
        try(
                BufferedWriter writer = new BufferedWriter( new FileWriter("arquivo.txt"))){
            writer.write("Olá, Mundo!");
            writer.newLine();
            writer.write("Meu nome é Ruan Silva.");
            writer.newLine();
            writer.write("Eu sou um estudante de ADS na faculdade Descomplica" +
                    ", a qual estou no primeiro periodo e muito empolgado para terminar ");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
