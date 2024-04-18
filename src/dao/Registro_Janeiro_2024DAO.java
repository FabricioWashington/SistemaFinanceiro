package dao;

import DTO.Registro_Janeiro_2024DTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Registro_Janeiro_2024DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Registro_Janeiro_2024DTO> lista = new ArrayList<>();
    BigDecimal total = BigDecimal.ZERO;
    

    public void registrarDados(Registro_Janeiro_2024DTO objregistrojaneiro2024dto) {
        String sql = "insert into saidas_janeiro_2024 (Classificacao, Despesas, Data, Valor, Pagamento, Obs, Tipo, tipo_saida) values (?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistrojaneiro2024dto.getClassificacao());
            pstm.setString(2, objregistrojaneiro2024dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistrojaneiro2024dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistrojaneiro2024dto.getValor());
            pstm.setString(5, objregistrojaneiro2024dto.getPagamento());
            pstm.setString(6, objregistrojaneiro2024dto.getObs());
            pstm.setString(7, objregistrojaneiro2024dto.getTipo());
            pstm.setString(8, objregistrojaneiro2024dto.getTipo_saida());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroJaneiro2024DAO em (Registrar)" + erro);

        }

    }

    public ArrayList<Registro_Janeiro_2024DTO> PesquisarRegistroJaneiro2024() {
        String sql = "select * from saidas_janeiro_2024 ";

        conn = new ConexaoDAO().conectaBD();
        ArrayList<Registro_Janeiro_2024DTO> lista = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Registro_Janeiro_2024DTO objregistrodto = new Registro_Janeiro_2024DTO();
                objregistrodto.setIdSaidas_Janeiro_2024(rs.getInt("idSaidas_Janeiro_2024"));
                objregistrodto.setClassificacao(rs.getString("Classificacao"));
                objregistrodto.setDespesas(rs.getString("Despesas"));
                objregistrodto.setData(rs.getDate("Data"));
                objregistrodto.setValor(rs.getBigDecimal("Valor"));
                objregistrodto.setPagamento(rs.getString("Pagamento"));
                objregistrodto.setObs(rs.getString("Obs"));
                objregistrodto.setTipo(rs.getString("Tipo"));
                objregistrodto.setTipo_saida(rs.getString("tipo_saida"));

                lista.add(objregistrodto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroJaneiro2024DAO (Pesquisar)" + erro);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public void alterarRegistroJaneiro2024(Registro_Janeiro_2024DTO objregistrojaneiro2024dto) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE saidas_janeiro_2024 SET Classificacao=?, Despesas=?, Data=?, Valor=?, Pagamento=?, Obs=?, Tipo=?, tipo_saida=? WHERE idSaidas_Janeiro_2024=?";

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistrojaneiro2024dto.getClassificacao());
            pstm.setString(2, objregistrojaneiro2024dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistrojaneiro2024dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistrojaneiro2024dto.getValor());
            pstm.setString(5, objregistrojaneiro2024dto.getPagamento());
            pstm.setString(6, objregistrojaneiro2024dto.getObs());
            pstm.setString(7, objregistrojaneiro2024dto.getTipo());
            pstm.setString(8, objregistrojaneiro2024dto.getTipo_saida());
            pstm.setInt(9, objregistrojaneiro2024dto.getIdSaidas_Janeiro_2024());

            pstm.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroJaneiro2024DAO em (Alterar)" + erro);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void ExcluirRegistros(Registro_Janeiro_2024DTO objregistrojaneiro2024dto) {

        String sql = "delete from saidas_janeiro_2024 where idsaidas_Janeiro_2024=?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objregistrojaneiro2024dto.getIdSaidas_Janeiro_2024());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroJaneiro2024DAO em (Excluir)" + erro);

        }

    }

    public BigDecimal calcularTotalSaidas() {
        BigDecimal total = BigDecimal.ZERO;

        try {
            conn = new ConexaoDAO().conectaBD();
            String sql = "SELECT SUM(Valor) AS Total_Saidas FROM saidas_janeiro_2024 WHERE tipo_saida = 'Saida'";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (rs.next()) {
                total = rs.getBigDecimal("Total_Saidas");
            }

            if (total == null) {
                total = BigDecimal.ZERO;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao calcular o total de saidas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return total;
    }
}

