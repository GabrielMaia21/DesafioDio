package org.example;

import org.example.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //iPHONE USANDO FUNÇÃO DO TELEFONE
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //IPHONE USANDO FUNÇÃO DO NAVEGADOR
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        //IPHONE USANDO FUNÇÃO REPRODUTOR DE MUSICA
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.pausar();



    }
}