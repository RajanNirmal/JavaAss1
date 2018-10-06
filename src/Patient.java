
public class Patient {
	
	private String firstName;
	private String lastName;
	private int healthCardNumber;
	OurDate birthDate;
	Appointment appointment;
	
	public Patient() {
		
		firstName = null;
		lastName= null;
		healthCardNumber = 0;
		birthDate = new OurDate();
a
	}
	
	public Patient(String firstName , String lastName , int healthCardNumber, OurDate birthDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.healthCardNumber = healthCardNumber;
		this.birthDate = birthDate;
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

	public int getHealthCardNumber() {
		return healthCardNumber;
	}

	public void setHealthCardNumber(int healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}
	
	public OurDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(OurDate birthDate) {
		this.birthDate = birthDate;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
}
