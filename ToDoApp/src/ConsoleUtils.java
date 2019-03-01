import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {
	
	//Member variables
	private Scanner scanner;
	
	//Constructor
	public ConsoleUtils() {
		 scanner = new Scanner(System.in);
	}
	
	//Methods
	
	//This method prints the menu of what is available
	public void printFunctions(){
        System.out.println("Available Functions: ");
        System.out.println("add: to add an item");
        System.out.println("delete: to delete an item");
        System.out.println("mark: to mark an item as done");
        System.out.println("list pending: lists the pending items");
        System.out.println("list done: lists the done items");
        System.out.println("list all: lists both pending and done items");
        System.out.println("help: display available functions");
        System.out.println("quit: to exit");
        System.out.println();

    }
	

	//Prints an informational message to the console
    public void info(String msg){
        System.out.println("["+msg+"]");
        System.out.println();
    }

	//Prints an error message
    public void error(String msg){
        System.out.println("[ERROR: "+msg+"]");
        System.out.println();
        }

	//Prompts the user to enter function and returns it
    public String promptString(String label){
        System.out.print(label+" ");
        return scanner.nextLine();
    }
    
    public int askForID() {
    	System.out.println("Please enter a Task ID: ");
    	int id = scanner.nextInt();
    	return id;
    }
    
    
    public void printList(List<ToDoItem> entries){
    	
        int longestTask =  12;
     
        for(ToDoItem entry : entries){
            if(entry.getDescription().length() > longestTask){
                longestTask = entry.getDescription().length();
            }
 
        }
        
        String taskHeader = String.format("%"+longestTask+"s", "Task");
        String taskUnderline = "";
        for(int i=0;i<longestTask;i++){
            taskUnderline+="-";
        }

        System.out.println(" ID | "+taskHeader   +" | Completed Flag");
        System.out.println("----+-"+taskUnderline+"-+----------------+");

        for(ToDoItem entry : entries){
            String task = String.format("%-"+longestTask+"s", entry.getDescription());
            
            String status = "";
            
            if (entry.getCompletedFlag()) {
            	status = "completed";
            }
            else {
            	status = "pending";
            }
            
            String line = String.format(" %2s | %s | %s ", entry.getID(), task, status);
            System.out.println(line);
        }

        if(entries.size() == 1){
            System.out.println("[1 entry]");
        } else {
            System.out.println("["+entries.size()+" entries]");
        }

        System.out.println();
    }
}
