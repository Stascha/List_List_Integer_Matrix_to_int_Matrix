import java.util.*;

public class Convert_Matrix
{
    // Funkcija koja konvertuje matricu datu kao List<List<Integer>> u matricu u obliku int[][]
    public static int[][] List_List_Integer_Matrix_to_int_Matrix(List<List<Integer>> list)
    {
        int[][] array = new int[list.size()][];
		
	    for (int i = 0; i < array.length; i++)
		    array[i] = new int[list.get(i).size()];
	
	    for(int i=0; i<list.size(); i++)
	  	    for (int j = 0; j < list.get(i).size(); j++) 
		   	    array[i][j] = list.get(i).get(j);
		   
	   return array;
    }
    
  

  // Funkcija koja konvertuje matricu datu kao int[][] u matricu u obliku List<List<Integer>>  
    public static List<List<Integer>>  Int_Matrix_to_List_List_Integer_Matrix(int[][] matrix)
    {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
 
	    for (int i = 0; i < matrix.length; i++)
		{    
		    List<Integer> integers = new ArrayList<Integer>();
		    
		    for(int j=0; j< matrix[i].length; j++)
	           integers.add( matrix[i][j] );
		  
		    list.add(integers);
	    }
		
	    return list;
    }

    // Funkcija koja pravi matricu kao List<List<Integer>> i popunjava je slučajnim brojevima od 0 do max
    public static List<List<Integer>>  Make_A_Matrix_As_a_List_List_Integer(int rows, int columns, int max)
    {
        Random random = new Random();
	    List<List<Integer>> list = new ArrayList<List<Integer>>();
		
	    for(int i = 0; i< rows; i++)
	    {
		    List<Integer> integers = new ArrayList<Integer>();
			
		    for(int j=0; j<columns; j++)
			    integers.add(random.nextInt(max));
		
	    	list.add(integers);
			
	    }
		
	    return list;
   }	
    

    public static void main (String[] args)
    {
   	    // Pravi se matrica List<List<Integer>> list i popunjava se random brojevima od 0 do 9
   	    List<List<Integer>> list =  Make_A_Matrix_As_a_List_List_Integer(5, 5, 9);
   	    
   	    // Ispiše se matrica	
	    for (int i = 0; i < list.size(); i++)
	    {
		    for (int j = 0; j < list.get(i).size(); j++) 
	    	    System.out.print(	list.get(i).get(j) + " " );
	    	    
	    	 System.out.println( );
	    }
		
		System.out.println( );
		
	    // Poziva se funkcija koja konvertuje matricu datu kao List<List<Integer>> u matricu u obliku int[][]
	    int[][] a = List_List_Integer_Matrix_to_int_Matrix(list);
	
	    // Ispiše se matrica	
	    for (int i = 0; i < a.length; i++)
	    {
		    for (int j = 0; j < a[i].length; j++) 
	    	    System.out.print(  a[i][j] + " "  ); 
	
		    System.out.println(	);
	    }
	    
	     // Poziva se funkcija koja konvertuje matricu datu kao int[][] u matricu u obliku List<List<Integer>>  
	    List<List<Integer>> list_2 = Int_Matrix_to_List_List_Integer_Matrix( a );
	    
	    System.out.println( );
	    
	     // Ispiše se matrica	
	    for (int i = 0; i < list_2.size(); i++)
	    {
		    for (int j = 0; j < list_2.get(i).size(); j++) 
	    	    System.out.print(	list_2.get(i).get(j) + " " );
	    	    
	    	 System.out.println( );
	    }
	    
	    System.out.println( );
	    
	    // Poziva se funkcija koja konvertuje matricu datu kao List<List<Integer>> u matricu u obliku int[][]
	    int[][] a_2 = List_List_Integer_Matrix_to_int_Matrix(list_2);
	
	    // Ispiše se matrica	
	    for (int i = 0; i < a_2.length; i++)
	    {
		    for (int j = 0; j < a_2[i].length; j++) 
	    	    System.out.print(  a_2[i][j] + " "  ); 
	
		    System.out.println(	);
	    }
	    
		
    }		

}
     
