package adegai;

import bd.ConnectBd;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import model.Funcionario;
import model.Cliente;

import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ContatosADM extends javax.swing.JFrame {
    
    Connection connection;
    
    public ContatosADM() {
        initComponents();
        
        showOffTabelaAdministrador();
        showOffTabelaCliente();
        showOffTabelaFuncionario();
        showOffCliente(); 
        showOffFuncionario();
        showOffAdministrador();
        
    }

    public ContatosADM(String funcionario, String funcao) {
        initComponents();
        
        showOffTabelaAdministrador();
        showOffTabelaCliente();
        showOffTabelaFuncionario();
        showOffCliente(); 
        showOffFuncionario();
        showOffAdministrador();
        
        funcionarioNome.setText(funcionario);
        funcionarioFunction.setText(funcao);
                
        botaoProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    //SHOW TABELA CLIENTE
    public void showTabelaCliente() {
        clientePlane.show(true);
        clientePlane.enable();
        clienteTable.enable();
        clienteTable.show(true);        
    }
    
    //SHOW OFF TABELA CLIENTE
    public void showOffTabelaCliente() {
        clientePlane.show(false);
        clientePlane.disable();
        clienteTable.disable();
        clienteTable.show(false);
    }
    
    //SHOW TABELA FUNCIONARIO
    public void showTabelaFuncionario() {
        funcionarioPane.show(true);
        funcionarioPane.enable();
        funcionarioTable.enable();
        funcionarioTable.show(true);        

    }
    
    //SHOW OFF TABELA FUNCIONARIO
    public void showOffTabelaFuncionario() {
        funcionarioPane.show(false);
        funcionarioPane.disable();
        funcionarioTable.disable();
        funcionarioTable.show(false);
    }
    
    //SHOW TABELA ADMINISTRADOR
    public void showTabelaAdministrador() {
        administradorPane.show(true);
        administradorPane.enable();
        administradorTable.enable();
        administradorTable.show(true);        
    }
    
    //SHOW OFF TABELA ADMINISTRADOR
    public void showOffTabelaAdministrador() {
        administradorPane.show(false);
        administradorPane.disable();
        administradorTable.disable();
        administradorTable.show(false);
    }
    
    //SHOW NO CLIENTE
    public void showCliente() {
        novoClienteCaixa.show(true);
        novoClienteCaixa.enable();
        nomeCliente.show(true);
        nomeCliente.enable();
        nomeCliente.setText("Nome...");
        cadastrarClienteBotao.enable();
        cadastrarClienteBotao.show(true);
    }
    
    //SHOW OFF NO CLIENTE
    public void showOffCliente() {
        novoClienteCaixa.show(false);
        novoClienteCaixa.disable();
        nomeCliente.show(false);
        nomeCliente.disable();
        nomeCliente.setText(null);
        cadastrarClienteBotao.disable();
        cadastrarClienteBotao.show(false);
    }
    
    //SHOW OFF NO FUNCIONARIO
    public void showOffFuncionario(){
        nomeFuncionario.show(false);
        nomeFuncionario.disable();
        nomeFuncionario.setText(null);
        loginFuncionario.show(false);
        loginFuncionario.disable();
        loginFuncionario.setText(null);
        senhaFuncionario.show(false);
        senhaFuncionario.disable();
        senhaFuncionario.setText(null);
        novoFuncionarioCaixa.show(false);
        novoFuncionarioCaixa.disable();
        cadastrarFuncionarioBotao.disable();
        cadastrarFuncionarioBotao.show(false);
    }
    
    //SHOW NO FUNCIONARIO
    public void showFuncionario() {
        nomeFuncionario.show(true);
        nomeFuncionario.enable();
        nomeFuncionario.setText("Nome...");
        loginFuncionario.show(true);
        loginFuncionario.enable();
        loginFuncionario.setText("Login...");
        senhaFuncionario.show(true);
        senhaFuncionario.enable();
        senhaFuncionario.setText("Senha...");
        novoFuncionarioCaixa.show(true);
        novoFuncionarioCaixa.enable();
        cadastrarFuncionarioBotao.enable();
        cadastrarFuncionarioBotao.show(true);
    }
    
    //SHOW NO ADMINISTRADOR
    public void showAdministrador() {
        novoAdministradorCaixa.show(true);
        nomeAdministrador.show(true);
        loginAdministrador.show(true);
        senhaAdministrador.show(true);
        novoAdministradorCaixa.enable();
        nomeAdministrador.enable();
        nomeAdministrador.setText("Nome...");
        loginAdministrador.enable();
        loginAdministrador.setText("Login...");
        senhaAdministrador.enable();
        senhaAdministrador.setText("Senha...");
        cadastrarAdministradorBotao.show(true);
        cadastrarAdministradorBotao.enable();
    }
    
    //SHOW OFF NO ADMINISTRADOR
    public void showOffAdministrador() {
        novoAdministradorCaixa.show(false);
        nomeAdministrador.show(false);
        loginAdministrador.show(false);
        senhaAdministrador.show(false);
        novoAdministradorCaixa.enable();
        nomeAdministrador.disable();
        nomeAdministrador.setText(null);
        loginAdministrador.disable();
        loginAdministrador.setText(null);
        senhaAdministrador.disable();
        senhaAdministrador.setText(null);
        cadastrarAdministradorBotao.show(false);
        cadastrarAdministradorBotao.disable();
    }
    
    //BUSCA TODOS CONTATOS
    public void buscarContatos(JComboBox combo) throws SQLException {

        connection = ConnectBd.getConnection();

        if (excluirTipoContatoCombo.getSelectedItem().toString().equals("Cliente")) {
            combo.removeAllItems();
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                String contato = (result.getInt(1) + "-> "+ result.getString(2));
                combo.addItem(contato);
            }
        } else if (excluirTipoContatoCombo.getSelectedItem().toString().equals("Funcionário")) {
            combo.removeAllItems();
            String sql = "SELECT * FROM funcionario WHERE admin=0";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                String contato = (result.getString(2) + " | Login: " + result.getString(3));
                combo.addItem(contato);
            }
        } else {
            combo.removeAllItems();
            String sql = "SELECT * FROM funcionario WHERE admin=1";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                String contato = (result.getString(2) + " | Login: " + result.getString(3));
                combo.addItem(contato);
            }
        }
        connection.close();
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
        senhaAdministrador = new javax.swing.JTextField();
        loginAdministrador = new javax.swing.JTextField();
        nomeAdministrador = new javax.swing.JTextField();
        novoAdministradorCaixa = new javax.swing.JLabel();
        nomeFuncionario = new javax.swing.JTextField();
        loginFuncionario = new javax.swing.JTextField();
        senhaFuncionario = new javax.swing.JTextField();
        novoFuncionarioCaixa = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        novoClienteCaixa = new javax.swing.JLabel();
        selecionarTabelaBotao = new javax.swing.JButton();
        tipoRelatorioCombo = new javax.swing.JComboBox<>();
        selecionarBotao = new javax.swing.JButton();
        comboContato = new javax.swing.JComboBox<>();
        cadastrarFuncionarioBotao = new javax.swing.JButton();
        cadastrarClienteBotao = new javax.swing.JButton();
        cadastrarAdministradorBotao = new javax.swing.JButton();
        limparBotao = new javax.swing.JButton();
        clientePlane = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();
        funcionarioPane = new javax.swing.JScrollPane();
        funcionarioTable = new javax.swing.JTable();
        administradorPane = new javax.swing.JScrollPane();
        administradorTable = new javax.swing.JTable();
        novoContatoCaixa = new javax.swing.JLabel();
        selecionarExcluirBotao = new javax.swing.JButton();
        excluirTipoContatoCombo = new javax.swing.JComboBox<>();
        excluirPordutosCombo = new javax.swing.JComboBox<>();
        excluirBotao = new javax.swing.JButton();
        caixa = new javax.swing.JLabel();
        bgContatos = new javax.swing.JLabel();

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

        senhaAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        senhaAdministrador.setFont(new java.awt.Font("Jost", 1, 20)); // NOI18N
        senhaAdministrador.setForeground(new java.awt.Color(32, 32, 32));
        senhaAdministrador.setText("Senha...");
        senhaAdministrador.setBorder(null);
        jPanel1.add(senhaAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 549, 320, 40));

        loginAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        loginAdministrador.setFont(new java.awt.Font("Jost", 1, 20)); // NOI18N
        loginAdministrador.setForeground(new java.awt.Color(32, 32, 32));
        loginAdministrador.setText("Login...");
        loginAdministrador.setBorder(null);
        jPanel1.add(loginAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 453, 320, 40));

        nomeAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        nomeAdministrador.setFont(new java.awt.Font("Jost", 1, 20)); // NOI18N
        nomeAdministrador.setForeground(new java.awt.Color(32, 32, 32));
        nomeAdministrador.setText("Nome...");
        nomeAdministrador.setBorder(null);
        jPanel1.add(nomeAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 365, 320, 40));

        novoAdministradorCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/caixaAdministrador.png"))); // NOI18N
        jPanel1.add(novoAdministradorCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 324, -1, -1));

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

        selecionarTabelaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionar.png"))); // NOI18N
        selecionarTabelaBotao.setBorder(null);
        selecionarTabelaBotao.setContentAreaFilled(false);
        selecionarTabelaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecionarTabelaBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionar.png"))); // NOI18N
        selecionarTabelaBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionarPressed.png"))); // NOI18N
        selecionarTabelaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarTabelaBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(selecionarTabelaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 162, -1, -1));

        tipoRelatorioCombo.setBackground(new java.awt.Color(255, 255, 255));
        tipoRelatorioCombo.setFont(new java.awt.Font("Jost", 0, 32)); // NOI18N
        tipoRelatorioCombo.setForeground(new java.awt.Color(32, 32, 32));
        tipoRelatorioCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário", "Administrador" }));
        tipoRelatorioCombo.setBorder(null);
        tipoRelatorioCombo.setMinimumSize(new java.awt.Dimension(106, 40));
        tipoRelatorioCombo.setPreferredSize(new java.awt.Dimension(106, 40));
        jPanel1.add(tipoRelatorioCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 230, 40));

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

        cadastrarFuncionarioBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarFuncionarioBotao.setBorder(null);
        cadastrarFuncionarioBotao.setContentAreaFilled(false);
        cadastrarFuncionarioBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarFuncionarioBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarFuncionarioBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrarPressed.png"))); // NOI18N
        cadastrarFuncionarioBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarFuncionarioBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 636, -1, -1));

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
        jPanel1.add(cadastrarClienteBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 636, -1, -1));

        cadastrarAdministradorBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarAdministradorBotao.setBorder(null);
        cadastrarAdministradorBotao.setContentAreaFilled(false);
        cadastrarAdministradorBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarAdministradorBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrar.png"))); // NOI18N
        cadastrarAdministradorBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoCadastrarPressed.png"))); // NOI18N
        cadastrarAdministradorBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAdministradorBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarAdministradorBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 636, -1, -1));

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

        clienteTable.setBackground(new java.awt.Color(255, 255, 255));
        clienteTable.setFont(new java.awt.Font("Jost", 1, 12)); // NOI18N
        clienteTable.setForeground(new java.awt.Color(32, 32, 32));
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        clienteTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        clientePlane.setViewportView(clienteTable);
        clienteTable.getAccessibleContext().setAccessibleName("");

        jPanel1.add(clientePlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 200, 480, 170));

        funcionarioTable.setBackground(new java.awt.Color(255, 255, 255));
        funcionarioTable.setFont(new java.awt.Font("Jost", 1, 12)); // NOI18N
        funcionarioTable.setForeground(new java.awt.Color(32, 32, 32));
        funcionarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha"
            }
        ));
        funcionarioTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        funcionarioPane.setViewportView(funcionarioTable);

        jPanel1.add(funcionarioPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 200, 480, 170));

        administradorTable.setBackground(new java.awt.Color(255, 255, 255));
        administradorTable.setFont(new java.awt.Font("Jost", 1, 12)); // NOI18N
        administradorTable.setForeground(new java.awt.Color(32, 32, 32));
        administradorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha"
            }
        ));
        administradorTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        administradorPane.setViewportView(administradorTable);

        jPanel1.add(administradorPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 200, 480, 170));

        novoContatoCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/novoContato.png"))); // NOI18N
        jPanel1.add(novoContatoCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, -1, -1));

        selecionarExcluirBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionar.png"))); // NOI18N
        selecionarExcluirBotao.setBorder(null);
        selecionarExcluirBotao.setContentAreaFilled(false);
        selecionarExcluirBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecionarExcluirBotao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionar.png"))); // NOI18N
        selecionarExcluirBotao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/botaoSelecionarPressed.png"))); // NOI18N
        selecionarExcluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarExcluirBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(selecionarExcluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 555, -1, -1));

        excluirTipoContatoCombo.setBackground(new java.awt.Color(255, 255, 255));
        excluirTipoContatoCombo.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        excluirTipoContatoCombo.setForeground(new java.awt.Color(0, 0, 0));
        excluirTipoContatoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário", "Administrador" }));
        excluirTipoContatoCombo.setBorder(null);
        excluirTipoContatoCombo.setMinimumSize(new java.awt.Dimension(106, 40));
        excluirTipoContatoCombo.setPreferredSize(new java.awt.Dimension(106, 40));
        jPanel1.add(excluirTipoContatoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 555, 180, 17));

        excluirPordutosCombo.setBackground(new java.awt.Color(255, 255, 255));
        excluirPordutosCombo.setFont(new java.awt.Font("Jost", 0, 12)); // NOI18N
        excluirPordutosCombo.setForeground(new java.awt.Color(0, 0, 0));
        excluirPordutosCombo.setBorder(null);
        excluirPordutosCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excluirPordutosCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPordutosComboActionPerformed(evt);
            }
        });
        jPanel1.add(excluirPordutosCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 609, 190, 22));

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
        jPanel1.add(excluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 650, -1, -1));

        caixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/ContatosADM/caixaContatos.png"))); // NOI18N
        jPanel1.add(caixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 138, -1, -1));

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
    
    //CADASTRAR CLIENTE
    private void cadastrarClienteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteBotaoActionPerformed
        try {
            Cliente cliente = new Cliente (nomeCliente.getText());
            ClienteDAO cdao = new ClienteDAO();
            
            if (nomeCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente!");  
            } else if (nomeCliente.isEnabled()){
                cdao.insertCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado!!!");
            }
            cdao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cadastrarClienteBotaoActionPerformed
    
    //SELECIONAR TIPO DE CADASTRADO
    private void selecionarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBotaoActionPerformed
        
        if(comboContato.getSelectedItem().toString().equals("Administrador")){
            showAdministrador();
            
            showOffFuncionario();
            showOffCliente();
            
        } else if (comboContato.getSelectedItem().toString().equals("Cliente")) { 
            
            showCliente();
            
            showOffAdministrador();
            showOffFuncionario();
                        
        } else {
            
            showFuncionario();
            
            showOffAdministrador();
            showOffCliente();
        }
    }//GEN-LAST:event_selecionarBotaoActionPerformed
    
    //LIMPA TODAS INFORMAÇÕES
    private void limparBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBotaoActionPerformed
        
        showOffCliente();
        showOffFuncionario();
        showOffAdministrador();
        
    }//GEN-LAST:event_limparBotaoActionPerformed
    
    //CADASTRAR FUNCIONARIO
    private void cadastrarFuncionarioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioBotaoActionPerformed
        try {
            Funcionario funcionario = new Funcionario(nomeFuncionario.getText(), loginFuncionario.getText(), senhaFuncionario.getText(), false);
            FuncionarioDAO fdao = new FuncionarioDAO();
            
            if (funcionarioNome.getText().isEmpty() || fdao.verifyFuncionarioLoginCadastro(loginFuncionario.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Funcionário"); 
            } else if (funcionarioNome.isEnabled()) {
                fdao.insertFuncionario(funcionario);
                JOptionPane.showMessageDialog(null, "Funcionário Cadastrado!!!");
            }
            fdao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_cadastrarFuncionarioBotaoActionPerformed
    
    //CADASTRAR ADMINISTRADOR
    private void cadastrarAdministradorBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAdministradorBotaoActionPerformed
        try {
            Funcionario administrador = new Funcionario(nomeAdministrador.getText(), loginAdministrador.getText(), senhaAdministrador.getText(), true);
            FuncionarioDAO adao = new FuncionarioDAO();
            
            if (funcionarioNome.getText().isEmpty() || adao.verifyFuncionarioLoginCadastro(loginAdministrador.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Administrador"); 
                
            } else if (funcionarioNome.isEnabled()) {
                adao.insertFuncionario(administrador);
                JOptionPane.showMessageDialog(null, "Administrador Cadastrado!!!");
            }
            adao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Testes.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_cadastrarAdministradorBotaoActionPerformed

    private void excluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBotaoActionPerformed
        /*try {
            Produto produto = new Produto(excluirPordutosCombo.getSelectedItem().toString());
            ProdutoDAO pdao = new ProdutoDAO();

            if (pdao.deletProduto(produto.getNome())) {

                JOptionPane.showMessageDialog(null, "Produto Excluído com sucesso!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosADM.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }//GEN-LAST:event_excluirBotaoActionPerformed

    private void excluirPordutosComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPordutosComboActionPerformed
        
        if (excluirTipoContatoCombo.getSelectedItem().toString().equals("Cliente")){
            
            excluirPordutosCombo.getSelectedItem().toString();
        }
    }//GEN-LAST:event_excluirPordutosComboActionPerformed
    
    //SELECIONAR TIPO DE CONTATO PARA EXCLUIR
    private void selecionarExcluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarExcluirBotaoActionPerformed
        
        try {
            buscarContatos(excluirPordutosCombo);
        } catch (SQLException ex) {
            Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selecionarExcluirBotaoActionPerformed

    //BOTAO SELECIONAR TABELA
    private void selecionarTabelaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarTabelaBotaoActionPerformed

        if (tipoRelatorioCombo.getSelectedItem().toString().equals("Cliente")) {
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement;

            showTabelaCliente();
            showOffTabelaFuncionario();
            showOffTabelaAdministrador();
            
            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String nome = result.getString(2);

                    String tabelaCliente[] = {id, nome};
                    DefaultTableModel defaultCliente = (DefaultTableModel) clienteTable.getModel();

                    defaultCliente.addRow(tabelaCliente);
                }
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoRelatorioCombo.getSelectedItem().toString().equals("Funcionário")) {
            String sql = "SELECT * FROM funcionario WHERE admin=0";
            PreparedStatement statement;
            clienteTable.getValue
            showTabelaFuncionario();
            showOffTabelaCliente();
            showOffTabelaAdministrador();

            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String nome = result.getString(2);
                    String login = result.getString(3);
                    String senha = result.getString(4);

                    String tabelaFuncionario[] = {id, nome, login, senha};
                    DefaultTableModel defaultFuncionario = (DefaultTableModel) funcionarioTable.getModel();

                    defaultFuncionario.addRow(tabelaFuncionario);
                }
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String sql = "SELECT * FROM funcionario WHERE admin=1";
            PreparedStatement statement;
            
            showTabelaAdministrador();
            showOffTabelaCliente();
            showOffTabelaFuncionario();

            try {
                connection = ConnectBd.getConnection();
                statement = connection.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    String id = String.valueOf(result.getInt(1));
                    String nome = result.getString(2);
                    String login = result.getString(3);
                    String senha = result.getString(4);

                    String tabelaAdministrador[] = {id, nome, login, senha};
                    DefaultTableModel defaultAdministrador = (DefaultTableModel) administradorTable.getModel();

                    defaultAdministrador.addRow(tabelaAdministrador);
                }
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatosADM.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_selecionarTabelaBotaoActionPerformed
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new ContatosADM().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane administradorPane;
    private javax.swing.JTable administradorTable;
    private javax.swing.JLabel bgContatos;
    private javax.swing.JButton botaoContatos;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoProdutos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoVendas;
    private javax.swing.JButton cadastrarAdministradorBotao;
    private javax.swing.JButton cadastrarClienteBotao;
    private javax.swing.JButton cadastrarFuncionarioBotao;
    private javax.swing.JLabel caixa;
    private javax.swing.JScrollPane clientePlane;
    private javax.swing.JTable clienteTable;
    private javax.swing.JComboBox<String> comboContato;
    private javax.swing.JButton excluirBotao;
    private javax.swing.JComboBox<String> excluirPordutosCombo;
    private javax.swing.JComboBox<String> excluirTipoContatoCombo;
    private javax.swing.JLabel funcionarioFunction;
    private javax.swing.JLabel funcionarioNome;
    private javax.swing.JScrollPane funcionarioPane;
    private javax.swing.JTable funcionarioTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparBotao;
    private javax.swing.JTextField loginAdministrador;
    private javax.swing.JTextField loginFuncionario;
    private javax.swing.JLabel logoIcon;
    private javax.swing.JLabel menuCima;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JTextField nomeAdministrador;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField nomeFuncionario;
    private javax.swing.JLabel novoAdministradorCaixa;
    private javax.swing.JLabel novoClienteCaixa;
    private javax.swing.JLabel novoContatoCaixa;
    private javax.swing.JLabel novoFuncionarioCaixa;
    private javax.swing.JButton selecionarBotao;
    private javax.swing.JButton selecionarExcluirBotao;
    private javax.swing.JButton selecionarTabelaBotao;
    private javax.swing.JTextField senhaAdministrador;
    private javax.swing.JTextField senhaFuncionario;
    private javax.swing.JComboBox<String> tipoRelatorioCombo;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
