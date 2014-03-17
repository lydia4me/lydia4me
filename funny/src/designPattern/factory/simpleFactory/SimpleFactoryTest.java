package designPattern.factory.simpleFactory;

public class SimpleFactoryTest {
	public static void main(String[] args){
		String flag = "B";
		Service service = ServiceFactory.getService(flag);
		service.invoke();
		
		flag = "C";
		service = ServiceFactory.getService(flag);
		service.invoke();
	}
}
