package adegai;

import bd.ConnectBd;

import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RelatoriosADM extends javax.swing.JFrame {
    Connection connection;
    
    public RelatoriosADM() {
        initComponents();

    }

    public RelatoriosADM(String funcionario, String funcao){
        initComponents();
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
                
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        funcionarioNome = new javax.swing.JLabel();
        funcionarioFunction = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        tipoRelatorioCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas Vendas", "Todos Clientes", "Venda por Periodo", " " }));
        jPanel1.add(tipoRelatorioCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 500, 50));

        dataFinal.setText("00/00/0000");
        jPanel1.add(dataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));

        dataInicio.setText("00/00/0000");
        jPanel1.add(dataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

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

        jPanel1.add(todosClientesPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 950, -1));

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

        jPanel1.add(vendaPeriodoPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 950, -1));

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

        jPanel1.add(todasVendasPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 950, -1));

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

    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        
        new HomeADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHomeActionPerformed

    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        
        new ProdutosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProdutosActionPerformed

    private void botaoContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContatosActionPerformed
        
        new ContatosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoContatosActionPerformed

    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        
        new VendasADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVendasActionPerformed

    //SHOW OFF TABELA
    public void showOff(JScrollPane pane, JTable table){
        pane.show(false);
        pane.disable();
        table.disable();
        table.show(false);
    }
    
    //SHOW OFF TABELA
    public void show(JScrollPane pane, JTable table){
        pane.show(true);
        pane.enable();
        table.enable();
        table.show(true);
    }
    
    private void gerarRelatorioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioBotaoActionPerformed
        DefaultTableModel defaultCliente = (DefaultTableModel) todosClientesTable.getModel();
        DefaultTableModel defaultVendas = (DefaultTableModel) todasVendasTable.getModel();

        if (tipoRelatorioCombo.getSelectedItem().toString().equals("Todas Vendas")) {
            
            show(todasVendasPane, todasVendasTable);
            
            showOff(todosClientesPane, todosClientesTable);
            showOff(vendaPeriodoPane, vendaPeriodoTable);

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
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (tipoRelatorioCombo.getSelectedItem().toString().equals("Todos Clientes")) {

            showOff(vendaPeriodoPane, vendaPeriodoTable);
            showOff(todasVendasPane, todasVendasTable);

            show(todosClientesPane, todosClientesTable);

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
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_gerarRelatorioBotaoActionPerformed

    private void ordemAlfabeticaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemAlfabeticaBotaoActionPerformed
        DefaultTableModel defaultCliente = (DefaultTableModel) todosClientesTable.getModel();
        
        if (tipoRelatorioCombo.getSelectedItem().toString().equals("Todos Clientes")){
            showOff(todosClientesPane, todosClientesTable);
            showOff(vendaPeriodoPane, vendaPeriodoTable);
            showOff(todasVendasPane, todasVendasTable);
            
            show(todosClientesPane, todosClientesTable);
            
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
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ordemAlfabeticaBotaoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatoriosADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JTextField dataFinal;
    private javax.swing.JTextField dataInicio;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JButton gerarRelatorioBotao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JButton ordemAlfabeticaBotao;
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
