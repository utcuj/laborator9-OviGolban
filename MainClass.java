
public class MainClass {

	public static void main(String[] args) {
		A a = new A("Ana");
		B b = new B("mere");
		C c = new C("nou");
		try {
			
			a.formateaza();
			b.formateaza();
			c.formateaza();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException t) {
			System.out.println(t.getMessage());
		}catch(ArithmeticException g) {
			System.out.println(g.getMessage());
		}
		

	}

}
