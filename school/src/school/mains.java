package school;

public class mains {

	public static void main(String[] args) {
		student s = new student();
		teacher t = new teacher();
		
		s.setinfo("Tasnim", 20, 91111111);
		s.getinfo();
		s.classnum(3);
		s.getsubject();
		
		t.setinfo("Naima", 30, 92222222);
		t.getinfo();
		t.setdetails(3, "Computer");
		t.getdetails();
		
	}
}
