
public final class CBoss extends AEmployee {
	double weeklySalary;
	CBoss(String firstName, String lastName,double newsalary){	
		super(firstName,lastName);
		salary=newsalary;
	}
	public double getWeeklySalary() {
		return (salary/4);
	}
	public double earnings() {
		return salary;
	}
	public String toString() {
		return null;
	}
}
