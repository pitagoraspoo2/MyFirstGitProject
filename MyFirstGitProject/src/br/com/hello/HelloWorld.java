package br.com.hello;

public class HelloWorld {
	
	public String my_method() {
		return "my_method";
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		System.out.println("Hello World " + hw.my_method());
	}

}
