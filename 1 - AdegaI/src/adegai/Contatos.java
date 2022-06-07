package adegai;

import dao.ClienteDAO;
import model.Cliente;

import java.awt.Cursor;
import java.sql.SQLException;
import java.sql.Connection;

public class Contatos extends javax.swing.JFrame { 
    Connection connection;
    AdegaI adegai = new AdegaI();
    
    //CONSTRUTOR PADRÃO
    public Contatos() {
        initComponents();
    }
    
    //CONSTRUTOR PEGANDO NOME/FUNÇÃO DO USUÁRIO
    public Contatos(String funcionario, String funcao) {
        initComponents();

        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
                
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        funcionarioNome = new javax.swing.JLabel();
        funcionarioFunction = new javax.swing.JLabel();
        botaoHome = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoContatos = new javax.swing.JButton();
        menuLateral = new javax.swing.JLabel();
        menuCima = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        novoClienteCaixa = new javax.swing.JLabel();
        cadastrarClienteBotao = new javax.swing.JButton();
        novoContatoCaixa = new javax.swing.JLabel();
        bgContatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/contatos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 14, -1, -1));

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

        botaoContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.setBorder(null);
        botaoContatos.setBorderPainted(false);
        botaoContatos.setContentAreaFilled(false);
        botaoContatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        jPanel1.add(botaoContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        menuLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuLateral.png"))); // NOI18N
        jPanel1.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuCima.png"))); // NOI18N
        jPanel1.add(menuCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        nomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        nomeCliente.setFont(new java.awt.Font("Jost", 1, 24)); // NOI18N
        nomeCliente.setForeground(new java.awt.Color(32, 32, 32));
        nomeCliente.setText("Nome...");
        nomeCliente.setBorder(null);
        jPanel1.add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 405, 410, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Jost", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 32, 32));
        jLabel2.setText("Cliente");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 50, -1));

        novoClienteCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/nomeCliente.png"))); // NOI18N
        jPanel1.add(novoClienteCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        cadastrarClienteBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarClienteBotao.setBorder(null);
        cadastrarClienteBotao.setContentAreaFilled(false);
        cadastrarClienteBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarClienteBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarClienteBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrarPressed.png"))); // NOI18N
        cadastrarClienteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarClienteBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, -1, -1));

        novoContatoCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/novoContato.png"))); // NOI18N
        jPanel1.add(novoContatoCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        bgContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/bgContatos.png"))); // NOI18N
        jPanel1.add(bgContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        new HomeADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHomeActionPerformed
    
    //DIRECIONA PARA A TELA VENDAS
    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        new VendasADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVendasActionPerformed
 
    //CADASTRAR CLIENTE
    private void cadastrarClienteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteBotaoActionPerformed
        try {
            Cliente cliente = new Cliente (nomeCliente.getText());
            ClienteDAO cdao = new ClienteDAO();

            if (nomeCliente.getText().isEmpty()) {
                adegai.mensagemPopUp("Erro ao cadastrar Cliente!");

            } else if (nomeCliente.isEnabled()){
                cdao.insertCliente(cliente);
                adegai.mensagemPopUp("Cliente Cadastrado!!!");
            }
            cdao.close();
        } catch (SQLException ex) {
            //Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastrarClienteBotaoActionPerformed
    
    //MAIN DA TELA CONTATOS
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Contatos().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgContatos;
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JButton cadastrarClienteBotao;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JLabel novoClienteCaixa;
    private javax.swing.JLabel novoContatoCaixa;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
