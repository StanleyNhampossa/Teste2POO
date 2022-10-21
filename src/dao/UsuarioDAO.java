package dao;

import model.Usuario;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public boolean registarUsuario(Usuario usuario) {
        boolean retorno = false;
        String sql = "insert into usuario (nome, email, nomeUsuario, dataDeNascimento, contacto, biografia, senha)" +
                " values (?, ?, ?, ?, ?, ?, ?)";

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getNomeUsuario());
            preparedStatement.setDate(4, new Date(usuario.getDataDeNascimento().getTime()));
            preparedStatement.setLong(5, usuario.getContacto());
            preparedStatement.setString(6, usuario.getBiografia());
            preparedStatement.setString(7, usuario.getSenha());
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

    public ArrayList<Usuario> listarTodosUsuarios() {
        ArrayList<Usuario> usuarios = null;
        String sql = "select * from usuario";

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                usuarios = new ArrayList<>();
                while (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(resultSet.getInt(1));
                    usuario.setNome(resultSet.getString(2));
                    usuario.setEmail(resultSet.getString(3));
                    usuario.setNomeUsuario(resultSet.getString(4));
                    usuario.setDataDeNascimento(resultSet.getDate(5));
                    usuario.setContacto(resultSet.getLong(6));
                    usuario.setBiografia(resultSet.getString(7));
                    usuario.setSenha(resultSet.getString(8));

                    usuarios.add(usuario);
                }
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


        return usuarios;
    }

    public ArrayList<Usuario> pesquisarUsuario(String nome) {
        ArrayList<Usuario> usuarios = null;
        String sql = "select * from usuario where nome like '%" + nome + "%' order by nome";
        //

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                usuarios = new ArrayList<>();
                while (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(resultSet.getInt(1));
                    usuario.setNome(resultSet.getString(2));
                    usuario.setEmail(resultSet.getString(3));
                    usuario.setNomeUsuario(resultSet.getString(4));
                    usuario.setDataDeNascimento(resultSet.getDate(5));
                    usuario.setContacto(resultSet.getLong(6));
                    usuario.setBiografia(resultSet.getString(7));
                    usuario.setSenha(resultSet.getString(8));

                    usuarios.add(usuario);
                }
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


        return usuarios;
    }


    public boolean actualizarUsuario(Usuario usuario) {
        boolean retorno = false;
        String sql = "update usuario set nome = ?, email = ?, nomeUsuario = ?, dataDeNascimento = ?, contacto = ?, " +
                "biografia = ?, senha = ? where id = ?";

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getNomeUsuario());
            preparedStatement.setDate(4, new Date(usuario.getDataDeNascimento().getTime()));
            preparedStatement.setLong(5, usuario.getContacto());
            preparedStatement.setString(6, usuario.getBiografia());
            preparedStatement.setString(7, usuario.getSenha());
            preparedStatement.setInt(8, usuario.getId());
            preparedStatement.executeUpdate();

            retorno = true;


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar: " + e.getMessage());
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

    public boolean deletarUsuario(int id) {

        String sql = "delete from usuario where id = ?";
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement preparedStatement = null;

        try {
            conexao = new Conexao().getConexao();
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            retorno = true;


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + e.getMessage());
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
}
