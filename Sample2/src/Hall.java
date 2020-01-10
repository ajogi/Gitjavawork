import java.util.ArrayList;
import java.util.List;
public class Hall {
   
private String name;
private int costPerDay;
private List<EventType> eventTypeList= new ArrayList<EventType>();
public Hall() {
super();
}
List<Integer> noOfEvents= new ArrayList<Integer>();
    public Hall(String name, int costPerDay) {
super();
this.name = name;
this.costPerDay = costPerDay;
}
     
    public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getCostPerDay() {
return costPerDay;
}
public void setCostPerDay(int costPerDay) {
this.costPerDay = costPerDay;
}
public List<EventType> getEventTypeList() {
return eventTypeList;
}
public void setEventTypeList(List<EventType> eventTypeList) {
this.eventTypeList = eventTypeList;
}
void addToNoOfEvents(int n)
    {
    noOfEvents.add(n);
    }
   
    void addToEventTypeList(EventType eventType)
    {
    eventTypeList.add(eventType);
    }
   
    private List<Hall> hallList=new ArrayList<Hall>();
    void addToHallList(Hall hall)
{
hallList.add(hall);
}
   
   public void checkEvent(String event)
    {
    int i=0,j=0,k=0;
    EventType ep= new EventType();
    /*System.out.println(hallList.size());
    for (Hall2 hall2 : hallList) {
System.out.println(hall2.getName());
}*/
    for (EventType eventType : eventTypeList) {
    if(noOfEvents.get(j)==k)
    {
    k=0;
    j++;
    }
if(eventType.getName().equals(event))
{
System.out.println(hallList.get(j).getName());
i++;
}
k=k+1;
}
    if(i==0)
    {
    System.out.println("No halls are available for the event type");
    }
   
}
}