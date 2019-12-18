package Additional;


	import java.util.Scanner;

	public class MainWeakPassword{

	    public static void main(String[] args) throws Exception {
			
			Scanner sc= new Scanner(System.in);           
			
			try                                           
			{
				System.out.println("Enter the user details");        
				String details= sc.nextLine();
				
				String s1[]= details.split(",");                      
				
				User obj= new User(s1[0],s1[1],s1[2],s1[3]);            
				 
				UserBO obj2= new UserBO();                          
				
				obj2.validate(obj);                                  
				
				System.out.println(obj);                            
				}
			
			catch(WeakPasswordException e)                
			{ 
				System.out.println("WeakPasswordException: "+e.msg);        
			}

		}

	}
