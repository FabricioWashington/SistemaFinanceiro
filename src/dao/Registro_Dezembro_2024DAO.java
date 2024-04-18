package dao;

import DTO.Registro_Dezembro_2024DTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Registro_Dezembro_2024DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Registro_Dezembro_2024DTO> lista = new ArrayList<>();
    BigDecimal total = BigDecimal.ZERO;

    public void registrarDados(Registro_Dezembro_2024DTO objregistrodezembro2024dto) {
        String sql = "insert into saidas_dezembro_2024 (Classificacao, Despesas, Data, Valor, Pagamento, Obs, Tipo, tipo_saida) values (?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistrodezembro2024dto.getClassificacao());
            pstm.setString(2, objregistrodezembro2024dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistrodezembro2024dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistrodezembro2024dto.getValor());
            pstm.setString(5, objregistrodezembro2024dto.getPagamento());
            pstm.setString(6, objregistrodezembro2024dto.getObs());
            pstm.setString(7, objregistrodezembro2024dto.getTipo());
            pstm.setString(8, objregistrodezembro2024dto.getTipo_saida());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroFevereiro2024DAO em (Registrar)" + erro);

        }

    }

    public ArrayList<Registro_Dezembro_2024DTO> PesquisarRegistroFevereiro2024() {
        String sql = "select * from saidas_dezembro_2024 ";

        conn = new ConexaoDAO().conectaBD();
        ArrayList<Registro_Dezembro_2024DTO> lista = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Registro_Dezembro_2024DTO objregistrodezembro2024dto = new Registro_Dezembro_2024DTO();
                objregistrodezembro2024dto.setIdSaidas_Dezembro_2024(rs.getInt("idsaidas_Dezembro_2024"));
                objregistrodezembro2024dto.setClassificacao(rs.getString("Classificacao"));
                objregistrodezembro2024dto.setDespesas(rs.getString("Despesas"));
                objregistrodezembro2024dto.setData(rs.getDate("Data"));
                objregistrodezembro2024dto.setValor(rs.getBigDecimal("Valor"));
                objregistrodezembro2024dto.setPagamento(rs.getString("Pagamento"));
                objregistrodezembro2024dto.setObs(rs.getString("Obs"));
                objregistrodezembro2024dto.setTipo(rs.getString("Tipo"));
                objregistrodezembro2024dto.setTipo_saida(rs.getString("tipo_saida"));

                lista.add(objregistrodezembro2024dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroFevereiro2024DAO (Pesquisar)" + erro);
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

    public void alterarRegistroFevereiro2024(Registro_Dezembro_2024DTO objregistrodezembro2024dto) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE saidas_dezembro_2024 SET Classificacao=?, Despesas=?, Data=?, Valor=?, Pagamento=?, Obs=?, Tipo=?, tipo_saida=? WHERE idSaidas_Dezembro_2024=?";

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistrodezembro2024dto.getClassificacao());
            pstm.setString(2, objregistrodezembro2024dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistrodezembro2024dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistrodezembro2024dto.getValor());
            pstm.setString(5, objregistrodezembro2024dto.getPagamento());
            pstm.setString(6, objregistrodezembro2024dto.getObs());
            pstm.setString(7, objregistrodezembro2024dto.getTipo());
            pstm.setString(8, objregistrodezembro2024dto.getTipo_saida());
            pstm.setInt(9, objregistrodezembro2024dto.getIdSaidas_Dezembro_2024());

            pstm.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroFevereiro2024DAO em (Alterar)" + erro);
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

    public void ExcluirRegistros(Registro_Dezembro_2024DTO objregistrodezembro2024dto) {

        String sql = "delete from saidas_dezembro_2024 where idSaidas_Dezembro_2024=?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objregistrodezembro2024dto.getIdSaidas_Dezembro_2024());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroFevereiro2024DAO em (Excluir)" + erro);

        }

    }

public BigDecimal calcularTotalSaidas() {
    BigDecimal total = BigDecimal.ZERO;

    try {
        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT SUM(Valor) AS Total_Saidas FROM saidas_dezembro_2024 WHERE tipo_saida = 'Saida'";
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
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return total;
}

}
