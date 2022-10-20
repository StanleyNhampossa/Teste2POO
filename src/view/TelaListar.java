/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UsuarioController;
import model.Usuario;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Stanley
 */
public class TelaListar extends javax.swing.JFrame {

    /**
     * Creates new form TelaListar
     */
    private String operacao = "Listar";

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    
    private void preencherDadosNaTabela(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = new UsuarioController().listarTodos();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for(Usuario usuario : usuarios){
            modelo.addRow(
                    new Object[]{
                            usuario.getId(),
                            usuario.getNome(),
                            usuario.getEmail(),
                            usuario.getNomeUsuario(),
                            usuario.getBiografia(),
                            usuario.getDataDeNascimento(),
                            usuario.getContacto()
                    }
            );
        }
        jTable1.setModel(modelo);

    }


    public TelaListar() {
        initComponents();
        setLocationRelativeTo(null);
        preencherDadosNaTabela();
        TextPrompt textPrompt = new TextPrompt("Pesquisar", jTextField1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email", "Nome do usuário", "Biografia", "Data de Nascimento", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount() == 2){
            if(operacao.equals("Listar")){
                
            }
            if(operacao.equals("Editar")){
                int id = (Integer) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
                String nome = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
                String email = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
                String nomeUsuario = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);
                String biografia = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4);
                Date data = (Date) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5);
                long contacto = (Long) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6);
                new TelaRegistarUsuario().preencherCampos(id, nome, email, nomeUsuario,
                        biografia, data, contacto, operacao);
            }
            if(operacao.equals("Eliminar")){
                int id = (Integer) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
                boolean sucesso = new UsuarioController().deletarUsuario(id);
                if(sucesso) JOptionPane.showMessageDialog(null, "Usuário eliminado com sucesso");
                else JOptionPane.showMessageDialog(null, "Erro ao eliminar");
                preencherDadosNaTabela();
            } 
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(jTextField1.getText().isEmpty()){
            preencherDadosNaTabela();
        }else{
            ArrayList<Usuario> usuarios = new ArrayList<>();
            usuarios = new UsuarioController().pesquisar(jTextField1.getText());
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            for(Usuario usuario : usuarios){
                modelo.addRow(
                        new Object[]{
                                usuario.getId(),
                                usuario.getNome(),
                                usuario.getEmail(),
                                usuario.getNomeUsuario(),
                                usuario.getBiografia(),
                                usuario.getDataDeNascimento(),
                                usuario.getContacto()
                        }
                );
            }
            jTable1.setModel(modelo);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1MouseEntered

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}