public class ToDoItem {

	// Static variable
	private static int NEXTID = 1;

	// Attributes
	private int id;
	private String description;
	private Boolean completedFlag;

	// Constructor
	public ToDoItem(String myToDoItem) {

		// Initialize member variables
		id = NEXTID;
		description = myToDoItem;
		completedFlag = false;

		// Increments ID
		NEXTID++;
	}

	// Getters
	public int getID() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getCompletedFlag() {
		return completedFlag;
	}

	// Sets completed flag to true
	public void updateCompletedFlag() {
		completedFlag = true;
	}

}
