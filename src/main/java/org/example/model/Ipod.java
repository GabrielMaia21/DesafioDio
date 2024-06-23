package org.example.model;

import org.example.interfaces.ReprodutorMusica;
public class Ipod implements ReprodutorMusica {


    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música.....");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }
}
