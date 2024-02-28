package area;

public class mains {
	public static void main(String[] args) {
		area a1 = new area();
		area a2 = new area();
		area a3 = new area();
		
		
		a1.setarea(4, 6);
		a1.getarea();
		System.out.println("--------------------------");
		
		
		a2.setarea(-1, 5);
		a2.getarea();
		System.out.println("--------------------------");
		
		
		a3.setarea(8, -8);
		a3.getarea();
	}
}
