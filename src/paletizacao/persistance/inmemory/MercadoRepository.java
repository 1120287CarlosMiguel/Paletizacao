/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;
import paletizacao.model.Artigo;
import paletizacao.model.Mercado;
import paletizacao.persistance.IMercadoRepository;

/**
 * Repositorio de artigos.
 * Implementado de modo a haver apenas uma lista de artigos.
 * @author Mac
 */
public class MercadoRepository implements IMercadoRepository{
    
    /** lista de artigos */
    private static List<Mercado> mercados = new ArrayList<Mercado>();

     /**
     * Metodo para receber os artigos existentes.
     * @return lista com artigos
     */
    @Override
    public List<Mercado> getAll() {
        return mercados;
    }

    /**
     * Metodo que permite adicionar novos artigos ao repositorio.
     * @param art artigo a ser adicionado na lista
     * @return true se for adicionado, false se nao for adicionado
     */
    @Override
    public boolean add(Mercado mc) {
        mercados.add(mc);
        return true;
    }
    
}
