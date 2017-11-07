
public abstract class AEmployee {
	
	String firstName;
	public String lastName;
	public double salary;
	AEmployee (String string,String string2){
		this.firstName=string;
		this.lastName=string2;
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
