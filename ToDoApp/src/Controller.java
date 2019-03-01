import java.util.List;
import java.util.Scanner;

public class Controller {

	// Member variables
	Dao toDoList;
	ConsoleUtils consoleUtils;
	Scanner scanner = new Scanner(System.in);

	// Constructor
	public Controller() {
		this.toDoList = new Dao();
		this.consoleUtils = new ConsoleUtils();
	}

	//starts the toDoList project
	public void start() {

		consoleUtils.printFunctions();
		boolean quit = false;

		while (!quit) {

			// Prompt the user for input, collect input, parse into parts
			String input = consoleUtils.promptString("> ");
			String[] actionParts = input.split(" ");
			String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
			if (action.equals("add")) {

				//adds tasks
				processAddAction();

			} else if (action.equals("delete")) {

				//deletes tasks
				processDeleteAction(actionParts);

			} else if (action.equals("mark")) {

				//marks the item as done
				processMarkAction();

			} else if (action.equals("list")) {

				//lists the task list
				processListAction(actionParts);

			} else if (action.equals("quit")) {
				
				// exits out of the loop
				quit = true;

			} else if (action.equals("help")) {
				
				// Should display the menu of actions
				consoleUtils.printFunctions();
			}
		}
	}

	//deletes entries
	public void processDeleteAction(String[] actionParts) {

		if (actionParts.length > 2) {
			consoleUtils.error("Too many inputs to delete command");
			return;
		}
		
		// calls get method to get specific and delete method to delete
		int id = Integer.parseInt(consoleUtils.promptString("Enter an Task ID: "));
		ToDoItem entry = toDoList.get(id);
		toDoList.delete(entry);
		System.out.println();
		System.out.println("[item deleted]");
		
	}

	//lists entries depending on whether they want pending, complete, or all
	public void processListAction(String[] actionParts) {

		if (actionParts.length > 3) {
			consoleUtils.error("Too many inputs to list command");
			return;
		}
		
		String listType = String.valueOf(actionParts[1]);
		
		//lists pending items
		if (listType.equals("pending")) {
			List<ToDoItem> entries = toDoList.getPending();
			consoleUtils.printList(entries);
		}
		//lists completed items
		else if (listType.equals("done")) {
			List<ToDoItem> entries = toDoList.getCompleted();
			consoleUtils.printList(entries);
		}
		//lists all items
		else if (listType.equals("all")) {
			List<ToDoItem> entries = toDoList.list();
			consoleUtils.printList(entries);
		}
		
	}

	//Adds entries to list
	public void processAddAction() {

		String task = consoleUtils.promptString("Task Name (one word only):");

		if (task.contains(" ")) {
			consoleUtils.error("Task name must be 1 word");
			return;
		} else {
			toDoList.add(task);
			System.out.println();
			System.out.println("[item added]");
		}
	}

	// marks tasks as done
	public void processMarkAction() {

		int id = Integer.parseInt(consoleUtils.promptString("Enter an Task ID: "));
		ToDoItem entry = toDoList.get(id);
		entry.updateCompletedFlag();
		System.out.println();
		System.out.println("[status updated]");

	}

}
