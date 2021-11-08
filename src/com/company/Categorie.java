package com.company;

import java.sql.Date;

public class Categorie {
	 protected int Id_categorie;
	 protected int Max_emprunt ; 
		protected int  Max_duree;  

	 public int getId_categorie() {
		return Id_categorie;
	}

	public void setId_categorie(int id_categorie) {
		Id_categorie = id_categorie;
	}

	public int getMax_emprunt() {
		return Max_emprunt;
	}

	public void setMax_emprunt(int max_emprunt) {
		Max_emprunt = max_emprunt;
	}

	public int getMax_duree() {
		return Max_duree;
	}

	public void setMax_duree(int max_duree) {
		Max_duree = max_duree;
	}

	 public void setCategorie(int id ) 
	 
	 {    
		 
		 
		 this.Id_categorie= id ; 
	  if (id == 1) {
	         this.Max_emprunt=  5;
	         this.Max_duree = 3; }

	   
	  if (id == 2) {
	         this.Max_emprunt=  3;
	         this.Max_duree = 2; }
	   
		  if (id == 3) {
		         this.Max_emprunt=  1;
		         this.Max_duree = 1; }

		  }

	  
	 


	 
	 public Categorie(int id, int Max, int md) 
	  {      this.Id_categorie= id ; 
	         this.Max_emprunt= Max;
	         this.Max_duree = md; 

	  }

	public Categorie() {
		// TODO Auto-generated constructor stub
	} 

	
	
	
	

}
