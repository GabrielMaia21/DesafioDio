package org.example.model;

import org.example.interfaces.AparelhoTelefonico;
import org.example.interfaces.Navegador;
import org.example.interfaces.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusica {

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

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Aba");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando......");
    }

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
