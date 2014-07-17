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
public class Palete {
    
    private double altura;
     
    private double comprimento;
    
    private double profundidade;
    
    private String tipoPalete;

    Palete() {
    }
    
    Palete(double alt,double cmp, double prf, String tipo) {
        this.altura=alt;
        this.comprimento = cmp;
        this.profundidade = prf;
        this.tipoPalete = tipo;
    }
    
}
