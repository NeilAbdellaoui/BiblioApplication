package com.company;

import java.util.Date;

public class User {
	protected static int  id; 
	 protected String nom; 
	 protected String prenom; 
	 protected String age;
	  protected String email;
	  protected String password; 
	  protected String login; 
	  protected int phone; 
	  protected String functionality;

	  public User(int i,String n, String p, String a, String f, String e,String pass, String l, int ph) 
	  {      this.nom = n;
	         this.id=i;
	         this.prenom = p; 
	         this.email= e; 
	         this.age = a; 
	         this.password= pass; 
	         this.login= l; 
	         this.phone= ph;
	         this.functionality = f; 
	  } 
	
	public void afficher() 
	  {System.out.println("Nom : "+nom+" prenom : "+prenom+" age : "+age);}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int tel) {
		this.phone = tel;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	} 
	public User() {}
	

}
