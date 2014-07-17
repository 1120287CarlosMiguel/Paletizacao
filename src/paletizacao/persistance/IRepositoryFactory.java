/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance;

/**
 * Interface a ser implementada por fabricas de repositorios concretas.
 * @author Mac
 */
public interface IRepositoryFactory {
    
    /**
     * Metodo que permite o acesso aos repositorios de artigos.
     * @return repositorio de artigos
     */
    public IArtigosRepository getArtigosRepository();
    
    /**
     * Metodo que permite o acesso aos repositorios de contentores.
     * @return repositorio de contentores
     */
    public IContentorRepository getContentorRepository();
    
}
