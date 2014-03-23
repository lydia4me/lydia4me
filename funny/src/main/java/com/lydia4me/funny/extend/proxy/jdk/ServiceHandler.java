package com.lydia4me.funny.extend.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceHandler implements InvocationHandler {
	private Object target;
	
	public ServiceHandler(Object target){
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		prev();
		method.invoke(target, args);
		after();
		return null;
	}

	private void prev(){
		System.out.println("prev");
	}
	
	private void after(){
		System.out.println("after");
	}
}
