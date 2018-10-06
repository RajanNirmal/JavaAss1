import java.util.*;

public class MedicalClinic {
	
	private Appointment[] appointment;
	private Patient[] patients;
	private Doctor[] doctors;
	
	private int numberAppointments = 0;
	private int numberPatients=0;
	private int numberDoctors=0;
	Scanner in;
	
	public MedicalClinic()
	{
		appointment = new Appointment[10];
		patients = new Patient[10];
		doctors = new Doctor[5];
		in = new Scanner(System.in);
		
		doctors[0] = new Doctor("Megha","Arora","Dentist");
		doctors[1] = new Doctor("Nirmal","Rajan","Cardiologists ");
		doctors[2] = new Doctor("John","Christian","Infectious Disease Specialists");
		doctors[3] = new Doctor("Phill","Bills","Neurologists");
		doctors[4] = new Doctor("Joe","Saab","Pediatricians ");
		
		
	}
	
	public void menu()
	{
		int userInput; 
		do
		{
			System.out.println("Please make a choice: \n"
					+ "1.Enter a new Patient\n"
					+ "2. Make an appointment for a patient\n"
					+ "3. List all appointments\n"
					+ "4.Quit" );
			
			userInput = in.nextInt();
			
			switch (userInput) {
			case 1:
				addPatient();
				break;
				
			case 2:
				addAppointment();
				break;
				
			case 3:
				//listAppointments();
				break;

			default:
				break;
			}
			
		}while(userInput != 4);
		
	}
	
	public void addPatient()
	{
		if(numberPatients<10)
		{
			for(int i=0;i<patients.length;i++) {
			patients[numberPatients] = new Patient();
			}
		
		
		boolean valid = false;
		do {			
		
			
			
			System.out.println("Enter first name:");
			patients[numberPatients].setFirstName(in.next());
			
			System.out.println("Enter last name:");
			patients[numberPatients].setLastName(in.next());
			
			
			System.out.println("\nEnter health card number:");
			int healthNumber = in.nextInt();
			
			numberPatients++;
		
		for(int i=0;i<numberPatients;i++)
		{
			//System.out.println(patients[i].getHealthCardNumber());
			if(patients[i].getHealthCardNumber() == healthNumber){
				
				
				System.out.println("Health card number is already inserted..!");
				numberPatients--;
				break;
			}
			else{
				valid = true;
				patients[numberPatients-1].setHealthCardNumber(healthNumber);
				break;
			}
		}
		
		}while(valid == false);
		
		
		System.out.println("\nEnter birth date DDMMYYYY:");
		int date = in.nextInt();
		int year = date%10000;
		date = date/10000;
		int month = date%100;
		date = date/100;
		int day = date%100;
		
		OurDate birthDate;
		patients[numberPatients-1].setBirthDate(birthDate = new OurDate(day,month,year));
		
		
		}
		else
		{
			System.out.println("Sorry..! Maximum limit is reached.");
		}
		
		
	}
	
	public void addAppointment()
	{
		if(numberAppointments < 10)
		{
			numberAppointments++;
			
			System.out.println("Enter a health card number :");
			int helathCardNumb = in.nextInt();
			
			for(int i=0;i<numberPatients;i++)
			{
				if(patients[i].getHealthCardNumber() == helathCardNumb)
				{
					System.out.println("Patirnts[firstname="+patients[i].getFirstName()+
							",lastName="+ patients[i].getLastName()+", birthDate=day=" + patients[i].getBirthDate().getDay()+
							", month="+ patients[i].getBirthDate().getMonth() + ", year="+ patients[i].getBirthDate().getYear()+
							", healthCardNumber="+patients[i].getHealthCardNumber()							
							);
					
					for(int k=0;k<doctors.length;k++)
					{
						System.out.println( (k+1) + ".  " + doctors[k].getFirstName() + " " + doctors[k].getLastName());
						
					}
					
					System.out.println("ABCD");
					
					System.out.print("Enter number for doctor selection: ");
					int selectedDoctor = in.nextInt();
					
					
					System.out.print("Enter despired appointment date DDMMYYYY:");
					int date = in.nextInt();
					int year = date%10000;
					date = date/10000;
					int month = date%100;
					date = date/100;
					int day = date%100;
					
					OurDate appointmentDate;
					
					for(int j=0;j<appointment.length;j++)
					{
						appointment[j] = new Appointment();
					}
					
					for(int j=0;j<appointment.length;j++)
					{
						if(appointment[j].getDoctor().getFirstName() == appointment[selectedDoctor-1].getDoctor().getFirstName())
						{ 
							System.out.println("App : " +  appointment[j].getDate().getDay() + " Day : " + day);
							if( (appointment[j].getDate().getDay() == day) &&
									(appointment[j].getDate().getDay() == day) &&
									(appointment[j].getDate().getDay() == day))
							{
								System.out.println("Soory..! Doctor is already book for this date.");
								break;
							}
							else
							{
								appointment[numberAppointments].setDate(appointmentDate = new OurDate(day, month, year));
							}
						}
					}
					
				}
				
			}
			
		}
	}
	
	
	

}
