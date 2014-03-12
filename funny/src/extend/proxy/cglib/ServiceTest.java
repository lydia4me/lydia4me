package extend.proxy.cglib;

public class ServiceTest {
	public static void main(String[] args){
		ServiceProxy proxy = new ServiceProxy();
		Service service = (Service) proxy.getProxy(Service.class);
		service.dosomething();
	}
}
