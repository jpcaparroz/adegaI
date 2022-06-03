package adegai;

import bd.ConnectBd;
import dao.ProdutoDAO;
import model.Produto;

import java.sql.Connection;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.SoNumeros;
import javax.swing.table.DefaultTableModel;

public class ProdutosADM extends javax.swing.JFrame {
    Connection connection;
    AdegaI adegai = new AdegaI();
    
    public ProdutosADM() {
        initComponents();

        quantidadeEstoque.setDocument(new SoNumeros());
        quantidadeProduto.setDocument(new SoNumeros()); 
        valorProduto.setDocument(new SoNumeros());
        
        buscarProdutos(excluirPordutosCombo);
        buscarProdutos(controleEstoqueCombo);
    }
    
    //CONSTRUTOR PEGANDO NOME/FUNÇÃO DO USUÁRIO
    public ProdutosADM(String funcionario, String funcao){
        initComponents();
        
        quantidadeEstoque.setDocument(new SoNumeros());
        quantidadeProduto.setDocument(new SoNumeros()); 
        valorProduto.setDocument(new SoNumeros());
        
        buscarProdutos(excluirPordutosCombo);
        buscarProdutos(controleEstoqueCombo);
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
                
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    //BUSCA TODOS PRODUTOS
    public void buscarProdutos(JComboBox combo) {
        combo.removeAllItems();
        try {
            connection = ConnectBd.getConnection();
            String sql = "SELECT * FROM produto";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();
            
            while (result.next()){
            
            String produto = (result.getString(2));

            combo.addItem(produto);
            
            }
            connection.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        produtosBanner = new javax.swing.JLabel();
        logoIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        funcionarioNome = new javax.swing.JLabel();
        funcionarioFunction = new javax.swing.JLabel();
        botaoHome = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoContatos = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        quantidadeProtudosField = new javax.swing.JLabel();
        menuLateral = new javax.swing.JLabel();
        menuCima = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        quantidadeProduto = new javax.swing.JTextField();
        valorProduto = new javax.swing.JTextField();
        cadastrarBotao = new javax.swing.JButton();
        tipoProdutoCombo = new javax.swing.JComboBox<>();
        limparBotao = new javax.swing.JButton();
        quantidadeEstoque = new javax.swing.JTextField();
        tipoEstoqueCombo = new javax.swing.JComboBox<>();
        lancarBotao = new javax.swing.JButton();
        controleEstoqueCombo = new javax.swing.JComboBox<>();
        excluirBotao = new javax.swing.JButton();
        excluirPordutosCombo = new javax.swing.JComboBox<>();
        atualizarBotao = new javax.swing.JButton();
        produtoPlane = new javax.swing.JScrollPane();
        produtoTable = new javax.swing.JTable();
        caixas = new javax.swing.JLabel();
        bgProdutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        produtosBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/produtos.png"))); // NOI18N
        jPanel1.add(produtosBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 14, -1, -1));

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

        botaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIconPressed.png"))); // NOI18N
        botaoProdutos.setBorder(null);
        botaoProdutos.setBorderPainted(false);
        botaoProdutos.setContentAreaFilled(false);
        botaoProdutos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIconPressed.png"))); // NOI18N
        botaoProdutos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/productIconPressed.png"))); // NOI18N
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

        quantidadeProtudosField.setFont(new java.awt.Font("Jost", 3, 64)); // NOI18N
        quantidadeProtudosField.setForeground(new java.awt.Color(255, 209, 0));
        quantidadeProtudosField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeProtudosField.setText("0");
        jPanel1.add(quantidadeProtudosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 380, 485, 60));

        menuLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuLateral.png"))); // NOI18N
        jPanel1.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/HomeADM/menuCima.png"))); // NOI18N
        jPanel1.add(menuCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        nomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        nomeProduto.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        nomeProduto.setForeground(new java.awt.Color(32, 32, 32));
        nomeProduto.setText("Nome do Produto");
        nomeProduto.setBorder(null);
        jPanel1.add(nomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 249, 193, 22));

        quantidadeProduto.setBackground(new java.awt.Color(255, 255, 255));
        quantidadeProduto.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        quantidadeProduto.setForeground(new java.awt.Color(32, 32, 32));
        quantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        quantidadeProduto.setBorder(null);
        jPanel1.add(quantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 303, 70, 22));

