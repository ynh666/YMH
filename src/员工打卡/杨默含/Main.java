package 员工打卡;

import java.text.SimpleDateFormat;

import java.util.*;

import java.io.*;


public class Main {
	
	
	private SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
	
	
	public void signIn(int ID) {
		
		String date1 = sdf1.format(new Date());
		String date2 = sdf2.format(new Date());
		
		if(!Company.getCompany().getMap2().containsKey(date1)) {
			
			Company.getCompany().startNewDay();
			Company.getCompany().setMap2(date1);
			
		
		}else{
			
		}
				
		
		if(Company.getCompany().getMap1().containsKey(ID)) {						
			
			if(Company.getCompany().getDakalnfo(ID).getDateOfSignIn() == null) {				
				
				Company.getCompany().getDakalnfo(ID).setDateOfSignIn(date2);
				System.out.println("卡号：" + ID + "  签到打卡成功  " + date2);
			
			}else {
				
				System.out.println("今天已经打过卡了");
			
			}
		
		}else {
			
			System.out.println("无此员工ID");
		
		}				
	
	}
	
	
	public void singOff(int ID) {
		
		String date1 = sdf1.format(new Date());
		String date2 = sdf2.format(new Date());
		
		Company.getCompany().setMap2(date1);
		
		if(Company.getCompany().getMap1().containsKey(ID)) {
			
			if(Company.getCompany().getDakalnfo(ID).getDateOfSignIn() != null) {
				
				if(Company.getCompany().getDakalnfo(ID).getDateOfSignOff() != null) {
					
					System.out.println("今天已经打过卡了");				
					
				}else {
					
					 Company.getCompany().getDakalnfo(ID).setDateOfSignOff(date2);
					    System.out.println("卡号：" + ID + "  签退打卡成功  " + date2);					
				
				}			    
			
			}else{
				
				System.out.println("卡号：" + ID + " 今天还没有签到，无法签退");
			
			}					
		
		}else {
			
			System.out.println("无此员工ID");
		
		}		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employee1 = new Employee(1111,"Tom");
		Employee employee2 = new Employee(2222,"Jack");
		Employee employee3 = new Employee(3333,"Ray");
		Employee employee4 = new Employee(4444,"Zack");
		Employee employee5 = new Employee(5555,"Skuara");		
		
		
		Company.getCompany().addEmployee(employee1);		
		Company.getCompany().addEmployee(employee2);		
		Company.getCompany().addEmployee(employee3);
		Company.getCompany().addEmployee(employee4);
		Company.getCompany().addEmployee(employee5);
		
		
		Main main = new Main();		   	
		
    	
		while(1==1){
			
    		System.out.println("----员工打卡系统----");
			System.out.println("输入0--------退出");
			System.out.println("输入1--------签到");
			System.out.println("输入2--------签退");
			System.out.println("输入3--------查看签到信息");
			
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			
			
			if(i == 1) {				
				
				System.out.println("请输入签到员工ID：");
				int ID = in.nextInt();
				main.signIn(ID);			
			
			}else if(i == 2) {
				
				System.out.println("请输入签退员工ID：");
				int ID = in.nextInt();
				main.singOff(ID);			
			
			}else if(i == 3) {
				
				FileOutputStream fw = null;
				ObjectOutputStream oos = null;
				
				try {
					
					fw = new FileOutputStream("C:/Users/HP/asd.txt");
					oos = new ObjectOutputStream(fw);
				    
					Collection<List> collection = new ArrayList<>();
					collection = Company.getCompany().getMap2().values();
					
					Iterator<List> it = collection.iterator();					
					while(it.hasNext()) {		
						
						oos.writeObject(it.next());
					
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {					
					try {
						oos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
