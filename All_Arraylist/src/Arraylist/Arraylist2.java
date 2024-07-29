package Arraylist;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist2.hm();
	}
	 public static void hm () {
		 ArrayList<String> ga = new ArrayList <String>();
		 ga.add("we");
		 ga.add("can");
		 ga.add("little");
		 ga.add("take");
		 ga.add("break");
		  System.out.println(ga.get(3)); //for printing specific value
		 System.out.println(ga); 
		
		int b = ga.size() ;
		System.out.println(b);
	 	
	 }
}
