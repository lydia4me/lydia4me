package designPattern.decorator;

public class ServiceDecorator implements Service {
	private Service service;
	public ServiceDecorator(Service service){
		this.service = service;
	}

	@Override
	public void service() {
		System.out.println("decorator service begin");
		service.service();
		System.out.println("decorator service end");
	}

}
