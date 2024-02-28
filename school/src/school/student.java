package school;

import java.util.Arrays;

public class student extends school{
	int classnumber;
	String [] subject1 = {"math","english1","arabic1","scince"};
	String [] subject2 = {"algaber","english2","arabic2","chemistry"};
	String [] subject3 = {"computer","english3","arabic3","biology"};
	
	public void classnum(int classnumber) {
		if (classnumber == 1 || classnumber == 2 || classnumber == 3)
			this.classnumber = classnumber;
		else {
			System.out.println("unvalid input");
		}
	}
	
	public void getsubject() {
		if (classnumber == 1)
			System.out.println(Arrays.toString(subject1));
		
		else {
			if (classnumber == 2)
			System.out.println(Arrays.toString(subject2));
		else {
			      if (classnumber == 3)
			      System.out.println(Arrays.toString(subject3));
		}
		}
	}
	

}
