/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 * Representa um contentor.
 * Utilizado para saber o volume de espaco maximo a utilizar.
 * @author Mac
 */
public class Contentor {
    
    /**Nome do contentor */
    private String descricao;
    
    /**Altura de um contento em mm*/
    private double altura;
    
    /**Comprimento de um contentor em mm */
    private double comprimento;
    
    /** largura de um contentor em mm */
    private double largura;

    /**
     * Cria um novo contentor.
     */
    public Contentor() {
        this.altura=0.0;
        this.comprimento = 0.0;
        this.largura = 0.0;
    }
    
    /**
     *  Cria um novo contentor.
     * @param des nome do contentor
     * @param cmp altura de um contentor em mm
     * @param lg comprimento do contentor em mm
     * @param alt larguram do contentor em mm
     */
    public Contentor(String des,double cmp,double lg, double alt) {
        this.descricao = des;
        this.altura=alt;
        this.comprimento = cmp;
        this.largura = lg;
    }
    
    /**
     * Metodo que calcula o volume do contentor em m3
     * @return vol em m3
     */
    public double getVolume() {
        return comprimento*largura*altura/1000000000;
    }
    
    public String imprimeMedidas() {
        return "Altura: "+this.altura/1000+
               "\nComprimento: "+this.comprimento/1000+
               "\nLargura: "+this.largura/1000;
    }
    
    public String toString() {
        return this.descricao;
    }
    
}
