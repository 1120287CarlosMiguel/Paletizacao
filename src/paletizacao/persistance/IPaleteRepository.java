/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance;

import java.util.List;
import paletizacao.model.Palete;

/**
 * Interface a ser usada pelos repositorios de paletes concretos.
 * @author Mac
 */
public interface IPaleteRepository {
    
    /**
     * Metodo para receber as paletes existentes.
     * @return lista com paletes
     */
    public List<Palete> getAll();
    
    /**
     * Metodo que permite adicionar novas paletes ao repositorio.
     * @param pal palete a ser adicionado na lista
     * @return true se for adicionado, false se nao for adicionado
     */
    public boolean add(Palete pal);
    
}
