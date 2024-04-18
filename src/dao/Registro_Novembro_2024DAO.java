package dao;

import DTO.Registro_Novembro_2024DTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Registro_Novembro_2024DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Registro_Novembro_2024DTO> lista = new ArrayList<>();
    BigDecimal total = BigDecimal.ZERO;

    public void registrarDados(Registro_Novembro_2024DTO objregistronovembro2024dto) {
        String sql = "insert into saidas_novembro_2024 (Classificacao, Despesas, Data, Valor, Pagamento, Obs, Tipo, tipo_saida) values (?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistronovembro2024dto.getClassificacao());
            pstm.setString(2, objregistronovembro2024dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistronovembro2024dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistronovembro2024dto.getValor());
            pstm.setString(5, objregistronovembro2024dto.getPagamento());
            pstm.setString(6, objregistronovembro2024dto.getObs());
            pstm.setString(7, objregistronovembro2024dto.getTipo());
            pstm.setString(8, objregistronovembro2024dto.getTipo_saida());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroFevereiro2024DAO em (Registrar)" + erro);

        }

    }

    public ArrayList<Registro_Novembro_2024DTO> PesquisarRegistroFevereiro2024() {
        String sql = "select * from saidas_novembro_2024 ";

        conn = new ConexaoDAO().conectaBD();
        ArrayList<Registro_Novembro_2024DTO> lista = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Registro_Novembro_2024DTO objregistronovembro2024dto = new Registro_Novembro_2024DTO();
                objregistronovembro2024dto.setIdSaidas_Novembro_2024(rs.getInt("idsaidas_Novembro_2024"));
                objregistronovembro2024dto.setClassificacao(rs.getString("Classificacao"));
                objregistronovembro2024dto.setDespesas(rs.getString("Despesas"));
                objregistronovembro2024dto.setData(rs.getDate("Data"));
                objregistronovembro2024dto.setValor(rs.getBigDecimal("Valor"));
                objregistronovembro2024dto.setPagamento(rs.getString("Pagamento"));
                objregistronovembro2024dto.setObs(rs.getString("Obs"));
                objregistronovembro2024dto.setTipo(rs.getString("Tipo"));
                objregistronovembro2024dto.setTipo_saida(rs.getString("tipo_saida"));

                lista.add(objregistronovembro2024dto);
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

    public void alterarRegistroFevereiro2024(Registro_Novembro_2024DTO objregistronovembro2024dto) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE saidas_novembro_2024 SET Classificacao=?, Despesas=?, Data=?, Valor=?, Pagamento=?, Obs=?, Tipo=?, tipo_saida=? WHERE idSaidas_Novembro_2024=?";

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistronovembro2024dto.getClassificacao());
            pstm.setString(2, objregistronovembro2024dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistronovembro2024dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistronovembro2024dto.getValor());
            pstm.setString(5, objregistronovembro2024dto.getPagamento());
            pstm.setString(6, objregistronovembro2024dto.getObs());
            pstm.setString(7, objregistronovembro2024dto.getTipo());
            pstm.setString(8, objregistronovembro2024dto.getTipo_saida());
            pstm.setInt(9, objregistronovembro2024dto.getIdSaidas_Novembro_2024());

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

    public void ExcluirRegistros(Registro_Novembro_2024DTO objregistronovembro2024dto) {

        String sql = "delete from saidas_novembro_2024 where idsaidas_novembro_2024=?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objregistronovembro2024dto.getIdSaidas_Novembro_2024());

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
        String sql = "SELECT SUM(Valor) AS Total_Saidas FROM saidas_novembro_2024 WHERE tipo_saida = 'Saida'";
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
