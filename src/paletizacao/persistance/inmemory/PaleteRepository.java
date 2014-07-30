/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;
import paletizacao.model.TipoPalete;
import paletizacao.persistance.IPaleteRepository;

/**
 * Classe que representa a palete do modelo de negocio
 * @author Mac
 */
public class PaleteRepository implements IPaleteRepository{

    private static List<TipoPalete> listaPaletes = new ArrayList<TipoPalete>();
    
    public PaleteRepository() {
        
    }
    
    @Override
    public List<TipoPalete> getAll() {
        return listaPaletes;
    }

    @Override
    public boolean add(TipoPalete pal) {
        listaPaletes.add(pal);
        return true;
    }
    
}
