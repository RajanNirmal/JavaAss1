
public class Doctor {

	private String firstName;
	private String lastName;
	private String specialty;
	
	public Doctor()
	{
		firstName = null;
		lastName = null;
		specialty = null;
		
	}
	
	public Doctor(String firstName, String lastName, String specialty)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
}
