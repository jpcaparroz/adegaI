package adegai;

import java.awt.Cursor;

public class ContatosADM extends javax.swing.JFrame {
    
    public ContatosADM() {
        initComponents();
        
        showOffCliente(); 
        showOffFuncionario();
        
    }

    public ContatosADM(String funcionario, String funcao){
        initComponents();
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
                
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    //SHOW NO CLIENTE
    public void showCliente() {
        novoClienteCaixa.show(true);
        novoClienteCaixa.enable();
        nomeCliente.show(true);
        nomeCliente.enable();
        nomeCliente.setText("Nome...");
    }
    
    //SHOW OFF NO CLIENTE
    public void showOffCliente() {
        novoClienteCaixa.show(false);
        novoClienteCaixa.disable();
        nomeCliente.show(false);
        nomeCliente.disable();
        nomeCliente.setText(null);
    }
    
    //SHOW OFF NO FUNCIONARIO
    public void showOffFuncionario(){
        nomeFuncionario.show(false);
        nomeFuncionario.setText(null);
        loginFuncionario.show(false);
        loginFuncionario.setText(null);
        senhaFuncionario.show(false);
        senhaFuncionario.setText(null);
        novoFuncionarioCaixa.show(false);
    }
    
    //SHOW NO FUNCIONARIO
    public void showFuncionario() {
        nomeFuncionario.show(true);
        nomeFuncionario.setText("Nome...");
        loginFuncionario.show(true);
        loginFuncionario.setText("Login...");
        senhaFuncionario.show(true);
        senhaFuncionario.setText("Senha...");
        novoFuncionarioCaixa.show(true);
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
        nomeFuncionario = new javax.swing.JTextField();
        loginFuncionario = new javax.swing.JTextField();
        senhaFuncionario = new javax.swing.JTextField();
        novoFuncionarioCaixa = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        novoClienteCaixa = new javax.swing.JLabel();
        selecionarBotao = new javax.swing.JButton();
        comboContato = new javax.swing.JComboBox<>();
        cadastrarBotao = new javax.swing.JButton();
        limparBotao = new javax.swing.JButton();
        novoContatoCaixa = new javax.swing.JLabel();
        todosContatosCaixa = new javax.swing.JLabel();

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

        botaoContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.setBorder(null);
        botaoContatos.setBorderPainted(false);
        botaoContatos.setContentAreaFilled(false);
        botaoContatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
        botaoContatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/contatosIconPressed.png"))); // NOI18N
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

        nomeFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        nomeFuncionario.setFont(new java.awt.Font("Jost", 1, 20)); // NOI18N
        nomeFuncionario.setForeground(new java.awt.Color(32, 32, 32));
        nomeFuncionario.setText("Nome");
        nomeFuncionario.setBorder(null);
        jPanel1.add(nomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 365, 320, 40));

        loginFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        loginFuncionario.setFont(new java.awt.Font("Jost", 1, 20)); // NOI18N
        loginFuncionario.setForeground(new java.awt.Color(32, 32, 32));
        loginFuncionario.setText("Login");
        loginFuncionario.setBorder(null);
        jPanel1.add(loginFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 453, 320, 40));

        senhaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        senhaFuncionario.setFont(new java.awt.Font("Jost", 1, 20)); // NOI18N
        senhaFuncionario.setForeground(new java.awt.Color(32, 32, 32));
        senhaFuncionario.setText("Senha");
        senhaFuncionario.setBorder(null);
        jPanel1.add(senhaFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 550, 320, 40));

        novoFuncionarioCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/caixaFuncionario.png"))); // NOI18N
        jPanel1.add(novoFuncionarioCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 328, -1, -1));

        nomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        nomeCliente.setFont(new java.awt.Font("Jost", 1, 24)); // NOI18N
        nomeCliente.setForeground(new java.awt.Color(32, 32, 32));
        nomeCliente.setText("Nome...");
        nomeCliente.setBorder(null);
        jPanel1.add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 405, 410, 50));

        novoClienteCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/nomeCliente.png"))); // NOI18N
        jPanel1.add(novoClienteCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 360, -1, -1));

        selecionarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionar.png"))); // NOI18N
        selecionarBotao.setBorder(null);
        selecionarBotao.setContentAreaFilled(false);
        selecionarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecionarBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionar.png"))); // NOI18N
        selecionarBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionarPressed.png"))); // NOI18N
        selecionarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(selecionarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 271, -1, -1));

        comboContato.setBackground(new java.awt.Color(255, 255, 255));
        comboContato.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        comboContato.setForeground(new java.awt.Color(0, 0, 0));
        comboContato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário", "Administrador" }));
        comboContato.setBorder(null);
        comboContato.setMinimumSize(new java.awt.Dimension(106, 40));
        comboContato.setPreferredSize(new java.awt.Dimension(106, 40));
        jPanel1.add(comboContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 271, 180, 17));

        cadastrarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarBotao.setBorder(null);
        cadastrarBotao.setContentAreaFilled(false);
        cadastrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrarPressed.png"))); // NOI18N
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 636, -1, -1));

        limparBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoLimpar.png"))); // NOI18N
        limparBotao.setBorder(null);
        limparBotao.setContentAreaFilled(false);
        limparBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limparBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoLimpar.png"))); // NOI18N
        limparBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoLimparPressed.png"))); // NOI18N
        limparBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(limparBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 636, -1, -1));

        novoContatoCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/novoContato.png"))); // NOI18N
        jPanel1.add(novoContatoCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, -1, -1));

        todosContatosCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/caixaContatos.png"))); // NOI18N
        jPanel1.add(todosContatosCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 138, -1, -1));

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

    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        
        new VendasADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVendasActionPerformed

    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
        
        new RelatoriosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoRelatoriosActionPerformed

    private void botaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosActionPerformed
        
        new ProdutosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProdutosActionPerformed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed

        
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void selecionarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBotaoActionPerformed
        
        if(comboContato.getSelectedItem().toString().equals("Administrador")){
            
            showOffFuncionario();
            showOffCliente();
            
        } else if (comboContato.getSelectedItem().toString().equals("Cliente")) { 
            
            showCliente();
            
            showOffFuncionario();
                        
        } else {
            
            showFuncionario();
            
            showOffCliente();
        }
    }//GEN-LAST:event_selecionarBotaoActionPerformed

    private void limparBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBotaoActionPerformed
        
        showOffCliente();
        showOffFuncionario();
        
    }//GEN-LAST:event_limparBotaoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContatosADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JComboBox<String> comboContato;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparBotao;
    private javax.swing.JTextField loginFuncionario;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField nomeFuncionario;
    private javax.swing.JLabel novoClienteCaixa;
    private javax.swing.JLabel novoContatoCaixa;
    private javax.swing.JLabel novoFuncionarioCaixa;
    private javax.swing.JButton selecionarBotao;
    private javax.swing.JTextField senhaFuncionario;
    private javax.swing.JLabel todosContatosCaixa;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
