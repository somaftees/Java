package secondq;

public abstract class emoloyee {

	String name;
	double basesalary;
	
	public emoloyee(String name, double basesalary) {
		this.name = name;
		this.basesalary = basesalary;
	}
	
	public abstract void setsalay();
	public abstract void displayinfo();
}
