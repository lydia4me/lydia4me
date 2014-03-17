package designPattern.factory.simpleFactory;

public class ServiceB implements Service {

	@Override
	public void invoke() {
		System.out.println("service invoked in service B");
	}

}
