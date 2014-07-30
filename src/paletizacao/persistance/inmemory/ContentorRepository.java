/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;
import paletizacao.model.TipoContentor;
import paletizacao.persistance.IContentorRepository;

/**
 *
 * @author Mac
 */
class ContentorRepository implements IContentorRepository {

    private static List<TipoContentor> rep = new ArrayList<TipoContentor>();
    
    public ContentorRepository() {
    }

    @Override
    public boolean save(TipoContentor c) {
        rep.add(c);
        return true;
    }

    @Override
    public List<TipoContentor> getAll() {
        return rep;
    }
    
}
