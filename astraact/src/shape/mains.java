package shape;

public class mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle rec = new rectangle(4,6);
		square sq = new square(2);
		circle cir = new circle(7);
		
		
		System.out.println("The area of rectangle = " + rec.getarea());
		System.out.println("The perimeter of rectangle = " + rec.getpere());
		System.out.println("------------------------------------------------");
		System.out.println("The area of square = " + sq.getarea());
		System.out.println("The perimeter of square = " + sq.getpere());
		System.out.println("-------------------------------------------------");
		System.out.println("The area of circle = " + cir.getarea());
		System.out.println("The perimeter of circle = " + cir.getpere());
	}

}
