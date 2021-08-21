import java.util.*;

public class TestClass {

static Scanner sc = new Scanner(System.in);


int countingValley(int n){

System.out.println("Enter ");	
	
char c1='U', c2='D';
char arr1[] = new char[n];
char arr2[]= new char[n];

int countU=0,countD=0;


for(int i=0; i<n; i++)
		{
	
	      arr1[i]=sc.next().charAt(0);
	
		  if(arr1[i]==c1 || arr1[i]==c2)
		  {
			  arr2[i]+=arr1[i];
		  }
	    }

//System.out.print(arr2);

for(int i=0; i<arr2.length; i++)
{

  if(arr2[i]==c1)
  {
	  countU++;	 
  }
  if(arr2[i]==c2)
  {
	  countD++;	 
  }
  
}
	
return (countU-countD);
}

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

System.out.println("Enter n");
int n, count=0;
n= sc.nextInt();

TestClass obj = new TestClass();

if(n>=2)
	count = obj.countingValley(n);

System.out.println("\n"+count);

}
}

