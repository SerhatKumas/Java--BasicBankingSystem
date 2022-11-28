package MemberPackage;

public class Person {
 
	//Person class parameters
	private String idNumber ;
	private String name;
	private String surname;
	private String email;
	private String phoneNumber;
	
	//Empty constructor 
 	public Person() {
		this.idNumber = "";
		this.name = "";
		this.surname = "";
		this.email = "";
		this.phoneNumber = "";
	} 
	
 	//Full-parameter constructor 
	public Person(String idNumber, String name, String surname, String email, String phoneNumber) {
		this.idNumber = idNumber;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	//Copy constructor
		public Person(Person person) {
			this.idNumber = person.idNumber;
			this.name = person.name;
			this.surname = person.surname;
			this.email = person.email;
			this.phoneNumber = person.phoneNumber;
		}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

}
