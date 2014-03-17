package designPattern.proxy;

public class Proxy implements Component {
	private Component subject;
	@Override
	public void operate() {
		this.subject = new Subject();
		this.subject.operate();
	}

}
