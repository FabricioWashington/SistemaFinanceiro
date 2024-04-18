package DTO;

import java.math.BigDecimal;
import java.util.Date;



public class Registro_Março_2024DTO {
    private int idSaidas_Março_2024;
    private String Classificacao,Despesas, Pagamento, Obs, Tipo, tipo_saida;
    private BigDecimal Valor, Valor_Total_Saidas;
    private Date Data;

    /**
     * @return the idSaidas_Janeiro_2024
     */
    public int getIdSaidas_Março_2024() {
        return idSaidas_Março_2024;
    }

    /**
     * @param idSaidas_Janeiro_2024 the idSaidas_Janeiro_2024 to set
     */
    public void setIdSaidas_Março_2024(int idSaidas_Janeiro_2024) {
        this.idSaidas_Março_2024 = idSaidas_Janeiro_2024;
    }

    /**
     * @return the Classificacao
     */
    public String getClassificacao() {
        return Classificacao;
    }

    /**
     * @param Classificicacao the Classificicacao to set
     */
    public void setClassificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }

    /**
     * @return the Despesas
     */
    public String getDespesas() {
        return Despesas;
    }

    /**
     * @param Despesas the Despesas to set
     */
    public void setDespesas(String Despesas) {
        this.Despesas = Despesas;
    }

    /**
     * @return the Pagamento
     */
    public String getPagamento() {
        return Pagamento;
    }

    /**
     * @param Pagamento the Pagamento to set
     */
    public void setPagamento(String Pagamento) {
        this.Pagamento = Pagamento;
    }

    /**
     * @return the Obs
     */
    public String getObs() {
        return Obs;
    }

    /**
     * @param Obs the Obs to set
     */
    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the tipo_saida
     */
    public String getTipo_saida() {
        return tipo_saida;
    }

    /**
     * @param tipo_saida the tipo_saida to set
     */
    public void setTipo_saida(String tipo_saida) {
        this.tipo_saida = tipo_saida;
    }

    /**
     * @return the Valor
     */
    public BigDecimal getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(BigDecimal Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Valor_Total_Saidas
     */
    public BigDecimal getValor_Total_Saidas() {
        return Valor_Total_Saidas;
    }

    /**
     * @param Valor_Total_Saidas the Valor_Total_Saidas to set
     */
    public void setValor_Total_Saidas(BigDecimal Valor_Total_Saidas) {
        this.Valor_Total_Saidas = Valor_Total_Saidas;
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
    
}

 