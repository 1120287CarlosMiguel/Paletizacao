/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

import java.util.HashMap;
import java.util.Map;

/**
 *Classe para executar algoritmo de destribuicao de artigos por paletes.
 * @author Mac
 */
public class DistribuiContentor {
    
    /**Mapa de artigos com os artigos da encomenda a criar no contentor*/
    private MapaArtigos artigos;
    
    /**Tipo de contentor a ser usado para criar a encomenda*/
    private TipoContentor contentor;
    
    /**Tipo de palete a ser usada na paletizacao*/
    private TipoPalete palete;

    /**
     * 
     * @param artigos, mapa de artigos a fazer a distribuicao
     * @param contentor, tipo de contentor a fazer a distribuicao, para saber numero de paletes a usar
     * @param palete, tipo de palete a usar na distribuicao 
     */
    public DistribuiContentor(MapaArtigos artigos, TipoContentor contentor, TipoPalete palete) {
        this.artigos = artigos;
        this.contentor = contentor;
        this.palete = palete;
    }
    
    public void distribui() {
        
        HashMap<Artigo,Double> artigoCaixa = artigos.convertMapaQuantidade();
        
        for(Map.Entry<Artigo,Double> entry : artigoCaixa.entrySet()) {
            
            int numCaixasPalete = entry.getKey().getDistribuicao(this.palete).getCaixasPorPalete();
            
            double numPaletes = entry.getValue() / numCaixasPalete;
            
        }
    }
    
    
    
}
