package school;

public class school {
	
	 private String name;
	 private int age;
	 private int phone;
	 
	 public void setinfo(String name, int age, int phone) {
		 this.name = name;
		 this.age = age;
		 this.phone = phone;
	 }
	 
	 public void getinfo() {
		 System.out.println("Name: " + name);
		 System.out.println("Age: " + age);
		 System.out.println("Phone Number: " + phone);
	 }

}
