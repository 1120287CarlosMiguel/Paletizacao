/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 *Classe que representa uma palete Industrial de um determinado artigo.
 * @author Mac
 */
public class PaleteIndustrialArtigo extends PaleteArtigo {
    
    /**
     * Metodo que cria uma nova distribuicao de um artigo no tipo Industrial(Descricao de palete
     * inicializado automaticamente)
     * @param c, numero de caixas por fiada
     * @param f, numero de fiadas por palete
     */
    public PaleteIndustrialArtigo(int c, int f) {
        super(DescricaoPalete.PAL_INDUSTRIALRF20, c, f);
    }
    
}
