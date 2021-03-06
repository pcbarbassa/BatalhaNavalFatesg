/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.navio;

import java.util.ArrayList;

/**
 *
 * @author diogo
 */
public class Destroyer implements Navio {

    private ArrayList<Integer> destroyer = new ArrayList<Integer>();
    private int qtdDestroyer;
    private String descricao = "Destroyer";
    private int pontos = 10;

    @Override
    public void adicionarNavio(int posicao) {
        destroyer.add(posicao);
    }

    @Override
    public ArrayList<Integer> retornaNavio() {
        return destroyer;
    }

    @Override
    public void setQtdNavio(int qtd) {
        qtdDestroyer = qtd;
    }

    @Override
    public int getQtdNavio() {
        return qtdDestroyer;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public int pontoNavio() {
        return pontos;
    }

    @Override
    public int removeNavio(int posicao) {
        qtdDestroyer--;
        return destroyer.remove(destroyer.indexOf(posicao));
    }

}
