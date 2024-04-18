
package dao;

import DTO.LoginDTO;
import dao.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class LoginDAO {
    Connection conn;
    
    public ResultSet autenticacaoLogin (LoginDTO objlogindto){
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "SELECT * FROM login WHERE Login_Usuario = ? AND Login_Senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlogindto.getLogin_Usuario());
            pstm.setString(2, objlogindto.getLogin_Senha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em LoginDAO" + erro);
            return null;
        }
    }

 public void registrarCadastro(LoginDTO objlogindto) {
    String sql = "insert into login (Login_Usuario, Login_Senha) values (?,?)";

    conn = new ConexaoDAO().conectaBD();

    try {
        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, objlogindto.getLogin_Usuario());
        pstm.setString(2, objlogindto.getLogin_Senha());

        pstm.execute();
        pstm.close();

        // Exibir mensagem de sucesso após o cadastro
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        // Exibir mensagem de erro se o usuário já estiver cadastrado
        JOptionPane.showMessageDialog(null, "Ocorreu um erro no cadastro. Esse usuário já foi cadastrado no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

  

}
