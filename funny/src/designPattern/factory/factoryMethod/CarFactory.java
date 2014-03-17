package designPattern.factory.factoryMethod;

public class CarFactory implements Factory {

	@Override
	public Car createTransport() {
		return new Car();
	}

}
