package school;

public class teacher extends school {
	
	int classnumber;
	String subjectname;
	
	public void setdetails(int classnumber, String subjectname) {
		if (classnumber == 1 || classnumber == 2 || classnumber == 3) {
			this.classnumber = classnumber;
			this.subjectname = subjectname;
		}
		else {
			System.out.println("unvalid input");
		}
	}
	
	public void getdetails() {
		if (classnumber == 1){
		System.out.println("the teacher teach class: " + classnumber);
		System.out.println("Subject name: " + subjectname);
		}
		else {
			if (classnumber == 2){
				System.out.println("the teacher teach class: " + classnumber);
				System.out.println("Subject name: " + subjectname);
				}
		else {
			if (classnumber == 3){
				System.out.println("the teacher teach class: " + classnumber);
				System.out.println("Subject name: " + subjectname);
				}
		}
		}
	}
}
