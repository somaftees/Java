package secondq;

public class mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manager m = new manager("tasnim",500,500);
		programmer p = new programmer("naima", 500, 5, 10);
		m.setsalay();
		m.displayinfo();
		p.setsalay();
		System.out.println("------------------");
		p.displayinfo();
		
	}

}
