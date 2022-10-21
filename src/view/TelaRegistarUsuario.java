/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UsuarioController;
import model.CurrentUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

/**
 *
 * @author Stanley
 */
public class TelaRegistarUsuario extends javax.swing.JFrame {
    
    private String operacao = "Cadastrar";

    private final CurrentUser currentUser;

    private int id;

    /**
     * Creates new form TelaRegistarUsuario
     */

    public TelaRegistarUsuario(CurrentUser currentUser) {
        initComponents();
        this.currentUser = currentUser;
        inicializarComponentes();
        setLocationRelativeTo(null);
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
        lblImagem = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomeUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tafBiografia = new javax.swing.JTextArea();
        dcsDataDeNascimento = new com.toedter.calendar.JDateChooser();
        txtContacto = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Crie um novo usuário");

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo-usuario.png"))); // NOI18N

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyReleased(evt);
            }
        });

        txtEmail.setToolTipText("usuario@dominio.com");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        tafBiografia.setColumns(20);
        tafBiografia.setRows(5);
        tafBiografia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tafBiografiaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tafBiografia);

        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactoKeyReleased(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });

        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyReleased(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(dcsDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcsDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtNome.getText().isEmpty()){
                txtNome.setBackground(Color.RED);
            }
            txtNomeUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        txtNome.setBackground(Color.WHITE);
        btnSalvar.setEnabled(!txtNome.getText().isEmpty() && !txtContacto.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() &&
                !txtNomeUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtEmail.getText().isEmpty());
        
    }//GEN-LAST:event_txtNomeKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String nomeUsuario = txtNomeUsuario.getText();
        String email = txtEmail.getText();
        Date dataDeNascimento = dcsDataDeNascimento.getDate();
        long contacto = Long.parseLong(txtContacto.getText());
        String biografia = tafBiografia.getText();
        String senha = txtSenha.getText();
        String senhaAConfirmar = txtConfirmarSenha.getText();
        if (!areThePasswordTheSame(senha, senhaAConfirmar)) {
            JOptionPane.showMessageDialog(this, "Introduza senhas iguais");
        }else{
            if(operacao.equals("Cadastrar")){
                clickNoBotaoSalvar(nome, nomeUsuario, email, dataDeNascimento, contacto,
                        biografia, senha);
            }
            if(operacao.equals("Editar")){
                clickNoBotaoEditar(nome, nomeUsuario, email, dataDeNascimento, contacto,
                        biografia, senha);
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(this.currentUser);
        telaMenuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        if(txtSenha.getText().length() == 8){
            txtConfirmarSenha.setEnabled(true);
            if((!txtNome.getText().isEmpty() && !txtContacto.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() &&
                    !txtNomeUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtEmail.getText().isEmpty())){
                btnSalvar.setEnabled(true);
            }
        }else{
            txtConfirmarSenha.setEnabled(false);
        }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtConfirmarSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyReleased
        if(txtConfirmarSenha.getText().equals(txtSenha.getText())){
            txtConfirmarSenha.setBackground(Color.green);
            btnSalvar.setEnabled(!txtNome.getText().isEmpty() && !txtContacto.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() &&
                    !txtNomeUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtEmail.getText().isEmpty());
        }else{
            txtConfirmarSenha.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyReleased

    private void txtNomeUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyReleased
        btnSalvar.setEnabled(!txtNome.getText().isEmpty() && !txtContacto.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() &&
                !txtNomeUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtEmail.getText().isEmpty());
    }//GEN-LAST:event_txtNomeUsuarioKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        btnSalvar.setEnabled(!txtNome.getText().isEmpty() && !txtContacto.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() &&
                !txtNomeUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtEmail.getText().isEmpty());
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyReleased
        btnSalvar.setEnabled(!txtNome.getText().isEmpty() && !txtContacto.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() &&
                !txtNomeUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty() && !txtEmail.getText().isEmpty());
    }//GEN-LAST:event_txtContactoKeyReleased

    private void tafBiografiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tafBiografiaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tafBiografiaKeyReleased

    private boolean areThePasswordTheSame(String senha, String senhaAConfirmar){
        return senha.equals(senhaAConfirmar);
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private com.toedter.calendar.JDateChooser dcsDataDeNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextArea tafBiografia;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void preencherCampos(int id, String nome, String email, String nomeUsuario, String biografia, Date data, long contacto, String operacao) {
        this.id = id;
        txtNome.setText(nome);
        txtEmail.setText(email);
        txtNomeUsuario.setText(nomeUsuario);
        tafBiografia.setText(biografia);
        dcsDataDeNascimento.setDate(data);
        txtContacto.setText(String.valueOf(contacto));
        //TODO pegar senha
        jLabel1.setText("Edite o usuário");
        this.operacao = operacao;
        this.setVisible(true);
    }

    private void clickNoBotaoSalvar(String nome, String nomeUsuario, String email, Date dataDeNascimento, long contacto,
            String biografia, String senha){
        boolean sucesso = new UsuarioController().registarUsuario(nome, nomeUsuario, email, dataDeNascimento, contacto,
                biografia, senha);
        if(sucesso) {
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso");
            TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(this.currentUser);
            telaMenuPrincipal.setVisible(true);
            this.dispose();
        }else
            JOptionPane.showMessageDialog(this, "Verifique os campos");
    }

    private void clickNoBotaoEditar(String nome, String nomeUsuario, String email, Date dataDeNascimento, long contacto,
                                    String biografia, String senha){
        boolean sucesso = new UsuarioController().actualizarUsuario(this.id, nome, nomeUsuario, email, dataDeNascimento, contacto,
                biografia, senha);
        if(sucesso) {
            JOptionPane.showMessageDialog(this, "Usuário editado com sucesso");
            TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(this.currentUser);
            telaMenuPrincipal.setVisible(true);
            this.dispose();
        }else
            JOptionPane.showMessageDialog(this, "Verifique os campos");
    }

    private void inicializarComponentes(){
        TextPrompt textPrompt = new TextPrompt("Nome", txtNome);
        textPrompt = new TextPrompt("Nome de usuário", txtNomeUsuario);
        textPrompt = new TextPrompt("Biografia", tafBiografia);
        textPrompt = new TextPrompt("Senha", txtSenha);
        textPrompt = new TextPrompt("Confirmar senha", txtConfirmarSenha);
        textPrompt = new TextPrompt("Email", txtEmail);
        textPrompt = new TextPrompt("Contacto", txtContacto);
        txtConfirmarSenha.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

}
