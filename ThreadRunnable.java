
public class ThreadRunnable {

	public class MyThread1 implements Runnable   
	{
		public void run()

	  {
		
	          for(int i=0;i<=5;i++)
	        	        	  
	       {
	        	   System.out.println("A"+"="+i);
	        	  
	              try
	           {
	    	   
	    	           Thread.sleep(1000); 
	           }
	          
	           catch(InterruptedException ex)
	           {
	        	   
	           }
	       }
	   }
		
	}

	
	public class MyThread2 implements Runnable 

	{

	   public void run()
	   {
		   
		  for (int i=5;i>=1;i--)
		  {
			
			System.out.println("B"+"="+i);
		
			     try
			   {
				         Thread.sleep(1000);
			   }
	            
			     catch(InterruptedException ex)
	            {
			    }
			
		  }
		     
	   }
	     
	}

	
	 public static void main(String args[])
	 
	    {        
		 
		        ThreadRunnable obj  =  new ThreadRunnable();
		 
		 
		         
		        ThreadRunnable.MyThread1 obj1 =obj.new MyThread1();  
		        ThreadRunnable.MyThread2 obj2 =obj.new MyThread2();  
		         
		        Thread t1=new Thread(obj1);   
		        
		        Thread t2=new Thread(obj2);
		         
		          t1.start();
		          t2.start();
	            	        
		        
	    }
	
	
}
