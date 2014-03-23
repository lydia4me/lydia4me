package com.lydia4me.funny.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private List<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void attach(Observer observer) {
		observerList.add(observer);
	}
	
	@Override
	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void change() {
		System.out.println("change some thing");
		notifyObserver();
	}
	
	private void notifyObserver(){
		for(Observer observer : observerList){
			observer.update();
		}
	}
}
