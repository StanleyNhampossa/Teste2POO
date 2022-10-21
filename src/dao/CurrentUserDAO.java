/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.CurrentUser;
import model.Usuario;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Stanley
 */
public class CurrentUserDAO {

    Connection conexao = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;


    public boolean registarNewUser(CurrentUser currentUser){
        boolean retorno = false;
        String sql = "insert into currentuser (nome, senha, MetodoDeRecuperarSenha, Resposta)" +
                " values (?, ?, ?, ?)";

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, currentUser.getNome());
            preparedStatement.setString(2, currentUser.getSenha());
            preparedStatement.setString(3, currentUser.getMetodoDeRecuperacao());
            preparedStatement.setString(4, currentUser.getResposta());
            preparedStatement.execute();

            retorno = true;


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar" + e.getMessage());
        } finally {
            try {
                preparedStatement.close();
                conexao.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return retorno;

    }

    public boolean actualizarSenha(String senha){
        
        boolean retorno = false;
        String sql = "update currentuser set senha = ? where id = 1";

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, senha);
            preparedStatement.execute();

            retorno = true;


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar" + e.getMessage());
        } finally {
            try {
                preparedStatement.close();
                conexao.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return retorno;
    }
    
    public boolean actualizarNewUser(CurrentUser currentUser){
        
        
        return false;
    }
    public void actualizarLembrarMe(boolean lembrarMe){
        String sql = "update currentuser set lembrarMe = ? where id = 1";

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setBoolean(1, lembrarMe);
            preparedStatement.execute();


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar" + e.getMessage());
        } finally {
            try {
                preparedStatement.close();
                conexao.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public CurrentUser recuperar(){
        String sql = "select * from currentuser";
        CurrentUser currentUser = null;
        try{
        conexao = new Conexao().getConexao();
        preparedStatement = conexao.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            currentUser = new CurrentUser();
            currentUser.setId(resultSet.getInt(1));
            currentUser.setNome(resultSet.getString(2));
            currentUser.setSenha(resultSet.getString(3));
            currentUser.setMetodoDeRecuperacao(resultSet.getString(4));
            currentUser.setResposta(resultSet.getString(5));
            currentUser.setLembrarMe(resultSet.getBoolean(6));

        }



        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage());
        } finally {
            try {
                preparedStatement.close();
                conexao.close();
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


        return currentUser;
    }
}
