/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paletizacao.ui;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import paletizacao.controller.CalculaPercentagemController;
import paletizacao.model.Artigo;
import paletizacao.model.Contentor;
import paletizacao.model.Mercado;
import paletizacao.persistance.inmemory.InMemoryRepositoryFactory;

/**
 *
 * @author Mac
 */
public class CalculaPercentagemUI extends javax.swing.JFrame {
    
    private CalculaPercentagemController controller = new CalculaPercentagemController();
    
    private boolean ignoreArtigo = true;
    
    private boolean ignoreContentor = true;
    
    /**
     * Creates new form CalculaPercentagemUI
     */
    public CalculaPercentagemUI() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        preencherMercado();
        preencherContentor();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mercadoCB = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaArtigos = new javax.swing.JList();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contentoresCB = new javax.swing.JComboBox();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tipoPaleteCB = new javax.swing.JComboBox();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        volCTextF = new javax.swing.JTextField();
        eraseButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        volOcupadoTF = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mercado:");

        mercadoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mercadoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercadoCBActionPerformed(evt);
            }
        });

        jLabel2.setText("Artigos");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        listaArtigos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaArtigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaArtigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaArtigos);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Gramas", "Kilogramas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setToolTipText("");
        tabelaProdutos.setShowGrid(true);
        tabelaProdutos.setGridColor (Color.black);
        jScrollPane2.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(1);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        jLabel3.setText("Artigos:");

        jLabel4.setText("Contentor:");

        contentoresCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        contentoresCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentoresCBActionPerformed(evt);
            }
        });

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setText("Tipo Palete:");

        tipoPaleteCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Vol. Contentor");
        jLabel6.setToolTipText("Volume do contentor em m3");

        volCTextF.setEditable(false);
        volCTextF.setToolTipText("Volume do contentor em m3");

        eraseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/erase.png"))); // NOI18N
        eraseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraseButtonMouseClicked(evt);
            }
        });

        jLabel7.setText("Vol. Ocupado");
        jLabel7.setToolTipText("Volume ocupada pela encomenda em m3");

        volOcupadoTF.setEditable(false);
        volOcupadoTF.setToolTipText("Volume ocupada pela encomenda em m3");

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(contentoresCB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoPaleteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(mercadoCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(0, 6, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(330, 330, 330))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                                        .addGap(12, 12, 12))))
                            .addComponent(jSeparator5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volCTextF, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(volOcupadoTF))
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contentoresCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tipoPaleteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(mercadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eraseButton)
                                    .addComponent(addButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(volCTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volOcupadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator6)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que preenche a lista de artigos consoante o mercado escolhido.
     * A lista de artigos que aparace np inicio e a do 1 mercado.
     * @param evt 
     */
    private void mercadoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercadoCBActionPerformed
        if(!ignoreArtigo) {    
           preencherArtigos();
        }
    }//GEN-LAST:event_mercadoCBActionPerformed

    /**
     * Metodo que verifica se foi clicado 2 vezes num dos items da lista de artigos para adicionar para a tabela.
     * @param evt evento
     */
    private void listaArtigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaArtigosMouseClicked
        if(evt.getClickCount() == 2) {
            addArtigo();
        }
    }//GEN-LAST:event_listaArtigosMouseClicked

    /**
     * Metodo que deteta a escolha de um contentor e altera a area total
     * @param evt 
     */
    private void contentoresCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentoresCBActionPerformed
        if(!ignoreContentor) {
            String area = String.format("%.2f",((Contentor)contentoresCB.getSelectedItem()).getVolume());
            volCTextF.setText(area);
        
            jLabel4.setToolTipText(((Contentor)contentoresCB.getSelectedItem()).imprimeMedidas());
            contentoresCB.setToolTipText(((Contentor)contentoresCB.getSelectedItem()).imprimeMedidas());
        }
    }//GEN-LAST:event_contentoresCBActionPerformed

    /**
     * Metodo que dispoleta evento de apagar uma das linhas.
     * @param evt 
     */
    private void eraseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseButtonMouseClicked
        int row = tabelaProdutos.getSelectedRow();
        
        DefaultTableModel mode = (DefaultTableModel) tabelaProdutos.getModel();
        
        if(row == -1) {
            JOptionPane.showMessageDialog(null,"Nenhum artigo da tabela selecionada.","ERRO",JOptionPane.ERROR_MESSAGE);
        } else {
            int rowC = mode.getRowCount();
            //corrigir eliminacao de artigos!!!
            for(int i = row;i<rowC;i++) {
                  tabelaProdutos.setValueAt(tabelaProdutos.getValueAt(i,0), i-1, 0);
                  tabelaProdutos.setValueAt(tabelaProdutos.getValueAt(i,1), i-1, 1);
                  tabelaProdutos.setValueAt(tabelaProdutos.getValueAt(i,2), i-1, 2);
                  mode.removeRow(i);
            }
        }
    }//GEN-LAST:event_eraseButtonMouseClicked

    /**
     * Metodo que verifica se addButton foi clicado para adicionar o artigo selecionado
     * @param evt 
     */
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        addArtigo();
    }//GEN-LAST:event_addButtonMouseClicked

    /**
     * Metodo que adiciona o artigo a tabela.
     */
    private void addArtigo() {
        DefaultTableModel mode = (DefaultTableModel) tabelaProdutos.getModel();

        if(listaArtigos.getSelectedValue() != null) {
            mode.addRow(new Object[3]);
            Artigo art = (Artigo) listaArtigos.getSelectedValue();
            
            tabelaProdutos.setValueAt(art, mode.getRowCount()-1, 0);
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum artigo da lista selecionado.","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Metodo que preenche a combo box com os mercados existentes.
     */
    private void preencherMercado() {
       mercadoCB.removeAllItems();
       
       for(Mercado m : controller.getListaMercados()) {
           mercadoCB.addItem(m);
       }
       
       ignoreArtigo = false;
       mercadoCB.setSelectedIndex(0);
   }

    /**
     * Metodo que preenche a lista com os artigos consoante o mercado escolhido.
     */
    private void preencherArtigos() {
        listaArtigos.removeAll();
        
        Mercado temp = (Mercado)mercadoCB.getSelectedItem();
        
        DefaultListModel listModel = new DefaultListModel();
        for(Artigo a : temp.getArtigos()) {
            listModel.addElement(a);
        }
        
        listaArtigos.setModel(listModel);
   }
    
    /**
    Metodo que preenche a combo box com os contentores existentes.
     */
    private void preencherContentor() {
        contentoresCB.removeAllItems();
        
        for(Contentor c : controller.getListaContentor()) {
            contentoresCB.addItem(c);
        }
        
        contentoresCB.setSelectedIndex(0);
        jLabel4.setToolTipText(((Contentor)contentoresCB.getSelectedItem()).imprimeMedidas());
        contentoresCB.setToolTipText(((Contentor)contentoresCB.getSelectedItem()).imprimeMedidas());
        
        ignoreContentor = false;
        
        String area = String.format("%.2f",((Contentor)contentoresCB.getSelectedItem()).getVolume());
        volCTextF.setText(area);
    }
   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox contentoresCB;
    private javax.swing.JButton eraseButton;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JList listaArtigos;
    private javax.swing.JComboBox mercadoCB;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JComboBox tipoPaleteCB;
    private javax.swing.JTextField volCTextF;
    private javax.swing.JTextField volOcupadoTF;
    // End of variables declaration//GEN-END:variables
}
