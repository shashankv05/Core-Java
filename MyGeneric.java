public class MyGeneric

{
	
  public static void main(String args[])
{

	int a=5,b=7;
	
	double x=5.546,y=6.54;
	
	char ch1='a',ch2='b';     // character is written within single quotes
	
	String s1="Ranveer",s2="Verma";
	
   System.out.println("After Swapping:"); 
	
	 swap(a,b);                   //function call
	 swap(x,y);  
	 swap(ch1,ch2);  
	 swap(s1,s2);  
}	
	

	public static <T> void swap(T p ,T q)                        //Generic Method
	{
		
          T r;	
          
          r=p;
          p=q;
          q=r;
         
       
         System.out.println(p + "\t" +q); 
          
		
	}
	
	

}
