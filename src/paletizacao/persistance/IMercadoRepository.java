/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance;

import java.util.List;
import paletizacao.model.Artigo;
import paletizacao.model.Mercado;

/**
 * Interface a ser usada por repositorio de artigos.
 * @author Mac
 */
public interface IMercadoRepository {
    
    /**
     * Metodo para receber os artigos existentes.
     * @return lista com artigos
     */
    public List<Mercado> getAll();
    
    /**
     * Metodo que permite adicionar novos artigos ao repositorio.
     * @param art artigo a ser adicionado na lista
     * @return true se for adicionado, false se nao for adicionado
     */
    public boolean add(Mercado mc);
    
}
