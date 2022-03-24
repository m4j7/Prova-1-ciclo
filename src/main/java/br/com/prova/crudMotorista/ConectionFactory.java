package br.com.prova.crudMotorista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
	
	public static Connection getConexao() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Prova","postgres","123");
        }
        catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
	

}
