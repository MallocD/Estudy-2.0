package com.nbs.jpahibernate.dao;

import com.nbs.jpahibernate.entity.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private final Connection connection;

    public ClienteDao(Connection connection){
         this.connection = connection;
    }

    public List<Cliente> buscarTodosOsClientes() throws SQLException {
        String SQL = "SELECT*FROM jpa_hibernate.clientes";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ResultSet resultSet =preparedStatement.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()){
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setName(resultSet.getString("name"));
            clientes.add(cliente);
        }
        return clientes;
    }

    public void inserirNovoCliente(String name) throws SQLException{
        String SQL = "INSERT INTO jpa_hibernate.clientes(name) values(?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1,name);
        preparedStatement.executeUpdate();
    }
    }
