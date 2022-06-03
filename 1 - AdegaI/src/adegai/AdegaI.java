package adegai;

import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdegaI {
    
    //INICIO DO APLICATIVO
    public static void main(String[] args) throws SQLException {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);

    }
    
    //MÉTODO PARA MOSTRAR/ATIVAR TABELA
    public void showTabela(JScrollPane pane, JTable table){
        pane.show(true);
        pane.enable();
        table.enable();
        table.show(true);
    }
    
    //MÉTODO PARA ESCONDER/DESATIVAR TABELA
    public void showOffTabela(JScrollPane pane, JTable table){
        pane.show(false);
        pane.disable();
        table.disable();
        table.show(false);
    }
    
    //MÉTODO #2 PARA MOSTRAR/ATIVAR TABELA
    public void showTabela(JScrollPane pane, JTable table, JLabel field){
        pane.show(true);
        pane.enable();
        table.enable();
        table.show(true);
        field.show(true);
        field.enable();
    }
    
    //MÉTODO #3 PARA ESCONDER/DESATIVAR TABELA
    public void showOffTabela(JScrollPane pane, JTable table, JLabel field){
        pane.show(false);
        pane.disable();
        table.disable();
        table.show(false);
        field.show(false);
        field.disable();
    }
    
    public void mensagemPopUp(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
