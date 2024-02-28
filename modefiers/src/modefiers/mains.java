package modefiers;

public class mains {
  
	 public static void main(String[] args) {
		 
		 example e1 = new example();
		 
		 //static
		 example.a = 10;
		 example.staticprint();
		 
		 
		 example.a = 77;
		 e1.print();

		 
	 }
}
