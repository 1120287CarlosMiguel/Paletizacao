/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.persistance;

import java.util.List;
import paletizacao.model.TipoContentor;

/**
 *
 * @author Mac
 */
public interface IContentorRepository {
    
    public boolean save(TipoContentor c);
    
    public List<TipoContentor> getAll();
    
}
