/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

import java.util.ArrayList;

/**
 *Classe que guarda as paletes criadas.
 * @author Mac
 */
public class Contentor {
    
    /**
     * Lista com as paletes a serem guardadas no contentor.
     */
    private ArrayList<Palete> paletes = new ArrayList<Palete>();
    
    public Contentor() {
        
    }
    
    public void addPalete(Palete pal) {
        paletes.add(pal);
    }
    
}
