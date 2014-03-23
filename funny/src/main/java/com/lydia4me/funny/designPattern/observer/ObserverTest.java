package com.lydia4me.funny.designPattern.observer;

public class ObserverTest {
	public static void main(String[] args){
		Subject subject = new ConcreteSubject();
		Observer observerA = new ConcreteObserver();
		observerA.subscribeSubject(subject);
		Observer observerB = new ConcreteObserver();
		observerB.subscribeSubject(subject);
		subject.change();
		
		System.out.println("ObserverA unsubscribe subject");
		observerA.unsubscribeSubject(subject);
		subject.change();
	}
}
