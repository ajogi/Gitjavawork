package sivaramexamples;

public class Addingdemo {

	public static void main(String[] args) {

     int a,b,result;
     
      if(args.length!=2)
       {
    	 System.out.println("Please pass two numbers as arguents!");
       }
      else
        {
        try 
          {
        	a=Integer.parseInt(args[0]);
       	    b=Integer.parseInt(args[1]);
    		 result=a/b;
    		 System.out.println(result);
    	  }
        catch(ArithmeticException ae)
         {
        	System.out.println("Please pass non-ZERO value as 2nd arguments!");
         }
        catch(NumberFormatException ne)
        {
        	System.out.println("Please pass numbers only as arguments!!!");
        }
        catch(Exception e)
    	  {
    		 //e.printStackTrace();
    		 System.out.println("Exception occured!");
    	  }
      
        }

  }

}
