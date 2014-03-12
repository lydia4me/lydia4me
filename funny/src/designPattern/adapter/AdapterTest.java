package designPattern.adapter;

public class AdapterTest {
	public static void main(String[] args){
		PS2 ps2 = new PS2Impl();
		USB adapter = new PS2ToUSBAdapter(ps2);
		adapter.workWithUSB();
	}
}
