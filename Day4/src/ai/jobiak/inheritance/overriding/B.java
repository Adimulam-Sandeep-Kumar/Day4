package ai.jobiak.inheritance.overriding;

public class B extends A {
	
	public B() {
		
		//m();
	}
	
	void sum() {
		m();
	}
	void m() {
		System.out.println("using tcp/ip protocol");
	}
}
