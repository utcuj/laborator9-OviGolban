
public class C extends B{
	private int b = 30;
	private int c = 0;
	
	public C(String a) {
		super(a);
		this.b = b;
		this.c = c;
		
	}
	
	public void formateaza() throws ArithmeticException {
		int rez = b/c;
		System.out.println(c);
		throw new ArithmeticException("Impartire la 0");
		
	}
}
