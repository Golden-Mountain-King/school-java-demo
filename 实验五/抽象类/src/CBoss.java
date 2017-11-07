
public final class CBoss extends AEmployee {
	double weeklySalary;
	CBoss(String string, String string2,double newsalary){	
		super(string,string2);
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
