package task_7;

//Importing scanner module to get user input.
import java.util.Scanner;

public class Menu { // Main class declaration.

	public static void main(String[] args) {

		// Declaring variables to be used in this program.
		int projectNumber;
		String projectName;
		String buildingType;
		String address;
		String erfNumber;
		double totalFee;
		double amountPaid;
		String deadline;

		// Assigning the string 'personType' to contractor.
		String personType = "Contractor";

		// Main menu only one option to add project
		System.out.println("\nPlease choose a number option from the main menu below: \n" + "\n1. Add a project"
				+ "\n2. Exit program");

		// Retrieve user input choice from program
		// Storing user input choice in 'userChoice' variable.
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();

		if (userChoice == 1) {

			// The user is then prompted add details about project
			// User input stored in appropriate variables.

			// Project number.
			System.out.println("\nPlease enter the project number: ");
			Scanner inputProjectNumber = new Scanner(System.in);
			projectNumber = inputProjectNumber.nextInt();

			// Project name.
			System.out.println("Please enter the project name: ");
			Scanner inputProjectName = new Scanner(System.in);
			projectName = inputProjectName.nextLine();

			// Building type design.
			System.out.println("Please enter the building type: ");
			Scanner inputBuildingType = new Scanner(System.in);
			buildingType = inputBuildingType.nextLine();

			// Physical address for the project.
			System.out.println("Please enter the physical address for the project: ");
			Scanner inputPhysicalAddress = new Scanner(System.in);
			address = inputPhysicalAddress.nextLine();

			// ERF number.
			System.out.println("Please enter the ERF number: ");
			Scanner inputErfNumber = new Scanner(System.in);
			erfNumber = inputErfNumber.nextLine();

			// Total fee being charged for the project.
			System.out.println("Please enter the total fee charged for the project: ");
			Scanner inputTotalFee = new Scanner(System.in);
			totalFee = inputTotalFee.nextDouble();

			// Total amount paid to date.
			System.out.println("Please enter the total amount paid to date: ");
			Scanner inputAmtPaid = new Scanner(System.in);
			amountPaid = inputAmtPaid.nextDouble();

			// Project deadline.
			System.out.println("Please enter the project deadline: ");
			Scanner inputProjectDeadline = new Scanner(System.in);
			deadline = inputProjectDeadline.nextLine();

			// A new project object is then created using the details entered above,
			// as well as the NewProject() method defined in the NewProject class.
			Project createProject = new Project(projectNumber, projectName, buildingType, address, erfNumber, totalFee,
					amountPaid, deadline);
			System.out.println("Your project was successfully created.");

			// Calling the DisplayProject() method in the NewProject class to display the
			// new project.
			System.out.println(createProject.DisplayProject());

			// The user is then shown a short menu with options to edit, update, finalise or
			// exit.
			System.out.println(
					"\nPlease choose a number option from the sub menu below: \n" + "\n1. Edit existing projects"
							+ "\n2. Update contractor details" + "\n3. Finalise the project" + "\n4. Exit program");

			// Getting input choice.
			// Storing their choice in 'userChoice' variable.
			Scanner inputA = new Scanner(System.in);
			int userChoiceA = inputA.nextInt();

			// Setting if condition to run if the user chooses option 1, to edit existing
			// projects.
			if (userChoiceA == 1) {
				// User is given choice of either editing the due date or the amount
				// paid to date.
				System.out.println("Would you like to:" + "\n1. Edit the project due date or"
						+ "\n2. Edit the total amount paid of the fee to date?" + "\nChoose either 1 or 2");

				// User choice is stored in the 'editChoice' variable.
				Scanner choice = new Scanner(System.in);
				int editChoice = choice.nextInt();

				// 1. Edit the project due date
				if (editChoice == 1) {
					// User is prompted to enter a new due date.
					System.out.println("\nPlease enter a new due date for the project: ");
					Scanner date = new Scanner(System.in);

					// deadline variable then updated to store the new due date.
					deadline = date.nextLine();

					// New project object created to include the new due date value.
					Project projectEdit = new Project(projectNumber, projectName, buildingType, address, erfNumber,
							totalFee, amountPaid, deadline);
					// Edited project object displayed.
					System.out.println(projectEdit.DisplayProject());

					// 2. Edit the total amount paid of the fee to date
				} else if (editChoice == 2)

					// User is prompted to enter a new amount paid to date.
					System.out.println("\nPlease enter a new total amount of the fee paid to date: ");
				Scanner amount = new Scanner(System.in);

				// amountPaid variable is updated to store the new value.
				amountPaid = amount.nextDouble();

				// New project object created to include the updated amount paid value.
				Project projectEdit2 = new Project(projectNumber, projectName, buildingType, address, erfNumber,
						totalFee, amountPaid, deadline);
				// Edited project object displayed.
				System.out.println(projectEdit2.DisplayProject());
			}
			// 2. Update contractor details
			else if (userChoiceA == 2) {
				// The user is prompted to enter the contractor's details to update the
				// information.
				// Their input is scanned in and stored in appropriate variables.

				// name.
				System.out.println("\nPlease enter the contractor's name to confirm their details: ");
				Scanner nameEdit = new Scanner(System.in);
				String name = nameEdit.nextLine();

				// Contact number.
				System.out.println("\nPlease enter the contractor's new contact number: ");
				Scanner newNumber = new Scanner(System.in);
				int number = newNumber.nextInt();

				// Email address.
				System.out.println("\nPlease enter the contractor's new email address: ");
				Scanner newEmail = new Scanner(System.in);
				String email = newEmail.nextLine();

				// Physical address.
				System.out.println("\nPlease enter the contractor's new physical address: ");
				Scanner newAddress = new Scanner(System.in);
				address = newAddress.nextLine();

				// Person object created with the updated details for the contractor.
				Person contractorEdit = new Person(personType, name, number, email, address);

				// Successful message printed out & the details for the updated contractor
				System.out.println("Your contractor details have been update successfully. \n");
				System.out.println(contractorEdit.DisplayPerson());

			}
			// 3. Finalise the project
			else if (userChoiceA == 3) {
				// If project fee paid in full.
				if (totalFee == amountPaid) {
					// No invoice is generated but user is prompted to enter a completion date.
					System.out.println("Project has been paid in full. No invoice generated.");
					System.out.println("Please add a completion date for this project: ");

					Scanner newDate = new Scanner(System.in);
					// Completion date stored in string variable.
					String completion = newDate.nextLine();
					String finaliseStatus = "Finalised";

					// The project object displayed with details including the
					// completion date & 'finalised' status of the project.
					System.out.println(createProject.DisplayProject() + "\nCompletion Date: " + completion);
					System.out.println("\nProject status: " + finaliseStatus);

				}

				// If the customer has not yet paid in full.
				else if (totalFee != amountPaid) {
					// The user is prompted to add customer details to generate an invoice.
					System.out.println("Invoice will be generated with the following details: ");
					System.out.println("\nPlease enter the customer's full name: ");
					Scanner customer = new Scanner(System.in);
					String name2 = customer.nextLine();

					// Assigning the string 'personType' to Customer.
					personType = "Customer";

					System.out.println("\nPlease enter the customer's contact number: ");
					Scanner contact = new Scanner(System.in);
					int number2 = contact.nextInt();

					System.out.println("\nPlease enter the customer's email address: ");
					Scanner contact2 = new Scanner(System.in);
					String email2 = contact2.nextLine();

					System.out.println("\nPlease enter the customer's physical address: ");
					Scanner physAddress = new Scanner(System.in);
					String address2 = physAddress.nextLine();

					// User prompted to add a completion date for the project.
					System.out.println("Please add a completion date for this project: ");

					Scanner newDate2 = new Scanner(System.in);
					// Completion date stored in string variable
					String completion2 = newDate2.nextLine();
					String finaliseStatus2 = "finalised";

					// Person object created to display the customer's details.
					Person customer1 = new Person(personType, name2, number2, email2, address2);
					System.out.println("\nPlease view your invoice details below: ");

					// Invoice details displayed with customer details and amount still owed.
					System.out.println(customer1.DisplayPerson());
					System.out.println("\nAmount still owed: R" + (totalFee - amountPaid) + "\n");

					// The project object displayed with details including the
					// completion date & 'finalised' status of the project.
					System.out.println(createProject.DisplayProject() + "\nCompletion Date: " + completion2);
					System.out.println("Project status: " + finaliseStatus2);

				}
			}
			// user choice 4 from the sub menu.
			if (userChoiceA == 4) {
				// Successful logout message.
				System.out.println("Log out, successful.");
			}

		} // user choice 2 from main menu
		if (userChoice == 2) {

			// Successful logout message.
			System.out.println("Log out, successful.");

		}
	}

}