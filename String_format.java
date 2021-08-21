import java.util.Scanner;

class String_format
{

  public static void main(String args[])
  
  {
	  int n1,n2,n3;
	  
	  String str1,str2,str3;
	  
	  System.out.println("Sample Input:-");
	  
	  Scanner sc=new Scanner(System.in);
	  
	  str1=sc.next();
	  
	  n1=sc.nextInt();
	  
	  
	  str2=sc.next();
	  
	  n2=sc.nextInt();
	  	  
	  str3=sc.next();
	
	  n3=sc.nextInt();
	
	
	  sc.close();
  
	  System.out.println("");
      System.out.println("Sample Output:-");
      System.out.println("=====================");
   
      System.out.printf( "%-15s %03d %n", str1, n1);  // %n always outputs the correct platform specific line 
     
      //System.out.printf("%s\t\t0%d",str2,n2);
      System.out.printf( "%-15s %03d %n", str2, n2);   // -15 indicates the space between str2 and n2
      //System.out.printf("%s",str2,"\t",(n2>100)?"%d":"%0d",n2);
     
      
      //System.out.printf("%s\t\t0%d",str3,n3);
      System.out.printf( "%-15s %03d %n", str3, n3);
      System.out.println("");
      System.out.println("=====================");
    
      
  
  
  
  }

}


