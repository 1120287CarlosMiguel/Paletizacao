/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 *Classe que representa uma palete do tipo EuroPalete de um tipo de artigo.
 * @author Mac
 */
public class EuroPaleteArtigo extends PaleteArtigo {

    /**
     * Metodo que cria uma nova distribuicao de um artigo no tipo EuroPalete(Descricao de palete
     * inicializado automaticamente)
     * @param c, numero de caixas por fiada
     * @param f, numero de fiadas por palete
     */
    public EuroPaleteArtigo(int c, int f) {
        super(DescricaoPalete.EUROPALETE, c, f);
    }
    
}
