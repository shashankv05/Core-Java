// Generic Class and Declaring a reference to a Generic class

class SelectionSort <T extends Comparable<T>>
{
         public void sort(T arr[])
         {  
             int i, j;
             T t;
                     for (i=0;i<arr.length;i++)
                   {
                            for(j=i+1;j<arr.length;j++)
                        {
                               if (arr[i].compareTo(arr[j])>0)
                             {
                               t=arr[i];
                               arr[i]= arr[j];
                               arr[j]=t;                                                
                             }
                         }
                    }   
                         for (i=0; i<arr.length;i++)
                         {
                                System.out.print(arr[i]+"\t");
                          }
                             System.out.println();                
        }
   }

class SelectionSortTest
{
            public static void main(String args[])
          {
             Integer arr1[] ={ 6, 5, 8, 3, 2};
                                        
             String arr2[] =  {"Michael", "Adam", "Ellen", "Shawn"};
                
             Character arr3[] = { 'r', 'a', 'm'};
           
             Double arr4[] = {1.435, 1.351, 1.678, 1.787};

       SelectionSort <Integer> obj1 = new SelectionSort<Integer>();
                     obj1.sort(arr1);
           
       SelectionSort <String> obj2 = new SelectionSort <String>();
                        obj2.sort(arr2);
      
        SelectionSort <Character> obj3 = new SelectionSort<Character>();
                          obj3.sort(arr3);
      
        SelectionSort <Double> obj4 =new SelectionSort <Double>();
                         obj4.sort(arr4);            
   
} 
}




