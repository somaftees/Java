package upcasting;

public class mains {
	public static void main(String[] args) {
	parent o1 = new child();
	
	o1.name = "tasnim";
	//o1.age=20;
	
	
	child o2 = (child)o1;
	
	o2.age = 22;
	//o2.name = "ftees";
	
	System.out.println(o2.age);
	System.out.println(o1.name);
	//System.out.println(o2.name);
	o2.printinfo();
	o1.printinfo();
	
	child o3 = new child();
	o3.age=5;
	o3.name="retag";
	o3.printinfo();
	System.out.println(o3.age);
	System.out.println(o3.name);
}
}