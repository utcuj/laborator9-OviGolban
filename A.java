
public class A {
	private String a = new String();
	
	public A(String a) {
		this.a = a;
	}
	
	
	public void formateaza() throws NullPointerException {
		a = null;
		throw new NullPointerException("Null pointer exception");
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}
	
	
}
