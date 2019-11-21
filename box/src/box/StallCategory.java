package box;

public class StallCategory {
	private String name;
    private String details;
   
    public StallCategory()
    {
    }
   public StallCategory(String name,String details)
    {
    this.name=name;
    this.details=details;
    }
   
    public void setName(String name)
    {
  this.name=name;
    }
    public String getName()
    {
  return this.name;
    }
    public void setDetails(String details)
   
    {
 this.details=details;  
    }
    public String getDetails()
    {
   return this.details;
    }
    public void display()
    {
    System.out.println("Name:" +getName());
    System.out.println("Detail:"+getDetails());
    }


}
