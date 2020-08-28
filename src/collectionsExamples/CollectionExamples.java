package collectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayInt = new int[3];
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;

		System.out.println("Size of array:::" + arrayInt.length);
		// Loop through
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}

		// How we can define
		// Interview Question : Object
		// CRUD Operation :
		List<String> stringList = new ArrayList<String>();

		// Create
		stringList.add("UI automation");
		System.out.println(stringList);
		// How can we read the data
		String val = stringList.get(0);
		System.out.println(val);
		// Update
		stringList.add(1, "API Automation");
		System.out.println(stringList.size());
        //#################################3
		stringList.add(2, "Mobile Automation");
		System.out.println("After Update :::" + stringList);
         //Updateing the data
		stringList.set(2, "Visual Regression");
		System.out.println("After adding one more elements::"+stringList.size());
		// Delete
		// stringList.remove(0);

		System.out.println(stringList);
		// How we can iterate
		
		System.out.println("Iterate using For each loop");
		for (String eachValue : stringList) {
			System.out.println(eachValue);
		}

		//another way to iterate
		//Because in selenium or in testing
		//Actual list
		//Expected List
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println("On Index of :::"+(i+1)+" value is "+stringList.get(i));
		}
		
		//In Collections we have a conception Iterator 
		Iterator<String> iterator = stringList.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
		}
		
		//Direct using Enumeration
		Enumeration<String> enumeration = Collections.enumeration(stringList);
		//using enum
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
			System.out.println(enumeration.hasMoreElements());
			
		}
		
		//Check trhe size
		//Sort
		
		Collections.sort(stringList);
		System.out.println("Sorted::::"+stringList);
		
		System.out.println(stringList.contains("UI Automation"));
		
		//Abstract Class
		
		//CRUD :
		
		HashMap<String, String>  keyValue = new HashMap<String, String>();
		
		//Add 
		keyValue.put("UI Automation", "TestNG");
		keyValue.put("API Automation", "Rest Assured");
		keyValue.put("Mobile Automation", "Appium");
		keyValue.put("Desktop Automation", "Winnium");
		
		System.out.println(keyValue);
		
		//Get the value
		
		System.out.println(keyValue.get("UI Automation"));
		
		//How we can update the
		keyValue.put("UI Automation","Cucumber");
		
		System.out.println("After Update");
		System.out.println(keyValue);
		
		String value = keyValue.remove("Desktop Automation");
		
		System.out.println("Value for the removed elements:::"+value);
		
		System.out.println("After removing the key");
		
		System.out.println(keyValue);
		
		//How we can iterate 
		
		//How we can iterate for the Keys
		
		Set<String> keys = keyValue.keySet();
		
		for (String key : keys) {
			if (keyValue.containsKey(key)) {
				System.out.println("Key is "+key+" and value is "+keyValue.get(key));
				//if(keyValue.get(key).equalIgnoreCase(keyValue.get(key)))
				//else
			}
		}
		
		//How we can fget the values
		
		   Collection<String> vals =     keyValue.values();
		   
		   Enumeration<String> valite = Collections.enumeration(vals);
		   
		   System.out.println();
		
		
	}

}
