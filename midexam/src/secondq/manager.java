package secondq;

public class manager extends emoloyee {

	double bouns;
	double x;
	
	public manager(String name, double basesalary, double bouns) {
		super(name , basesalary);
		this.bouns = bouns;
	}
	public void setsalay() {
		x=super.basesalary+bouns;
	}
	public void displayinfo() {
		System.out.println(name);
		System.out.println(basesalary);
		System.out.println(bouns);
		System.out.println(x);
	}
	
}
