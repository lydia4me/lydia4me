package designPattern.factory.factoryMethod;

public class FactoryMethodTest {
	public static void main(String[] args){
		Factory factory = new CarFactory();
		Transport car = factory.createTransport();
		car.run();
		
		factory = new PlainFactory();
		Transport plain = factory.createTransport();
		plain.run();
	}
}
