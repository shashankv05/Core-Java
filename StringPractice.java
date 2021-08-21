public class StringPractice

{
      public static void main(String[] args)
      {
         	char c1 = 'a',c2;
		    c2 = (char) ( c1 - ('a' - 'A'));
         	String s1 = "shashank", s2 = "";
			for (int i=0; i<s1.length(); i++) 
			{
			    s2 = s2 + (char) ( s1.charAt(i) - ('a' - 'A') );
			  // System.out.println(s2);
			}
			System.out.println( "" + s2);
			System.out.println(c2);
      }
}



