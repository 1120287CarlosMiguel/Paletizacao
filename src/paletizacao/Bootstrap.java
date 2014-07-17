package paletizacao;


import paletizacao.model.Artigo;
import paletizacao.model.Caixa;
import paletizacao.model.Contentor;
import paletizacao.persistance.IArtigosRepository;
import paletizacao.persistance.inmemory.ArtigosRepository;
import paletizacao.persistance.inmemory.InMemoryRepositoryFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mac
 */
public class Bootstrap {
    
    public Bootstrap() {
        Caixa c1 = new Caixa(5.5, 17.6, 10.8,"541191");
        
        Artigo art1 = new Artigo("Amoras DUJARDIN 10*450 grs","22A10",c1,10,12,720.0,721.0);
        InMemoryRepositoryFactory.getInstance().getArtigosRepository().add(art1);
        
        Contentor con1 = new Contentor("REEFER 20´´ Std",5451,2290,2167);
        Contentor con2 = new Contentor("REEFER 40´´ High icube",11580,2275,2415);
        Contentor con3 = new Contentor("REEFER 40´´ High starfresh",11578,2280,2425);
        Contentor con4 = new Contentor("REEFER 40´´ High starfresh plus",11578,2280,2425);
        Contentor con5 = new Contentor("REEFER 40´´ Magnum",11578,2280,2450);
        Contentor con6 = new Contentor("REEFER 40´´ High starVent",11578,2268,2426);
        Contentor con7 = new Contentor("REEFER 40´´ High superfreezer",11578,2188,2380);
        
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con1);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con2);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con3);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con4);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con5);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con6);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con7);
    }
    
}
