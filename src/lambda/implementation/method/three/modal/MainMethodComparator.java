package lambda.implementation.method.three.modal;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class MainMethodComparator 
{
	public static void main(String[] args)
	{
		Map<Integer, Country> mp = new HashMap<Integer, Country>();
		mp.put(1, new Country("USA",2, 876));
		mp.put(91, new Country("INDIA",1, 921));
		mp.put(61, new Country("AUSTRALIA",3, 472));
		mp.put(86, new Country("CHINA",9, 273));
		mp.put(33, new Country("FRANCE",4,972));
		mp.put(852, new Country("HONG KONG",21, 139));
		mp.put(92, new Country("PAKISTHAN",99, 441));
		
		Set<Integer> keys = mp.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println("=======Before Sorting=====");
			Object key = it.next();
			Country c1 = mp.get(key);
			System.out.print(key);
			System.out.println("My Object Value: >> "+c1);
			System.out.println();
			
			
		}
		
	
		

		
	}

}
