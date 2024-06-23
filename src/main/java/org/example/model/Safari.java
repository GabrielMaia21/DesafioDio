package org.example.model;

import org.example.interfaces.Navegador;

public class Safari implements Navegador {

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
}
