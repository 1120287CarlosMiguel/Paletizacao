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
    
    /**Gramas por cada unidade de artigo*/
    private double grUNI;
    
    /**Numero de artigos por cada caixa*/
    private int uniCaixa;
    
    /**Distribuicao de um artifo numa palete*/
    private PaleteArtigo distribuicao;
    
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
    public Artigo(String nome,String cod, Caixa tipo) {
        this.nomeArtigo = nome;
        this.codArtigo = cod;
        this.tipoCaixa = tipo;
    }
    
    /**
     * Cria um novo artigo.
     * @param nome nome do artigo
     * @param cod codigo do artigo
     * @param tipo tipo de artigo
     * @param numF numero de fieiras
     * @param cpf numero de caixas por fieira
     * @param gr gramas por unidade
     * @param uni unidades por caixa
     */
    public Artigo(String nome,String cod, Caixa tipo,double gr, int uni) {
        this.nomeArtigo = nome;
        this.codArtigo = cod;
        this.tipoCaixa = tipo;
        this.grUNI = gr;
        this.uniCaixa = uni;
    }
    
    /**
     * Define o atributo distribuicao
     * @param p a distribuicao de um artigo numa palete
     */
    public void setDistribuicaoPalete(PaleteArtigo p) {
        this.distribuicao = p;
    }
    
    /**
     * Metodo que converte gramas do produto em unidades.
     * @param gram int com peso em gramas desejadas
     * @return int com unidades necessarias
     */
    public double gramasParaUnidade(double gram) {
        return Math.floor(gram/grUNI);
    }
    
    /**
     * Metodo que converte o peso() em numero de caixas.
     * Para obter o resultado didive se o numero de unidades a transportar pelo numero de caixas por unidade
     * (valor a ser verificado se tem casas decimais ou nao)
     * @param gr int com peso em gramas para transportar
     * @return numero de caixas a transportar
     */
     public double gramasParaCaixas(double gr) {
        return Math.floor(gramasParaUnidade(gr)/this.uniCaixa);
     }
     
     /**
     * Metodo que converte o peso() em numero de caixas.
     * Para obter o resultado didive se o numero de unidades a transportar pelo numero de caixas por unidade
     * (valor a ser verificado se tem casas decimais ou nao)
     * @param gr int com peso em gramas para transportar
     * @return numero de caixas a transportar
     */
     public double kilogramaParaCaixas(double kg) {
         return Math.floor(gramasParaUnidade(kg*1000.0)/this.uniCaixa);
     }
    
     /**
      * Metodo que converte o peso(kilogramas) da encomenda em volume das caixas.
      * Retorna -1 se o numero de caixas a ser usado nao for um inteiro, deste modo e feita a validacao para apenas ser possivel
      * encomendar uma quantidade certa.
      * @param gramas peso em kilogramas da encomenda
      * @return double com o volume de caixas a ser encomendado
      */
     public double volumePorGrama(double gramas) {
         double numCaixas = gramasParaCaixas(gramas);
         if(numCaixas % 1 == 0) {
             return numCaixas * tipoCaixa.getVolume();
         } else {
             return -1.0;
         }
     }
     
     /**
      * Metodo que converte o peso(kilogramas) da encomenda em volume das caixas.
      * Retorna -1 se o numero de caixas a ser usado nao for um inteiro, deste modo e feita a validacao para apenas ser possivel
      * encomendar uma quantidade certa.
      * @param kg peso em kilogramas da encomenda
      * @return double com o volume de caixas a ser encomendado
      */
     public double volumePorKiloGrama(double kg) {
         double numCaixas = gramasParaCaixas(kg * 1000);
         if(numCaixas % 1 == 0) {
             return numCaixas * tipoCaixa.getVolume();
         } else {
             return -1.0;
         }
     }
    
    public String toString() {
        return nomeArtigo;
    }
}
