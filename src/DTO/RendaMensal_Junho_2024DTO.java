package DTO;

import java.math.BigDecimal;
import java.util.Date;


public class RendaMensal_Junho_2024DTO {
    private int idRendaMensal_Junho_2024;
    private String Descricao, tipo_Entrada;
    private BigDecimal Valor_Entrou;
    private Date Data;

 
    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the tipo_Entrada
     */
    public String getTipo_Entrada() {
        return tipo_Entrada;
    }

    /**
     * @param tipo_Entrada the tipo_Entrada to set
     */
    public void setTipo_Entrada(String tipo_Entrada) {
        this.tipo_Entrada = tipo_Entrada;
    }

    /**
     * @return the Valor_Entrou
     */
    public BigDecimal getValor_Entrou() {
        return Valor_Entrou;
    }

    /**
     * @param Valor_Entrou the Valor_Entrou to set
     */
    public void setValor_Entrou(BigDecimal Valor_Entrou) {
        this.Valor_Entrou = Valor_Entrou;
    }

    /**
     * @return the Data
     */
    public Date getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Date Data) {
        this.Data = Data;
    }

    /**
     * @return the idRendaMensal_Junho_2024
     */
    public int getIdRendaMensal_Junho_2024() {
        return idRendaMensal_Junho_2024;
    }

    /**
     * @param idRendaMensal_Junho_2024 the idRendaMensal_Junho_2024 to set
     */
    public void setIdRendaMensal_Junho_2024(int idRendaMensal_Junho_2024) {
        this.idRendaMensal_Junho_2024 = idRendaMensal_Junho_2024;
    }

}
  