
public class Appointment {

	private Doctor doctor;
	private Patient patient;
	private OurDate date;
	
	public Appointment()
	{
		doctor = new Doctor();
		//patient = new Patient();
		date = new OurDate();
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public OurDate getDate() {
		return date;
	}
	public void setDate(OurDate date) {
		this.date = date;
	}
	
	
}
