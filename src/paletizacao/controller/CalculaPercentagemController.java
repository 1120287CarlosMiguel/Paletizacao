/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.controller;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JTextField;
import paletizacao.model.Contentor;
import paletizacao.model.Mercado;
import paletizacao.persistance.inmemory.InMemoryRepositoryFactory;

/**
 *
 * @author Mac
 */
public class CalculaPercentagemController {
    
    /**Text field com volume total do contentor*/
    private JTextField volumeContentor;
    
    /**Text Field com valor do volume da encomenda*/
    private JTextField volumeEncomenda;
    
    /**
     * Cria um novo controller.
     * @param volC text field com o valor do volume do contentor
     * @param volE text field com o valor do volume da encomenda
     */
    public CalculaPercentagemController(JTextField volC, JTextField volE) {
        volumeContentor = volC;
        volumeEncomenda = volE;
    }
    
    /**
     * Método para ir buscar a lista de mercados existentes.
     * @return lista com os mercados.
     */
    public List<Mercado> getListaMercados() {
        return InMemoryRepositoryFactory.getInstance().getMercadoRepository().getAll();
    }
    
    /**
     * Método para ir buscar a lista dos contentores existentes.
     * @return 
     */
    public List<Contentor> getListaContentor() {
        return InMemoryRepositoryFactory.getInstance().getContentorRepository().getAll();
    }
    
    /**
     * Método para calcular a percentagem da ocupação da encomenda
     * @return double, v
     */
    public double getPercetagemOcupacao() {
        double percentagem = 0.00;
        
         NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
       
        try {
            
            Number number = nf.parse(volumeContentor.getText());
            double volContentor = number.doubleValue();
            
            number= nf.parse(volumeEncomenda.getText());
            double volOcu = number.doubleValue();
                    
            percentagem = volOcu/volContentor*100.0;
            System.out.println(Double.toString(percentagem));
        } catch(Exception e) {
            percentagem = 0.0;
        } 
        
        return percentagem;
    }
    
    /**
     * Método que converte a string com o volume do contentor num double.
     * @return double, volume do contentor.
     */
    public double getDoubleVolumeContentor() throws ParseException {
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        Number number = nf.parse(volumeContentor.getText());
        
        return number.doubleValue();
    }    
}
