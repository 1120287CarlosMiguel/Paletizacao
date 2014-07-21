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
    
    /** altura da caixa em metros*/
    private double altura;
    
    /** comprimento da caixa em metros*/
    private double comprimento;
    
    /** largura da caixa em metros*/
    private double largura;
    
    /**peso da cauxa em kg*/
    private double peso;

    /** Cria uma nova caixa. */
    public Caixa() {
    }
    
    /**
     * Cria uma nova caixa.
     * @param alt altura da caixa
     * @param cmp comprimento da caixa
     * @param lg largura da caixa
     * @param cod codigo identificador da caixa
     * @param  kg peso da caixa
     */
    public Caixa(double alt,double cmp, double lg, String cod,double kg) {
        this.altura=alt;
        this.comprimento = cmp;
        this.largura = lg;
        this.codCaixa = cod;
        this.peso = kg;
    }
    
    /**
     * Metodo que calcula o volume da caixa.
     * @return volume da caixa em metros
     */
    public double getVolume() {
        return largura * comprimento * altura;
    }
    
    
}
