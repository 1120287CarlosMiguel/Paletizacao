/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 *
 * @author Mac
 */
public class Artigo {
    
    private String codArtigo;
    
    private Caixa tipoCaixa;
    
    private int numFieiras;

    Artigo() {
    }
    
    Artigo(String cod, Caixa tipo, int numF) {
        this.codArtigo = cod;
        this.tipoCaixa = tipo;
        this.numFieiras = numF;
    }
    
}
