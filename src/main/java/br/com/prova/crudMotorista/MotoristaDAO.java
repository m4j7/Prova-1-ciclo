package br.com.prova.crudMotorista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import br.com.prova.crudMotorista.ConectionFactory;

public class MotoristaDAO {
	
	
	public static ArrayList<Motorista> listaMotorista = new ArrayList<Motorista>();
	public static int index = -1;

	private static Connection connection;
	
	public MotoristaDAO() {
		
		 try {
	            this.connection = ConectionFactory.getConexao();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	
	public void createTable(){

		
        String sqlCreate = "CREATE SEQUENCE IF NOT EXISTS seq_motorista_id;"
        		+ "CREATE TABLE IF NOT EXISTS motorista (" +
        		"id bigint primary key default nextval('seq_motorista_id')," +
                "cadastro TIMESTAMP NOT NULL," +
                "atualizado TIMESTAMP,"+
                "excluido TIMESTAMP,"+
                "nome VARCHAR(20) not null," +
                "nrCpf VARCHAR(20) not null," +
                "nrTelefone VARCHAR(20) not null,"+
                "dsLagradouro  VARCHAR(20) not null," +
                "nrCep VARCHAR(11) not null,"+
                "nrCasa int not null,"+
                "dtNascimento timestamp not null," +
                "cidade VARCHAR(20) not null," +
                "nacionalidade VARCHAR(20) not null" +
                ");";


        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCreate);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
	
	public void cadastrar(Motorista motorista) {
		
		
        String sql = "INSERT INTO motorista (cadastro,nome,nrCpf,nrTelefone,dsLagradouro,nrCep,nrCasa,dtNascimento,cidade, nacionalidade)" +
                "VALUES(now(),?,?,?,?,?,?,now(),?,?)";


        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,motorista.getNome());
            preparedStatement.setString(2, motorista.getNrCpf());
            preparedStatement.setString(3, motorista.getNrTelefone());
            preparedStatement.setString(4, motorista.getDsLagradouro());
            preparedStatement.setString(5, motorista.getNrCep());
            preparedStatement.setInt(6, motorista.getNrCasa());
            preparedStatement.setDate(7,  motorista.getDtNascimento()); 
            preparedStatement.setString(7, motorista.getCidade());
            preparedStatement.setString(8, motorista.getNacionalidade());
            preparedStatement.execute();
            
         

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

          
            while (resultSet.next()){
                motorista.setId(resultSet.getLong(1));
            }

            preparedStatement.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
		
	}

	
	public ArrayList<Motorista> findByAll() {
		
		
		String sql = "SELECT * FROM motorista WHERE excluido is null";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            ArrayList<Motorista> listmotorista = new ArrayList();
            while (resultSet.next()){
                Motorista motorista = new Motorista();
               

                motorista.setId(resultSet.getLong("id"));
                motorista.setCadatro(resultSet.getTimestamp("cadastro").toLocalDateTime());
                
                if(resultSet.getTimestamp("atualizado") != null &&
                        resultSet.getTimestamp("excluido") != null){
                    motorista.setAtualizado(resultSet.getTimestamp("atualizado").toLocalDateTime());
                    motorista.setExcluido(resultSet.getTimestamp("excluido").toLocalDateTime());
                }
                
                motorista.setNome(resultSet.getString("nome"));
                motorista.setNrCpf(resultSet.getString("nrCpf"));
                motorista.setNrTelefone(resultSet.getString("nrTelefone"));
                motorista.setDsLagradouro(resultSet.getString("dsLagradouro"));
                motorista.setNrCep(resultSet.getString("nrCep"));
                motorista.setNrCasa(resultSet.getInt("nrCasa"));
                motorista.setDtNascimento(resultSet.getDate("dtNascimento"));
                motorista.setCidade(resultSet.getString("cidade"));
                motorista.setNacionalidade(resultSet.getString("nacionalidade"));
                
                listmotorista.add(motorista);
               
	     }
            
            return listmotorista;
        } catch (SQLException e){
            e.printStackTrace();
        }
		return null;
	
    } 
	
	public Motorista findById(int id){

        String sql = "SELECT * FROM motorista WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
            	
                Motorista motorista = new Motorista();

                motorista.setId(resultSet.getLong("id"));
                motorista.setCadatro(resultSet.getTimestamp("cadastro").toLocalDateTime());
                
                if(resultSet.getTimestamp("atualizado") != null &&
                        resultSet.getTimestamp("excluido") != null){
                    motorista.setAtualizado(resultSet.getTimestamp("atualizado").toLocalDateTime());
                    motorista.setExcluido(resultSet.getTimestamp("excluido").toLocalDateTime());
                }
                
                motorista.setNome(resultSet.getString("nome"));
                motorista.setNrCpf(resultSet.getString("nrCpf"));
                motorista.setNrTelefone(resultSet.getString("nrTelefone"));
                motorista.setDsLagradouro(resultSet.getString("dsLagradouro"));
                motorista.setNrCep(resultSet.getString("nrCep"));
                motorista.setNrCasa(resultSet.getInt("nrCasa"));
                motorista.setDtNascimento(resultSet.getDate("dtNascimento"));
                motorista.setCidade(resultSet.getString("cidade"));
                motorista.setNacionalidade(resultSet.getString("nacionalidade"));
                
                return motorista;
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
	
	 public void updateMotorista(Motorista motorista){

	        String sql = "UPDATE motorista SET atualizado = now(),nome = ?,nrCpf = ?,nrTelefone = ?,dsLagradouro = ?," +
	                "nrCep = ?,nrcep = ?,nrCasa = ?,dtNascimento = ?,cidade = ?," +
	                "nacionalidade = ? WHERE id = ?";
	       

	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1,motorista.getNome());
	            preparedStatement.setString(2, motorista.getNrCpf());
	            preparedStatement.setString(3, motorista.getNrTelefone());
	            preparedStatement.setString(4, motorista.getDsLagradouro());
	            preparedStatement.setString(5, motorista.getNrCep());
	            preparedStatement.setInt(6, motorista.getNrCasa());
	            preparedStatement.setDate(7, motorista.getDtNascimento()); 
	            preparedStatement.setString(7, motorista.getCidade());
	            preparedStatement.setString(8, motorista.getNacionalidade());
	            preparedStatement.execute();
	            preparedStatement.close();
	        } catch (SQLException e){
	            e.printStackTrace();
	        }

	    }

	    public void disableMotorista(long id){

	        String sql = "UPDATE motorista SET excluido = now() WHERE id = ?";

	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setLong(1,id);
	            preparedStatement.execute();
	            preparedStatement.close();
	        } catch (SQLException e){
	            e.printStackTrace();
	        }

	    }
	
	
}
        


