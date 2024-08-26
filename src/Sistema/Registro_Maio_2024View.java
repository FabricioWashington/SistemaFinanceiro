package Sistema;

import DTO.Registro_Maio_2024DTO;
import dao.Registro_Maio_2024DAO;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextField;

public class Registro_Maio_2024View extends javax.swing.JFrame {

    public Registro_Maio_2024View() {
        initComponents();
        ListarRegistros();
        ExibirCalculoTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnHome_Registro = new javax.swing.JButton();
        btnHome_RendaMensal = new javax.swing.JButton();
        btn_Home_TelaInicial = new javax.swing.JButton();
        cbx_Classificacao = new javax.swing.JComboBox<>();
        txtDespesas = new javax.swing.JTextField();
        cbx_Pagamento = new javax.swing.JComboBox<>();
        txtObs = new javax.swing.JTextField();
        cbx_Tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistro_Inserir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnRegistro_CarregarCampos = new javax.swing.JButton();
        btnRegistro_LimparCampos = new javax.swing.JButton();
        btnRegistro_Excluir = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Registro_Maio_2024 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtValor_Total_Saidas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnHome_Registro.setBackground(new java.awt.Color(51, 51, 51));
        btnHome_Registro.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Registro.setText("Registro");
        btnHome_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_RegistroActionPerformed(evt);
            }
        });

        btnHome_RendaMensal.setBackground(new java.awt.Color(51, 51, 51));
        btnHome_RendaMensal.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_RendaMensal.setText("Renda Mensal");
        btnHome_RendaMensal.setMaximumSize(new java.awt.Dimension(73, 23));
        btnHome_RendaMensal.setMinimumSize(new java.awt.Dimension(73, 23));
        btnHome_RendaMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_RendaMensalActionPerformed(evt);
            }
        });

        btn_Home_TelaInicial.setBackground(new java.awt.Color(51, 51, 51));
        btn_Home_TelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        btn_Home_TelaInicial.setText("Home");
        btn_Home_TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Home_TelaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(btnHome_RendaMensal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(btn_Home_TelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btn_Home_TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome_RendaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbx_Classificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Contas de Casa", "Comida", "Pessoal", "Entretenimento", "Transporte", "Besteira", "Crianças", "Pets", "Investimento", "Mercado", "Roupa", "Gastos Extras" }));

        cbx_Pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Credito", "Debito", "Pix", "Carnê", "Boleto", "Parcelado" }));

        cbx_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Extra", "Necessario", "Gosto de ter" }));

        jLabel4.setText("*CLASSIFICAÇÃO");

        jLabel5.setText("*DESPESAS");

        jLabel6.setText("*VALOR");

        jLabel7.setText("*PAGAMENTO");

        jLabel8.setText("*OBSERVAÇÃO");

        jLabel9.setText("*TIPO");

        btnRegistro_Inserir.setText("INSERIR");
        btnRegistro_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro_InserirActionPerformed(evt);
            }
        });

        jLabel10.setText("*DATA");

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);
        txtCodigo.setFocusable(false);

        jLabel11.setText("ID");

        btnRegistro_CarregarCampos.setText("CARREGAR CAMPOS");
        btnRegistro_CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro_CarregarCamposActionPerformed(evt);
            }
        });

        btnRegistro_LimparCampos.setText("LIMPAR CAMPOS");
        btnRegistro_LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro_LimparCamposActionPerformed(evt);
            }
        });

        btnRegistro_Excluir.setText("EXCLUIR");
        btnRegistro_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro_ExcluirActionPerformed(evt);
            }
        });

        Tabela_Registro_Maio_2024.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Classificação", "Despesas", "Data", "Valor", "Pagamento", "Obs", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_Registro_Maio_2024);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("TOTAL");

        txtValor_Total_Saidas.setEditable(false);
        txtValor_Total_Saidas.setFocusable(false);
        txtValor_Total_Saidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor_Total_SaidasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("MAIO 2024");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(cbx_Classificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDespesas)
                            .addComponent(cbx_Pagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtObs)
                            .addComponent(cbx_Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtValor)
                            .addComponent(jLabel10)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnRegistro_Inserir)))
                .addGap(18, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistro_CarregarCampos)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistro_LimparCampos)
                        .addGap(105, 105, 105)
                        .addComponent(btnRegistro_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor_Total_Saidas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(293, 293, 293))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistro_Inserir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor_Total_Saidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistro_Excluir)
                        .addComponent(btnRegistro_CarregarCampos)
                        .addComponent(btnRegistro_LimparCampos)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1266, 735));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_RegistroActionPerformed
        // chamar tela de registro
        RegistroView objregistroview = new RegistroView();
        objregistroview.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnHome_RegistroActionPerformed

    private void btnHome_RendaMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_RendaMensalActionPerformed
        // chamar tela de renda mensal
        RendaMensalView objrendamensalview = new RendaMensalView();
        objrendamensalview.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnHome_RendaMensalActionPerformed

    private void btn_Home_TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Home_TelaInicialActionPerformed
        // chamar tela inicial
        HomeView objhomeviewTelaInicial = new HomeView();
        objhomeviewTelaInicial.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_Home_TelaInicialActionPerformed

    private void btnRegistro_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_InserirActionPerformed
        RegistrarDadosFevereiro2024();
        ListarRegistros();
        LimparCamposFevereiro2024();
        ExibirCalculoTotal();


    }//GEN-LAST:event_btnRegistro_InserirActionPerformed

    private void btnRegistro_CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_CarregarCamposActionPerformed
        // carregar campos no campo de texto 
        CarregarCamposFevereiro2024();


    }//GEN-LAST:event_btnRegistro_CarregarCamposActionPerformed

    private void btnRegistro_LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_LimparCamposActionPerformed
        // limpar campos no campo de texto
        LimparCamposFevereiro2024();

    }//GEN-LAST:event_btnRegistro_LimparCamposActionPerformed

    private void btnRegistro_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_ExcluirActionPerformed
        // excluir registros
        ExcluirRegistrosFevereiro2024();
        ListarRegistros();
        LimparCamposFevereiro2024();
        ExibirCalculoTotal();

    }//GEN-LAST:event_btnRegistro_ExcluirActionPerformed

    private void txtValor_Total_SaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor_Total_SaidasActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txtValor_Total_SaidasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_Maio_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Maio_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Maio_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Maio_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Maio_2024View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_Registro_Maio_2024;
    private javax.swing.JButton btnHome_Registro;
    private javax.swing.JButton btnHome_RendaMensal;
    private javax.swing.JButton btnRegistro_CarregarCampos;
    private javax.swing.JButton btnRegistro_Excluir;
    private javax.swing.JButton btnRegistro_Inserir;
    private javax.swing.JButton btnRegistro_LimparCampos;
    private javax.swing.JButton btn_Home_TelaInicial;
    private javax.swing.JComboBox<String> cbx_Classificacao;
    private javax.swing.JComboBox<String> cbx_Pagamento;
    private javax.swing.JComboBox<String> cbx_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDespesas;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor_Total_Saidas;
    // End of variables declaration//GEN-END:variables

    private void ListarRegistros() {

        try {

            Registro_Maio_2024DAO objregistromaio2024dao = new Registro_Maio_2024DAO();

            DefaultTableModel model = (DefaultTableModel) Tabela_Registro_Maio_2024.getModel();
            model.setNumRows(0);

            ArrayList<Registro_Maio_2024DTO> lista = objregistromaio2024dao.PesquisarRegistroFevereiro2024();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdSaidas_Maio_2024(),
                    lista.get(num).getClassificacao(),
                    lista.get(num).getDespesas(),
                    lista.get(num).getData(),
                    lista.get(num).getValor(),
                    lista.get(num).getPagamento(),
                    lista.get(num).getObs(),
                    lista.get(num).getTipo(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em ListarRegistrosFevereiro2024 em RegistrosView" + erro);
        }

    }

    private void RegistrarDadosFevereiro2024() {
        String Classificacao, Despesas, Obs, Pagamento, Tipo;
        BigDecimal Valor;
        Date Data;

        // Obter os valores dos componentes da interface
        Classificacao = (String) cbx_Classificacao.getSelectedItem();
        Despesas = txtDespesas.getText();
        Obs = txtObs.getText();
        Pagamento = (String) cbx_Pagamento.getSelectedItem();
        Tipo = (String) cbx_Tipo.getSelectedItem();

        BigDecimal Valor_Total_Saidas = BigDecimal.ZERO; // Valor padrão, ajuste conforme necessário
        String tipo_saida = "Saida"; // Valor padrão, ajuste conforme necessário

        // Obter e converter o valor
        String valorTexto = txtValor.getText().replaceAll("[^0-9,.]", "").replace(".", "").replace(",", "."); // Remove caracteres não numéricos e substitui vírgula por ponto
        try {
            Valor = new BigDecimal(valorTexto).setScale(2, RoundingMode.HALF_UP);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor inserido não é válido.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Data = sdf.parse(txtData.getText());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "A data inserida não é válida. Use o formato dd/MM/yyyy.");
            return;
        }

        // Criar objeto DTO com os dados
        Registro_Maio_2024DTO objregistromaio2024dto = new Registro_Maio_2024DTO();
        objregistromaio2024dto.setClassificicacao(Classificacao);
        objregistromaio2024dto.setDespesas(Despesas);
        objregistromaio2024dto.setObs(Obs);
        objregistromaio2024dto.setValor(Valor);
        objregistromaio2024dto.setPagamento(Pagamento);
        objregistromaio2024dto.setData(Data);
        objregistromaio2024dto.setTipo(Tipo);
        objregistromaio2024dto.setValor_Total_Saidas(Valor_Total_Saidas);
        objregistromaio2024dto.setTipo_saida(tipo_saida);

        // Chamar o método do DAO para registrar os dados
        Registro_Maio_2024DAO objregistromaio2024dao = new Registro_Maio_2024DAO();
        objregistromaio2024dao.registrarDados(objregistromaio2024dto);
    }

    private void CarregarCamposFevereiro2024() {
        int setar = Tabela_Registro_Maio_2024.getSelectedRow();

        // Verificar se há uma linha selecionada
        if (setar >= 0 && setar < Tabela_Registro_Maio_2024.getRowCount()) {
            txtCodigo.setText(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 0).toString());
            cbx_Classificacao.setSelectedItem(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 1).toString());
            txtDespesas.setText(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 2).toString());

            // Carregar a data no formato dd/MM/yyyy
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date data = (Date) Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 3);
                txtData.setText(sdf.format(data));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar a data.");
            }

            txtValor.setText(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 4).toString());
            cbx_Pagamento.setSelectedItem(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 5).toString());
            txtObs.setText(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 6).toString());
            cbx_Tipo.setSelectedItem(Tabela_Registro_Maio_2024.getModel().getValueAt(setar, 7).toString());
        }
    }

    private void AlterarRegistroFevereiro2024() {
        try {
            if (txtCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione um registro, em seguida CLIQUE em Carregar Campos para alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int idSaidas_Maio_2024 = Integer.parseInt(txtCodigo.getText());
            String Classificacao = (String) cbx_Classificacao.getSelectedItem();
            String Despesas = txtDespesas.getText();
            String DataStr = txtData.getText();
            String ValorStr = txtValor.getText();
            String Pagamento = (String) cbx_Pagamento.getSelectedItem();
            String Obs = txtObs.getText();
            String Tipo = (String) cbx_Tipo.getSelectedItem();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date Data = null;
            try {
                Data = sdf.parse(DataStr);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Data inserida inválida. Use o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            DecimalFormat df = new DecimalFormat("#,##0.00");
            BigDecimal Valor = null;
            try {
                // Tenta converter o valor de entrada para BigDecimal
                Valor = new BigDecimal(ValorStr.replace(",", ".").replace(",", "."));
                // Formata o valor para ter no máximo 9 dígitos no total, com até 2 casas decimais
                txtValor.setText(df.format(Valor));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inserido inválido. Use apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Registro_Maio_2024DTO objregistromaio2024dto = new Registro_Maio_2024DTO();
            objregistromaio2024dto.setIdSaidas_Maio_2024(idSaidas_Maio_2024);
            objregistromaio2024dto.setClassificicacao(Classificacao);
            objregistromaio2024dto.setDespesas(Despesas);
            objregistromaio2024dto.setData(Data);
            objregistromaio2024dto.setValor(Valor);
            objregistromaio2024dto.setPagamento(Pagamento);
            objregistromaio2024dto.setObs(Obs);
            objregistromaio2024dto.setTipo(Tipo);

            Registro_Maio_2024DAO objregistromaio2024dao = new Registro_Maio_2024DAO();
            objregistromaio2024dao.alterarRegistroFevereiro2024(objregistromaio2024dto);

            //exibir metodo atualizar valor
            atualizarValor(Valor, txtValor_Total_Saidas);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter número. Verifique os campos de valor e código!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ExcluirRegistrosFevereiro2024() {
        try {
            if (txtCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha na tabela e CLIQUE em Carregar Campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int idSaidas_Maio_2024 = Integer.parseInt(txtCodigo.getText());

            Registro_Maio_2024DTO objregistromaio2024dto = new Registro_Maio_2024DTO();
            objregistromaio2024dto.setIdSaidas_Maio_2024(idSaidas_Maio_2024);

            Registro_Maio_2024DAO objregistromaio2024dao = new Registro_Maio_2024DAO();
            objregistromaio2024dao.ExcluirRegistros(objregistromaio2024dto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter número. Verifique o campo de código!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LimparCamposFevereiro2024() {

        txtCodigo.setText("");
        cbx_Classificacao.setSelectedItem(null);
        txtDespesas.setText("");
        txtData.setText("");
        txtValor.setText("");
        cbx_Pagamento.setSelectedItem(null);
        txtObs.setText("");
        cbx_Tipo.setSelectedItem(null);

    }

    //agora q ja criei minha DAO, quero que puxe o valor total para o meu txtValor_Total_Saiu
    private void ExibirCalculoTotal() {
        Registro_Maio_2024DAO dao = new Registro_Maio_2024DAO();
        BigDecimal total = dao.calcularTotalSaidas();

        // Formatar o total para exibir no formato desejado
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String totalFormatado = df.format(total);

        // Exibir o total no campo de texto txtValor_Total_Saiu
        txtValor_Total_Saidas.setText(totalFormatado);
    }

    private void atualizarValor(BigDecimal valor, JTextField txtValor_Total_Entrou) {
        // Verifica se o valor é nulo
        if (valor == null) {
            txtValor_Total_Entrou.setText("Valor nulo");
            return;
        }

        // Formatar o valor para exibir com duas casas decimais e separador de milhares
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        String valorFormatado = df.format(valor);

        // Exibir o valor formatado no campo de texto
        txtValor_Total_Saidas.setText(valorFormatado);
    }

}
