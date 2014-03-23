package com.lydia4me.funny.designPattern.observer;

public interface Observer {
	public void subscribeSubject(Subject subject);
	public void unsubscribeSubject(Subject subject);
	public void update();
}
