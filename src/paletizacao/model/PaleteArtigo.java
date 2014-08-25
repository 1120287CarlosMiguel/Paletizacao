/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;


/**
 * Representa a distribuicao do artigo num determinado tipo de palete.
 * @author Mac
 */
public abstract class PaleteArtigo {
    
     /**Tipo de palete da distribuicao*/
     private DescricaoPalete palete;

     /**Numero de caixas por cada fiada(camada)*/
     private int cxFiada;
     
     /**Numero de fiadas por palete*/
     private int fiadaPal;
     
    /**
     * Cria uma nova palete.
     */
    public PaleteArtigo() {
        
    }
    
    /**
     * 
     * @param t tipo de palete a criar
     * @param c numero de caixas por cada fiada
     * @param f numero de fiadas por palete
     */
    public PaleteArtigo(DescricaoPalete t, int c, int f) {
        this.palete = t;
        this.cxFiada = c;
        this.fiadaPal = f;
    }
    
    /**
     * 
     * @return int, com o numero de caixas a ser guardado por cada palete.
     */
    public int getCaixasPorPalete() {
        return this.cxFiada * this.fiadaPal;
    }
     
}
