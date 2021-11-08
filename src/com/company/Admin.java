package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin  extends User {

	public Admin(int i, String n, String p, String a, String f, String e, String pass, String l, int ph) {
		  super(i,n, p, a, f, e, pass, l, ph);
		// TODO Auto-generated constructor stub
	}
public Admin() {
		// TODO Auto-generated constructor stub
	}
public void  AjouterUser(NormalUser u) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt = null;
	String SQL = "INSERT INTO user(\r\n"
			+ "                     id,\r\n"
			+ "                     login,\r\n"
			+ "                     password,\r\n"
			+ "                     email,\r\n"
			+ "                     nom,\r\n"
			+ "                     prenom,\r\n"
			+ "                     phone,\r\n"
			+ "                     functionality,\r\n"
			+ "                     age\r\n"
			+ "                 ) "
			+ "VALUES("+u.id+",'"+u.login+"','"+u.password+"','"+u.email+"','"+u.nom+"','"+u.prenom+"',"+u.phone+",'"+u.functionality+"','"+u.age+"');";
	int idCategorie= u.getCategorie().getId_categorie();
	//String SQL2 = "INSERT INTO normalUser VALUES("+u.id+","+u.getCategorie().getId_categorie()+","+u.id+")";

	try {
		stmt = con.createStatement();
		//stmt2 = con.createStatement();

		 stmt.executeUpdate(SQL);
		 //stmt2.executeUpdate( SQL2);
			JOptionPane.showMessageDialog(null,"utilisateur "+u.prenom+" est ajoute avec succes");


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null,"Numero d'utilisateur existe deja   ");
	}
	
	 con.close();
	 stmt.close();
	

}

public void  AjouterNormalUser(NormalUser u) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt = null;
	/*String SQL = "INSERT INTO user(\r\n"
			+ "                     id,\r\n"
			+ "                     login,\r\n"
			+ "                     password,\r\n"
			+ "                     email,\r\n"
			+ "                     nom,\r\n"
			+ "                     prenom,\r\n"
			+ "                     phone,\r\n"
			+ "                     functionality,\r\n"
			+ "                     age\r\n"
			+ "                 ) "
			+ "VALUES("+u.id+",'"+u.login+"','"+u.password+"','"+u.email+"','"+u.nom+"','"+u.prenom+"',"+u.phone+",'"+u.functionality+"','"+u.age+"');";*/
	int idCategorie= u.getCategorie().getId_categorie();
	String SQL2 = "INSERT INTO normalUser VALUES("+u.id+","+u.getCategorie().getId_categorie()+","+u.id+")";

	try {
		stmt = con.createStatement();
		//stmt2 = con.createStatement();

		 stmt.executeUpdate(SQL2);
		 //stmt2.executeUpdate( SQL2);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null,"Numero D'utilisateur existe deja ");
	}
	

	 con.close();
	 stmt.close();

}

public void  ModiferUser(NormalUser u) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt = null;
	String SQL = "INSERT INTO user(\r\n"
			+ "                     id,\r\n"
			+ "                     login,\r\n"
			+ "                     password,\r\n"
			+ "                     email,\r\n"
			+ "                     nom,\r\n"
			+ "                     prenom,\r\n"
			+ "                     phone,\r\n"
			+ "                     functionality,\r\n"
			+ "                     age\r\n"
			+ "                 ) "
			+ "VALUES("+u.id+",'"+u.login+"','"+u.password+"','"+u.email+"','"+u.nom+"','"+u.prenom+"',"+u.phone+",'"+u.functionality+"','"+u.age+"');";
	int idCategorie= u.getCategorie().getId_categorie();
	//String SQL2 = "INSERT INTO normalUser VALUES("+u.id+","+u.getCategorie().getId_categorie()+","+u.id+")";

	try {
		stmt = con.createStatement();
		//stmt2 = con.createStatement();

		 stmt.executeUpdate(SQL);
		 //stmt2.executeUpdate( SQL2);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	 con.close();
	 stmt.close();

}


