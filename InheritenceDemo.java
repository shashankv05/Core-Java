

public class InheritenceDemo {

    protected class grandparent {
		 String grandparentname;
		 int grandparentincome;
		 	
		public grandparent(String gpname,int gpincome)

		{
			grandparentname=gpname;
			
			grandparentincome=gpincome;
			
			}
		 
		void displaygrandparent()
		{
			
		System.out.println("Grandparent name = " +grandparentname);
		System.out.println("Grandparent income = " +grandparentincome);
		}

   }
		 
	

   protected class parent extends grandparent {


	String parentname;
	int   parentincome;
		
	public parent(String gpname,int gpincome,String pname,int pincome)

	{
		super(gpname,gpincome);
		
		parentname=pname;
		parentincome=pincome;
			
		}
	
		void displayParent()
		{
			
		System.out.println("Parent name = " +parentname);
		System.out.println("Parent income = " +parentincome);
		}

   }
    
    
class child extends parent {


    	 String childname;
    	 int   childincome;
    	 	
    	public child(String gpname,int gpincome,String pname,int pincome,String cname,int cincome)

    	{
    		   super(gpname,gpincome,pname,pincome);   // constructor call should be  first statement
    		
    		   childname=cname;
       		   childincome=cincome;
    		}
    	 
    	void displayChild()
    	{
    		
    	System.out.println("Child name = " +childname);
    	System.out.println("Child income = " +childincome);
    	}

    	void familyIncome()

    	{

    	int total;

    	total = grandparentincome + parentincome+childincome;

    	System.out.println("FamilyIncome " +total);
    	}

}
    	    
   
    public static void main(String args[])
    {
    
    InheritenceDemo obj1 = new InheritenceDemo();
    	
   
   // https://www.geeksforgeeks.org/nested-classes-java/
    
    InheritenceDemo.child obj3 =  obj1.new child("Ranveer",500000,"Dhruv",1300000,"Arjun",11800000);
    obj3.displaygrandparent();
    obj3.displayParent();
    obj3.displayChild();
    obj3.familyIncome();
        	
    }
	

}