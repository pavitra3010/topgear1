package Threads;

import java.util.Random;

public class Assignment_1{
	Assignment_1(){
		
	}
	class Runnable1 implements Runnable{
		int n;
		Runnable1(int n){
			this.n=n;
			
		}
	    public void run(){
	            System.out.println(n);
	        }
	    }
	

	class Runnable2 implements Runnable{
		int n;
		Runnable2(int n){
			this.n=n;
			
		}

	    public void run(){
	    	int fact=1;
	        for(int i=1;i<=n;i++) {
	        	fact=fact*i;
	        }
	        System.out.println("the fact of "+n +"is" +fact);
	    }
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		Random rand =new Random();
		int n=5;
		int max=10;
		int min=1;
		Assignment_1 a=new Assignment_1();
		while(n!=0)
		{
			int num=rand.nextInt((max - min) + 1) + min;
			 Runnable r = a.new Runnable1(num);
		        Thread t = new Thread(r);
		        Runnable r2 = a.new Runnable2(num);
		        Thread t2 = new Thread(r2);
		        t.start();
		        try
		        {
		        Thread.sleep(1000);
		        }
		        catch(InterruptedException ex)
		        {
		        	
		        }
		        
		        t2.start();
		        
		        try
		        {
		        Thread.sleep(1000);
		        }
		        catch(InterruptedException ex)
		        {
		        }
		        
		        n--;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}
