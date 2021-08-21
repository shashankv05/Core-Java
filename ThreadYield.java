
public class ThreadYield {

	public class MyThreadYield1 extends Thread {

		
		public void run()
		
		{
			for (int i=1;i<=5;i++)
				
			{
				
				if (i==3)
				yield();	               // sends the running thread to runnable state	
				
				System.out.println("A ="+i);
				
			}		
				
			
		}
		
		
	}

	
	public class MyThreadYield2 extends Thread 

	{

		public void run()
		
		{
			for (int i=5;i>=1;i--)
				
			{
				if(i==4)
				yield();                   // sends the running thread to runnable state	
				
				System.out.println("B ="+i);
				
			}
			
			
		}
		
	
	}

	public class MyThreadYield3 extends Thread 

	{
		
		public void run()
		{
			
			for(int i=1;i<10;i+=2)
				
			{
				if(i==5)
					yield();       // sends the running thread to runnable state	
				System.out.println("C ="+i);
				
			}
								
			
		}
		
		

	}

	
	   public static void main(String args[])

	   {
	   	 
		         ThreadYield obj = new ThreadYield();
		   
	              ThreadYield.MyThreadYield1 t1 = obj.new MyThreadYield1();         // objects
	         
	              ThreadYield.MyThreadYield2 t2 = obj.new MyThreadYield2();  
	              
	              ThreadYield.MyThreadYield3 t3 = obj.new MyThreadYield3();  
	              
	                t1.start();
	                t2.start();
	                t3.start();
	                         
	   }
	
	
	
}
