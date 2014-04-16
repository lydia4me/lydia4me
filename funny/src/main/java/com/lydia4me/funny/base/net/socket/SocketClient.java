package com.lydia4me.funny.base.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args){
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String info = "";
			while(!(info = br.readLine()).equals("bye")){
				Socket socket = new Socket("127.0.0.1", 8082);
				OutputStream os = socket.getOutputStream();
				System.out.println("input:"+info);
				os.write(info.getBytes());
				os.flush();
				os.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
