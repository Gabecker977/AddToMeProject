package projetoagenda;


/**
 *
 * @author windows
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException{
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/crudads?useSSL=false";
            String user = "root";
            String password = "";
            
            return DriverManager.getConnection(url, user, password);
            
        } catch(ClassNotFoundException ex){
            
            throw new SQLException(ex.getMessage());
        }
    }
    public static boolean loginTest(String cod,String password) {
		 Connection con;
		 Statement stmt;
		 ResultSet rs;
		 String slq;
		 try{	//conexao
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/superbd?useSSL=false","root","pcgb5764");
		        stmt=con.createStatement();
			//comando sql 
		        slq="Select * from users where telefone='"+cod+"'and senha='"+password+"'";
		        rs=stmt.executeQuery(slq);
		         //se retornar um usuario           
			 if(rs.next()) {
				//Aqui vc pode guardar dos dodos do usuario
                            	User.instance.nome = rs["nome"]
				User.instance.telefone=rs["telefone"]
				//Aqui ele retorna imformando que o login deu certo
		                    	return true;
		                    }else {
				 	//Aqui ele cria uma menssagem de erro caso ele erre a senha ou o codigo
		                    	JOptionPane.showMessageDialog(null, "Codigo ou senha está errada","ERRO! :(",JOptionPane.ERROR_MESSAGE);
		                    	return false;
		                    }
		                    }

		    catch (Exception i) 
		    {
			    //Aqui ele printa qualquer erro de conexao
		        System.out.println(i);
		        return false;
		    }
		
	 }
    
    public static Cadastro getCadastro(int codigo){
        Connection con;
		 Statement stmt;
		 ResultSet rs;
		    String slq;
		 try{
		        Class.forName("com.mysql.jdbc.Driver");
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/superbd?useSSL=false","root","");
		                    stmt=con.createStatement();
			 	    //Aqui ele procura um usuario pela chave primaria
		                    slq="Select cod,nome,telefone from users where cod="+codigo;
		                    rs=stmt.executeQuery(slq);
			 		//Se der certo ele retorna como um objeto
                                    if(rs.next()) return new Cadastro(rs.getInt("cod"),rs.getString("nome"),rs.getString("telefone1"));
                                    //Caso ao contrario ele retorna nulo
                                    return null;
                 
                  }
                 catch (Exception i) 
		    {
		        System.out.println(i);
		        return null;
		    }
    }
	
}
