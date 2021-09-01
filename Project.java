package task_7;

//Main class declaration.
public class Project {

	// Listing variable attributes for the 'NewProject' class.
	int projectNumber;
	String projectName;
	String buildingType;
	String address;
	String erfNumber;
	double totalFee;
	double amountPaid;
	String deadline;

	// Constructor method to create a new project object.
	// This takes in all the attributes of the project above.
	public Project(int projectNumber, String projectName, String buildingType, String address, String erfNumber,
			double totalFee, double amountPaid, String deadline) {

		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.address = address;
		this.erfNumber = erfNumber;
		this.totalFee = totalFee;
		this.amountPaid = amountPaid;
		this.deadline = deadline;

	}

	// Method to display the project information
	// This method returns a string 'output' with all the project details.
	public String DisplayProject() {

		System.out.println("The details for project " + projectName + " are as follows: \n");
		String output = "Project Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nBuilding Type: " + buildingType;
		output += "\nPhysical Address: " + address;
		output += "\nERF Number: " + erfNumber;
		output += "\nProject Fee Total: R" + totalFee;
		output += "\nAmount Paid to Date: R" + amountPaid;
		output += "\nProject Deadline: " + deadline;

		return output;

	}

}