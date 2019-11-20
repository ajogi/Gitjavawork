package box;

import java.util.Scanner;

public class Scholar {
    public static void main(String[] args) {

    	int a[]=new int[5];
    	int sum=0;
    	float avg;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=4;i++){
    		a[i]=sc.nextInt();
    		sum=sum+a[i];
    		}
        avg=sum/5;
        if(a[0]>2&& a[1]>2&& a[2]>2&& a[3]>2&& a[4]>2){
    	if(avg<4.0){
    		System.out.println("No");
    	}else{
    	System.out.println("Yes");
    	}
    	}else{
    	System.out.println("No"); 
       }
   }
}