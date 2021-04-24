package Week4Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsPractice {
	
	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeNames.add("Mamta");
		employeeNames.add("Daniel");
		employeeNames.add("Shane");
		employeeNames.add("Jean");
		employeeNames.add("Herbert");
		employeeNames.add("Sergio");
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		ids.add(6);
		
		for (int i : ids) {
			System.out.println(i);
			employeeMap.put(i, employeeNames.get(i-1));
			//System.out.println(employeeMap.get(i));
		}
		
		for (int key : employeeMap.keySet()) {
			System.out.println("ID: " + key + " = " + employeeMap.get(key));
				}
		
		StringBuilder idsBuilder = new StringBuilder("");
		//int x;
		for (int x : ids) {
			idsBuilder.append(x + "-");
		}
		//System.out.println(idsBuilder);
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder("");
		for (String y : employeeNames)	{
			namesBuilder.append(y + " ");
		}
		System.out.println(namesBuilder.toString());
			
	}

}
