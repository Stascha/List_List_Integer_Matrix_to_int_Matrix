import java.util.*;

public class HelloWorld
{
    
    public static int[][] List_List_Integer_Matrix_to_int_Matrix(List<List<Integer>> list)
    {
        int[][] array = new int[list.size()][];
		
		for (int i = 0; i < array.length; i++)
			array[i] = new int[list.get(i).size()];
	
	    for(int i=0; i<list.size(); i++)
	    {
			for (int j = 0; j < list.get(i).size(); j++)
			{
				array[i][j] = list.get(i).get(j);
			}
		}
		
		return array;
    }


public static void main (String[] args)
{
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		for(int i = 0; i< 5; i++)
		{
			List<Integer> integers = new ArrayList<Integer>();
			for(int j=0; j<5; j++)
			{
				Random random = new Random();
				integers.add(random.nextInt(10));
			}
			
			list.add(integers);
		}
		
	
	    int[][] a = List_List_Integer_Matrix_to_int_Matrix(list);
	
	
		
		for (int i = 0; i < a.length; i++)
		{
			
		    for (int j = 0; j < a.length; j++) 
			{
			    	System.out.print(	a[i][j] + " "); 
			}
			
			System.out.println(	);
		}
		
}		

}
