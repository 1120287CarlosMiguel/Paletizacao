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
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import paletizacao.model.Artigo;
import paletizacao.model.TipoContentor;
import paletizacao.model.MapaArtigos;
import paletizacao.model.Mercado;
import paletizacao.model.TipoPalete;
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
    
    /** Mapa de artigos com artigos e respectiva quantidade da encomenda*/
    private MapaArtigos artigos;
    
    /**
     * Cria um novo controller.
     * @param volC text field com o valor do volume do contentor
     * @param volE text field com o valor do volume da encomenda
     */
    public CalculaPercentagemController(JTextField volC, JTextField volE) {
        volumeContentor = volC;
        volumeEncomenda = volE;
        artigos = new MapaArtigos();
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
     * @return lista de contentores
     */
    public List<TipoContentor> getListaContentor() {
        return InMemoryRepositoryFactory.getInstance().getContentorRepository().getAll();
    }
    
    /**
     * Método para ir buscar a lista das paletes existentes.
     * @return lista de paletes
     */
    public List<TipoPalete> getListaPalete() {
        return InMemoryRepositoryFactory.getInstance().getPaleteRepository().getAll();
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
    
    /**
     * Método que adiciona um novo elemento ao mapa de artigos. Antes da insercao 
     * verifica a existencia do artigo ou nao.
     * @param art, artigo a adicionar.
     * @param d, valor do peso a adicionar.
     * @return boolean, true se adicionou o artigo, false se nao adiciona o artigo
     */
    public boolean addArtigo(Artigo art, Double d) {
        if(artigos.containsKey(art)) {
            return false;
        }
        
        artigos.put(art, d);
        return true;
    }
    
    /**Metodo que altera a quantidade doa artigo enviado como parametro.
     * 
     * @param art Artigo, artigo a alterar a quantidade,
     * @param d double, peso em kilogramas a encomendar,
     */
    public void alteraQuantidadeArtigo(Artigo art, double d) {
        artigos.setQuantidadeArtigo(art, new Double(d));
    }
    
    /**
     * Método que apaga todos os artigos do mapa.
     */
    public void removeArtigos() {
        artigos.clear();
    }
    
    /**
     * Metodo que retorna o valor do voluma da encomenda.
     * @return double, volume da encomenda.
     */
    public double getVolumeEncomenda() {
        return artigos.getVolume();
    }
    
    /**
     * Método que apaga os artigos com determinados index.
     * @param rows, index dos artigos a apagar. 
     */
    public void removeArtigos(int rows[]) {
        artigos.apagarArtigos(rows);
    }
    
    public void mostraArtigos() {
        for(Map.Entry<Artigo,Double> entry : artigos.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
    
    /**
     * Método que caclula a percentagem de ocupacao, usando o volume do contentor 
 do textField volumeTipoContentor e com o volume da encomenda.
     * @return double, percentagem da ocup
     * @throws ParseException 
     */
    public double getPercentagemOcupacao() throws ParseException {
        return artigos.getPercentagemOcupacao(getDoubleVolumeContentor());
    }
    
    /**
     * Método que retorna a quantidade da encomenda do artigos.
     * @param art, artigo a saber a quantidade
     * @return double, quantidade de artigo
     */
    public double getQuantidadeArtig(Artigo art) {
        return artigos.get(art).doubleValue();
    }
}
