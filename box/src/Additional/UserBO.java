package Additional;

public class UserBO {
    
	public UserBO()                    
	{
	}
	
	static void validate(User u) throws Exception          
	{
		int Count=0;
		String s2= u.getPassword();
		for(int i=0;i<s2.length();i++)                      
		{
			if(s2.charAt(i)>='0' && s2.charAt(i)<='9')
			{
				Count++;
			}
		}
		
		if(Count==0)                                  
		{
			throw new WeakPasswordException("Your password is weak");
		}
	}

}