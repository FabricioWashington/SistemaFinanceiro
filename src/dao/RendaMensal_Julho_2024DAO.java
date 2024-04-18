package dao;

import DTO.RendaMensal_Julho_2024DTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RendaMensal_Julho_2024DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<RendaMensal_Julho_2024DTO> lista = new ArrayList<>();

    public void registrarRendaMensalFevereiro2024(RendaMensal_Julho_2024DTO objrendamensaljulho2024dto) {
        String sql = "INSERT INTO rendamensal_julho_2024 (Descricao, Valor_Entrou, Data, tipo_Entrada) VALUES (?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objrendamensaljulho2024dto.getDescricao());
            pstm.setBigDecimal(2, objrendamensaljulho2024dto.getValor_Entrou());
            pstm.setDate(3, new java.sql.Date(objrendamensaljulho2024dto.getData().getTime()));
            pstm.setString(4, objrendamensaljulho2024dto.getTipo_Entrada());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RendaMensalDAO em (Registrar)" + erro);
        }
    }

    public ArrayList<RendaMensal_Julho_2024DTO> PesquisarRendaMensalFevereiro2024() {
        ArrayList<RendaMensal_Julho_2024DTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM rendamensal_julho_2024";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                RendaMensal_Julho_2024DTO objrendamensaljulho2024dto = new RendaMensal_Julho_2024DTO();
                objrendamensaljulho2024dto.setIdRendaMensal_Julho_2024(rs.getInt("idRendaMensal_Julho_2024"));
                objrendamensaljulho2024dto.setDescricao(rs.getString("Descricao"));
                objrendamensaljulho2024dto.setValor_Entrou(rs.getBigDecimal("Valor_Entrou"));
                objrendamensaljulho2024dto.setData(rs.getDate("Data"));
                objrendamensaljulho2024dto.setTipo_Entrada(rs.getString("tipo_Entrada"));

                lista.add(objrendamensaljulho2024dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RendaMensalDAO (Pesquisar)" + erro);
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

    public void alterarRendaMensalFevereiro2024(RendaMensal_Julho_2024DTO objrendamensaljulho2024dto) {
        conn = new ConexaoDAO().conectaBD();

        String sql = "UPDATE rendamensal_julho_2024 SET Descricao=?, Valor_Entrou=?, Data=?, tipo_Entrada=? WHERE idRendaMensal_Julho_2024=?";

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objrendamensaljulho2024dto.getDescricao());
            pstm.setBigDecimal(2, objrendamensaljulho2024dto.getValor_Entrou());
            pstm.setDate(3, new java.sql.Date(objrendamensaljulho2024dto.getData().getTime()));
            pstm.setInt(4, objrendamensaljulho2024dto.getIdRendaMensal_Julho_2024());

            pstm.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RendaMensalDAO em (Alterar)" + erro);
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

    public void ExcluirRendaMensal(RendaMensal_Julho_2024DTO objrendamensaljulho2024dto) {

        String sql = "DELETE FROM rendamensal_julho_2024 WHERE idRendaMensal_Julho_2024=?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objrendamensaljulho2024dto.getIdRendaMensal_Julho_2024());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro em RendaMensalDAO em (Excluir)" + erro);

        }

    }

    public BigDecimal calcularTotalEntradas() {
        BigDecimal total = BigDecimal.ZERO;

        try {
            conn = new ConexaoDAO().conectaBD();
            String sql = "SELECT SUM(Valor_Entrou) AS Total_Entradas FROM rendamensal_julho_2024 WHERE tipo_Entrada = 'Entrada'";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (rs.next()) {
                total = rs.getBigDecimal("Total_Entradas");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao calcular o total de entradas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
