package Sistema;

import DTO.RendaMensal_Março_2024DTO;
import dao.RendaMensal_Março_2024DAO;
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

public class RendaMensal_Março_2024View extends javax.swing.JFrame {

    public RendaMensal_Março_2024View() {
        initComponents();
        ListarRendaMensalFevereiro2024();
        atualizarValor(BigDecimal.ZERO, txtValor_Total_Entrou);
        ExibirCalculoTotalEntradas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnHome_Registro = new javax.swing.JButton();
        btnHome_RendaMensal = new javax.swing.JButton();
        btn_Home_TelaInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtValor_Entrou = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtData_Entrou = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtidRendaMensal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_RendaMensal_Março_2024 = new javax.swing.JTable();
        btnRegistro_CarregarCampos = new javax.swing.JButton();
        btnRegistro_LimparCampos = new javax.swing.JButton();
        btnRegistro_Excluir = new javax.swing.JButton();
        btnRegistro_Inserir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtValor_Total_Entrou = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

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

        jLabel1.setText("*Valor");

        jLabel2.setText("Data");

        jLabel3.setText("*Descrição");

        jLabel4.setText("ID");

        txtidRendaMensal.setEditable(false);
        txtidRendaMensal.setEnabled(false);
        txtidRendaMensal.setFocusable(false);
        txtidRendaMensal.setRequestFocusEnabled(false);

        Tabela_RendaMensal_Março_2024.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Valor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_RendaMensal_Março_2024);

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

        btnRegistro_Inserir.setText("INSERIR");
        btnRegistro_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro_InserirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("TOTAL");

