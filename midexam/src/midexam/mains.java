package midexam;

public class mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		student s4 = new student();
		
		
		s1.setinfo("tasnim", 21, 911156342, 2003);
		s1.getinfo();
		
		s2.setinfo("takwa", 20, 911156353, 2004);
		s2.getinfo();
		
		s3.setinfo("tana", 19, 91128003, 2005);
		s3.getinfo();
		
		s4.setinfo("raghad", 13, 9111111, 2011);
		s4.getinfo();
		
		student.printTotalNum();
		System.out.println(student.counter);
	}

}
