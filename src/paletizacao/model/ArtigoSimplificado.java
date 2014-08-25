/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 * Classe que representa um artigo mas apenas com o seu nome.
 * @author Mac
 */
public class ArtigoSimplificado {
    
    /**
     * Nome do artigo que representa.
     */
    private String nome;
    
    /**
     * Constructor de um artigo simplificado.
     * @param art, Artigo para poder atribuir o nome do artigo a varivel nome. 
     */
    public ArtigoSimplificado(Artigo art) {
        this.nome = art.getNomeArtigo();
    }
    
}
