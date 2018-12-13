/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Consultar;

import DAO.Conexao;
import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import Principal.Menu;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ConsultarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarDVD
     */
    
    
     private void AtualizarTable(){
            Connection con = Conexao.AbrirConexao();
            FuncionarioDAO bd = new FuncionarioDAO(con);
            List<Funcionario> lista = new ArrayList<>();
            lista = bd.ListarFuncionario();
            DefaultTableModel tbm =
                    (DefaultTableModel) jtableConsulFuncionario.getModel();
            while (tbm.getRowCount() > 0) {
                tbm.removeRow(0);
                
            }
            int i= 0;

            for (Funcionario tab : lista) {

              tbm.addRow(new String[i]);
              jtableConsulFuncionario.setValueAt(tab.getCodigo(), i, 0);
              jtableConsulFuncionario.setValueAt(tab.getNome(), i, 1);
              jtableConsulFuncionario.setValueAt(tab.getEmail(), i, 2);
              jtableConsulFuncionario.setValueAt(tab.getRG(), i, 3);
              jtableConsulFuncionario.setValueAt(tab.getCPF(), i, 4);
              jtableConsulFuncionario.setValueAt(tab.getTelefone(), i, 5);
              jtableConsulFuncionario.setValueAt(tab.getNascimento(), i, 6);
              jtableConsulFuncionario.setValueAt(tab.getRua(), i, 7);
              jtableConsulFuncionario.setValueAt(tab.getNumero(), i, 8);
              jtableConsulFuncionario.setValueAt(tab.getBairro(), i, 9);
              jtableConsulFuncionario.setValueAt(tab.getCEP(), i, 10);
             
              i++;
                
            }
            Conexao.FecharConexao(con);
        }
     
      private void AtualizarNome(){
            Connection con = Conexao.AbrirConexao();
            FuncionarioDAO bd = new FuncionarioDAO(con);
            List<Funcionario> lista = new ArrayList<>();
            
            String nome = (String) jTextField3.getText();
            
            lista = bd.Pesquisar_Nome_Funcionario(nome);

            DefaultTableModel tbm =
                    (DefaultTableModel) jtableConsulFuncionario.getModel();
            while (tbm.getRowCount() > 0) {
                tbm.removeRow(0);
                
            }
            int i= 0;

            for (Funcionario tab : lista) {

              tbm.addRow(new String[i]);
              jtableConsulFuncionario.setValueAt(tab.getCodigo(), i, 0);
              jtableConsulFuncionario.setValueAt(tab.getNome(), i, 1);
              jtableConsulFuncionario.setValueAt(tab.getEmail(), i, 2);
              jtableConsulFuncionario.setValueAt(tab.getRG(), i, 3);
              jtableConsulFuncionario.setValueAt(tab.getCPF(), i, 4);
              jtableConsulFuncionario.setValueAt(tab.getTelefone(), i, 5);
              jtableConsulFuncionario.setValueAt(tab.getNascimento(), i, 6);
              jtableConsulFuncionario.setValueAt(tab.getRua(), i, 7);
              jtableConsulFuncionario.setValueAt(tab.getNumero(), i, 8);
              jtableConsulFuncionario.setValueAt(tab.getBairro(), i, 9);
              jtableConsulFuncionario.setValueAt(tab.getCEP(), i, 10);
             
              i++;
                
            }
            Conexao.FecharConexao(con);
        }
      
       private void AtualizarCodigo(){
            Connection con = Conexao.AbrirConexao();
            FuncionarioDAO bd = new FuncionarioDAO(con);
            List<Funcionario> lista = new ArrayList<>();
            lista = bd.ListarFuncionario();
            DefaultTableModel tbm =
                    (DefaultTableModel) jtableConsulFuncionario.getModel();
            while (tbm.getRowCount() > 0) {
                tbm.removeRow(0);
                
            }
            int i= 0;

            for (Funcionario tab : lista) {

              tbm.addRow(new String[i]);
              jtableConsulFuncionario.setValueAt(tab.getCodigo(), i, 0);
              jtableConsulFuncionario.setValueAt(tab.getNome(), i, 1);
              jtableConsulFuncionario.setValueAt(tab.getEmail(), i, 2);
              jtableConsulFuncionario.setValueAt(tab.getRG(), i, 3);
              jtableConsulFuncionario.setValueAt(tab.getCPF(), i, 4);
              jtableConsulFuncionario.setValueAt(tab.getTelefone(), i, 5);
              jtableConsulFuncionario.setValueAt(tab.getNascimento(), i, 6);
              jtableConsulFuncionario.setValueAt(tab.getRua(), i, 7);
              jtableConsulFuncionario.setValueAt(tab.getNumero(), i, 8);
              jtableConsulFuncionario.setValueAt(tab.getBairro(), i, 9);
              jtableConsulFuncionario.setValueAt(tab.getCEP(), i, 10);
             
              i++;
                
            }
            Conexao.FecharConexao(con);
        }

    
  
     public ConsultarFuncionario() {
        initComponents();
       
       AtualizarTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableConsulFuncionario = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 90, 0));

        jLabel6.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        jLabel6.setText(" E-Wall");

        jLabel7.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 18)); // NOI18N
        jLabel7.setText("CONSULTAR FUNCIONÁRIO");

        jButton5.setText("Sair");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
        );

        jPanel12.setBackground(new java.awt.Color(1, 62, 254));

        jtableConsulFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Email", "RG", "CPF", "Telefone", "Data Nacs", "Rua", "Numero", "Bairro", "CEP"
            }
        ));
        jScrollPane1.setViewportView(jtableConsulFuncionario);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar por nome");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar por Codigo");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("TODOS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
        AtualizarNome();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AtualizarTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Connection con = Conexao.AbrirConexao();
           FuncionarioDAO bd = new FuncionarioDAO(con);
            List<Funcionario> lista = new ArrayList<>();
            lista = bd.Pesquisar_Cod_Funcionario(Integer.parseInt(jTextField2.getText()));
            DefaultTableModel tbm =
                    (DefaultTableModel) jtableConsulFuncionario.getModel();
            while (tbm.getRowCount() > 0) {
                tbm.removeRow(0);
                
            }
            int i= 0;
            for (Funcionario tab : lista) {
              tbm.addRow(new String[i]);
              jtableConsulFuncionario.setValueAt(tab.getCodigo(), i, 0);
              jtableConsulFuncionario.setValueAt(tab.getNome(), i, 1);
              jtableConsulFuncionario.setValueAt(tab.getEmail(), i, 2);
              jtableConsulFuncionario.setValueAt(tab.getRG(), i, 3);
              jtableConsulFuncionario.setValueAt(tab.getCPF(), i, 4);
              jtableConsulFuncionario.setValueAt(tab.getTelefone(), i, 5);
              jtableConsulFuncionario.setValueAt(tab.getNascimento(), i, 6);
              jtableConsulFuncionario.setValueAt(tab.getRua(), i, 7);
              jtableConsulFuncionario.setValueAt(tab.getNumero(), i, 8);
              jtableConsulFuncionario.setValueAt(tab.getBairro(), i, 9);
              jtableConsulFuncionario.setValueAt(tab.getCEP(), i, 10);
             
             
              i++;
                
            }
            Conexao.FecharConexao(con);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsultarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable jtableConsulFuncionario;
    // End of variables declaration//GEN-END:variables
}