        valorProduto.setBackground(new java.awt.Color(255, 255, 255));
        valorProduto.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        valorProduto.setForeground(new java.awt.Color(0, 153, 51));
        valorProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorProduto.setText("0,00");
        valorProduto.setBorder(null);
        jPanel1.add(valorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 359, 70, 22));

        cadastrarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarBotao.setBorder(null);
        cadastrarBotao.setBorderPainted(false);
        cadastrarBotao.setContentAreaFilled(false);
        cadastrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoCadastrarPressed.png"))); // NOI18N
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 402, -1, -1));

        tipoProdutoCombo.setBackground(new java.awt.Color(255, 255, 255));
        tipoProdutoCombo.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        tipoProdutoCombo.setForeground(new java.awt.Color(0, 0, 0));
        tipoProdutoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lata", "Garrafa", "Fardo", "Pet", "Caixa" }));
        tipoProdutoCombo.setBorder(null);
        tipoProdutoCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(tipoProdutoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 108, 21));

        limparBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoLimpar.png"))); // NOI18N
        limparBotao.setBorder(null);
        limparBotao.setBorderPainted(false);
        limparBotao.setContentAreaFilled(false);
        limparBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limparBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoLimpar.png"))); // NOI18N
        limparBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoLimparPressed.png"))); // NOI18N
        limparBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(limparBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 402, -1, -1));

        quantidadeEstoque.setBackground(new java.awt.Color(255, 255, 255));
        quantidadeEstoque.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        quantidadeEstoque.setForeground(new java.awt.Color(32, 32, 32));
        quantidadeEstoque.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        quantidadeEstoque.setText("0");
        quantidadeEstoque.setBorder(null);
        jPanel1.add(quantidadeEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 568, 80, 22));

        tipoEstoqueCombo.setBackground(new java.awt.Color(255, 255, 255));
        tipoEstoqueCombo.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        tipoEstoqueCombo.setForeground(new java.awt.Color(0, 0, 0));
        tipoEstoqueCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída", "Balanço" }));
        tipoEstoqueCombo.setBorder(null);
        tipoEstoqueCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(tipoEstoqueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 623, 93, 20));

        lancarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoLancar.png"))); // NOI18N
        lancarBotao.setBorder(null);
        lancarBotao.setBorderPainted(false);
        lancarBotao.setContentAreaFilled(false);
        lancarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lancarBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoLancar.png"))); // NOI18N
        lancarBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoLancarPressed.png"))); // NOI18N
        lancarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(lancarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 621, -1, -1));

        controleEstoqueCombo.setBackground(new java.awt.Color(255, 255, 255));
        controleEstoqueCombo.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        controleEstoqueCombo.setForeground(new java.awt.Color(0, 0, 0));
        controleEstoqueCombo.setBorder(null);
        controleEstoqueCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(controleEstoqueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 568, 190, 22));

        excluirBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoEcluir.png"))); // NOI18N
        excluirBotao.setBorder(null);
        excluirBotao.setBorderPainted(false);
        excluirBotao.setContentAreaFilled(false);
        excluirBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoEcluir.png"))); // NOI18N
        excluirBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoExcluirPressed.png"))); // NOI18N
        excluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(excluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 621, -1, -1));

        excluirPordutosCombo.setBackground(new java.awt.Color(255, 255, 255));
        excluirPordutosCombo.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        excluirPordutosCombo.setForeground(new java.awt.Color(0, 0, 0));
        excluirPordutosCombo.setBorder(null);
        excluirPordutosCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(excluirPordutosCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 563, 190, 22));

        atualizarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoAtualizar.png"))); // NOI18N
        atualizarBotao.setBorder(null);
        atualizarBotao.setContentAreaFilled(false);
        atualizarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoAtualizar.png"))); // NOI18N
        atualizarBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/botaoAtualizarPressed.png"))); // NOI18N
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(atualizarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, -1, -1));

        produtoTable.setBackground(new java.awt.Color(255, 255, 255));
        produtoTable.setFont(new java.awt.Font("Jost", 1, 12)); // NOI18N
        produtoTable.setForeground(new java.awt.Color(32, 32, 32));
        produtoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Quantidade", "Tipo"
            }
        ));
        produtoTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        produtoPlane.setViewportView(produtoTable);

        jPanel1.add(produtoPlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 200, 480, 170));

        caixas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/caixas.png"))); // NOI18N
        jPanel1.add(caixas, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, -1, -1));

        bgProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ProdutosADM/bgProdutos.png"))); // NOI18N
        jPanel1.add(bgProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    
    //BUSCA QUANTIDADE DE PRODUTOS CADASTRADOS
    public void qntProduto(JLabel qnt){
        try {
            ProdutoDAO pdao = new ProdutoDAO();
            
            quantidadeProtudosField.setText(Integer.toString(pdao.quantidadeProduto()));
        } catch (SQLException ex) {
            
            //Logger.getLogger(ProdutosADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //DIRECIONA PARA A TELA HOME
    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        
        new HomeADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHomeActionPerformed

    //DIRECIONA PARA A TELA CONTATOS
    private void botaoContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContatosActionPerformed
        
        new ContatosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoContatosActionPerformed

    //DIRECIONA PARA A TELA VENDAS
    private void botaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendasActionPerformed
        
        new VendasADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVendasActionPerformed
    
    //DIRECIONA PARA A TELA RELATORIOS
    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
        
        new RelatoriosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoRelatoriosActionPerformed
    
    //EXCLUI PRODUTO
    private void excluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBotaoActionPerformed
        try {
            Produto produto = new Produto(excluirPordutosCombo.getSelectedItem().toString());
            ProdutoDAO pdao = new ProdutoDAO();
            
            if (pdao.deletProduto(produto.getNome())) {
                
                adegai.mensagemPopUp("Produto Excluído com sucesso!");
                atualizarBotaoActionPerformed(evt);
            }    
        } catch (SQLException ex) {
            adegai.mensagemPopUp("Erro!");
            atualizarBotaoActionPerformed(evt);
            //Logger.getLogger(ProdutosADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirBotaoActionPerformed
    
    //LANÇA NO ESTOQUE
    private void lancarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancarBotaoActionPerformed
        if(quantidadeEstoque.getText().isEmpty() || quantidadeEstoque.getText().isBlank()) {
            
            adegai.mensagemPopUp("Erro!");      
        } else try {
            Produto produto = new Produto(Integer.valueOf(quantidadeEstoque.getText()), controleEstoqueCombo.getSelectedItem().toString());
            ProdutoDAO pdao = new ProdutoDAO();
            
            if (tipoEstoqueCombo.getSelectedItem().toString().equals("Balanço")) {
                
                pdao.balancoQuantidadeProduto(produto);
                adegai.mensagemPopUp("Balanço realizado com sucesso!!!");
                
                atualizarBotaoActionPerformed(evt);
            } else if (tipoEstoqueCombo.getSelectedItem().toString().equals("Entrada")) {
                
                int atual = pdao.quantidadeEstoqueProduto(produto);
                produto.setQuantidade(atual + produto.getQuantidade());
                
                pdao.balancoQuantidadeProduto(produto);
                adegai.mensagemPopUp("Entrada realizado com sucesso!!!");
                atualizarBotaoActionPerformed(evt);  
            } else {
                
                int atual = pdao.quantidadeEstoqueProduto(produto);
                produto.setQuantidade(atual - produto.getQuantidade());
                
                pdao.balancoQuantidadeProduto(produto);
                adegai.mensagemPopUp("Saída realizada com sucesso!!!");
                atualizarBotaoActionPerformed(evt); 
            }    
        } catch (SQLException ex) {
            
            atualizarBotaoActionPerformed(evt);
            adegai.mensagemPopUp("Erro");
            //Logger.getLogger(ProdutosADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lancarBotaoActionPerformed
    
    //LIMPA TODOS CAMPOS DA CRIAÇÃO DO PRODUTO
    private void limparBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBotaoActionPerformed
        nomeProduto.setText("Nome do Produto");
        quantidadeProduto.setText("0");
        valorProduto.setText("0,00");
        atualizarBotaoActionPerformed(evt);
    }//GEN-LAST:event_limparBotaoActionPerformed
    
    //CADASTRA PRODUTO
    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        if (nomeProduto.getText().isEmpty() || quantidadeProduto.getText().isEmpty() || valorProduto.getText().isEmpty()) {
            adegai.mensagemPopUp("Erro!");
        } else {
            try {
                Produto produto = new Produto(nomeProduto.getText(), Double.parseDouble(valorProduto.getText().replaceAll(",", ".")), Integer.parseInt(quantidadeProduto.getText()), tipoProdutoCombo.getSelectedItem().toString());
                ProdutoDAO pdao = new ProdutoDAO();

                pdao.insertProduto(produto);
                adegai.mensagemPopUp("Produto Cadastrado =)");
                atualizarBotaoActionPerformed(evt);
            } catch (SQLException ex) {
                adegai.mensagemPopUp("Erro ao cadastrar...");
                atualizarBotaoActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_cadastrarBotaoActionPerformed
    
    //ATUALIZA TABELA DE PRODUTOS
    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed
        String sql = "SELECT * FROM produto";
            PreparedStatement statement;
            DefaultTableModel defaultProduto = (DefaultTableModel) produtoTable.getModel();
            defaultProduto.setRowCount(0);
            qntProduto(quantidadeProtudosField);
            buscarProdutos(excluirPordutosCombo);
            buscarProdutos(controleEstoqueCombo);
            
            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                
                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String nome = result.getString(2);
                    String valor = Double.toString(result.getDouble(3));
                    String quantidade = Integer.toString(result.getInt(4));
                    String tipo = result.getString(5);

                    String tabelaProduto[] = {id, nome, valor, quantidade, tipo};

                    defaultProduto.addRow(tabelaProduto);
                }
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_atualizarBotaoActionPerformed
    
    //MAIN
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new ProdutosADM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JLabel bgProdutos;
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JLabel caixas;
    private javax.swing.JComboBox<String> controleEstoqueCombo;
    private javax.swing.JButton excluirBotao;
    private javax.swing.JComboBox<String> excluirPordutosCombo;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lancarBotao;
    private javax.swing.JButton limparBotao;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JScrollPane produtoPlane;
    private javax.swing.JTable produtoTable;
    private javax.swing.JLabel produtosBanner;
    private javax.swing.JTextField quantidadeEstoque;
    private javax.swing.JTextField quantidadeProduto;
    private javax.swing.JLabel quantidadeProtudosField;
    private javax.swing.JComboBox<String> tipoEstoqueCombo;
    private javax.swing.JComboBox<String> tipoProdutoCombo;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField valorProduto;
    // End of variables declaration//GEN-END:variables
}
