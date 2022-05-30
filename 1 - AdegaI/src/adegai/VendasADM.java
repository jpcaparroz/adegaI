package adegai;

import bd.ConnectBd;
import java.sql.Connection;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendasADM extends javax.swing.JFrame {
    
    Connection connection;
    public VendasADM() {
        initComponents();
        buscarClientes();
    }
    
    public VendasADM(String funcionario, String funcao){
        initComponents();
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
        
        buscarClientes();
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoFinalizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        comboClientes = new javax.swing.JComboBox<>();
        caixaCliente = new javax.swing.JLabel();
        botaoFinalizar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        vendasCaixa = new javax.swing.JLabel();
        novaVendaCaixa = new javax.swing.JLabel();

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

        botaoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
        botaoVendas.setBorder(null);
        botaoVendas.setBorderPainted(false);
        botaoVendas.setContentAreaFilled(false);
        botaoVendas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
        botaoVendas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/vendaIconPressed.png"))); // NOI18N
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

        botaoRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIcon.png"))); // NOI18N
        botaoRelatorios.setBorder(null);
        botaoRelatorios.setBorderPainted(false);
        botaoRelatorios.setContentAreaFilled(false);
        botaoRelatorios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIconPressed.png"))); // NOI18N
        botaoRelatorios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/relatorioIconPressed.png"))); // NOI18N
        botaoRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatoriosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        menuLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuLateral.png"))); // NOI18N
        jPanel1.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuCima.png"))); // NOI18N
        jPanel1.add(menuCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        comboClientes.setBackground(new java.awt.Color(255, 255, 255));
        comboClientes.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(0, 0, 0));
        comboClientes.setToolTipText("");
        comboClientes.setBorder(null);
        comboClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboClientesMouseClicked(evt);
            }
        });
        jPanel1.add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 266, 320, 20));

        caixaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/clienteCaixa.png"))); // NOI18N
        jPanel1.add(caixaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 238, -1, -1));

        botaoFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoFinalizar.png"))); // NOI18N
        botaoFinalizar.setBorder(null);
        botaoFinalizar.setContentAreaFilled(false);
        botaoFinalizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoFinalizar.png"))); // NOI18N
        botaoFinalizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoFinalizarPressed.png"))); // NOI18N
        jPanel1.add(botaoFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 636, -1, -1));

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoLimpar.png"))); // NOI18N
        botaoLimpar.setBorder(null);
        botaoLimpar.setContentAreaFilled(false);
        botaoLimpar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoLimpar.png"))); // NOI18N
        botaoLimpar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoLimparPressed.png"))); // NOI18N
        jPanel1.add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 636, -1, -1));

        vendasCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/caixaVendas.png"))); // NOI18N
        jPanel1.add(vendasCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 138, -1, -1));

        novaVendaCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/novaVendaCaixa.png"))); // NOI18N
        jPanel1.add(novaVendaCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, -1, -1));

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

    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
        
        new RelatoriosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoRelatoriosActionPerformed
    
    public void buscarClientes() {
        try {
            connection = ConnectBd.getConnection();
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();
            
            while (result.next()){
            
            String cliente = (result.getString(2));

            comboClientes.addItem(cliente);
            
            }
            connection.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(VendasADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void comboClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboClientesMouseClicked

    }//GEN-LAST:event_comboClientesMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JLabel caixaCliente;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JLabel novaVendaCaixa;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel vendasCaixa;
    // End of variables declaration//GEN-END:variables
}
