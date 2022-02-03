package com.nbs.jpahibernate;

import com.nbs.jpahibernate.configuration.DB;
import com.nbs.jpahibernate.dao.ClienteDao;

import java.sql.Connection;
import java.sql.SQLException;

public class InserirNovoClienteExecute {
    public static void main(String [] args) throws SQLException {
        try(Connection connection = DB.getConnection()) {
            ClienteDao clienteDao = new ClienteDao(connection);
            clienteDao.inserirNovoCliente("Malloc");

        }
    }
}