public ResultSet  chercherUser(int id) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt;
    PreparedStatement p;
    ResultSet res = null; 
   String SQL2 = "SELECT   nom as nom,  prenom as prenom,   phone  as phone , email as email, normalUser.idCategorie as Categorie FROM user  join  normalUser  on  user.id =normalUser.id  where user.id= "+id+"; ";

	try {
		p = con.prepareStatement(SQL2);
		
        res= p.executeQuery();
        if (!res.isBeforeFirst() ) {    
           res=null;
        } 

	} catch (SQLException e) {
		return res;
	}
   
   
	
	return res; 


	

}
public ReturningTowTypes  chercherUser2(int id) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    PreparedStatement p = null ;
    ResultSet res = null ;
   String SQL2 = "SELECT   nom,    prenom,  phone   , email , normalUser.idCategorie, login, password FROM user  join  normalUser  on  user.id =normalUser.id  where user.id= "+id+"; ";
   ReturningTowTypes r = new ReturningTowTypes();
	try {
		p = con.prepareStatement(SQL2);
		
        res= p.executeQuery();
        if (!res.isBeforeFirst() ) {    
           res=null;
       
        } 
       if (res!= null) {
      
        int pho =res.getInt("phone");
		String n =res.getString("nom");
		String pren =res.getString("prenom");
		String em =res.getString("email");
		int  ca =res.getInt("idCategorie");
		
		String log = res.getString("login");
		String pass = res.getString("password"); 
		
		
		User u = new User();
		
		u.setNom(n);
		u.setPassword(pass);
		u.setPhone(pho);
        u.setLogin(log);
		u.setEmail(em);
		u.setPrenom(pren);
		
		
		Categorie c = new Categorie();
		
		c.setId_categorie(ca);
		NormalUser nu = new  NormalUser();
		nu.setCategorie(c);
		r.setU(u);
		r.setNU(nu);
		r.setExist(1);
       }else {
    	   
    	   r.setExist(0);
    	   
    	   JOptionPane.showMessageDialog(null,"Numero D'utilisateur introuvable");
    	   
    	   
       }
    		   
		
		

	} catch (SQLException e) {
		
	}
  

  
	res.close();
	con.close();
	return r; 


	

}
public void   SupprimerUser(String id) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt;
   ResultSet res = null; 
   String SQL2 = "DELETE FROM  user  where id= ? ;";
  
   PreparedStatement pstmt = con.prepareStatement(SQL2 );

       // set the corresponding param
       
       // execute the delete statement
     
      int a=  Integer.parseInt(id) ;
      pstmt.setInt(1, a);

     
       pstmt.executeUpdate();

       pstmt.close();
       con.close();
	

}

public void   Update(NormalUser u ) throws SQLException {
	ConnectionDataBase connection = new ConnectionDataBase();
	 Connection con = connection.ConnecrDb();
    Statement stmt;
   ResultSet res = null; 
   String SQL2 = "UPDATE user SET login = ?,password = ?,email = ?,nom = ?,prenom = ?, phone = ?  WHERE id = ?;";
  
   PreparedStatement pstmt = con.prepareStatement(SQL2 );

    
     
      
      pstmt.setString(1, u.getLogin());
      pstmt.setString(2, u.getPassword());
      pstmt.setString(3, u.getEmail());
      pstmt.setString(4, u.getNom());
      pstmt.setString(5, u.getPrenom());
      pstmt.setInt(6, u.getPhone());
      pstmt.setInt(7, u.getId());
       pstmt.executeUpdate();

       pstmt.close();
       con.close();
	

}

public void   Update2(NormalUser u ) throws SQLException {
ConnectionDataBase connection = new ConnectionDataBase();
Connection con = connection.ConnecrDb();
    Statement stmt;
   ResultSet res = null;
   String SQL2 = "UPDATE normalUser SET  idCategorie = ?  WHERE id = ?;";
 
   PreparedStatement pstmt = con.prepareStatement(SQL2 );

   
     
     
     
      pstmt.setInt(1, u.getCategorie().getId_categorie());
      pstmt.setInt(2, u.getId());
       pstmt.executeUpdate();

       pstmt.close();
       con.close();

}

}
