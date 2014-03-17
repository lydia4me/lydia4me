package designPattern.proxy;


public class Subject implements Component {

	@Override
	public void operate() {
		System.out.println("operate in subject");
	}

}
