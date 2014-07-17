/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.model;

/**
 *
 * @author Mac
 */
public class Artigo {
    
    /**Nome do artigo */
    private String nomeArtigo;
    
    /**Codigo identificador do artigo */
    private String codArtigo;
    
    /**Caixa usada por este artigo */
    private Caixa tipoCaixa;
    
    /**Numero de caixas por cada camada */
    private int caixaPorFiada;
    
    /**Numero de camadas na palete*/
    private int numFiadas;

    /**Peso bruto do artigo em kilogramas*/
    private double pesoBruto;
    
    /**Peso liquido do artigo em kilogramas*/
    private double pesoLiquido;
    
    /**Gramas por cada unidade de artigo*/
    private double grUNI;
    
    /**Numero de artigos por cada caixa*/
    private int uniCaixa;
    
    /**
     * Cria um novo artigo vazio. 
     */
    public Artigo() {
    }
    
    /**
     * Cria um novo artigo.
     * @param nome nome do artigo
     * @param cod codigo do artigo
     * @param tipo tipo de artigo
     * @param numF numero de fieiras
     * @param cpf numero de caixas por fieira
     */
    public Artigo(String nome,String cod, Caixa tipo, int numF, int cpf) {
        this.nomeArtigo = nome;
        this.codArtigo = cod;
        this.tipoCaixa = tipo;
        this.numFiadas = numF;
        this.caixaPorFiada = cpf;
    }
    
    /**
     * Cria um novo artigo.
     * @param nome nome do artigo
     * @param cod codigo do artigo
     * @param tipo tipo de artigo
     * @param numF numero de fieiras
     * @param cpf numero de caixas por fieira
     * @param pl peso liquido do artigo
     * @param pb peso bruto do artigo
     */
    public Artigo(String nome,String cod, Caixa tipo, int numF, int cpf,double pl, double pb) {
        this.nomeArtigo = nome;
        this.codArtigo = cod;
        this.tipoCaixa = tipo;
        this.numFiadas = numF;
        this.caixaPorFiada = cpf;
        this.pesoBruto = pb;
        this.pesoLiquido = pl;
    }
    
    public String getNomeArtigo() {
        return nomeArtigo;
    }
    
    public String toString() {
        return nomeArtigo;
    }
}
