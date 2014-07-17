/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 * Representa o objecto caixa.
 * Permite calcular o valor do volume a ser ocupado pelo artigo
 * @author Mac
 */
public class Caixa {
    
    /** codigo que identifica a caixa */
    private String codCaixa;
    
    /** altura da caixa */
    private double altura;
    
    /** comprimento da caixa */
    private double comprimento;
    
    /** largura da caixa*/
    private double largura;

    /** Cria uma nova caixa. */
    public Caixa() {
    }
    
    /**
     * Cria uma nova caixa.
     * @param alt altura da caixa
     * @param cmp comprimento da caixa
     * @param lg largura da caixa
     * @param cod codigo identificador da caixa
     */
    public Caixa(double alt,double cmp, double lg, String cod) {
        this.altura=alt;
        this.comprimento = cmp;
        this.largura = lg;
        this.codCaixa = cod;
    }
    
    
    
}
