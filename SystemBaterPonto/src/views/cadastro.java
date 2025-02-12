package views;

import cadastro.Usuario;
import controller.FormCadastroController;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author César
 */
public class cadastro extends javax.swing.JFrame {
    private final FormCadastroController controller;

    /**
     * Creates new form cadastro
     */
    public cadastro() {
        initComponents();
        controller = new FormCadastroController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        ForCpf = new javax.swing.JFormattedTextField();
        ForData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ForRg = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PassSenh = new javax.swing.JPasswordField();
        txtTele = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEsta = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtRefe = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtComple = new javax.swing.JTextField();
        ForCep = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("CPF :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 202, 30));
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, 120, 30));
        jPanel1.add(ForCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 169, 29));
        jPanel1.add(ForData, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 52, 120, 30));

        jLabel3.setText("Data de Nascimento :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 30, -1, -1));

        jLabel4.setText("RG");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 89, -1, -1));
        jPanel1.add(ForRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 111, 150, 29));

        jLabel5.setText("Cargo :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        jLabel6.setText("Teleone :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 80, 30));

        jLabel7.setText("Senha :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        jPanel1.add(PassSenh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 30));
        jPanel1.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, 30));

        jLabel8.setText("ID :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel18.setText("Usuário:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 280));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Estado :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 58, -1));

        jLabel10.setText("Bairro :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        jLabel11.setText("Referencia :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        jLabel12.setText("Número :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel2.add(txtEsta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 32));
        jPanel2.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 130, 31));
        jPanel2.add(txtRefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 163, 32));
        jPanel2.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 163, 30));

        jLabel13.setText("Cidade :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel14.setText("Rua :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel15.setText("Complemento");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel16.setText("CEP :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        jPanel2.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, 32));
        jPanel2.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 108, 210, 31));
        jPanel2.add(txtComple, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 171, 170, 32));
        jPanel2.add(ForCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 370, 282));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, -1));

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 350, 110, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Sistem Ponto (2).png"))); // NOI18N
        jLabel17.setText("Img");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 920, 500));

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Volta a página inicial");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        //Vai feixa a interface quando o usuario administrador volta a pagina inicial
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        controller.salvaUsuario();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    public JFormattedTextField getForCep() {
        return ForCep;
    }

    public void setForCep(JFormattedTextField ForCep) {
        this.ForCep = ForCep;
    }

    public JFormattedTextField getForCpf() {
        return ForCpf;
    }

    public void setForCpf(JFormattedTextField ForCpf) {
        this.ForCpf = ForCpf;
    }

    public JFormattedTextField getForData() {
        return ForData;
    }

    public void setForData(JFormattedTextField ForData) {
        this.ForData = ForData;
    }

    public JFormattedTextField getForRg() {
        return ForRg;
    }

    public void setForRg(JFormattedTextField ForRg) {
        this.ForRg = ForRg;
    }

    public JTextField getTxtBairro() {
        return txtBairro;
    }

    public void setTxtBairro(JTextField txtBairro) {
        this.txtBairro = txtBairro;
    }

    public JTextField getTxtCargo() {
        return txtCargo;
    }

    public void setTxtCargo(JTextField txtCargo) {
        this.txtCargo = txtCargo;
    }

    public JTextField getTxtCidade() {
        return txtCidade;
    }

    public void setTxtCidade(JTextField txtCidade) {
        this.txtCidade = txtCidade;
    }

    public JTextField getTxtComple() {
        return txtComple;
    }

    public void setTxtComple(JTextField txtComple) {
        this.txtComple = txtComple;
    }

    public JTextField getTxtEsta() {
        return txtEsta;
    }

    public void setTxtEsta(JTextField txtEsta) {
        this.txtEsta = txtEsta;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtNum() {
        return txtNum;
    }

    public void setTxtNum(JTextField txtNum) {
        this.txtNum = txtNum;
    }

    public JTextField getTxtRefe() {
        return txtRefe;
    }

    public void setTxtRefe(JTextField txtRefe) {
        this.txtRefe = txtRefe;
    }

    public JTextField getTxtRua() {
        return txtRua;
    }

    public void setTxtRua(JTextField txtRua) {
        this.txtRua = txtRua;
    }

    public JTextField getTxtTele() {
        return txtTele;
    }

    public void setTxtTele(JTextField txtTele) {
        this.txtTele = txtTele;
    }

    public JTextField getTxtUsu() {
        return txtUsu;
    }

    public void setTxtUsu(JTextField txtUsu) {
        this.txtUsu = txtUsu;
    }

    public JPasswordField getPassSenh() {
        return PassSenh;
    }

    public void setPassSenh(JPasswordField PassSenh) {
        this.PassSenh = PassSenh;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ForCep;
    private javax.swing.JFormattedTextField ForCpf;
    private javax.swing.JFormattedTextField ForData;
    private javax.swing.JFormattedTextField ForRg;
    private javax.swing.JPasswordField PassSenh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComple;
    private javax.swing.JTextField txtEsta;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRefe;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTele;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
