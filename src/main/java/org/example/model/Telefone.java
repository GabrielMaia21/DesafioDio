package org.example.model;

import org.example.interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando.......");
    }

    @Override
    public void atender() {
        System.out.println("Recebendo ligação...");
        System.out.println("Atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}

