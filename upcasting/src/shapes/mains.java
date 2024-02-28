package shapes;

public class mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	shape o1 = new squre();
	shape o2 = new circle();
	shape o3 = new rect();
	shape o4 = new triangle();
	
	draw obj = new draw();
	
	obj.draws(o1);
	System.out.println();
	obj.draws(o2);
	System.out.println();
	obj.draws(o3);
	System.out.println();
	obj.draws(o4);

	}

}
