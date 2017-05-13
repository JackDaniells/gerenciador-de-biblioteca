/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EmprestimoController;
import Controller.LivroController;
import Controller.UsuarioController;
import Entidades.Emprestimo;
import Entidades.Livro;
import Entidades.Sessao;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Enumeradores.SituacaoLivro;
import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author jackdaniels
 */
public class EmprestimoView extends javax.swing.JFrame {

    EmprestimoController ctrlEmprestimo;
    LivroController ctrlLivro;
    UsuarioController ctrlUsuario;
    Sessao sessao;
    private EventoBotao acao;

    /**
     * Creates new form EmprestimoView
     */
    public EmprestimoView(Sessao p_sessao) {
        this.setLocation(300, 100);
        initComponents();
        sessao = p_sessao;
        ctrlEmprestimo = new EmprestimoController(p_sessao);
        ctrlLivro = new LivroController(p_sessao);
        ctrlUsuario = new UsuarioController(p_sessao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldIdLivroEmprestimo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIdUsuarioEmprestimo = new javax.swing.JTextField();
        jTextFieldIdEmprestimo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JButtonAjudaLivro = new java.awt.Button();
        JButtonAjudaUsuario = new java.awt.Button();
        lblMensagem = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jButtonLimpaTela = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRmv = new javax.swing.JButton();
        jButtonCons = new javax.swing.JButton();
        jLabelLivro = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanelCampos.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldIdLivroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdLivroEmprestimoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Usuario");

        jLabel3.setText("ID Livro");

        jTextFieldIdUsuarioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdUsuarioEmprestimoActionPerformed(evt);
            }
        });

        jTextFieldIdEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdEmprestimoActionPerformed(evt);
            }
        });

        jLabel8.setText("Código");

        JButtonAjudaLivro.setLabel("?");
        JButtonAjudaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAjudaLivroActionPerformed(evt);
            }
        });

        JButtonAjudaUsuario.setLabel("?");
        JButtonAjudaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAjudaUsuarioActionPerformed(evt);
            }
        });

        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableLista);
        if (jTableLista.getColumnModel().getColumnCount() > 0) {
            jTableLista.getColumnModel().getColumn(0).setResizable(false);
            jTableLista.getColumnModel().getColumn(1).setResizable(false);
            jTableLista.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldIdUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIdLivroEmprestimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JButtonAjudaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonAjudaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIdUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonAjudaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldIdLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(JButtonAjudaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensagem)
                .addGap(26, 26, 26))
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

        jButtonRmv.setText("Devolver");
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

        jLabelLivro.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelLivro.setText("Adicionar Emprestimo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabelLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel))
                    .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCons, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonLimpaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaTelaActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButtonLimpaTelaActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        Usuario user = new Usuario();
        Livro livro = new Livro();

        try {
            user = new Usuario(Integer.parseInt(!jTextFieldIdUsuarioEmprestimo.getText().trim().equals("") ? jTextFieldIdUsuarioEmprestimo.getText() : "0"));
            //user.setIdUsuario(1);
            user = ctrlUsuario.ExecutaEventoBotao(user, acao.Consultar);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario");
            System.err.println(e);
            System.err.println(e.getLocalizedMessage());
        }
        try {
            livro = new Livro(Integer.parseInt(jTextFieldIdUsuarioEmprestimo.getText().equals("") ? "0" : jTextFieldIdUsuarioEmprestimo.getText()));
            livro = ctrlLivro.ExecutaEventoBotao(livro, acao.Consultar);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Livro");
            System.err.println(e);
            System.err.println(e.getLocalizedMessage());

        }
        try {
            if (livro != null && user != null) {
                Emprestimo emp = new Emprestimo(Integer.parseInt(jTextFieldIdEmprestimo.getText().equals("") ? "0" : jTextFieldIdEmprestimo.getText()), livro, user);
                jTextFieldIdEmprestimo.setText(String.valueOf(ctrlEmprestimo.ExecutaEventoBotao(emp, acao.Incluir).getIdEmprestimo()));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou livro não encontrados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar emprestimo");
            System.err.println(e);
            System.err.println(e.getLocalizedMessage());

        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvActionPerformed
        jLabelLivro.setText("Devolver Livro");
        try {
            Emprestimo _e = ctrlEmprestimo.ExecutaEventoBotao(new Emprestimo(Integer.parseInt(jTextFieldIdEmprestimo.getText())), acao.Consultar);
            JOptionPane.showMessageDialog(null, "Este empréstimo contem R$" + ctrlEmprestimo.devolveLivro(_e) + " de multa");
            _e = ctrlEmprestimo.ExecutaEventoBotao(_e, acao.Excluir);

            if (_e == null) {
                LimparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonRmvActionPerformed

    private void jButtonConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsActionPerformed
        jLabelLivro.setText("Consultar Emprestimo");
        try {
            Emprestimo _e = new Emprestimo();
            _e.setIdEmprestimo(Integer.parseInt(!jTextFieldIdEmprestimo.getText().trim().equals("") ? jTextFieldIdEmprestimo.getText() : "0"));
            _e = ctrlEmprestimo.ExecutaEventoBotao(_e, acao.Consultar);
            jTextFieldIdLivroEmprestimo.setText(String.valueOf(_e.getLivro().getIdLivro()));
            jTextFieldIdUsuarioEmprestimo.setText(String.valueOf(_e.getUsuario().getIdUsuario()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado");
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_jButtonConsActionPerformed

    private void JButtonAjudaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAjudaUsuarioActionPerformed
        //Usuario _user = new Usuario();
        try {
            //ArrayList<Usuario> lstUsuario = new ArrayList<>(ctrlUsuario.Listar().stream().filter((Usuario u) -> !u.getDeLivro().equals(SituacaoLivro.Disponivel)).map(m -> m).collect(Collectors.toList()));
            ArrayList<Usuario> lstUsuario = ctrlUsuario.Listar();
            jTableLista.removeColumnSelectionInterval(0, 2);
            // lstLivro.add(new Livro("teste", "teste", "teste"));
            System.out.println(lstUsuario.size());
            jTableLista.addColumnSelectionInterval(0, 2);
            System.out.println(jTableLista.getRowCount());
            for (int i = 0; i < lstUsuario.size(); i++) {
                jTableLista.setValueAt(lstUsuario.get(i).getIdUsuario(), i, 0);
                jTableLista.setValueAt(lstUsuario.get(i).getNome(), i, 1);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Algo deu Errado");
        }
    }//GEN-LAST:event_JButtonAjudaUsuarioActionPerformed

    private void JButtonAjudaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAjudaLivroActionPerformed

        try {
            ArrayList<Livro> lstLivro = ctrlLivro.Listar();
            jTableLista.removeColumnSelectionInterval(0, 2);
            // lstLivro.add(new Livro("teste", "teste", "teste"));
            System.out.println(lstLivro.size());
            jTableLista.addColumnSelectionInterval(0, 2);
            for (int i = 0; i < lstLivro.size(); i++) {

                jTableLista.setValueAt(lstLivro.get(i).getIdLivro(), i, 0);
                jTableLista.setValueAt(lstLivro.get(i).getNome(), i, 1);
                jTableLista.setValueAt(lstLivro.get(i).getSituacao(), i, 2);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Algo deu Errado");
        }
    }//GEN-LAST:event_JButtonAjudaLivroActionPerformed

    private void jTextFieldIdEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdEmprestimoActionPerformed

    private void jTextFieldIdUsuarioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdUsuarioEmprestimoActionPerformed

    private void jTextFieldIdLivroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdLivroEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdLivroEmprestimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JButtonAjudaLivro;
    private java.awt.Button JButtonAjudaUsuario;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCons;
    private javax.swing.JButton jButtonLimpaTela;
    private javax.swing.JButton jButtonRmv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelLivro;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField jTextFieldIdEmprestimo;
    private javax.swing.JTextField jTextFieldIdLivroEmprestimo;
    private javax.swing.JTextField jTextFieldIdUsuarioEmprestimo;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        jTextFieldIdEmprestimo.setText("");
        jTextFieldIdUsuarioEmprestimo.setText("");
        jTextFieldIdLivroEmprestimo.setText("");
    }

}
