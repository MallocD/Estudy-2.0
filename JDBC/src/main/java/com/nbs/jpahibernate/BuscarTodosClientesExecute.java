package com.nbs.jpahibernate;

import com.nbs.jpahibernate.configuration.DB;
import com.nbs.jpahibernate.dao.ClienteDao;
import com.nbs.jpahibernate.entity.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BuscarTodosClientesExecute {
    public static void main(String[] args) throws SQLException  {

        try(Connection connection = DB.getConnection()) {
        ClienteDao clienteDao = new ClienteDao(connection);
            List<Cliente> clientes = clienteDao.buscarTodosOsClientes();
            System.out.println(clientes);

    }
    }
}
