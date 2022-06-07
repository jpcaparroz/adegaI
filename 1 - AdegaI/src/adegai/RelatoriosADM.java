package adegai;

import bd.ConnectBd;

import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class RelatoriosADM extends javax.swing.JFrame {
    Connection connection;
    AdegaI adegai = new AdegaI();
    
    public RelatoriosADM() {
        initComponents();
    }
    
    //CONSTRUTOR PEGANDO NOME/FUNÇÃO DO USUÁRIO
    public RelatoriosADM(String funcionario, String funcao, String id){
        initComponents();
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
        funcionarioId.setText(id);
        
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        funcionarioId = new javax.swing.JLabel();
        logoIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        funcionarioNome = new javax.swing.JLabel();
        funcionarioFunction = new javax.swing.JLabel();
        relatoriosBanner = new javax.swing.JLabel();
        botaoHome = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoContatos = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        menuLateral = new javax.swing.JLabel();
        menuCima = new javax.swing.JLabel();
        tipoRelatorioCombo = new javax.swing.JComboBox<>();
        dataFinal = new javax.swing.JTextField();
        dataInicio = new javax.swing.JTextField();
        gerarRelatorioBotao = new javax.swing.JButton();
        ordemAlfabeticaBotao = new javax.swing.JButton();
        todosClientesPane = new javax.swing.JScrollPane();
        todosClientesTable = new javax.swing.JTable();
        vendaPeriodoPane = new javax.swing.JScrollPane();
        vendaPeriodoTable = new javax.swing.JTable();
        todasVendasPane = new javax.swing.JScrollPane();
        todasVendasTable = new javax.swing.JTable();
        relatoriosCaixa = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        funcionarioId.setFont(new java.awt.Font("Jost", 1, 30)); // NOI18N
        funcionarioId.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funcionarioId.setText("0");
        jPanel1.add(funcionarioId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 35, 65, -1));

        logoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/logo.png"))); // NOI18N
        jPanel1.add(logoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/userIcon.png"))); // NOI18N
        jPanel1.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 26, -1, -1));

        funcionarioNome.setFont(new java.awt.Font("Jost", 1, 24)); // NOI18N
        funcionarioNome.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioNome.setText("User");
        jPanel1.add(funcionarioNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        funcionarioFunction.setFont(new java.awt.Font("Jost", 2, 12)); // NOI18N
        funcionarioFunction.setForeground(new java.awt.Color(255, 255, 255));
        funcionarioFunction.setText("administrador");
        jPanel1.add(funcionarioFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        relatoriosBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/RelatoriosADM/relatórios.png"))); // NOI18N
        jPanel1.add(relatoriosBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 14, -1, -1));

        botaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/homeIcon.png"))); // NOI18N
        botaoHome.setBorder(null);
        botaoHome.setBorderPainted(false);
        botaoHome.setContentAreaFilled(false);
        botaoHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/homeIconPressed.png"))); // NOI18N
        botaoHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/homeIconPressed.png"))); // NOI18N
        botaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHomeActionPerformed(evt);
            }
        });
        jPanel1.add(botaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        botaoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIcon.png"))); // NOI18N
        botaoVendas.setBorder(null);
        botaoVendas.setBorderPainted(false);
        botaoVendas.setContentAreaFilled(false);
        botaoVendas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
        botaoVendas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
        botaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendasActionPerformed(evt);
            }
        });
        jPanel1.add(botaoVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        botaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIcon.png"))); // NOI18N
        botaoProdutos.setBorder(null);
        botaoProdutos.setBorderPainted(false);
        botaoProdutos.setContentAreaFilled(false);
        botaoProdutos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIconPressed.png"))); // NOI18N
        botaoProdutos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIconPressed.png"))); // NOI18N
        botaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        botaoContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIcon.png"))); // NOI18N
        botaoContatos.setBorder(null);
        botaoContatos.setBorderPainted(false);
        botaoContatos.setContentAreaFilled(false);
        botaoContatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContatosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        botaoRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIconPressed.png"))); // NOI18N
        botaoRelatorios.setBorder(null);
        botaoRelatorios.setBorderPainted(false);
        botaoRelatorios.setContentAreaFilled(false);
        botaoRelatorios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIconPressed.png"))); // NOI18N
        botaoRelatorios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIconPressed.png"))); // NOI18N
        jPanel1.add(botaoRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        menuLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuLateral.png"))); // NOI18N
        jPanel1.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuCima.png"))); // NOI18N
        jPanel1.add(menuCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tipoRelatorioCombo.setBackground(new java.awt.Color(255, 255, 255));
        tipoRelatorioCombo.setFont(new java.awt.Font("Jost", 1, 17)); // NOI18N
        tipoRelatorioCombo.setForeground(new java.awt.Color(32, 32, 32));
        tipoRelatorioCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas Vendas", "Todos Clientes", "Venda por Periodo" }));
        tipoRelatorioCombo.setBorder(null);
        jPanel1.add(tipoRelatorioCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 209, 370, 40));

        dataFinal.setText("00/00/0000");
        jPanel1.add(dataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));

        dataInicio.setText("00/00/0000");
        jPanel1.add(dataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        gerarRelatorioBotao.setText("Gerar");
        gerarRelatorioBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(gerarRelatorioBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, -1, -1));

        ordemAlfabeticaBotao.setText("Ordem Alfabética");
        ordemAlfabeticaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemAlfabeticaBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(ordemAlfabeticaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));

        todosClientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        todosClientesPane.setViewportView(todosClientesTable);

        jPanel1.add(todosClientesPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 303, 969, 348));

        vendaPeriodoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Data", "Valor"
            }
        ));
        vendaPeriodoPane.setViewportView(vendaPeriodoTable);

        jPanel1.add(vendaPeriodoPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 303, 969, 348));

        todasVendasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Data", "Valor"
            }
        ));
        todasVendasPane.setViewportView(todasVendasTable);

        jPanel1.add(todasVendasPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 303, 969, 348));

        relatoriosCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/RelatoriosADM/relatorioCaixa.png"))); // NOI18N
        jPanel1.add(relatoriosCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 148, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/RelatoriosADM/relatoriosBg.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //DIRECIONA PARA A TELA HOME
    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        
        new Home(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHomeActionPerformed
    
    //DIRECIONA PARA A TELA PRODUTOS
    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        
        new ProdutosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProdutosActionPerformed
    
    //DIRECIONA PARA A TELA CONTATOS
    private void botaoContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContatosActionPerformed
        
        new ContatosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoContatosActionPerformed
    
    //DIRECIONA PARA A TELA VENDAS
    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        
        new Vendas(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVendasActionPerformed
    
    //GERA O RELATORIO SELECIONADO
    private void gerarRelatorioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioBotaoActionPerformed
        DefaultTableModel defaultCliente = (DefaultTableModel) todosClientesTable.getModel();
        DefaultTableModel defaultVendas = (DefaultTableModel) todasVendasTable.getModel();

        if (tipoRelatorioCombo.getSelectedItem().toString().equals("Todas Vendas")) {

            adegai.showTabela(todasVendasPane, todasVendasTable);

            adegai.showOffTabela(todosClientesPane, todosClientesTable);
            adegai.showOffTabela(vendaPeriodoPane, vendaPeriodoTable);

            String sql = "SELECT * FROM venda";
            PreparedStatement statement;

            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String data_venda = String.valueOf(result.getDate(2));
                    String valor = String.valueOf(result.getDouble(3));

                    String tabelaVendas[] = {id, data_venda, valor};

                    defaultVendas.addRow(tabelaVendas);
                }

                connection.close();
            } catch (SQLException ex) {
                adegai.mensagemPopUp("Erro");
                //Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (tipoRelatorioCombo.getSelectedItem().toString().equals("Todos Clientes")) {

            adegai.showOffTabela(vendaPeriodoPane, vendaPeriodoTable);
            adegai.showOffTabela(todasVendasPane, todasVendasTable);

            adegai.showTabela(todosClientesPane, todosClientesTable);

            String sql = "SELECT * FROM cliente";
            PreparedStatement statement;

            defaultCliente.setRowCount(0);

            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String nome = result.getString(2);

                    String tabelaCliente[] = {id, nome};

                    defaultCliente.addRow(tabelaCliente);
                }
                
                connection.close();
            } catch (SQLException ex) {
                adegai.mensagemPopUp("Erro");
                //Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_gerarRelatorioBotaoActionPerformed
    
    //DEIXA O RELATORIO GERADO EM ORDEM ALFABÉTICA
    private void ordemAlfabeticaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemAlfabeticaBotaoActionPerformed
        DefaultTableModel defaultCliente = (DefaultTableModel) todosClientesTable.getModel();
        
        if (tipoRelatorioCombo.getSelectedItem().toString().equals("Todos Clientes")){
            
            adegai.showOffTabela(todasVendasPane, todasVendasTable);
            adegai.showOffTabela(todosClientesPane, todosClientesTable);
            adegai.showOffTabela(vendaPeriodoPane, vendaPeriodoTable);
            
            adegai.showTabela(todosClientesPane, todosClientesTable);
            
            String sql = "SELECT * FROM cliente ORDER BY nome";
            PreparedStatement statement;

            
            defaultCliente.setRowCount(0);

            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                
                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String nome = result.getString(2);

                    String tabelaCliente[] = {id, nome};
                    

                    defaultCliente.addRow(tabelaCliente);
                    
                }
                connection.close();
            } catch (SQLException ex) {
                adegai.mensagemPopUp("Erro");
                //Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ordemAlfabeticaBotaoActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new RelatoriosADM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JTextField dataFinal;
    private javax.swing.JTextField dataInicio;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioId;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JButton gerarRelatorioBotao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JButton ordemAlfabeticaBotao;
    private javax.swing.JLabel relatoriosBanner;
    private javax.swing.JLabel relatoriosCaixa;
    private javax.swing.JComboBox<String> tipoRelatorioCombo;
    private javax.swing.JScrollPane todasVendasPane;
    private javax.swing.JTable todasVendasTable;
    private javax.swing.JScrollPane todosClientesPane;
    private javax.swing.JTable todosClientesTable;
    private javax.swing.JLabel userIcon;
    private javax.swing.JScrollPane vendaPeriodoPane;
    private javax.swing.JTable vendaPeriodoTable;
    // End of variables declaration//GEN-END:variables
}
