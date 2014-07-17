/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import paletizacao.persistance.IArtigosRepository;
import paletizacao.persistance.IRepositoryFactory;
import sun.security.jca.GetInstance;

/**
 *
 * @author Mac
 */
public class InMemoryRepositoryFactory implements IRepositoryFactory{

    private InMemoryRepositoryFactory instance;
    
    private InMemoryRepositoryFactory() {
    }
    
    private synchronized InMemoryRepositoryFactory getInstance() {
        if(instance == null) {
            instance = new InMemoryRepositoryFactory();
        }
        
        return instance;
    }
    
    @Override
    public IArtigosRepository getArtigosRepository() {
        return new ArtigosRepository();
    }
    
}
