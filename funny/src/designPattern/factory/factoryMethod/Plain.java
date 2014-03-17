package designPattern.factory.factoryMethod;

public class Plain implements Transport {

	@Override
	public void run() {
		System.out.println("fly to the sky");
	}

}
