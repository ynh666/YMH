package 员工打卡;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List> list = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("C:/Users/HP/asd.txt");
			ois = new ObjectInputStream(fis);
			while(fis.available() > 0) {
				list.add((List) ois.readObject());				
			}
		Iterator<List> it1 = list.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
