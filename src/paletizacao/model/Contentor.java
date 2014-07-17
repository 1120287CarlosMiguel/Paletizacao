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
public class Contentor {
    
    private double altura;
    
    private double comprimento;
    
    private double profundidade;
    
    private double margemCarga;

    Contentor() {
    }
    
    Contentor(double alt,double cmp, double prf, double mC) {
        this.altura=alt;
        this.comprimento = cmp;
        this.profundidade = prf;
        this.margemCarga = mC;
    }
    
    
    
}
