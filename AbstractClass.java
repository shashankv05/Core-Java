public class AbstractClass {

public abstract class shape {
	
	
	public double dim1,dim2;
	public abstract void area(); // abstract method declared
    abstract void display();
}
public class circle extends shape {

	
double area;
	
 public circle(int r){

dim1 = r;
		
	
}
  public void area()       // abstract method definition
{

	 area = ( 3.14 * dim1 * dim1);
	

}
  
  void display()
  {
 	 
 	 System.out.println("Area of circle is " + area);
  }
   

}


public class rectangle extends shape {

	
	double area;
	
public  rectangle (int l,int b){


	dim1 = l;
	dim2 = b;
		
}	

  public void area()
{

area = dim1 * dim2;
	
}
 void display()
 {
	 
	 System.out.println("Area of rectangle is " + area);
 }
  
}

public class triangle extends shape {

	
	double area;
	
public  triangle(int b,int h){


	dim1=b;
	dim2=h;
		
}	

  public void area()                // abstract method definition
{

	area= 0.5 * dim1 * dim2;
	
}
  
  
  void display()
  {
 	 
 	 System.out.println("Area of triangle is " + area);
  }
    

}

public static void main(String args[])
{
	
	AbstractClass obj =new AbstractClass();
	
	AbstractClass.circle cir = obj.new circle(7);
	
   cir.area();
   cir.display();
	
	
	AbstractClass.rectangle rect = obj.new rectangle(7,9);
	
	rect.area();
	rect.display();
	
	
	AbstractClass.triangle tri = obj.new triangle(7,9);
	
	tri.area();
	tri.display();
	
	// AbstractClass.shape s= obj.new rectangle(7,9);
    // s.area();
     //s.display();

	
}

}
