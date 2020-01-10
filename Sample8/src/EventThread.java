import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EventThread {//start of class eventthread
    
	public Map<String, Integer> eventMonths(final List<Event> eventList)//Method to get event months count
	{
		Map<String,Integer> mp= new HashMap<>();//Initialize a map to store months count
		ExecutorService executor = Executors.newSingleThreadExecutor();//Initialize executorservice for execution
		int value=1;//Initialize primary value
		for (Event event : eventList) {//For eventList
	    //System.out.println(event.getEventDate());
		String month= new SimpleDateFormat("MMMM").format(event.getEventDate());//Get month from event date
		//System.out.println(month);
		if(mp.containsKey(month))//If that month already contains in map
		{
			int i=mp.get(month);
			i++;//Increment value of the respective key and store it
			mp.put(month, i);
		}
		else
		{
			mp.put(month, value);//Else add it to map
		}
		}   
		executor.shutdown();//shutdown executor
		try {
			executor.awaitTermination(200,TimeUnit.MILLISECONDS);//wait to terminate till 200ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return mp;//Return count map
		
	}

}