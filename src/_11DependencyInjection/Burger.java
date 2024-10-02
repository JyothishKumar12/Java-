package _11DependencyInjection;

public class Burger implements Food{

	@Override
	public void preaparing() {
		System.out.println("Burger is ready");
	}

	public void price() {
		System.out.println("100");
	}
}
