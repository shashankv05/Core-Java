class Base { 

	// virtual by default 
	public  void show() { 
	System.out.println("Base::show() called"); 
	} 
} 

class Derived extends Base { 
	public void show() { 
	System.out.println("Derived::show() called"); 
	} 
} 

public class Test_Inheritance { 
	public static void main(String[] args) { 
		Base b = new Derived(); 
		b.show(); 
	} 
} 
