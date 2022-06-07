package adegai;

import  dao.ClienteDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import dao.VendaProdutoDAO;
import model.VendaProduto;
import model.Venda;

import java.sql.Connection;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import model.SoNumeros;
import java.util.Date;

public class Vendas extends javax.swing.JFrame {
    Connection connection;
    AdegaI adegai = new AdegaI();
    
    public Vendas() {
        initComponents();
        
        valorProduto.setDocument(new SoNumeros());
        quantidadeProduto.setDocument(new SoNumeros());
        buscarClientes();
        buscarProdutos();
    }
    
    //CONSTRUTOR PEGANDO NOME/FUNÇÃO DO USUÁRIO
    public Vendas(String funcionario, String funcao, String id){
        initComponents();
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
        funcionarioId.setText(id);
        
        if (funcionarioFunction.getText().equals("Padrão")){
            botaoRelatorios.show(false);
            botaoProdutos.show(false);         
        }
        
        valorProduto.setDocument(new SoNumeros());
        quantidadeProduto.setDocument(new SoNumeros());
        
        buscarClientes();
        buscarProdutos();
        
        botaoContatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        vendasBanner = new javax.swing.JLabel();
        botaoHome = new javax.swing.JButton();
        botaoVendas = new javax.swing.JButton();
        botaoContatos = new javax.swing.JButton();
        botaoProdutos = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        menuLateral = new javax.swing.JLabel();
        menuCima = new javax.swing.JLabel();
        totalVenda = new javax.swing.JLabel();
        vendaPane = new javax.swing.JScrollPane();
        vendaTable = new javax.swing.JTable();
        comboProdutos = new javax.swing.JComboBox<>();
        comboClientes = new javax.swing.JComboBox<>();
        quantidadeProduto = new javax.swing.JTextField();
        valorProduto = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoFinalizar = new javax.swing.JButton();
        botaoInserir = new javax.swing.JButton();
        caixas = new javax.swing.JLabel();

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

        vendasBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/vendas.png"))); // NOI18N
        jPanel1.add(vendasBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 15, -1, -1));

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
        jPanel1.add(botaoContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

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
        jPanel1.add(botaoProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

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

        totalVenda.setBackground(new java.awt.Color(255, 255, 255));
        totalVenda.setFont(new java.awt.Font("Jost", 1, 18)); // NOI18N
        totalVenda.setForeground(new java.awt.Color(0, 153, 0));
        totalVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalVenda.setText("0,00");
        jPanel1.add(totalVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 567, 140, 30));

        vendaTable.setBackground(new java.awt.Color(255, 255, 255));
        vendaTable.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        vendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Produto", "Produto", "Quantidade", "Valor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendaPane.setViewportView(vendaTable);

        jPanel1.add(vendaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 207, 490, 310));

