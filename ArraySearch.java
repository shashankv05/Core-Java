import java.util.Scanner;

class ArraySearch{

public static void main(String args[])
{
	System.out.println("Enter Array Size: ");
    
	
    Scanner sc= new Scanner(System.in);
    
    int n = sc.nextInt();
    int arr[] = new int[n];
    boolean flag = false;
    System.out.println("Enter Array Elements:");
    
    for (int i=0;i<n;i++)
    {
    	
       arr[i]= sc.nextInt();
    		
    }
	
    System.out.println("Element search");
    
    int k = sc.nextInt();
    
    for (int i = 0;i<arr.length;i++)
    {
    	
         if(arr[i]==k)
         {
        	  flag = true;
         }       
         
    }
    if (flag== true)
    {
    	System.out.println("Found");
    	
    }
    else
    {
    	System.out.println("Not Found");
    	
    }
  sc.close();
}
}