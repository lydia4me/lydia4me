package com.lydia4me.funny.designPattern.observer;


public interface Subject {
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void change();
}
