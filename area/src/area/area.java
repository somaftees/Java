package area;

public class area {
	private int a;
	private int b;
	
	
	public void setarea(int x, int z) {
		
		if(x <= 0 || z<= 0) {
			System.out.println("The number can`t be zero or less");
		}
		else {
			
			a=x;
			b=z;
		}
	}
	
	
	public void getarea() {
		int area = a*b;
		
		System.out.println("Area:" + area);
	}
}
