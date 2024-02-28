package secondq;

public class programmer extends emoloyee{
	
	double overtimeHours;
	double horlyRate;
	double x;
	
	public programmer(String name, double basesalary, double overtimeHours, double horlyRate) {
		super(name , basesalary);
		this.overtimeHours = overtimeHours;
		this.horlyRate = horlyRate;
	}
	public void setsalay() {
		x=super.basesalary+(horlyRate * overtimeHours);
	}
	public void displayinfo() {
		System.out.println(name);
		System.out.println(basesalary);
		System.out.println(overtimeHours);
		System.out.println(horlyRate);
		System.out.println(x);
	}
	
		

}
