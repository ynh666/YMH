package 员工打卡;

import java.util.*;

public class Company {
	
	private Map<Integer, Employee> map1 = new HashMap<>();;
	private Map<String, List> map2 = new HashMap<>();
	private List<Dakalnfo> moduleList = new ArrayList<>();
	private List<Dakalnfo> list = new ArrayList<>();	
	private static Company company = null;
	
	private Company() {		
		
	}
	
	public static Company getCompany() {
		
		if(company == null) {
			company = new Company();
		}
		return company;
	}
	
	public void addEmployee(Employee employee) {
		
		map1.put(employee.getID(),employee);		
		moduleList.add(new Dakalnfo(employee.getID()));
		System.out.println("添加信息成功！");
	}
	
	public void deleteEmployee(int ID) {
		
		map1.remove(ID);
		System.out.println("删除成功！");
	}
	
	public String getEmployee(int ID) {
		
				
		return map1.get(ID).getName();
	}
	
	public String display(int ID) {
		
		return map1.get(ID).toString();		
	}	
	
	public Map<Integer, Employee> getMap1() {
		
		return map1;
	}	

	public List<Dakalnfo> getList() {
		
		return list;
	}
	
	public Map<String, List> getMap2(){
		
		return map2;
	}
	
	public void setMap2(String date) {
		
		map2.put(date, list);
	}
	
	public Dakalnfo getDakalnfo(int ID) {
		
		Iterator<Dakalnfo> it = list.iterator();
		while(it.hasNext()) {			
			Dakalnfo dakalnfo = it.next();
			if(dakalnfo.getID() == ID) {					
				return dakalnfo;				
			}						
		}
		return null;
	}
	
	public void startNewDay() {
		
		list = new ArrayList<>();
		list.addAll(moduleList);
	}
	
	

}
