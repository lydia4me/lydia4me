package designPattern.adapter;

public class PS2ToUSBAdapter implements USB {
	private PS2 ps2;
	public PS2ToUSBAdapter(PS2 ps2){
		this.ps2 = ps2;
	}
	@Override
	public void workWithUSB() {
		ps2.workWithPS2();
	}
}
