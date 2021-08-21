public class ThreadPRun {

	//Thread Even
	public class ThreadP1 extends Thread {

		public void run()
		{
			for(int i=2;i<=10;i+=2)
				
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


	//Thread Odd
	public class ThreadP2 extends Thread {

		
		public void run()
		{
			for(int i=1;i<10;i+=2)
				
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

	
public static void main(String args[])
	
	{
		ThreadPRun obj = new ThreadPRun();
		
		ThreadPRun.ThreadP1 t1=obj.new ThreadP1();
		ThreadPRun.ThreadP2 t2=obj.new ThreadP2();

        t1.start();
        t2.start();
		
	}
	
	
	
}
