public class B extends A{
	private String[] b = new String[10];
	
	public B(String a) {
		super(a);
		this.b = b;
		
	}
	
	public void formateaza() throws ArrayIndexOutOfBoundsException {
		System.out.println(b[10]);
		throw new ArrayIndexOutOfBoundsException("Index out");
		
	}

}
