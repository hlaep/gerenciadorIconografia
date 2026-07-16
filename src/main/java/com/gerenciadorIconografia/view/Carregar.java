package com.gerenciadorIconografia.view;

import javax.swing.*;

public class Carregar {
    private static Icon getIcone(String url) {
        java.net.URL urlImagem = Carregar.class.getResource(url);

        if(urlImagem == null) {
            System.err.println("Erro: não foi possível encontrar imagem: " + url);
            return null;
        }

        return new ImageIcon(urlImagem);
    }

    public static Icon[] getIconesNavegacao() {
        return new Icon[] {
                getIcone("/editor-de-texto.png"),
                getIcone("/vocabulario.png"),
                getIcone("/adicionar-palavra.png")
        };
    }

}
