package oop;

public class Bird {
	//instance variable needed to store object data
		public static int legs=2;
		public static int wings=2;
		public String birdName;
		public String birdColor;
		private boolean singStatus;
		
		//constructor is a method used to initialize common values to the attributes or properties
		Bird()
		{
			legs=2;
			wings=2;
		}
		//setter method to set value for private variable
		public void setsingingStatus()
		{
			if(this.birdName.equalsIgnoreCase("Kokila"))
			{
				singStatus=true;
			}
		}
		
		//methods to describe the behavior of object
		public void walk()
		{
			System.out.println(birdColor+" "+birdName+" is walking with"+legs+" legs.");
		}
		
		public void fly()
		{
			System.out.println(birdColor+" "+birdName+" is flying with"+wings+" wings.");
		}
	     public void sing()
	     {
	    	 if(singStatus)
	    	 {
	    		 System.out.println("la ra loooo....la ra looo....");
	    	 }else
	    	 {
	    		 System.out.println("can't sing!!!");
	    	 }
	     }

}
