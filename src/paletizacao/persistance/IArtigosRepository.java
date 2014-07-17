/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance;

import java.util.List;
import paletizacao.model.Artigo;

/**
 *
 * @author Mac
 */
public interface IArtigosRepository {
    
    public List<Artigo> getAll();
    
    public boolean add(Artigo art);
    
}
