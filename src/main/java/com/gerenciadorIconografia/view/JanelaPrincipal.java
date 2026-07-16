package com.gerenciadorIconografia.view;
import javax.swing.*;
import java.awt.*;

/*
 * Janela principal está dividida entre a barra de navegação e um painel com a tela
 * selecionada na navegação.
 */

public class JanelaPrincipal extends JFrame {
    private JPanel painelAtual;
    public JanelaPrincipal() {
        setTitle("Gerenciador de Iconografia");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());
        this.add(new BarraNavegacao(), BorderLayout.WEST);

        painelAtual = new EditorTexto();
        this.add(painelAtual, BorderLayout.CENTER);
    }

    public void setPainel(JPanel novoPainel) {
        this.remove(painelAtual);
        painelAtual = novoPainel;
        this.add(painelAtual);
        this.revalidate();
        this.repaint();
    }
}
