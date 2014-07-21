/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.controller;

import java.util.ArrayList;
import java.util.List;
import paletizacao.model.Contentor;
import paletizacao.model.Mercado;
import paletizacao.persistance.inmemory.InMemoryRepositoryFactory;

/**
 *
 * @author Mac
 */
public class CalculaPercentagemController {

    public CalculaPercentagemController() {
    }
    
    public List<Mercado> getListaMercados() {
        return InMemoryRepositoryFactory.getInstance().getMercadoRepository().getAll();
    }
    
    public List<Contentor> getListaContentor() {
        return InMemoryRepositoryFactory.getInstance().getContentorRepository().getAll();
    }
    
    
}
