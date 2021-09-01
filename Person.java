package task_7;

//Main class declaration.
public class Person {

	// Attribute variables declared for use in this class.
	String personType;
	String name;
	int number;
	String email;
	String address;

	// Constructor method to create a person object.
	// This takes in all the attributes of the person above.
	public Person(String personType, String name, int number, String email, String address) {

		this.personType = personType;
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;

	}

	// This method displays the person object details.
	// It returns the string 'output' with all of the person's details.
	public String DisplayPerson() {

		System.out.println(personType + " details are as follows: \n");
		String output = "Title: " + personType;
		output += "\nName: " + name;
		output += "\nNumber: " + number;
		output += "\nEmail Address: " + email;
		output += "\nPhysical Address: " + address;

		return output; // String output returned.
	}
}