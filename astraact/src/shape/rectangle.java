package shape;

public class rectangle extends shape{
	double x;
	double y;
	
	public rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getarea() {
		return x * y;
	}
	
	
	public double getpere() {
		return (2 * (x+y));
	}

}