        txtValor_Total_Entrou.setEditable(false);
        txtValor_Total_Entrou.setFocusable(false);
        txtValor_Total_Entrou.setRequestFocusEnabled(false);
        txtValor_Total_Entrou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor_Total_EntrouActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setText("MARÇO 2024");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(txtValor_Entrou)
                                        .addComponent(txtDescricao)
                                        .addComponent(txtData_Entrou)
                                        .addComponent(jLabel4)
                                        .addComponent(txtidRendaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(btnRegistro_Inserir)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistro_Excluir, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnRegistro_CarregarCampos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRegistro_LimparCampos)
                                        .addGap(313, 313, 313))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor_Total_Entrou, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(211, 211, 211))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtidRendaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor_Entrou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData_Entrou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnRegistro_Inserir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor_Total_Entrou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro_CarregarCampos)
                    .addComponent(btnRegistro_LimparCampos)
                    .addComponent(btnRegistro_Excluir))
                .addGap(51, 51, 51))
        );

        setSize(new java.awt.Dimension(1052, 708));
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

    private void btnRegistro_CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_CarregarCamposActionPerformed
        // carregar campos no campo de texto
        CarregarCamposFevereiro2024();
        ExibirCalculoTotalEntradas();

    }//GEN-LAST:event_btnRegistro_CarregarCamposActionPerformed

    private void btnRegistro_LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_LimparCamposActionPerformed
        // limpar campos no campo de texto
        LimparCamposJaneiro2024();
        ExibirCalculoTotalEntradas();

    }//GEN-LAST:event_btnRegistro_LimparCamposActionPerformed

    private void btnRegistro_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_ExcluirActionPerformed
        // excluir registros
        ExcluirRendaMensalFevereiro2024();
        ListarRendaMensalFevereiro2024();
        LimparCamposJaneiro2024();
        atualizarValor(BigDecimal.ZERO, txtValor_Total_Entrou);
        ExibirCalculoTotalEntradas();

    }//GEN-LAST:event_btnRegistro_ExcluirActionPerformed

    private void btnRegistro_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro_InserirActionPerformed
        RegistrarRendaMensalFevereiro2024();
        ListarRendaMensalFevereiro2024();
        LimparCamposJaneiro2024();
        atualizarValor(BigDecimal.ZERO, txtValor_Total_Entrou);
        ExibirCalculoTotalEntradas();


    }//GEN-LAST:event_btnRegistro_InserirActionPerformed

    private void txtValor_Total_EntrouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor_Total_EntrouActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtValor_Total_EntrouActionPerformed

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
            java.util.logging.Logger.getLogger(RendaMensal_Março_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RendaMensal_Março_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RendaMensal_Março_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RendaMensal_Março_2024View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new RendaMensal_Março_2024View().setVisible(true);
            }
        });
    }

    private void ListarRendaMensalFevereiro2024() {

        try {

            RendaMensal_Março_2024DAO objrendamensalmarço2024dao = new RendaMensal_Março_2024DAO();

            DefaultTableModel model = (DefaultTableModel) Tabela_RendaMensal_Março_2024.getModel();
            model.setNumRows(0);

            ArrayList<RendaMensal_Março_2024DTO> lista = objrendamensalmarço2024dao.PesquisarRendaMensalFevereiro2024();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdRendaMensal_Março_2024(),
                    lista.get(num).getDescricao(),
                    lista.get(num).getValor_Entrou(),
                    lista.get(num).getData(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro em ListarRegistros em RendaMensalFevereiro2024" + erro);
        }

    }

private void RegistrarRendaMensalFevereiro2024() {
    String Descricao;
    BigDecimal Valor_Entrou;
    Date Data;

    // Obter os valores dos componentes da interface
    Descricao = (String) txtDescricao.getText();

    String tipo_Entrada = "Entrada"; // Valor padrão, ajuste conforme necessário

    // Obter e converter o valor
    String valorTexto = txtValor_Entrou.getText().replaceAll("[^0-9,.]", "").replace(".", "").replace(",", "."); // Remove caracteres não numéricos e substitui vírgula por ponto
    if (valorTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "O valor inserido não é válido.\n" + " Verifique se todos os campos obrigatorios foram preenchidos.\n" + 
                                                 "Esses campos tem um * no começo,\n" + "Por exemplo: *Valor");
        return;
    }
    try {
        Valor_Entrou = new BigDecimal(valorTexto).setScale(2, RoundingMode.HALF_UP);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "O valor inserido não é válido.");
        return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
        Data = sdf.parse(txtData_Entrou.getText());
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "A data inserida não é válida. Use o formato dd/MM/yyyy.");
        return;
    }

    // Criar objeto DTO com os dados
    RendaMensal_Março_2024DTO objrendamensalmarço2024dto = new RendaMensal_Março_2024DTO();
    objrendamensalmarço2024dto.setDescricao(Descricao);
    objrendamensalmarço2024dto.setValor_Entrou(Valor_Entrou);
    objrendamensalmarço2024dto.setData(Data);
    objrendamensalmarço2024dto.setTipo_Entrada(tipo_Entrada);

    // Chamar o método do DAO para registrar os dados
    RendaMensal_Março_2024DAO objrendamensalmarço2024dao = new RendaMensal_Março_2024DAO();
    objrendamensalmarço2024dao.registrarRendaMensalFevereiro2024(objrendamensalmarço2024dto);
}

