/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;
import paletizacao.model.Contentor;
import paletizacao.persistance.IContentorRepository;

/**
 *
 * @author Mac
 */
class ContentorRepository implements IContentorRepository {

    private static List<Contentor> rep = new ArrayList<Contentor>();
    
    public ContentorRepository() {
    }

    @Override
    public boolean save(Contentor c) {
        rep.add(c);
        return true;
    }

    @Override
    public List<Contentor> getAll() {
        return rep;
    }
    
}
