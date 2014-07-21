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
public class Mercado {
    
    /**Codigo que identifica o mercado*/
    private String codigo;
    
    /**Descricao do mercado*/
    private String descricao;
    
    /**Lista com todos os artigos*/
    private ArrayList<Artigo> artigos = new ArrayList<Artigo>();
    
    public Mercado(String codigo, String descricao, ArrayList<Artigo> lista) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.artigos = lista;
    }
    
    public Mercado(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public void addArtigo(Artigo art) {
        artigos.add(art);
    }
    
    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }    
    public String toString() {
        return descricao;
    }
}
