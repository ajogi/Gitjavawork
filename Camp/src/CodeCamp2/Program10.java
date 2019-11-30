package CodeCamp2;

public class Program10 {
	    private static int calDiff(int i,int j,int[] arr) { 
	        return Math.abs(arr[i] - arr[j]) +Math.abs(i - j); 
	    } 	  	   
	    private static int maxDistance(int[] arr) 
	    { 	     
	        int result = 0; 	     
	        for (int i = 0; i < arr.length; i++)  
	        { 
	            for (int j = i; j < arr.length; j++) 
	            { 	          
	                result = Math.max(result, calDiff(i, j, arr)); 
	            } 
	        } 
	        return result; 
	    } 
	    public static void main(String[] args) 
	    { 
	        int[] arr = { -70, -64, -6, -56, 64, 
	                        61, -57, 16, 48, -98 }; 
	        System.out.println(maxDistance(arr)); 
	    } 
	} 