private void CarregarCamposFevereiro2024() {
    int setar = Tabela_RendaMensal_Março_2024.getSelectedRow();

    //verificar se há uma linha selecionada
    if (setar >= 0 && setar < Tabela_RendaMensal_Março_2024.getRowCount()) {
        txtidRendaMensal.setText(Tabela_RendaMensal_Março_2024.getModel().getValueAt(setar, 0).toString());
        txtDescricao.setText(Tabela_RendaMensal_Março_2024.getModel().getValueAt(setar, 1).toString());
        txtValor_Entrou.setText(Tabela_RendaMensal_Março_2024.getModel().getValueAt(setar, 2).toString());

        // Carregar a data no formato dd/MM/yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = (Date) Tabela_RendaMensal_Março_2024.getModel().getValueAt(setar, 3);
            txtData_Entrou.setText(sdf.format(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a data.");
        }
    }
}


private void AlterarRendaMensalFevereiro2024() {
    try {
        if (txtidRendaMensal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um registro, em seguida CLIQUE em Carregar Campos para alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int IdRendaMensal_Março_2024 = Integer.parseInt(txtidRendaMensal.getText());
        String Descricao = txtDescricao.getText();
        BigDecimal Valor_Entrou = null;
        Date Data_Entrou = new SimpleDateFormat("dd/MM/yyyy").parse(txtData_Entrou.getText());

        try {
            // Tenta converter o valor de entrada para BigDecimal
            Valor_Entrou = new BigDecimal(txtValor_Entrou.getText().replace(",", "."));
            // Formata o valor para ter no máximo 9 dígitos no total, com até 2 casas decimais
            Valor_Entrou = Valor_Entrou.setScale(2, RoundingMode.HALF_UP);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter número. Verifique os campos de valor e código!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        RendaMensal_Março_2024DTO objrendamensalmarço2024dto = new RendaMensal_Março_2024DTO();
        objrendamensalmarço2024dto.setIdRendaMensal_Março_2024(IdRendaMensal_Março_2024);
        objrendamensalmarço2024dto.setDescricao(Descricao);
        objrendamensalmarço2024dto.setData(Data_Entrou);
        objrendamensalmarço2024dto.setValor_Entrou(Valor_Entrou);

        RendaMensal_Março_2024DAO objrendamensalmarço2024dao = new RendaMensal_Março_2024DAO();
        objrendamensalmarço2024dao.alterarRendaMensalFevereiro2024(objrendamensalmarço2024dto);
        
        //exibir metodo atualizar valor
        atualizarValor(Valor_Entrou, txtValor_Total_Entrou);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erro ao converter número. Verifique os campos de valor e código!", "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Erro ao converter data. Verifique o formato dd/MM/yyyy!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


    private void ExcluirRendaMensalFevereiro2024() {
        try {
            if (txtidRendaMensal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha na tabela e CLIQUE em Carregar Campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int IdRendaMensal_Março_2024 = Integer.parseInt(txtidRendaMensal.getText());

            RendaMensal_Março_2024DTO objrendamensalmarço2024dto = new RendaMensal_Março_2024DTO();
            objrendamensalmarço2024dto.setIdRendaMensal_Março_2024(IdRendaMensal_Março_2024);

            RendaMensal_Março_2024DAO objrendamensalmarço2024dao = new RendaMensal_Março_2024DAO();
            objrendamensalmarço2024dao.ExcluirRendaMensal(objrendamensalmarço2024dto);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter número. Verifique o campo de código!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LimparCamposJaneiro2024() {

        txtidRendaMensal.setText("");
        txtDescricao.setText("");
        txtData_Entrou.setText("");
        txtValor_Entrou.setText("");

    }

 private void ExibirCalculoTotalEntradas() {
    RendaMensal_Março_2024DAO dao = new RendaMensal_Março_2024DAO();
    BigDecimal total = dao.calcularTotalEntradas();

    // Verifica se o total é nulo
    if (total == null) {
        JOptionPane.showMessageDialog(null, "O total de entradas é nulo.");
        return;
    }

    // Formatar o total para exibir com duas casas decimais e separador de milhares
    DecimalFormat df = new DecimalFormat("###,###,##0.00");
    String totalFormatado = df.format(total);

    // Exibir o total no campo de texto txtValor_Total_Entrou
    txtValor_Total_Entrou.setText(totalFormatado);
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
    txtValor_Total_Entrou.setText(valorFormatado);
}







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_RendaMensal_Março_2024;
    private javax.swing.JButton btnHome_Registro;
    private javax.swing.JButton btnHome_RendaMensal;
    private javax.swing.JButton btnRegistro_CarregarCampos;
    private javax.swing.JButton btnRegistro_Excluir;
    private javax.swing.JButton btnRegistro_Inserir;
    private javax.swing.JButton btnRegistro_LimparCampos;
    private javax.swing.JButton btn_Home_TelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtData_Entrou;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValor_Entrou;
    private javax.swing.JTextField txtValor_Total_Entrou;
    private javax.swing.JTextField txtidRendaMensal;
    // End of variables declaration//GEN-END:variables

}
