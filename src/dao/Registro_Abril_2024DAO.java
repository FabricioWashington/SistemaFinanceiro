package dao;

import DTO.Registro_Abril_2024DTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Registro_Abril_2024DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Registro_Abril_2024DTO> lista = new ArrayList<>();
    BigDecimal total = BigDecimal.ZERO;

    public void registrarDados(Registro_Abril_2024DTO objregistroabril24dto) {
        String sql = "insert into saidas_abril_2024 (Classificacao, Despesas, Data, Valor, Pagamento, Obs, Tipo, tipo_saida) values (?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistroabril24dto.getClassificacao());
            pstm.setString(2, objregistroabril24dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistroabril24dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistroabril24dto.getValor());
            pstm.setString(5, objregistroabril24dto.getPagamento());
            pstm.setString(6, objregistroabril24dto.getObs());
            pstm.setString(7, objregistroabril24dto.getTipo());
            pstm.setString(8, objregistroabril24dto.getTipo_saida());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RegistroFevereiro2024DAO em (Registrar)" + erro);

        }

    }

    public ArrayList<Registro_Abril_2024DTO> PesquisarRegistroFevereiro2024() {
        String sql = "select * from saidas_abril_2024 ";

        conn = new ConexaoDAO().conectaBD();
        ArrayList<Registro_Abril_2024DTO> lista = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Registro_Abril_2024DTO objregistroabril24dto = new Registro_Abril_2024DTO();
                objregistroabril24dto.setIdSaidas_Abril_2024(rs.getInt("idsaidas_Abril_2024"));
                objregistroabril24dto.setClassificacao(rs.getString("Classificacao"));
                objregistroabril24dto.setDespesas(rs.getString("Despesas"));
                objregistroabril24dto.setData(rs.getDate("Data"));
                objregistroabril24dto.setValor(rs.getBigDecimal("Valor"));
                objregistroabril24dto.setPagamento(rs.getString("Pagamento"));
                objregistroabril24dto.setObs(rs.getString("Obs"));
                objregistroabril24dto.setTipo(rs.getString("Tipo"));
                objregistroabril24dto.setTipo_saida(rs.getString("tipo_saida"));

                lista.add(objregistroabril24dto);
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

    public void alterarRegistroFevereiro2024(Registro_Abril_2024DTO objregistroabril24dto) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE saidas_abril_2024 SET Classificacao=?, Despesas=?, Data=?, Valor=?, Pagamento=?, Obs=?, Tipo=?, tipo_saida=? WHERE idSaidas_Abril_2024=?";

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objregistroabril24dto.getClassificacao());
            pstm.setString(2, objregistroabril24dto.getDespesas());
            pstm.setDate(3, new java.sql.Date(objregistroabril24dto.getData().getTime()));
            pstm.setBigDecimal(4, objregistroabril24dto.getValor());
            pstm.setString(5, objregistroabril24dto.getPagamento());
            pstm.setString(6, objregistroabril24dto.getObs());
            pstm.setString(7, objregistroabril24dto.getTipo());
            pstm.setString(8, objregistroabril24dto.getTipo_saida());
            pstm.setInt(9, objregistroabril24dto.getIdSaidas_Abril_2024());

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

    public void ExcluirRegistrosAbril(Registro_Abril_2024DTO objregistroabril24dto) {

        String sql = "delete from saidas_abril_2024 where idsaidas_abril_2024=?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objregistroabril24dto.getIdSaidas_Abril_2024());

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
        String sql = "SELECT SUM(Valor) AS Total_Saidas FROM saidas_abril_2024 WHERE tipo_saida = 'Saida'";
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
