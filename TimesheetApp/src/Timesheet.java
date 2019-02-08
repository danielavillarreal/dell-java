import java.util.List;
import java.util.ArrayList;

public class Timesheet {
	
	//Attributes
	private List<TimesheetEntry> database;
	
	//Constructor
	public Timesheet() {
		database = new ArrayList<>();
	}
	
	//Getters and Setters
	public List<TimesheetEntry> getDatabase() {
		return database;
	}
	
	public void setDatabase(List<TimesheetEntry> myDatabase) {
		database = myDatabase;
	}
	
	public void add(String project, String task) {
		TimesheetEntry myEntry = new TimesheetEntry(project, task);
		database.add(myEntry);
	}
	
	public List<TimesheetEntry> list() {
		
		//if (activeOnly == true) {
			//return 
		//}
		return database;
	}
	
	public TimesheetEntry get(int id) {
		for (int i=0; i < database.size(); i++) {
			TimesheetEntry currList = database.get(i);
			int currID = currList.getID();
			if (currID == id) {
				return currList;
			}
		}
		return null;	
	}
	
	public void delete(TimesheetEntry entry) {
		database.remove(entry);
	}
	
	public void stop(TimesheetEntry entry) {
		entry.updateEndTime();
	}
}
