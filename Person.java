import java.util.Calendar;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private byte gender;
	private java.util.Calendar birthDate;
	private byte maritalStatus ;
	private boolean hasDriverLicence;
	
	public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		setGender(gender);
		this.birthDate=birthDate;
		setMaritalStatus(maritalStatus);
		setHasDriverLicence(hasDriverLicence);
		
	}
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", maritalStatus=" + maritalStatus + ", hasDriverLicence="
				+ hasDriverLicence + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public java.util.Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.util.Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public void setGender(String gender) {
		
			if (gender.equalsIgnoreCase("Woman"))
					this.gender=1;
			if (gender.equalsIgnoreCase("Man"))
					this.gender=2;
		
	}
	
	public String getGender() {
		if (gender==1)
			return  "Woman";
		if (gender==2)
			return "Man";
		return "";
	}
	
	public void setMaritalStatus(String status) {
		if (status.equalsIgnoreCase("Single"))
			maritalStatus=1;
	if (status.equalsIgnoreCase("Married"))
			maritalStatus=2;
	}
	
	public String getMaritalStatus() {
		if (maritalStatus==1)
			return  "Single";
		if (maritalStatus==2)
			return "Married";
		return "";
	}
	
	public void setHasDriverLicence(String info) {
		if (info.equalsIgnoreCase("Yes"))
			hasDriverLicence=true;
		if (info.equalsIgnoreCase("No"))
			hasDriverLicence=false;
	}
	public String getHasDriverLicence() {
		if (hasDriverLicence==true)
			return "Yes";
		if (hasDriverLicence=false)
			return "No";
		
		return "";
	}
	
	
	
	
	
	
	
	
	
}
