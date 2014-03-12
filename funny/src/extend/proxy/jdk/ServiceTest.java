package extend.proxy.jdk;

import java.lang.reflect.Proxy;

public class ServiceTest {
	public static void main(String[] args){
		ServiceImpl impl = new ServiceImpl();
		ServiceHandler handler = new ServiceHandler(impl);
		Service serviceByProxy = (Service) Proxy.newProxyInstance(impl.getClass()
				.getClassLoader(), impl.getClass().getInterfaces(), handler);
		serviceByProxy.dosmoething();
	}
}
