package com.lydia4me.funny.designPattern.observer;

public class ConcreteObserver implements Observer {

	@Override
	public void subscribeSubject(Subject subject) {
		subject.attach(this);
	}
	
	@Override
	public void unsubscribeSubject(Subject subject) {
		subject.detach(this);
	}
	
	@Override
	public void update() {
		System.out.println("call back!");
	}

}
