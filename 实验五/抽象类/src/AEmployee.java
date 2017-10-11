
public abstract class AEmployee {
	public String firstName,lastName;
	public double salary;
	AEmployee (String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public abstract double earnings();
	public abstract String toString();
	
}
