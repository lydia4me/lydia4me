package designPattern.factory.factoryMethod;

public class Car implements Transport {

	@Override
	public void run() {
		System.out.println("I'm on my way!");
	}

}
