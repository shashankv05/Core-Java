class MyGenericMultiply

{

	public static void main(String args[])
	
	{
		
	     int a=5,b=7;
	     
	     double d1=1.2,d2=3.4;
	     
	     multiply(a,b);
	     
	     multiply(d1,d2);
		
	}
	
	
	public static <T extends Number>  void multiply (T p,T q)   //abstract class [Number]
	
	{
		
		int r;
		//double r;
		//r= p.doubleValue() * q.doubleValue();
	    r = p.intValue() * q.intValue();
		System.out.println(r);
	}
	
}
	