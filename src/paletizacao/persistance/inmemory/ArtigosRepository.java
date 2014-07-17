/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;
import paletizacao.model.Artigo;
import paletizacao.persistance.IArtigosRepository;

/**
 *
 * @author Mac
 */
public class ArtigosRepository implements IArtigosRepository{
    
    private static List<Artigo> artigos = new ArrayList<Artigo>();

    @Override
    public List<Artigo> getAll() {
        return artigos;
    }

    @Override
    public boolean add(Artigo art) {
        artigos.add(art);
        return true;
    }
    
}
