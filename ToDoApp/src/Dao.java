import java.util.ArrayList;

public class Dao {

	// Attributes
	private ArrayList<ToDoItem> toDoList;

	// Constructor
	public Dao() {
		toDoList = new ArrayList<>();
	}

	// Getters and Setters
	public ArrayList<ToDoItem> getDatabase() {
		return toDoList;
	}

	public void setDatabase(ArrayList<ToDoItem> myToDoList) {
		toDoList = myToDoList;
	}

	//Other methods
	
	//adds ToDoItem to list
	public void add(String myToDoItem) {
		ToDoItem myList = new ToDoItem(myToDoItem);
		toDoList.add(myList);
	}

	//returns the toDoList
	public ArrayList<ToDoItem> list() {
		return toDoList;
	}

	//deletes ToDoItem from list
	public void delete(ToDoItem task) {
		toDoList.remove(task);
	}

	//marks task as done
	public void mark(ToDoItem task) {
		task.updateCompletedFlag();
	}

	//gets ToDoItem based on it's ID
	public ToDoItem get(int id) {

		for (int i = 0; i < toDoList.size(); i++) {
			ToDoItem currTask = toDoList.get(i);
			int currID = currTask.getID();
			if (currID == id) {
				return currTask;
			}
		}
		return null;
	}

	//Gets completed items
	public ArrayList<ToDoItem> getCompleted() {
		ArrayList<ToDoItem> completedList = new ArrayList<>();
		for (int i = 0; i < toDoList.size(); i++) {
			ToDoItem currItem = toDoList.get(i);
			boolean status = currItem.getCompletedFlag();
			if (status) {
				completedList.add(currItem);
			}
		}
		return completedList;
	}

	//gets pending items
	public ArrayList<ToDoItem> getPending() {
		ArrayList<ToDoItem> pendingList = new ArrayList<>();
		for (int i = 0; i < toDoList.size(); i++) {
			ToDoItem currItem = toDoList.get(i);
			boolean status = currItem.getCompletedFlag();
			if (!status) {
				pendingList.add(currItem);
			}
		}
		return pendingList;
	}

}
