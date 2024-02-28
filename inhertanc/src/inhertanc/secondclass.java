package inhertanc;

public class secondclass extends firstclass {

	int x = 66;
	
	public void prints() {
		System.out.println("---------------------------------------------------");
		System.out.println("this `s my second print statment from Second class");
		System.out.println("x = " + this.x);
		System.out.println("x = " + super.x);
	}
	public void bothprints() {
		
		super.prints();
		this.prints();
	}
}
