
class ThreadName {

	class MyThread1 implements Runnable 
{
	Thread th1;	    // globally declared object of Thread class   
		
    String name;
 
   MyThread1(String name)                 // constructor
 
 {
	 
	this.name=name;
	 
	th1 =new Thread(this,name);               // this references current class object 
	
	th1.start();                        // object of thread class calls start method defined in Thread class
 }
	     public void run()
	{
		   if(th1.getName().equals("A"))
		{
			for (int i=1;i<=5;i++)
			{
						System.out.println(th1.getName()+"="+i);
						
	            	     try
		               {
			             	 Thread.sleep(1000);               //Thread.sleep(1000) by class name is a static way to call sleep method 
		               }
		                catch(InterruptedException ex)
		                   {
		    	 
		                   }
		     
		     }
		 }
		
		
	}	

}

class MyThread2 implements Runnable 
{
	Thread th2;	    // globally declared object of Thread class   
		
    String name;
 
   MyThread2(String name)                 // constructor
 
 {
	 
	this.name=name;
	 
	th2=new Thread(this,name);         //Thread(String name)  constructor in Thread Class
	
	th2.start();                        // object of thread class calls start method defined in Thread class
 }
	     public void run()
	{
		   if(th2.getName().equals("B"))
		{
			for (int i=5;i>=1;i--)
			{
						System.out.println(th2.getName()+"="+i);
						
	            	     try
		               {
			             	 Thread.sleep(1000);               //Thread.sleep(1000) by class name is a static way to call sleep method 
		               }
		                catch(InterruptedException ex)
		                   {
		    	 
		                   }
		     
		     }
		 }
				
		
	}	

}

	
	public static void main(String args[])
	
	{
		ThreadName obj = new ThreadName();
		
		ThreadName.MyThread1 t1 = obj.new MyThread1("A");
		ThreadName.MyThread2 t2= obj.new MyThread2("B");

        t1.run();
		t2.run();
		
	}
	
	
	
	
}
