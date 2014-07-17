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
public class Caixa {
    
    private String codCaixa;
    
    private double altura;
    
    private double comprimento;
    
    private double profundidade;

    Caixa() {
    }
    
    Caixa(double alt,double cmp, double prf, String cod) {
        this.altura=alt;
        this.comprimento = cmp;
        this.profundidade = prf;
        this.codCaixa = cod;
    }
    
    
    
}
