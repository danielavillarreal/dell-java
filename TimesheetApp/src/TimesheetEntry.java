import java.time.LocalDateTime;

public class TimesheetEntry {

	//Static variable
	private static int NEXTID = 1;
	
	//Attributes
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	//Constructor
	public TimesheetEntry(String myProject, String myTask) {
		
		//Initialize member variables
		projectName = myProject;
		task = myTask;
		id = NEXTID;
		startTime = LocalDateTime.now();
		
		//Increment ID
		NEXTID++;
	}
	
	//Methods
	
	//Getters
	public String getProjectName() {
		return projectName;
	}
	
	public String getTask() {
		return task;
	}
	
	public int getID() {
		return id;
	}
	
	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	//If endTime has not been set, set it to LocalDateTime.now()
	public void updateEndTime() {
		
		if(endTime == null) {
			endTime = LocalDateTime.now();
		}
	}
}
