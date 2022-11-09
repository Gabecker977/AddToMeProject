/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public static boolean loginTest(String name,String password) {
		 Connection con;
		 Statement stmt;
		 ResultSet rs;
		    String slq;
		 try{
		        Class.forName("com.mysql.jdbc.Driver");
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/superbd?useSSL=false","root","");
		                    stmt=con.createStatement();
		                    slq="Select * from users where nome='"+name+"'and senha='"+password+"'";
		                    rs=stmt.executeQuery(slq);
		                    if(rs.next()) {
		                    	return true;
		                    }else {
		                    	JOptionPane.showMessageDialog(null, "Codigo ou senha está errada","ERRO! :(",JOptionPane.ERROR_MESSAGE);
		                    	return false;
		                    
		                    }
		                    }

		    catch (Exception i) 
		    {
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
		                    slq="Select cod,nome,telefone1 from users where cod="+codigo;
		                    rs=stmt.executeQuery(slq);
                                    if(rs.next()) return new Cadastro(rs.getInt("cod"),rs.getString("nome"),rs.getString("telefone1"));
                                    
                                    return null;
                 
                  }
                 catch (Exception i) 
		    {
		        System.out.println(i);
		        return null;
		    }
    }
	
}