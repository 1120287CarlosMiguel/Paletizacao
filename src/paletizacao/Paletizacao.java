/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao;

import paletizacao.model.Artigo;
import paletizacao.model.Contentor;
import paletizacao.model.Mercado;
import paletizacao.persistance.inmemory.InMemoryRepositoryFactory;
import paletizacao.ui.CalculaPercentagemUI;

/**
 *
 * @author Mac
 */
public class Paletizacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bootstrap boot = new Bootstrap();
        CalculaPercentagemUI ui = new CalculaPercentagemUI();
        
//        for(Mercado m : InMemoryRepositoryFactory.getInstance().getMercadoRepository().getAll()) {
//            for(Artigo a : m.getArtigos()) {
//                System.out.println(Double.toString(a.gramasParaCaixas(5000)));
//            }
//        }
        
    }
    
}
