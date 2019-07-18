package 员工打卡;

public class Employee {
	
	private int ID;
	private String name;
	
	public Employee(int ID,String name) {
		
		this.ID = ID;
		this.name = name;
	}
	
	public void setID(int ID) {
		
		this.ID = ID;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public int getID() {
		
		return this.ID;
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public String toString() {
		
		return "员工ID：" + this.ID + "  " + "姓名：" + this.name;
	}

}

	
	
	
