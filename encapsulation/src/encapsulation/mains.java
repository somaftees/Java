package encapsulation;

public class mains {
	public static void main(String[] args) {
		employee o = new employee();
		
		o.setname("Tasnim");
		o.setage(20);
		o.setsalary(5000);
		
		System.out.println("Name: " + o.getname());
		System.out.println("Age: " + o.getage());
		System.out.println("Salary: " + o.getsalary());
	}

}