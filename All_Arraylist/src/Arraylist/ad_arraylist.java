package Arraylist;

import java.util.ArrayList;

public class ad_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ad_arraylist.gf();
	}
//accessmodifire  void  methodname
    public static void gf() { 
    	ArrayList too = new ArrayList (); //too is a objectname; obj,metdnm can be anything
    	too.add("Short");
    	too.add("long");
    	too.add("tree");
    	too.add("900");
    	System.out.println(too.get(3));
    	 
  }
}
