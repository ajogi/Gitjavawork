package Practice2;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) 
    { 
        int r = 5; 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Declaring 2-D array with 5 rows 
        int arr[][] = new int[r][]; 
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[1];
        arr[3]=new int[5];
        arr[4]=new int[4];

        
        /*
        for(int i=0;i<6;i++)
		{
			out.println("Enter "+year+"year Marks:");
			for(int j=0;j<studentName.length;j++)
			{
				out.println("Enter "+studentName[j]+" Marks:");
			    for (int k=0;k<subjectName.length;k++)
			    {
			    	out.println("Marks for "+subjectName[k]);
			    	marks[i][j][k]=Integer.parseInt(br.readLine());
			    }
			      
				
			}
			year++;
	     }
       }
        */
        
        

        //Initializing array 
        int count = 0; 
        for (int i=0; i<arr.length; i++) 
            for(int j=0; j<arr[i].length; j++) 
                arr[i][j] = count++; 
  
        // Displaying the values of 2D Jagged array 
        System.out.println("Contents of 2D Jagged Array"); 
        for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
            	//arr[i][j]=Integer.parseInt(br.readLine());
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
    } 

}
