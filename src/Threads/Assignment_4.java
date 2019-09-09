package Threads;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Assignment_4 {
	 public static void main(String[] args) {
		 
         HashMap< String,Integer> tel_dir_map = new HashMap<String, Integer>();

         tel_dir_map.put("pavi", 1234567895);

         tel_dir_map.put("sri", 789412354);

         tel_dir_map.put( "denin",1234569632);

         tel_dir_map.put( "teja",706985415);



        // System.out.println("Telephone Numbers:");

         //System.out.print("\t" + tel_dir_map);
         int val = tel_dir_map.get("pavi");
         System.out.println("Value for key  is: " + val);

      }

}
