/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Mapa que guarda o artigo e a quantidade em kilos da encomenda.
 * @author Mac
 */
public class MapaArtigos extends LinkedHashMap<Artigo, Double>{
    
    public MapaArtigos () {
        super();
    }
    
    /**
     * Método que guarda a percorre o mapa de artigos e calcula o volume total.
     * @return 
     */
    public double getVolume() {
        double volume = 0.0;
        
        for(Map.Entry<Artigo,Double> entry : this.entrySet()) {
            Artigo a = entry.getKey();
            Double kg = entry.getValue();
            volume += a.volumePorKiloGrama(kg.doubleValue());
        }
        
        return volume;
    }
    
    /**
     * Metodo que recebe um volume e calcula a percentagem do volume da encomenda no
     * volume do contentor.
     * @param volTotal volume total para medir a percentagem. -1 se volume da encomensa for maior
     * @return 
     */
    public double getPercentagemOcupacao(double volTotal) {
        if(volTotal < getVolume()) {
            return -1;
        }
        
        try {
           return getVolume()/volTotal * 100;
        } catch (Exception e) {
            return -1;
        }
        
    }
    
    /**
     * Metodo que altera o valor do peso do artigo.
     * @param ar Artigo, artigo a alterar a quantidade da encomenda
     * @param d Double, valor em kilogramas da encomenda
     */
    public void setQuantidadeArtigo(Artigo ar,Double d) {
        for(Map.Entry<Artigo,Double> entry : this.entrySet()) {
           if(entry.getKey().equals(ar)) {
               entry.setValue(d);
           }
        }
    }
    
    /**
     * Método que apagas os artigos que estão em determinados indices.
     * @param linhas , numero dos indices dos artigos a apagar,
     */
    public void apagarArtigos(int[] linhas) {
        int i=0;
        int tam = linhas.length;
                
        Artigo temp[] = new Artigo[tam];
        
        for(int x=0;x<tam;x++) {
            i=0;
            for(Map.Entry<Artigo,Double> entry : this.entrySet()) {
                if(i == linhas[x]) {
                    temp[x] = entry.getKey();
                }
                i++;
            }
        }
        
        for(int j=0;j<tam;j++) {
            this.remove(temp[j]);
        }
    }
    
    /**
     * Método que converte o mapa de artigos para um novo HashMap com todos os artigos
     * e o numero de caixas dependendo da quantidade pretendida.
     * @return mapa com artigo e a quantidade correspondente
     */
    public HashMap<Artigo,Double> convertMapaQuantidade() {
        HashMap<Artigo,Double> artigosCaixas = new HashMap<Artigo,Double>();
        
        for(Map.Entry<Artigo,Double> entry : this.entrySet()) {
            Double caixas = new Double(entry.getKey().kilogramaParaCaixas(entry.getValue().doubleValue()));
            artigosCaixas.put(entry.getKey(),caixas);
        }
        
        return artigosCaixas;
        
    }
    
    
    
}
