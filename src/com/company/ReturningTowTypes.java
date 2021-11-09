package com.company;
// pour contourner les restrictions de retour de type (Admin & admingestionuser)
public class ReturningTowTypes {
	
	    public  User u;
	    public  NormalUser NU;
	    public  int  exist;

	    public ReturningTowTypes(User value, NormalUser index, int  ex) {
	        this.u = value;
	        this.NU = index;
	        this.exist= ex;
	    }

		public ReturningTowTypes() {
			// TODO Auto-generated constructor stub
		}

		public User getU() {
			return u;
		}

		public void setU(User u) {
			this.u = u;
		}

		public NormalUser getNU() {
			return NU;
		}

		public void setNU(NormalUser nU) {
			NU = nU;
		}

		public int getExist() {
			return exist;
		}

		public void setExist(int exist) {
			this.exist = exist;
		}

		

	
	}


