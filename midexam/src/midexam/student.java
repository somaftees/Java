package midexam;

public class student {

	public static int counter;
	private String name;
	private int age;
	private int phone;
	private int year;
	
	public void setinfo(String name, int age, int phone, int year) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.year=year;
		counter++;
	}
	
	public void getinfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phone);
		System.out.println("year: " + year);
	}
	public static void printTotalNum() {
		System.out.println("The total nunber of students :" +counter);
		
	}
}
