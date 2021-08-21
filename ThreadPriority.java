
public class ThreadPriority {


public class MyThread1 extends Thread                    //inheritance  
{

	public void run()
	{
		for(int i=1;i<=5;i++)
			
		{
			
				System.out.println("A="+i);
				
				
				try
				{
					sleep(1000);
					
				}
					catch(InterruptedException ex)                         // 
					{
						
						
					}
						
			
			
		}	
		
		
	}	
	
}
	
public class MyThread2 extends Thread{

	
	public void run()
	{
		for(int i=5;i>=1;i--)
			
		{
			
				System.out.println("B="+i);
				
				
				try
				{
					sleep(1000);
					
				}
					catch(InterruptedException ex)
					{
						
						
					}
				
			
		}	
		
		
	}
		
		
}
public class MyThread3 extends Thread {

	
	public void run()
	{
		for(int i=1;i<10;i+=2)
			
		{
			
				System.out.println("C="+i);
				
				try
				{
					sleep(1000);
					
				}
					catch(InterruptedException ex)
					{
						
						
					}
				
			
		}	
		
		
	}
			
	
	
}

	
public static void main(String args[])
{
	

	ThreadPriority obj = new ThreadPriority();
	
	ThreadPriority.MyThread1 t1 = obj.new MyThread1();
	ThreadPriority.MyThread2 t2 = obj.new MyThread2();
	ThreadPriority.MyThread3 t3 = obj.new MyThread3();

	t1.setPriority(5);
	t2.setPriority(1);
	t3.setPriority(10);
	
	t1.start();
	t2.start();
	t3.start();
	
	
}
	
}
