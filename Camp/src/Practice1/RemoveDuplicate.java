package Practice1;

import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicate {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int num = 6;
   int[] arr = new int[num];
   int[] arrf = new int[num];
   for (int a = 0; a < arr.length; a++)
   {        
       arr[a] = sc.nextInt();
       arrf[a] = 0;
   }
   int[] uni = new int[arr.length];    
   int n=0;
   for (int b = 0; b < arr.length; b++) {            
       if (arrf[b] == 0) {
           uni[n++] = arr[b];
           for (int j = b+1; j < arr.length; j++)
           {  
               if (arr[b] == arr[j]) {                        
                   arrf[j]=-1;
               }
           } } }  
   for (int i = 0; i < n; i++)
   {
           System.out.printf(""+uni[i]+" ");          
   }
} }
 