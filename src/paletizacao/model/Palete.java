/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

import java.util.ArrayList;

/**
 *
 * @author Mac
 */
public class Palete {
    
    /**
     * Lista dos artigos que vao levar a palete.
     */
    private ArrayList<ArtigoSimplificado> listaArtigos;
    
    /**
     * Constructor vazio de uma palete. Inicializa a lisra de artigos 
     * simplificados.
     */
    public Palete() {
        listaArtigos = new ArrayList<>();
    }
    
    /**
     * Método que permite adicionar novos artigos a palete.
     * @param art, artigo a adicionar a palete. 
     */
    public void addArtigoSimplificado(ArtigoSimplificado art) {
        this.listaArtigos.add(art);
    }
    
    
    
}
