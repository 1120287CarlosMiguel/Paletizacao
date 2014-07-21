/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import paletizacao.model.Mercado;
import paletizacao.persistance.IMercadoRepository;
import paletizacao.persistance.IContentorRepository;
import paletizacao.persistance.IRepositoryFactory;

/**
 * Fabrica de repositorios.
 * Implementado segundo o padrão Singleton(GOF) para garantir a existencia de apenas uma fabrica.
 * @author Mac
 */
public class InMemoryRepositoryFactory implements IRepositoryFactory{

    /** Fabrica de Repositorios*/
    private static InMemoryRepositoryFactory instance;
    
    /**
     * Cria uma nova InMemoryRepositoryFactor.
     */
    private InMemoryRepositoryFactory() {
    }
    
    /**
     * Permite aceder a Factory
     * @return instance
     */
    public static synchronized InMemoryRepositoryFactory getInstance() {
        if(instance == null) {
            instance = new InMemoryRepositoryFactory();
        }
        
        return instance;
    }
    
    /**
     * Metodo que permite o acesso aos repositorios de mercados.
     * @return repositorio de mercados
     */
    @Override
    public IMercadoRepository getMercadoRepository() {
        return new MercadoRepository();
    }
    
    /**
     * Metodo que permite o acesso aos repositorios de contentores.
     * @return repositorio de contentores
     */
    @Override
    public IContentorRepository getContentorRepository() {
        return new ContentorRepository();
    }
    
}
