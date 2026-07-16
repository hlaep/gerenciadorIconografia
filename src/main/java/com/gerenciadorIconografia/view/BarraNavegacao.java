package com.gerenciadorIconografia.view;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class BarraNavegacao extends JPanel {
    private void gerarBotoes() {
        Icon[] iconesBotoes = Carregar.getIconesNavegacao();

        for(Icon icone: iconesBotoes) {
            JButton botao = new JButton(icone);

            // Remove fundo e tracejado.
            botao.setContentAreaFilled(false);
            botao.setBorderPainted(false);
            botao.setFocusPainted(false);

            this.add(botao);

            // Adiciona uma lacuna entre os botões.
            this.add(Box.createVerticalStrut(5));
        }
    }

    public BarraNavegacao() {
        gerarBotoes();
        this.setBackground(new Color(40, 35, 45));
        MatteBorder bordaDireita = new MatteBorder(0, 0, 0, 1, Color.RED);
        this.setBorder(bordaDireita);

        // Muda para uma orientação vertical.
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
}


