package Threads;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_5 {
	 public static void main(String args[])
	    {
	        Set set = new HashSet();
	 
	        //Adding values to the HashSet
	        set.add("Pavi");
	        set.add("Srikanth");
	        set.add("NAveen");
	 
	        System.out.println("Retrieving values from HashSet using Iterator");
	        retrieveValuesFromListMethod1(set);
	    }
	 public static void retrieveValuesFromListMethod1(Set set)
	    {
	        Iterator itr = set.iterator();
	        while(itr.hasNext())
	        {
	            System.out.println(itr.next());
	        }
	    }
	 

}
