/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UsuarioController;
import Entidades.Sessao;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Enumeradores.TipoUsuario;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.UsuarioModel;

/**
 *
 * @author jackdaniels
 */
public class UsuarioView extends javax.swing.JFrame {

    UsuarioController ctrlUsuario;
    private EventoBotao acao;

    /**
     * Creates new form UsuarioView
     */
    public UsuarioView(Sessao p_sessao) {
        this.setLocation(300, 100);
        initComponents();
        ctrlUsuario = new UsuarioController(p_sessao);
        if (p_sessao.getPerfilUsuario() == TipoUsuario.FUNCIONARIO) {
            jComboBoxTipoUsuario.setSelectedIndex(2);
            jComboBoxTipoUsuario.setEnabled(false);
            jButtonRmv.setEnabled(false);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancel = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEnderecoUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCPFUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDtNascUsuario = new javax.swing.JTextField();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelUser = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JPasswordField();
        jButtonLimpaTela = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRmv = new javax.swing.JButton();
        jButtonCons = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanelCampos.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jTextFieldEnderecoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF:");

        jTextFieldCPFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Data Nasc.");

        jTextFieldDtNascUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtNascUsuarioActionPerformed(evt);
            }
        });

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionário", "Gerente", "Cliente"}));
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });

        jLabel21.setText("Tipo Usuário:");

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jLabelUser.setText("Usuario;");

        jLabelSenha.setText("Senha;");

        jTextFieldIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setText("Id:");

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDtNascUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUser)
                            .addComponent(jLabel21)
                            .addComponent(jLabelSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldSenha)
                                .addComponent(jComboBoxTipoUsuario, 0, 351, Short.MAX_VALUE)
                                .addComponent(jTextFieldUserName)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnderecoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDtNascUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonLimpaTela.setLabel("Limpar Tela");
        jButtonLimpaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpaTelaActionPerformed(evt);
            }
        });

        jButtonAdd.setLabel("Incluir");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRmv.setText("Remover");
        jButtonRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRmvActionPerformed(evt);
            }
        });

        jButtonCons.setText("Consultar");
        jButtonCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelUsuario.setText("Adicionar Usuario");

        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCons)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancel)
                                .addGap(4, 4, 4))
                            .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jLabelUsuario)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCons, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMensagem.getAccessibleContext().setAccessibleName("lblMensagem");
        lblMensagem.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            TipoUsuario _tipo = null;
            switch (jComboBoxTipoUsuario.getSelectedIndex()) {
                case 0:
                    _tipo = _tipo.FUNCIONARIO;
                    break;
                case 1:
                    _tipo = _tipo.GERENTE;
                    break;
                case 2:
                    _tipo = _tipo.CLIENTE;
                    break;
            }
            Usuario user = new Usuario(Integer.parseInt(jTextFieldIdUsuario.getText().equals("") ? "0" : jTextFieldIdUsuario.getText()), jTextFieldNomeUsuario.getText(), jTextFieldEnderecoUsuario.getText(), jTextFieldCPFUsuario.getText(), jTextFieldDtNascUsuario.getText(), jTextFieldUserName.getText(), String.valueOf(jTextFieldSenha.getPassword()), _tipo);
            jTextFieldIdUsuario.setText(String.valueOf(ctrlUsuario.ExecutaEventoBotao(user, acao.Incluir).getIdUsuario()));
        } catch (Exception e) {
            lblMensagem.setText(e.getMessage());
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvActionPerformed
        try {
            jLabelUsuario.setText("Remover Usuario");
            Usuario _u = ctrlUsuario.ExecutaEventoBotao(new Usuario(Integer.parseInt(jTextFieldIdUsuario.getText())), acao.Excluir);
            if (_u == null) {
                LimparCampos();
                lblMensagem.setText("Exclusão com sucesso!");

            }
        } catch (Exception e) {
            lblMensagem.setText(e.getMessage());
        }

    }//GEN-LAST:event_jButtonRmvActionPerformed

    private void jButtonConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsActionPerformed
        try {
            jLabelUsuario.setText("Consultar Usuario");
            Usuario user = new Usuario();

            user.setIdUsuario(Integer.parseInt(!jTextFieldIdUsuario.getText().trim().equals("") ? jTextFieldIdUsuario.getText() : "0"));
            user.setNome(!jTextFieldNomeUsuario.getText().trim().equals("") ? jTextFieldNomeUsuario.getText() : "");
            user = ctrlUsuario.ExecutaEventoBotao(user, acao.Consultar);
            jTextFieldIdUsuario.setText(String.valueOf(user.getIdUsuario()));
            jTextFieldNomeUsuario.setText(user.getNome());
            jTextFieldEnderecoUsuario.setText(user.getEndereco());
            jTextFieldCPFUsuario.setText(user.getCpf());
            jTextFieldDtNascUsuario.setText(user.getDtNasc());
            jTextFieldUserName.setText(user.getUsuario());
            jTextFieldSenha.setText(user.getSenha());
        } catch (Exception e) {
            lblMensagem.setText(e.getMessage());
        }

    }//GEN-LAST:event_jButtonConsActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdUsuarioActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed
        // TODO add your handling code here:
        switch (jComboBoxTipoUsuario.getSelectedIndex()) {

            case 0:
            case 1:
                jTextFieldUserName.setVisible(true);
                jTextFieldSenha.setVisible(true);
                jLabelUser.setVisible(true);
                jLabelSenha.setVisible(true);
                break;

            case 2:
                jTextFieldUserName.setText("");
                jTextFieldSenha.setText("");
                jTextFieldUserName.setVisible(false);
                jTextFieldSenha.setVisible(false);
                jLabelUser.setVisible(false);
                jLabelSenha.setVisible(false);
                break;
        }
    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

    private void jTextFieldDtNascUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtNascUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtNascUsuarioActionPerformed

    private void jTextFieldCPFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFUsuarioActionPerformed

    private void jTextFieldEnderecoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoUsuarioActionPerformed

    private void jTextFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeUsuarioActionPerformed

    private void jButtonLimpaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaTelaActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButtonLimpaTelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCons;
    private javax.swing.JButton jButtonLimpaTela;
    private javax.swing.JButton jButtonRmv;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JTextField jTextFieldCPFUsuario;
    private javax.swing.JTextField jTextFieldDtNascUsuario;
    private javax.swing.JTextField jTextFieldEnderecoUsuario;
    private javax.swing.JTextField jTextFieldIdUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    private javax.swing.JPasswordField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        jTextFieldIdUsuario.setText("");
        jTextFieldNomeUsuario.setText("");
        jTextFieldEnderecoUsuario.setText("");
        jTextFieldCPFUsuario.setText("");
        jTextFieldDtNascUsuario.setText("");
        jTextFieldUserName.setText("");
        jTextFieldSenha.setText("");
    }

}
