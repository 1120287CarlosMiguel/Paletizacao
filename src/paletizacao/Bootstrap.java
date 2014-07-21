package paletizacao;


import paletizacao.model.Artigo;
import paletizacao.model.Caixa;
import paletizacao.model.Contentor;
import paletizacao.model.Mercado;
import paletizacao.persistance.IMercadoRepository;
import paletizacao.persistance.inmemory.MercadoRepository;
import paletizacao.persistance.inmemory.InMemoryRepositoryFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mac
 */
public class Bootstrap {
    
    public Bootstrap() {
        //contentores criados
        Contentor con1 = new Contentor("REEFER 20´´ Std",5451,2290,2167);
        Contentor con2 = new Contentor("REEFER 40´´ High icube",11580,2275,2415);
        Contentor con3 = new Contentor("REEFER 40´´ High starfresh",11578,2280,2425);
        Contentor con4 = new Contentor("REEFER 40´´ High starfresh plus",11578,2280,2425);
        Contentor con5 = new Contentor("REEFER 40´´ Magnum",11578,2280,2450);
        Contentor con6 = new Contentor("REEFER 40´´ High starVent",11578,2268,2426);
        Contentor con7 = new Contentor("REEFER 40´´ High superfreezer",11578,2188,2380);
        
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con1);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con2);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con3);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con4);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con5);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con6);
        InMemoryRepositoryFactory.getInstance().getContentorRepository().save(con7);
        
        //caixas na BD
        Caixa c1 = new Caixa(0.3,0.38,0.25,"123",0.38,"Caixas Cartao 30 EXP");
        Caixa c2 = new Caixa(0.18,0.38,0.25,"123",0.30,"Caixas Cartao 18 EXP");
        Caixa c3 = new Caixa(0.2,0.38,0.25,"123",0.31,"Caixas Cartao 20 EXP");
        Caixa c4 = new Caixa(0.22,0.38,0.25,"123",0.32,"Caixas Cartao 22 EXP");
        Caixa c5 = new Caixa(0.18,0.38,0.25,"123",0.30,"Caixas Cartao 18 EXP");
        Caixa c6 = new Caixa(0.18,0.38,0.25,"123",0.30,"Caixas Cartao 18 EXP");
        Caixa c7 = new Caixa(0.22,0.38,0.25,"123",0.32,"Caixas Cartao 22 EXP");
        Caixa c8 = new Caixa(0.2,0.38,0.25,"123",0.31,"Caixas Cartao 20 EXP");
        Caixa c9 = new Caixa(0.2,0.38,0.25,"123",0.31,"Caixas Cartao 20 EXP");
        Caixa c10 = new Caixa(0.3,0.38,0.25,"123",0.38,"Caixas Cartao 30 EXP");
        Caixa c11 = new Caixa(0.18,0.38,0.25,"123",0.30,"Caixas Cartao 18 EXP");
        Caixa c12 = new Caixa(0.2,0.38,0.25,"123",0.31,"Caixas Cartao 20 EXP");
        Caixa c13 = new Caixa(0.22,0.38,0.25,"123",0.32,"Caixas Cartao 22 EXP");
        
        
        //artigos na BD
        Artigo art1 = new Artigo("BRÓCOLO   Escolha Gourmet 25x400 g","30BR0000220024",c1,400,25);
        Artigo art2 = new Artigo("CASTANHA   Escolha Gourmet 25x400 g","32Z100002200Q4",c2,400,25);
        Artigo art3 = new Artigo("CENOURA BABY   Escolha Gourmet 25x400 g ","30CB0000220064",c3,400,25);
        Artigo art4 = new Artigo("COUVE BRUXELAS   Escolha Gourmet 25x400 g ","30VB00002200B4",c4,400,25);
        Artigo art5 = new Artigo("ERVILHA   Escolha Gourmet 25x400 g ","30E100002200Q4",c5,400,25);
        Artigo art6 = new Artigo("FAVA   Escolha Gourmet 25x400 g ","30F100002200Q4",c6,400,25);
        Artigo art7 = new Artigo("FEIJÃO VERDE RED.   Escolha Gourmet 25x400 g ","30FR00002200B4",c7,400,25);
        Artigo art8 = new Artigo("JARDINEIRA   Escolha Gourmet 25x400 g","31J20000220064",c8,400,25);
        Artigo art9 = new Artigo("SALADA DE MILHO   Escolha Gourmet 25x400 g","31S20000220064",c9,400,25);
        Artigo art10 = new Artigo("BRÓCOLO   Escolha Gourmet 10x1000 g","30BR0000660024",c10,1000,10);
        Artigo art11 = new Artigo("ERVILHA   Escolha Gourmet 10x1000 g ","30E100006600Q4",c11,1000,10);
        Artigo art12 = new Artigo("JARDINEIRA   Escolha Gourmet 10x1000 g ","31J20000660064",c12,1000,10);
        Artigo art13 = new Artigo("FEIJÃO VERDE RED.   Escolha Gourmet 10x1000 g","30FR0000660064",c13,1000,10);

        //mercados na BD
        Mercado m1 = new Mercado("234", "Vegetais");
        m1.addArtigo(art1);
        m1.addArtigo(art3);
        m1.addArtigo(art4);
        m1.addArtigo(art5);
        m1.addArtigo(art6);
        m1.addArtigo(art7);
        m1.addArtigo(art10);
        m1.addArtigo(art11);
        m1.addArtigo(art13);
        
        Mercado m2 = new Mercado("235","Frutos");
        m2.addArtigo(art2);
        
        Mercado m3 = new Mercado("236","Misturas Vegetais");
        m3.addArtigo(art8);
        m3.addArtigo(art9);
        m3.addArtigo(art2);
        
        InMemoryRepositoryFactory.getInstance().getMercadoRepository().add(m1);
        InMemoryRepositoryFactory.getInstance().getMercadoRepository().add(m2);
        InMemoryRepositoryFactory.getInstance().getMercadoRepository().add(m3);
        
        
        
    }
    
}
