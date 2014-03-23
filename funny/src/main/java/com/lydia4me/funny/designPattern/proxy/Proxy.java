package com.lydia4me.funny.designPattern.proxy;

public class Proxy implements Component {
	private Component subject;
	@Override
	public void operate() {
		this.subject = new PrivateSubject();
		this.subject.operate();
	}
	
	private class PrivateSubject implements Component{
		@Override
		public void operate() {
			System.out.println("operate in private subject");
		}
	}
	
	class ChildSubject implements Component{
		@Override
		public void operate() {
			System.out.println("operate in child subject");
		}
	}
}
