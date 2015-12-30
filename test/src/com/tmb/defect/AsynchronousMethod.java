package com.tmb.defect;

public class AsynchronousMethod {
	
	public void getCount()
	{
		try
		{
			int data = 50/0;
			System.out.println( "In try block");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public static void main(String [] args)
	{
		AsynchronousMethod obj = new AsynchronousMethod();
		obj.getCount();
	}
}
