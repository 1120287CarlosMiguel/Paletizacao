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
public class TipoPalete {
    
   /** Atributo que guarda o tipo de TipoPalete */ 
   private DescricaoPalete tipo;
   
   /**Atributo que guarda a altura da palete em m*/
   private double altura;
   
   /**
    * Cria uma nova palete.
    * @param tipo, nome do tipo de palete
    * @param alt, altura da palete em m
    */
   public TipoPalete(DescricaoPalete tipo, double alt) {
       this.tipo = tipo;
       this.altura = alt;
   }
   
   /**
    * Método que retorna a altura da palete
    * @return double, altura da palete em m
    */
   public double getAltura() {
       return this.altura;
   }
   
   public String toString() {
       return tipo.toString();
   }
    
}
