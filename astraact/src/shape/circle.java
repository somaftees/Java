package shape;

public class circle extends shape {
	
	private double x;
	
	public circle(double x) {
		this.x=x;
	}
	public double getarea() {
		return (Math.PI * x * x);
	}
	
	public double getpere() {
		return (Math.PI * 2 * x);
	}
}
