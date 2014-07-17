/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 * @author Mac
 */
public class Palete {
    
    /**Altura da palete */
    private double altura;
     
    /**Comprimento da Palete */
    private double comprimento;
    
    /**Largura da palete*/
    private double largura;
    
    /**Tipo de palete a usar */
    private String tipoPalete;

    /**
     * Cria uma nova palete.
     */
    public Palete() {
        altura = 0.0;
        comprimento = 0.0;
        largura = 0.0;
        tipoPalete = "";
    }
    
    /**
     * Cria uma nova palete.
     * @param alt altura da palete
     * @param cmp comprimento da palete
     * @param lg largura da palete
     * @param tipo tipo de palete a ser usada
     */ 
    public Palete(double alt,double cmp, double lg, String tipo) {
        this.altura=alt;
        this.comprimento = cmp;
        this.largura = lg;
        this.tipoPalete = tipo;
    }
    
}
