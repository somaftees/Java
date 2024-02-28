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
		
		s2.setinfo("retag", 22, 911156353, 2002);
		s2.getinfo();
		
		s3.setinfo("aya", 22, 91128003, 2002);
		s3.getinfo();
		
		s4.setinfo("soma", 21, 9111111, 2003);
		s4.getinfo();
		
		student.printTotalNum();
		System.out.println(student.counter);
	}

}