        comboProdutos.setBackground(new java.awt.Color(255, 255, 255));
        comboProdutos.setFont(new java.awt.Font("Jost", 2, 12)); // NOI18N
        comboProdutos.setForeground(new java.awt.Color(32, 32, 32));
        comboProdutos.setBorder(null);
        comboProdutos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboProdutosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(comboProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 454, 312, 23));

        comboClientes.setBackground(new java.awt.Color(255, 255, 255));
        comboClientes.setFont(new java.awt.Font("Jost", 2, 12)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(32, 32, 32));
        comboClientes.setBorder(null);
        jPanel1.add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 264, 312, 23));

        quantidadeProduto.setBackground(new java.awt.Color(255, 255, 255));
        quantidadeProduto.setFont(new java.awt.Font("Jost", 1, 12)); // NOI18N
        quantidadeProduto.setForeground(new java.awt.Color(32, 32, 32));
        quantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        quantidadeProduto.setText("0");
        quantidadeProduto.setBorder(null);
        jPanel1.add(quantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 515, 70, 22));

        valorProduto.setBackground(new java.awt.Color(255, 255, 255));
        valorProduto.setFont(new java.awt.Font("Jost", 1, 12)); // NOI18N
        valorProduto.setForeground(new java.awt.Color(32, 32, 32));
        valorProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorProduto.setText("0,00");
        valorProduto.setBorder(null);
        jPanel1.add(valorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 572, 65, 22));

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoLimpar.png"))); // NOI18N
        botaoLimpar.setBorder(null);
        botaoLimpar.setBorderPainted(false);
        botaoLimpar.setContentAreaFilled(false);
        botaoLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLimpar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoLimpar.png"))); // NOI18N
        botaoLimpar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoLimparPressed.png"))); // NOI18N
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel1.add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 633, -1, -1));

        botaoFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoFinalizar.png"))); // NOI18N
        botaoFinalizar.setBorder(null);
        botaoFinalizar.setBorderPainted(false);
        botaoFinalizar.setContentAreaFilled(false);
        botaoFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFinalizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoFinalizar.png"))); // NOI18N
        botaoFinalizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoFinalizarPressed.png"))); // NOI18N
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1043, 633, -1, -1));

        botaoInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoInserir.png"))); // NOI18N
        botaoInserir.setBorder(null);
        botaoInserir.setBorderPainted(false);
        botaoInserir.setContentAreaFilled(false);
        botaoInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInserir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoInserir.png"))); // NOI18N
        botaoInserir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/botaoInserirPressed.png"))); // NOI18N
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });
        jPanel1.add(botaoInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 624, -1, -1));

        caixas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/VendasADM/caixas.png"))); // NOI18N
        jPanel1.add(caixas, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, -1, -1));

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
    
    //PROCURAR TODOS CLIENTES
    public void buscarClientes(){
        try {
            ClienteDAO cdao = new ClienteDAO();
            cdao.buscarClientes(comboClientes);
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //PROCURA TODOS PRODUTOS
    public void buscarProdutos(){
        try {
            ProdutoDAO pdao = new ProdutoDAO();
            pdao.buscarProdutos(comboProdutos);
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
        if (funcionarioFunction.getText().equals("Padrão")) {
            new Contatos(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
            this.dispose();
        } else {
            new ContatosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoContatosActionPerformed

    //DIRECIONA PARA A TELA RELATORIOS
    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
        new RelatoriosADM(this.funcionarioNome.getText(), this.funcionarioFunction.getText(), this.funcionarioId.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoRelatoriosActionPerformed
    
    //INSERIR PRODUTO NA VENDA
    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        DecimalFormat f = new DecimalFormat("#.##");
        DefaultTableModel defaultVenda = (DefaultTableModel) vendaTable.getModel();
        double valorTotal;
        
        if(quantidadeProduto.getText().isEmpty() || quantidadeProduto.getText().isBlank() || quantidadeProduto.getText().equals("0")){
           adegai.mensagemPopUp("Erro"); 
        } else {
            
            String id_produto = Integer.toString(adegai.getId(comboProdutos.getSelectedItem().toString()));
            String produto = adegai.getNome(comboProdutos.getSelectedItem().toString());
            String quantidade = quantidadeProduto.getText();
            String valor = valorProduto.getText().replaceAll(",", ".");
            String total = f.format(Double.parseDouble(valor) * Double.parseDouble(quantidade)).replaceAll(",", ".");
            
            String tabelaVenda[] = {id_produto, produto, quantidade, valor, total};
            
            defaultVenda.addRow(tabelaVenda);
            
            valorTotal = Double.parseDouble(total) + Double.parseDouble(totalVenda.getText().replaceAll(",", "."));
            
            totalVenda.setText(f.format(valorTotal));
        }
        
    }//GEN-LAST:event_botaoInserirActionPerformed
    
    //IMPRIME VALOR DO PRODUTO SELECIONADO
    private void comboProdutosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboProdutosPopupMenuWillBecomeInvisible
        try {
            ProdutoDAO pdao = new ProdutoDAO();
            
            valorProduto.setText(Double.toString(pdao.buscarValorProduto(adegai.getId(comboProdutos.getSelectedItem().toString())))); 
            
            pdao.close();
        } catch (SQLException ex) {
            
           // Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboProdutosPopupMenuWillBecomeInvisible
    
    //LIMPA DADOS DA VENDA
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        DefaultTableModel defaultVenda = (DefaultTableModel) vendaTable.getModel();
        
        defaultVenda.setRowCount(0);
        
        totalVenda.setText("0,00");
    }//GEN-LAST:event_botaoLimparActionPerformed
    
    //FINALIZAR VENDA (INSERIR NO BANCO)
    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        Date date = new Date();
        SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
        
        String data = fdate.format(date);
        double total = Double.parseDouble(totalVenda.getText().replaceAll(",", "."));
        int id_cliente = adegai.getId(comboClientes.getSelectedItem().toString());
        int id_funcionario = Integer.parseInt(funcionarioId.getText());
        
        try {
            VendaDAO vdao = new VendaDAO();
            Venda venda = new Venda(data, total, id_cliente, id_funcionario);
                    
            vdao.insertVenda(venda);
            
            VendaProdutoDAO vpdao = new VendaProdutoDAO();
            VendaProduto vendaProduto = new VendaProduto(2, id_cliente, id_cliente);
            
            
            adegai.mensagemPopUp("Venda feita!");
        } catch (SQLException ex) {
            
            adegai.mensagemPopUp("Erro ao fazer a venda =(");
            //Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_botaoFinalizarActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Vendas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JLabel caixas;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboProdutos;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioId;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JTextField quantidadeProduto;
    private javax.swing.JLabel totalVenda;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField valorProduto;
    private javax.swing.JScrollPane vendaPane;
    private javax.swing.JTable vendaTable;
    private javax.swing.JLabel vendasBanner;
    // End of variables declaration//GEN-END:variables
}
