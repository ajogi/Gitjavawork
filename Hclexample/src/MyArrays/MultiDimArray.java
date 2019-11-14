package MyArrays;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimArray {

	public static void main(String[] args) throws IOException{
		
		String studentName[]= {"Jogi","Eswar"};
		String subjectName[]= {"Maths","Physics","Chemistry"};
		int marks[][][]=new int[2][2][3];
		int year=1;
		
		//create input stream reader object to accept data from keyword
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//display(marks,studentName,subjectName);

	   //public static void display(int m[][][]; String sName[], String sName[]);
		for(int i=0;i<2;i++)
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
		
	}

