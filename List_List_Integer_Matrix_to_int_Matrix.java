import java.util.*;

public class Convert_Matrix
{
    // Funkcija koja konvertuje matricu datu kao List<List<Integer>> 
    // u matricu u obliku int[][]
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
    	// Pravi se matrica List<List<Integer>> list i
    	// popunjava se random brojevima od 0 do 9
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
		
	// Poziva se funkcija koja konvertuje matricu datu kao List<List<Integer>> 
	// u matricu u obliku int[][]
	int[][] a = List_List_Integer_Matrix_to_int_Matrix(list);
	
	// Ispiše se matrica	
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a[i].length; j++) 
		{
		    	System.out.print(	a[i][j] + " "); 
		}
			
		System.out.println(	);
	}
		
    }		

}
