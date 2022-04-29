package InterfaceDemo;

public class Runner2 {
	
	public static void main(String[] args) {
		Greetings howdy = new Howdy();
		Greetings hello = new Hello();
		howdy = outputInterface(howdy);
		hello = outputInterface(hello);
		howdy.hello();
		hello.hello();
		System.out.println();
	}
	
	public static Greetings outputInterface(Greetings hello) {
		return hello;
	}
	
}
