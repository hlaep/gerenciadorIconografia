package com.gerenciadorIconografia.control;

import com.gerenciadorIconografia.view.JanelaPrincipal;

public class JanelaControl {
    private final JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
    public JanelaControl() {
    }

    public void iniciar() {
        janelaPrincipal.setVisible(true);

    }
}
