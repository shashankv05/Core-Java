
public class InterfaceDemo {

	public interface interfaceA {

		public static final int a=5;
		public abstract void sum();
	 	
	}

	
	public interface interfaceB extends interfaceA {
		public static final int b=6;
		public abstract void sum();
	 	
	}


public class TestInterface implements interfaceB
{


int c=7;	
int sum=0;	
public void sum()
{
	
sum=(a+b+c);
		
}

void display()
{
	
System.out.println("Sum of a,b and c is " + sum);
}



}

public static void main(String args[])
	
{
	InterfaceDemo obj1 = new InterfaceDemo();
	InterfaceDemo.TestInterface obj2 = obj1.new TestInterface();
	obj2.sum();
	obj2.display();
	
		
}
	
}
