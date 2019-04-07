package com.samepackage;

public class ClassA {

	private int pri=10;
	           int def=20;
	protected  int pro=30;
	public     int pub=40;
	       
	
	public ClassA()
	{
		System.out.println("pri  "+pri);
		System.out.println("def  "+def);
		System.out.println("pro  "+pro);
		System.out.println("pub  "+pub);
	}
	
	        
	        public static void main(String args[])
	        {
	        	ClassA cA=new ClassA();
	        	
	        	System.out.println("pri  "+pri);
	    		System.out.println("def  "+def);
	    		System.out.println("pro  "+pro);
	    		System.out.println("pub  "+pub);
	        }
}
