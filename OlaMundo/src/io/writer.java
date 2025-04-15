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
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
