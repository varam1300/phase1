package collection6;

import java.util.*;

public class CollectionExp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        ArrayList<String> numbers = new ArrayList<String>();  
        
        numbers.add("One");
        numbers.add("Two");  
        numbers.add("Three");  
        numbers.add("Two");    
        Iterator iter = numbers.iterator();  									
        System.out.println("The items in the collection are: ");
        while(iter.hasNext())
        {  
            System.out.println(iter.next());  
        }  

	}


}
