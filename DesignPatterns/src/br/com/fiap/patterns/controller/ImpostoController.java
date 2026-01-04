package br.com.fiap.patterns.controller;

import br.com.fiap.patterns.model.Imposto;
import br.com.fiap.patterns.view.TelaImposto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImpostoController implements ActionListener {

    private Imposto model;
    private TelaImposto tela;

    @Override
    public void actionPerformed(ActionEvent e) {
        model.CalcularImposto(tela.getValor());
    }

    public ImpostoController(Imposto model, TelaImposto tela) {
        this.model = model;
        this.tela = tela;
    }

}
