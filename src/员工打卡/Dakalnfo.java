package 员工打卡;

import java.io.Serializable;

public class Dakalnfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String dateOfSignIn = null; 
	private String dateOfSignOff = null;
	
	
	public Dakalnfo(int ID) {
		
		this.ID = ID;		
	}
	
	public void setDateOfSignIn(String dateOfSignIn) {
		
		this.dateOfSignIn = dateOfSignIn;		
	}
	
	public void setDateOfSignOff(String dateOfSignOff) {
		
		this.dateOfSignOff = dateOfSignOff;
	}
	
	public int getID() {
		
		return this.ID;
	}
	
	public String getDateOfSignIn() {
		
		return this.dateOfSignIn;
	}
	
	public String getDateOfSignOff() {
		
		return this.dateOfSignOff;
	}
	
	public String toString() {
		
		return this.ID + " "  + this.dateOfSignIn + " " + this.dateOfSignOff;
	}
	
	
	
	
	
	
	
	
     
	
   
    	
    			
    	
}
	
	



