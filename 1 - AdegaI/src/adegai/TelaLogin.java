package adegai;

import java.awt.Cursor;
import java.io.IOException;
import javax.swing.JOptionPane;
import dao.FuncionarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLogin extends javax.swing.JFrame {
    
    String nome;
    String funcao;
    
    public TelaLogin() throws SQLException {
        initComponents();
        
        gitIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botaoEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        formaLinha = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        formaLogin = new javax.swing.JLabel();
        senhaIcon = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        formaSenha = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        gitIcon = new javax.swing.JLabel();
        formaAmarela = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/logo.png"))); // NOI18N
        jPanelLogin.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 100, -1, -1));

        formaLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/formaLinha.png"))); // NOI18N
        jPanelLogin.add(formaLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 350, -1, -1));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/userIcon.png"))); // NOI18N
        jPanelLogin.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 378, -1, -1));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Jost", 0, 16)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Login");
        login.setBorder(null);
        jPanelLogin.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 378, 220, -1));

        formaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/formaTexto.png"))); // NOI18N
        jPanelLogin.add(formaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        senhaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/passwordIcon.png"))); // NOI18N
        jPanelLogin.add(senhaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 433, -1, -1));

        senha.setBackground(new java.awt.Color(255, 255, 255));
        senha.setFont(new java.awt.Font("Jost", 0, 16)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("password");
        senha.setBorder(null);
        jPanelLogin.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 433, 220, -1));

        formaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/formaTexto.png"))); // NOI18N
        jPanelLogin.add(formaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 425, -1, -1));

        botaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/botaoEntrar.png"))); // NOI18N
        botaoEntrar.setBorder(null);
        botaoEntrar.setBorderPainted(false);
        botaoEntrar.setContentAreaFilled(false);
        botaoEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/botaoEntrarPressed.png"))); // NOI18N
        botaoEntrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/botaoEntrarPressed.png"))); // NOI18N
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        jPanelLogin.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        gitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/githubLogo.png"))); // NOI18N
        gitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gitIconMouseClicked(evt);
            }
        });
        jPanelLogin.add(gitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 580, -1, -1));

        formaAmarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/formaAmarela.png"))); // NOI18N
        jPanelLogin.add(formaAmarela, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 70, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adegai/Login/bg.png"))); // NOI18N
        jPanelLogin.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //ação do botao entrar (verificando senha e login corretos
    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        String pass = new String(this.senha.getPassword());
        FuncionarioDAO dao;
        
        try {
            dao = new FuncionarioDAO();
            
            if (dao.verifyFuncionarioLogin(login.getText(), pass) == true && dao.verifyFuncionarioAdm(login.getText(), pass) == false) {
                
                //SET DO NOME/FUNCAO DO USUARIO
                nome = dao.verifyFuncionario(login.getText(), pass).getNome();
                
                if(dao.verifyFuncionario(login.getText(), pass).isAdmin() == true){
                    funcao = "Administrador";
                } else {funcao = "Padrão";}
                
                
                HomeADM homeADM = new HomeADM(nome, funcao);
                homeADM.setVisible(true);
                this.dispose();
                dao.close();
                
            } else if (dao.verifyFuncionarioAdm(login.getText(), pass)){
                
                //SET DO NOME/FUNCAO DO USUARIO
                nome = dao.verifyFuncionario(login.getText(), pass).getNome();
                
                if(dao.verifyFuncionario(login.getText(), pass).isAdmin() == true){
                    funcao = "Administrador";
                } else {funcao = "Padrão";}
                
                HomeADM homeADM = new HomeADM();
                homeADM.setFuncionario(nome, funcao);
                homeADM.setVisible(true);
                this.dispose();
                dao.close();
            }
            else {JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!!!");}
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoEntrarActionPerformed
    
    //ação do click no gitIcon direto ao site do projeto no github
    private void gitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gitIconMouseClicked
        
        try {
            String projectUrl = "https://github.com/jpcaparroz/adegaI";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(projectUrl));
            
        } catch (IOException e2) {}
    }//GEN-LAST:event_gitIconMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new TelaLogin().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    public javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel formaAmarela;
    private javax.swing.JLabel formaLinha;
    private javax.swing.JLabel formaLogin;
    private javax.swing.JLabel formaSenha;
    private javax.swing.JLabel gitIcon;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JTextField login;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaIcon;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
